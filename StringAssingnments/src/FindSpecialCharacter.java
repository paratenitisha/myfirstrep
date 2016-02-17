
public class FindSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to check for valid string or not.
		
		String str=")(";
		String str1="))";
		
		int count=0;
		int count1=0;
		int k;

		System.out.println(str.length());
		
		if(str.charAt(0)==')'){
			
		for(k=0;k<=str.length()-1;k++){
		if(str.charAt(k)=='('){
		count++;}
		else if(str.charAt(k)==')'){
			count--;}
		}
		
		if(count==0)
		{
		System.out.println(count);
		
		System.out.println(count1);
		System.out.println("valid");
		}
		else
		{
			System.out.println("not valid");
			
		}

	}
	
	else {
		System.out.println("invalid");}

}
}