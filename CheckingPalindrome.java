package controller;

public class CheckingPalindrome {

	public static void main(String[] args) {
		if (args.length != 1) System.err.println("Wrong num of arguments");
		int palindrome = Integer.parseInt(args[0]);
		System.out.println(isPalindrome(palindrome));
		
	}
	
	//Without changing to string
	public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int digitos = (int)Math.floor(Math.log10(x) + 1);
        int veces = digitos/2 + digitos%2;
        int supLimit = digitos -1;
        int supCopy = x, lowCopy = x;
        int sup10, low10 = 10;
        for (int i=0; i<veces; i++) {
        	sup10 = (int)Math.pow(10, supLimit);
        	int supDigit = (supCopy/sup10)%10;
        	supCopy=supCopy%sup10;
        	supCopy+=sup10;
        	supLimit--;
        	int lowDigit = lowCopy%low10;
        	lowCopy = lowCopy/low10;
        	if (supDigit != lowDigit) return false;
        }
        return true;
    }
	
	//Changing to string
	public static boolean isPalindrome2(int x) {
		String num = Integer.toString(x);
		int tam = num.length();
		for (int i=0; i<tam; i++) {
			if (num.charAt(i) != num.charAt(tam-1-i)) return false;
		}
		return true;
	}

}
