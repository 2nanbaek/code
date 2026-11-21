/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0; i<t; i++) {
			int n=sc.nextInt();
			int m1=0;
			int m2=0;
			int m3=0;
			int m4=0;
			int m5=0;
			int m6=0;
			int m7=0;
			int m8=0;
			int quo=0;
			
			if(n>=50000) {
				quo=n/50000;
				n=n%50000;
				m1=quo;
			}if(n>=10000) {
				quo=n/10000;
				n=n%10000;
				m2=quo;
			}
			if(n>=5000) {
				quo=n/5000;
				n=n%5000;
				m3=quo;
			}if(n>=1000) {
				quo=n/1000;
				n=n%1000;
				m4=quo;
			}if(n>=500) {
				quo=n/500;
				n=n%500;
				m5=quo;
			}if(n>=100) {
				quo=n/100;
				n=n%100;
				m6=quo;
			}if(n>=50) {
				quo=n/50;
				n=n%50;
				m7=quo;
			}if(n>=10) {
				quo=n/10;
				n=n%10;
				m8=quo;
			}
			System.out.println("#"+(i+1));
			System.out.println(m1+" "+m2+" "+m3+" "+m4+" "+m5+" "+m6+" "+m7+" "+m8);
		}
	}
}