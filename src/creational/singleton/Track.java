package creational.singleton;

public class Track extends Thread  {

	@Override
	public void run() {
		System.out.println("Running Thread!");
		super.run();
	}

	
}
