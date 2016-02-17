
public class SubStringAss {

	
	//to find the substring in a given string and replace it with another substring.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  givstring="welcome";
		
		System.out.println("The string is "+givstring);
		System.out.println("The substring is "+givstring.substring(3,7));
		
		
		System.out.println("Replacing the substring with done "+givstring.substring(3,7));
		
		String chastring=givstring.replaceFirst("come", "ldone");
		
		//System.out.println("test"+chastring);
		
		System.out.println("The string is after replacement is "+chastring);
		
		
	}
}
