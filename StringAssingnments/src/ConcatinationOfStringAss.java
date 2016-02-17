
public class ConcatinationOfStringAss {

	
	
	//take a string this is nice and after execution string should be changed to this1 is1 nice1.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String originalstr="This is nice ";
		int len=originalstr.length();
		String[] str=originalstr.split(" ");
		
		int j=0;
		String result=" ";
		for(String word:str) {
			result += word + ++j + " ";
			
			
		}
		
		System.out.println(result);
		
		//print the sentence in reverse order 
		
     String result1=" ";
     //String word=" ";
     String [] arr=result.split(" ");
     int len1=arr.length;
     int k=0;
     for(k=len1-1;k>=0;k--)
     {
    	 result1 += arr[k].toString();
    	 
    	 
     }
     System.out.println("After revese "+result1);
		
	}

}
