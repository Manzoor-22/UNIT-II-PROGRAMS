import java.util.Scanner;

public class CodeChef2 {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
		while(t != 0){
    		int a1, a2, b1, b2;
    		a1 = sc.nextInt();
    		a2 = sc.nextInt();
    		b1 = sc.nextInt();
    		b2 = sc.nextInt();
    		
    		int nea = a1 - a2;
    		int neb = b1 - b2;
    		
    		if(nea + neb < 0)
    		    System.out.println("YES");
    		else
    		    System.out.println("NO");
    		    
    		t--;
		}
	}
}
