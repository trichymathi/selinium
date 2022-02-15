package assignment;

public class Charoccurance {

	public static void main(String[] args) {
		String occ = "Welcome To Chennai";
		int count=0;
		for(int i=0;i<occ.length();i++) 
			//System.out.println(occ.charAt(i));
			{
			if(occ.charAt(i)=='e') {
				count++; //count=count+1
			}

		}
			if(count>0) 
				System.out.println(count);
	}
}
