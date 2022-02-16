package week2;

public class ReverseOfEvenWords {

	public static void main(String[] args) {
		String input = "I am software tester ";
		String[] word = input.split(" ");
		//System.out.println(word);
		for (int i = 0; i < word.length; i++) {
			if(i%2==1) {
				for (int j = word[i].length() -1; j >=0; j--) {
					System.out.print(word[i].charAt(j));
				}
				System.out.print(" ");
			}
			else {
				System.out.print(word[i]+" ");
			}
			
		}

	}

}
