import java.util.Scanner;
import java.io.File;

public class arrayLibrary
{
 public static int linearSearch(int[] Array, int key)
 {
  for(int i = 0; i < Array.length; i++)
  {
   if (key == Array[i])
   {
    return i;
   }
  }
  return -1;
 }
 public static void printArray(int[] Array)
 {
  for(int i = 0; i < Array.length; i ++)
   System.out.println(Array[i]);
 }
 public static void printArray(double[] Array)
 {
  for(int i = 0; i < Array.length; i ++)
   System.out.println(Array[i]);
 }
 public static double arrayMax(double[] Array)
 {
   double max = Array[0];
   for (int i = 1; i < Array.length; i++) {
     if (Array[i] > max) 
       max = Array[i];
   }
   return max;
 }
 public static void getArray(int[] Batch){
  Scanner input = new Scanner(System.in);
  for(int i = 0; i < Batch.length; i++)
  {
   System.out.print((i+1)+ "-Enter number->  ");
   Batch[i] = input.nextInt();
  }
 }
 public static void getArrayFromFile(double[] x)throws Exception{
  File Ryan = new File("scores.txt");
  Scanner myscanner = new Scanner(Ryan);
  for(int i = 0; i < x.length; i++)
  {
   //System.out.print((i+1)+ "-Enter number->  ");
   x[i] = myscanner.nextDouble();
  }
  myscanner.close();
 }
 public static void getArrayFromFile(String[] x)throws Exception{
  File Ryan = new File("names.txt");
  Scanner myscanner = new Scanner(Ryan);
  for(int i = 0; i < x.length; i++)
  {
   //System.out.print((i+1)+ "-Enter number->  ");
   x[i] = myscanner.nextLine();
  }
  myscanner.close();
 }
 public static int[] getArray(){//pg 212 section 6.7
  int[] Batch = new int[11];
  Scanner input = new Scanner(System.in);
  for(int i = 0; i < Batch.length; i++)
  {
   System.out.print((i+1)+ "-Enter number->  ");
   Batch[i] = input.nextInt();
  }
  return Batch;  
 }
 public static void printArray(String[] list)
 {
  for(int i = 0; i < list.length; i ++)
   System.out.println(list[i]);
 }
}