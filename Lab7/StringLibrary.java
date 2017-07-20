public class StringLibrary{
  public static int count(String str, char a){
    int counts = 0;
    
    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == a)
        counts++;
    }
    return counts;
  }
}
    