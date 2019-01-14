package creational.singleton;

public class FactoryManager {

	private static FactoryManager instance = null;

	private FactoryManager() {
	}

	public static FactoryManager getInstance() {
		if (instance == null) {
			instance = new FactoryManager();
		}
		return instance;
	}

	private int numTracks = 5;

	public void startTracks() {
		for (int i = 0; i < numTracks; i++) {
			Track t = new Track();
			t.start();
		}
	}

	public static void main(final String[] args) {
		FactoryManager fm = FactoryManager.getInstance();
		fm.startTracks();
	}

}
