
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
    	String str=sc.next();
    	String str1=sc.next();
    	String str2=sc.next();
    	
    	if(UserMainCode.stringFinder(str, str1, str2)==1)
    	{
    		System.out.println("yes");
    	}
    	else
    	{
    		System.out.println("no");
    	}
      
    }
}