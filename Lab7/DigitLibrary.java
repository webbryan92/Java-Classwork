public class DigitLibrary{
  public static int[] count(String s){
    int[] counts = new int[10];
    for(int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        counts[s.charAt(i) - '0']++;
      }
    }
    return counts;
  }
   public static void printArray(int[] Array)
 {
  for(int i = 0; i < Array.length; i ++)
   System.out.println("There are " + Array[i] + " occurances of " + i);
   
 }
}