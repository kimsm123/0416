import java.util.Scanner; // package

public class First {

	//argument=args(a라고 써도 가능)
	public static void main(String[] a) { 
		/*
		 * int num1 = 10; int num2 = 20;
		 * 
		 * int sum = 0; int sum1 = 0;
		 * 
		 * sum = num1 + num2; sum1 = num1*num2;
		 * 
		 * System.out.println(sum); System.out.println(sum1);
		 */
		
		/*
		 * int i = 97; //정수의 기본은 int double f = 3.15f; //실수의 기본형은 double(3.14뒤의f는 기본은
		 * double이지만 float실수로 나타나겠다는 말)
		 * 
		 * System.out.printf("%d\n", i ); System.out.printf("%5d\n", i );
		 * System.out.printf("%05d\n", i );
		 * 
		 * System.out.printf("%f\n", f); System.out.printf("%4.1f\n", f);
		 * System.out.printf("%4.2f\n", f);
		 */
		Scanner in  = new Scanner(System.in);//Scanner 객체 생성(객체이름:in)
		System.out.print("첫번째 정수를 입력 :  ");
		int x = in.nextInt();// 문자를 정수로 변환=nextInt
		System.out.print("두번째 정수를 입력 : ");
		int y = in.nextInt();
		System.out.printf("%d * %d = %d입니다.", x, y, x * y);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
