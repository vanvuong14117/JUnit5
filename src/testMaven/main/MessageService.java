package testMaven.main;

public class MessageService {
	public static String get() {
		return "Hello JUnit 5";
	}

	// odd so le
	public static boolean isOdd(int number) {
		return number % 2 != 0;
	}

	// even so chan
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
}
