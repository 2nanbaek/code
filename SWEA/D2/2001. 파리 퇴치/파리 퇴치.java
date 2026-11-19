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
			int m=sc.nextInt();
			
			
			int max=0;
			
			int[][] arr=new int[n][n];
			
			for(int r=0; r<n; r++) {
				for(int c=0; c<n;c++) {
					arr[r][c]=sc.nextInt();
				}
			}
			
			for(int r1=0;r1<=n-m;r1++) {
				for(int c1=0;c1<=n-m;c1++) {
					
					int sum=0;
					
					for(int r2=0; r2<m; r2++) {
					    for(int c2=0; c2<m; c2++) {

					        sum+=arr[r1+r2][c1+c2];
					        if(sum>max) {
								max=sum;
							}
					    }
					}
					
				}
				
			}
			System.out.println("#"+(i+1)+" "+max);
		}
	}
}