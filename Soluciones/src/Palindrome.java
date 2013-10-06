public class Palindrome {
	public static void main (String[] args) {
		for(String s : args) {
			if (EsPalindrome(s)) {
				System.out.println(s + " SI es palindrome");
			} else {
				System.out.println(s + " NO es palindrome");
			}
		}		
	}
	
	public static boolean EsPalindrome(String palabra) {
		int largo = palabra.length();
		
		for (int i = 0; i < largo/2; ++i) {
			if (palabra.charAt(i) != palabra.charAt(largo-1-i)) {
				return false;
			}
		}
		
		return true;
	}
}