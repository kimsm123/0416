import java.util.Scanner; // package

public class First {

	//argument=args(a��� �ᵵ ����)
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
		 * int i = 97; //������ �⺻�� int double f = 3.15f; //�Ǽ��� �⺻���� double(3.14����f�� �⺻��
		 * double������ float�Ǽ��� ��Ÿ���ڴٴ� ��)
		 * 
		 * System.out.printf("%d\n", i ); System.out.printf("%5d\n", i );
		 * System.out.printf("%05d\n", i );
		 * 
		 * System.out.printf("%f\n", f); System.out.printf("%4.1f\n", f);
		 * System.out.printf("%4.2f\n", f);
		 */
		Scanner in  = new Scanner(System.in);//Scanner ��ü ����(��ü�̸�:in)
		System.out.print("ù��° ������ �Է� :  ");
		int x = in.nextInt();// ���ڸ� ������ ��ȯ=nextInt
		System.out.print("�ι�° ������ �Է� : ");
		int y = in.nextInt();
		System.out.printf("%d * %d = %d�Դϴ�.", x, y, x * y);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
