package creational.singleton;

public class SingletonLazy {

	private static SingletonLazy uniqueInstance;
	
	public static SingletonLazy getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonLazy();
		}
		return uniqueInstance;
	}
	
	private SingletonLazy() {
	}
	
}
