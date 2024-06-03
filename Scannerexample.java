package ch02.sec13;
import java.util.Scanner;
public class Scannerexample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x 값 입력:");
		String strX = scanner.nextLine();
		int x=Integer.parseInt(strX);
		
		System.out.println("y 값 입력:");
		String strY = scanner.nextLine();
		int y=Integer.parseInt(strY);
		
		int result=x+y;
		System.out.println("x+y:"+result);
		System.out.println();
		
		while(true) {
			System.out.println("문자 입력열:");
			String data= scanner.nextLine();
			if(data.equals("입력중단")) {
				break;
			}
			System.out.println("출력 문자열:"+data);
			System.out.println();
		}
		System.out.println("종료");
	}

}
