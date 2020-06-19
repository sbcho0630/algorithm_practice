package scan;
import java.util.Scanner;
/*
 * 정수2개  출력하기
 */
public class ScanBasic04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.print(i+" "+j);
	}
}