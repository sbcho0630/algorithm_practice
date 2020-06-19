package scan;
import java.util.*;
/*
 *		문자열 입력받아서  한 char씩 줄바꿔서 출력
 */

public class ScanBasic13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		
		for(int i=0;i<a.length();i++) {
			System.out.println("'"+a.charAt(i)+"'");
		}
	}
}