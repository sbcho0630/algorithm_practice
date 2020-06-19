package scan;
import java.util.Scanner;
/*
 * float형 소수점 2자리 출력하기
 */
public class ScanBasic06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float i=sc.nextFloat();
		System.out.printf("%.2f",i);
	}
}