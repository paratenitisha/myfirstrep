
public class HashcodeAndEqualsString {
//use of hashcode and equals methods 
	public static void main(String[] args) {
		
		

		String str1=new String("Hello World");
		
		String str2=new String("Hello World");
		
	System.out.println("The hashcode for first String is "+str1.hashCode());

	System.out.println("The hashcode for second String is "+str2.hashCode());
	
	if(str1.equals(str2)){
		System.out.println("Strings are equal");
	}
	else
		System.out.println("Strings are not equal");
			
			
			
		
	
		
		
		// TODO Auto-generated method stub

	}

}
