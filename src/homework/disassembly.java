/*
[���Ʈ����]
���� ������ �˰�����, ��� ����� ���� �˻��ϴ� ���Ʈ ���� �˰���

[����]
� �ڿ��� N�� ���� ��, �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ��Ѵ�.
� �ڿ��� M�� �������� N�� ���, M�� N�� �����ڶ� �Ѵ�.
���� ���, 245�� �������� 256(=245+2+4+5)�� �ȴ�. ���� 245�� 256�� �����ڰ� �ȴ�.
����, � �ڿ����� ��쿡�� �����ڰ� ���� ���� �ִ�. �ݴ��, �����ڰ� ���� ���� �ڿ����� ���� �� �ִ�.
�ڿ��� N�� �־����� ��, N�� ���� ���� �����ڸ� ���س��� ���α׷��� �ۼ��Ͻÿ�.

[�Է�]
ù° �ٿ� �ڿ��� N(1 �� N �� 1,000,000)�� �־�����.

[���]
ù° �ٿ� ���� ����Ѵ�. �����ڰ� ���� ��쿡�� 0�� ����Ѵ�.

[���� �Է�]
216

[���� ���]
198
*/
package homework;
import java.util.Scanner;

public class disassembly {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		int goal = 0;
		for(int i = 1; i <= num; i++) {
			String num2 = "" + i;
			int result = Integer.parseInt(num2);
			for(int x = 0; x < num2.length(); x++) {
				int plus = Integer.parseInt(num2.substring(x, x+1));
				result = result + plus;
			}
			if(result == num) {
				goal = Integer.parseInt(num2);
				break;
			}
		}
		System.out.println(goal);
	}

}
