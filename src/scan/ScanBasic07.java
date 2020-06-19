package scan;
import java.util.Scanner;
/*
 * 정수 1개 입력받아서 3번 출력하기
 */
public class ScanBasic07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println(i+" "+i+" "+i);
	}

}
