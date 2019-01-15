package behaviour.strategy;

import org.junit.Test;

public class EncryptorTest {

	@Test
	public void EncryptTest() {
		String plainText = "This is plain text";
		
		EncryptionStrategy aesStrategy = new AesEncryptionStrategy();
		Encryptor aesEncryptor = new Encryptor(aesStrategy);
		aesEncryptor.setPlainText(plainText);
		aesEncryptor.encrypt();
		
		EncryptionStrategy blowfishStrategy = new BlowfishEncryptionStrategy();
		Encryptor blowfishEncryptor = new Encryptor(blowfishStrategy);
		blowfishEncryptor.setPlainText(plainText);
		blowfishEncryptor.encrypt();
	}

}
