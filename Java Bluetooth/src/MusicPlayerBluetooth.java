

public class MusicPlayerBluetooth {

    public static void main(String args[]) {
	new MyController(new MyModel(), new MyView());
    }
        /*Desktop desktop = Desktop.getDesktop();
        String[] Filenames = getNames();
        for(int i = 0; i < Filenames.length; i++){
            System.out.println(Filenames[i]);
        }
        File fullFile = new File("C:\\Users\\Ryan\\Downloads\\EXVS bgms\\"+ Filenames[0]);        
        try{
            desktop.open(fullFile);
        }
        catch(Exception e){
            System.out.println("file not available");
        }
    } 
    

    private void bluetoothPeer() {
        final UUID TTTSERVICE_ID = new UUID("0000110100001000800000805F9B34F7",
                false);

        DiscoveryAgent mDiscoveryAgent;
        String url = null;
        StreamConnection conn = null;
        server = false;

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
        }

        if (url == null) {
            System.out.println("Discovery failed: " + TTTSERVICE_ID);
            System.out.println("Acting as server: ");
            try {
                StreamConnectionNotifier service = (StreamConnectionNotifier) Connector
                        .open("btspp://localhost:" + TTTSERVICE_ID.toString()
                                + ";name=TTTService");

                conn = (StreamConnection) service.acceptAndOpen();
                server = true;
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

    private void sendNames(char request) {
        try {
            //out.writeUTF(); // Send remote
        } catch (Exception e) {
            System.out.print("sendMove Exception " + e);
        }
    }

    private char getMove() {
        char received = '-';
        try {
            //received = in.readUTF(); // Read remote
        } catch (Exception e) {
            System.out.print("getMove Exception " + e);
        }
        return received;
    }

    private static String[] getNames() {
        File folder = new File("C:\\Users\\Ryan\\Downloads\\EXVS bgms");
        File[] listOfFiles = folder.listFiles();
        String[] temp = new String[listOfFiles.length-1]; //-1 is to exclude directory
        int j = 0;

        for (int i = 0; i < listOfFiles.length; i++) {            
            if (listOfFiles[i].isFile()) {
                temp[j] = listOfFiles[i].getName();
                j++;
            } /*else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
        return temp;
    }    */
}
