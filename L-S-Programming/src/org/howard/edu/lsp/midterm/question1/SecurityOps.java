package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
	/**
	 * Encrypts the text based on their index
	 * @param text accepts the text that needs to be encrypted
	 * @return returns the encrypted message with rearranging evenWords and oddWords, neglating different types of punctuations
	 */
	public static String encrypt(String text) {
        StringBuilder evenWords = new StringBuilder();
        StringBuilder oddWords = new StringBuilder();
        
        // replaces the punctuation, with the empty string
        text = text.replaceAll("[\\s\\p{Punct}]", "");
        for (int i = 0; i < text.length(); i++) {
            char word = text.charAt(i);
            
            if (Character.isLetterOrDigit(word)) {
                if (i % 2 != 0) { // if odd index, append it to oddWords
                	oddWords.append(word);
                } else { // if even index, append it to evenWords
                    evenWords.append(word);
                }
            }
        }

        return evenWords.toString() + oddWords.toString();
    }

}
