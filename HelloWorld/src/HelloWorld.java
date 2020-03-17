import java.util.concurrent.TimeUnit;

public class HelloWorld {
	
	public static void main(String[] args) {
		sayHello();
		for (int i = 50; i < 2000; i *= 3) {
			System.out.println(i);
		}
		int i = isGood(30) ? 75 : isGood(25) ? 30 : 100;
		System.out.println(i);
		sayBye();
	}

	private static boolean isGood(int i) {
		return i % 15 == 0 && i * 2 < 75;
	}

	static void sayHello() {
		String x = "hello";
	}

	static void sayBye() {
		System.out.println("bye");
	}
}
