package scan;
import java.util.*;
/*
	입력한 문자열 그대로 출력하기

 */
public class ScanBasic11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();   //Scanner클래스의 next함수는 공백에서 끊어지므로 nextLine을 이용해 공백포함한 한줄 그대로 출력
		System.out.print(b);   
		}
}