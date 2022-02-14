package assignment;

public class Palindrome {

	public static void main(String[] args) {
	
		String palin=new String("MATHI");
		String rev =new String("");
		//char[] chararray=palin.toCharArray();
		for(int i =palin.length()-1;i>=0;i--) {
			System.out.println(palin.charAt(i));
			rev=rev+palin.charAt(i); //concadinate a string
			//System.out.println(rev);
		}
		if(palin.equals(rev)) {
		System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	
	}
}



				