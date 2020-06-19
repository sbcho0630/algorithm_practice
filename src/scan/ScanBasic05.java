package scan;
import java.util.Scanner;
/*
 * 문자2개  순서바꿔 출력하기
 */
public class ScanBasic05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String i=sc.next();
		String j=sc.next();
		System.out.print(j+" "+i);
	}
}