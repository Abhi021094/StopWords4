
import java.util.Scanner;  
import java.io.*;

public class StopWords4 {
	

	
	public static void main(String args[]) throws IOException{
		long startTime = System.currentTimeMillis();
		String text="";
		int temp=0;
		String s1;
		
		
		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\akumar3\\Desktop\\Abhi\\Abhi1.txt"));
		
		while((s1=bf.readLine())!=null) {
			System.out.println(s1);
		
		text+=" "+s1+" ";
		
		}
	
		
		                                                            
//	bf.close();
		
		System.out.println("Enter the word to be searched");
		  Scanner sc=new Scanner(System.in);  
		String finder=sc.nextLine(); 
		
	
		sc.close();
		
	//	char ch=s1.charAt(text.indexOf(finder,temp)+finder.length()+1);
	
		try{
		
		int indx=text.indexOf(finder,temp)+finder.length();
//		System.out.println("index of next"+indx);
		char ch=text.charAt(indx);
		int indx1=text.indexOf(finder,temp)-1;
		if(indx1<0){
			indx1=0;
		}
		char ch1=text.charAt(indx1);
//		System.out.println("character"+ch);
		
		
	
			if((text.indexOf(finder)>=0)&& ch==' ' && ch1==' '){
		
		if(indx<0 ||indx1<0){
				
		indx=indx1=0;
		System.out.println("starting indexof "+finder +" ="+text.indexOf(finder,temp)+"    last index "+(finder.length()+text.indexOf(finder,temp)-1));

			
			temp=text.indexOf(finder,temp)+1;
		}
			if(text.indexOf(finder,temp)>=0){
			for( int i=0;i<9;i++) {

			 indx=text.indexOf(finder,temp)+finder.length();
			 ch=text.charAt(indx);
			  indx1=text.indexOf(finder,temp)-1;
			  ch1=text.charAt(indx1);
		
		if((text.indexOf(finder)>=0)&& ch==' '){
		
			
			
			if(text.lastIndexOf(finder)==text.indexOf(finder,temp)) {
					
				i=10;
					
			}
			
			System.out.println("starting indexof "+finder +" ="+text.indexOf(finder,temp)+"   last index "+(finder.length()+text.indexOf(finder,temp)-1));
			
		}	
		
		temp=text.indexOf(finder,temp)+1;
		
		}
			}
		}
	
		else
			{System.out.println("string not found");	
		}
			
/*			if(text.indexOf(finder)>=0 && ch1!=' '){
				System.out.println("string not found");	
		}*/
		bf.close(); 
		
		
		long endTime   = System.currentTimeMillis();
		long totalTime = (endTime - startTime); 
		System.out.println("total time of exec  = "+totalTime);
		
		}
		catch(StringIndexOutOfBoundsException e){
			
		}
	}



}



	
	
	
	



