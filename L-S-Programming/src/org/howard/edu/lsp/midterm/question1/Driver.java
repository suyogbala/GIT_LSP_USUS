package org.howard.edu.lsp.midterm.question1;

public class Driver {

	public static void main(String[] args) {
		// making the object and passing the text
		SecurityOps test = new SecurityOps();
		String encryptedText = test.encrypt("I love CSCI363");
        System.out.println("Encrypted text: " + encryptedText);

	}

}
