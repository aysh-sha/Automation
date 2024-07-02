package stringpractice2;

public class LastIndex {


    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // Loop through each letter of the alphabet
        for (char letter : alphabet.toCharArray()) {
            int lastIndex = str.lastIndexOf(letter);
            System.out.print(lastIndex + " ");
        }
    }
}