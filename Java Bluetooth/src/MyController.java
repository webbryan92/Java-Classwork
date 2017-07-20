import java.io.DataInputStream;
import java.io.DataOutputStream;

/*import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.ServiceRecord;*/
import javax.bluetooth.UUID;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;

class MyController extends Object {
	MyModel myModel;
	MyView myView;
	DataInputStream in = null;
	DataOutputStream out = null;
	StreamConnection conn;
        Boolean connected = false;
        String file;

	public MyController(MyModel myModel, MyView myView) {
		this.myView = myView;
		this.myModel = myModel;

		do {
			bluetoothPeer();
			//myModel.reset();
                        waitForConn();
                        sendFiles(myModel.getFileList());
			while (connected){
                            file = getFilename();
                            myModel.playFile(file);
                        }				
			try {
				in.close();
				out.close();
				conn.close();
			} catch (Exception e) {}

			System.out.println("\nConnection closed.\n");
		} while (true);
	}


	/*private void remotePlayer() {
		if (!myModel.getGameOver()) {
			char player = myModel.getPlayer();
			myView.setView(myModel.getBoard(), "They play " + player);

			myModel.setMove(getMove());

			if (myModel.getWin())
				myView.setView(myModel.getBoard(), player + " wins");
			else if (myModel.getGameOver())
				myView.setView(myModel.getBoard(), "Tie");
		}
	}*/

	/*private void localPlayer() {
		if (!myModel.getGameOver()) {
			char player = myModel.getPlayer();
			myView.setView(myModel.getBoard(), "You play " + player);

			char move = '\0';
			do {
				try {
					move = (char) System.in.read();
				} catch (Exception e) {}
			} while (!myModel.setMove(move));

			if (myModel.getWin())
				myView.setView(myModel.getBoard(), player + " wins");
			else if (myModel.getGameOver())
				myView.setView(myModel.getBoard(), "Tie");
		}
		sendMove(myModel.getMove());
	}*/
	
	private void bluetoothPeer() {
		final UUID TTTSERVICE_ID = new UUID("0000110100001000800000805F9B34F7",
				false);

		//DiscoveryAgent mDiscoveryAgent;
		String url = null;
		StreamConnection conn = null;/*

		try {
			mDiscoveryAgent = LocalDevice.getLocalDevice().getDiscoveryAgent();

			url = mDiscoveryAgent.selectService(TTTSERVICE_ID,
					ServiceRecord.NOAUTHENTICATE_NOENCRYPT, false);

			if (url != null) {
				System.out.println("URL:" + url + "\n");
				conn = (StreamConnection) Connector.open(url);
				System.out.println("Acting as client: ");
			}
		} catch (Exception e) {
			System.out.println("Client Exception: " + e.toString() + "\n");
		}*/
		if (url == null) {
			//System.out.println("Discovery failed: " + TTTSERVICE_ID);
			System.out.println("Acting as server: ");
			try {
				StreamConnectionNotifier service = (StreamConnectionNotifier) Connector
						.open("btspp://localhost:" + TTTSERVICE_ID.toString()
								+ ";name=TTTService");

				conn = (StreamConnection) service.acceptAndOpen();
				service.close();                                
				System.out.println("Connected");
			} catch (Exception e) {
				System.out.println("Server Exception: " + e.toString() + "\n");
			}
		}
		try {
			in = conn.openDataInputStream();
			out = conn.openDataOutputStream();
		} catch (Exception e) {
			System.out.println("Exception in/out " + e);
		}

	}

	private void sendFiles(String[] request) {
		try {
                    for(int i = 0; i < request.length; i++){
			out.writeUTF(request[i]); // Send remote
                        //Thread.sleep(100);
                    }                    
		} catch (Exception e) {
			System.out.print("sendFiles Exception " + e);
		}
	}

	private String getFilename() {
		String received = "";
		try {
			received = in.readUTF(); // Read remote
		} catch (Exception e) {
			System.out.print("Disconnected");
                        connected = false;
		}
		return received;
	}
        private void waitForConn() {
            String received = "";
            System.out.println("waiting");
            try {
			received = in.readUTF(); // Read remote
            } 
            catch (Exception e) {
			System.out.print("Disconnected");
		}
            if(received.equals("hello")){ 
                System.out.println("recieved confirmation");
                connected = true;
            }
            else{
                connected = false;
            }
        }
}
