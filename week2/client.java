public class client {
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before the call, x is " + x);
		increment.increment(x);
		System.out.println("after the call, x is " + x);
	}
}