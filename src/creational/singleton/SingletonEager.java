package creational.singleton;

public class SingletonEager {

	private static final SingletonEager instance = new SingletonEager();
	
	public static SingletonEager getInstance() {
		return instance;
	}
	
	public SingletonEager() {
	}
}
