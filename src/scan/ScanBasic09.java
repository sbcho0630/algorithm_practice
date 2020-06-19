package scan;
import java.util.*;
/*
 *  
 *  입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
	(%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
	
	입력 예시   
	2013.8.5
	
	출력 예시
	2013.08.05
 */
public class ScanBasic09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		String []tokens=date.split("\\.");
		List list=new ArrayList();
		for(int i=0;i<tokens.length;i++){
			list.add(Integer.parseInt(tokens[i]));
		}
		System.out.printf("%04d.%02d.%02d",list.get(0),list.get(1),list.get(2));
		}

}