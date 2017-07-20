public class MyGenericArrayListTester{
	public static void main(String[] args ) {
		MyGenericArrayList<Integer> mal = new MyGenericArrayList<Integer>();
		for (int i = 0; i < 6; i++)
			mal.addElement(i);
		System.out.println(mal);
		System.out.println(mal.getElement(6));
		System.out.println(mal.findElement(3));
		System.out.println(mal.findElement(7));
		System.out.println(mal.removeElement(5));
		for (int i = 12; i < 26; i++)
			mal.addElement(i);
		System.out.println(mal);
		System.out.println(mal.removeElement(14));
	}
	
}
