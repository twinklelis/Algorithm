/*
[����]
0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�.
���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�.
�� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�.
���� ���� ����. 26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�.
6+8 = 14�̴�. ���ο� ���� 84�̴�.
8+4 = 12�̴�. ���ο� ���� 42�̴�.
4+2 = 6�̴�. ���ο� ���� 26�̴�.
���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

[�Է�]
ù° �ٿ� N�� �־�����. N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.


[���]
ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.

[����]
26			4
55			3
1			60
*/
package homework;
import java.util.Scanner;

public class plusCycle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numStr = scanner.nextLine(); //ù �� �Է�
		int num = Integer.parseInt(numStr); //int �� ����
		int x = 0;
		int y = 0;
		int z = 0;
		int second = 0;
		int result = 0;

		if(num < 0 || num > 99) {
			System.out.println("0�� 99������ ������ �Է����ֽñ� �ٶ��ϴ�.");
			System.exit(0);
		}
		
		if(num<10) {
			second = num + (num*10);
			x = (int)second/10;
			y = (int)second%10;
			result++;
		}else {
			x = (int)num/10;
			y = (int)num%10;
		}
		
		while(true) {
			result++;
			z = x+y;
			if(z>=10) {
				z=z%10;
			}
			second = z+(y*10);
			if(second == num) {
				System.out.println(result);
				break;
			}else {
				x = (int)second/10;
				y = (int)second%10;
			}
		}
	}

}
