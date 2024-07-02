package stringpractice2;

public class FirstIndex {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		
		for(char ch : alphabets.toCharArray())
		{
			int index = str.indexOf(ch);
			System.out.print(index+ " ");
		}
	}
}