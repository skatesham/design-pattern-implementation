package creational.singleton;

public class ThreadSafeSingleton {

	private ThreadSafeSingleton() {
	}

	private static volatile ThreadSafeSingleton instance;

	private static Object mutex = new Object();

	public static ThreadSafeSingleton getInstance() {
		ThreadSafeSingleton result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null) {
					instance = result = new ThreadSafeSingleton();
				}
			}
		}
		return result;
	}

}
