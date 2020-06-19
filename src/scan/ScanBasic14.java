package scan;

import java.util.*;

/*
		 다섯 자리로 이루어진 1개의 정수를 입력받는다.
		(단, 10,000 <= 입력받는 수 <= 99,999 )
		
		출력
		각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력한다.
		
		입력 예시   
		75254
		출력 예시
		[70000]
		[5000]
		[200]
		[50]
		[4]
 */
public class ScanBasic14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int a = i / 10000;
		int b = i % 10000 /1000;
		int c = i % 1000 /100;
		int d = i % 100 /10;
		int e = i % 10 ;
		System.out.printf("["+a*10000+"]"+"%n"+"["+b*1000+"]"+"%n"+"["+c*100+"]"+"%n"+"["+d*10+"]"+"%n"+"["+e+"]");

	}

}
