
public class StringReverseAss {

	
	
	//to reverse a string
	public static void main(String[] args) {
		
	String orgstring ="welcome";

	int len=orgstring.length();
	int i;
	
	
	System.out.println("The original string is "+orgstring);
	//for(i=0;i<=len-1;i++)
	
	System.out.print("The string in reverse order is ");
	for(i=len-1;i>=0;i--)
		
	{
		
	
		
		System.out.print(orgstring.charAt(i));
	}
	
		
		
		// TODO Auto-generated method stub

	}

}
