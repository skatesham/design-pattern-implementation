package behaviour.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Encryptor {

	private String plainText;
	private EncryptionStrategy strategy;

	public Encryptor(final EncryptionStrategy strategy) {
		this.strategy = strategy;
	}

	public void encrypt() {
		strategy.encryptData(plainText);
	}

}
