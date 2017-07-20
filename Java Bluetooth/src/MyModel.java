import java.awt.Desktop;
import java.io.File;

public class MyModel {
        Desktop desktop = Desktop.getDesktop();
	
	public MyModel() { } 
        public String[] getFileList(){
            String[] Filenames = getNames();
            return Filenames;
        }
        public String[] getNames() {
            File folder = new File("C:\\Users\\Ryan\\Downloads\\EXVS bgms\\");
            File[] listOfFiles = folder.listFiles();
            String[] temp = new String[listOfFiles.length];
            int j = 0;

            for (int i = 0; i < listOfFiles.length; i++) {            
                if (listOfFiles[i].isFile()) {
                    temp[j] = listOfFiles[i].getName();
                    j++;
                } /*else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }*/
            }
            return temp;
        }
        public void playFile(String x) {            
            File fullFile = new File("C:\\Users\\Ryan\\Downloads\\EXVS bgms\\"+ x);
            try{
                desktop.open(fullFile);
            }
            catch(Exception e){
                System.out.println("file not available");
            }
        }
	/*public void reset() {
	}*/
}
