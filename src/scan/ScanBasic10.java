package scan;
import java.util.*;
/*
 *  주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력된다.
	(입력값은 가상의 주민번호이다.)
	ex)110011-0000000
	
	'-'를 제외한 주민번호 13자리를 모두 붙여 출력한다.

 */
public class ScanBasic10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String jumin=sc.next();
		
		jumin = jumin.replaceAll("-", "");
		System.out.println(jumin);
		}

}