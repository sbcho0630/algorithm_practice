package scan;
import java.util.Scanner;
/*
 * 정수 2개로 시간 출력하기
 */
public class ScanBasic08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String time=sc.next();
		String min=time.substring(time.lastIndexOf(":")+1);
		int index=time.indexOf(":");
		String time2=time.substring(0,index);
		System.out.print(time2+":"+min);
	}
}