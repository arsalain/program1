package digit;
import java.util.Scanner;
public class Digit {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter a");
		  int n=sc.nextInt();
          int count=1;
          for(int i=1;i<=n;i++)
          {
        	  System.out.println(count);
        	  	 count =count+2;
          }           
       }
}
