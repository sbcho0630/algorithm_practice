package scan;
import java.util.*;
/*
 * 실수 입력받아서 소수점 앞의 수와 뒤의 수로 나누어서 출력하기
 * ex) 3.14입력
 * 		====
 * 		3
 * 		14 
 * 		출력
 */

public class ScanBasic12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int dot=a.indexOf(".");
		String front = a.substring(0,dot);
		int f=Integer.parseInt(front);
		String back=a.substring(a.indexOf(".")+1);
		int b=Integer.parseInt(back);
		System.out.printf("%d%n%d", f, b);
	}
}