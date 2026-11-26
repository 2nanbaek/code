
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			int rn=0;
			int rm=0;
			
			int n1=0;
			int n2=0;
			int n3=0;
			
			int m1=0;
			int m2=0;
			int m3=0;
			
			n3=n%10; //4
			n=n/10; //73
			
			n2=n%10;
			n=n/10;
			
			n1=n;
			
			rn=(n3*100)+n2*10+n1;
			
			m3=m%10; //4
			m=m/10; //73
			
			m2=m%10;
			m=m/10;
			
			m1=m;
			
			rm=m3*100+m2*10+m1;
			
			if(rn>rm) {
				System.out.println(rn);
			}else {
				System.out.println(rm);
			}
		}
}
