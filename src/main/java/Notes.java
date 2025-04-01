
class Notes {
	public static void main(String[] args) {
		System.out.println(fib(5));
	}

	public static int fib(int n) {

		// base case: when it stops
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		// recursive call: what we repeat
		return fib(n - 1) + fib(n - 2);
	}
  	
}
