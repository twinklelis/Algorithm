/*
[����]
���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

[�Է�]
ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.

[���]
X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.

[�Է¿���]
10 5
1 10 4 9 2 3 8 5 7 6

[��¿���]
1 4 2 3
*/
package homework;
import java.util.Scanner;
public class uptox {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] first = scanner.nextLine().split(" ");
		int leng = Integer.parseInt(first[0]);
		int num = Integer.parseInt(first[1]);
		String[] numArr = scanner.nextLine().split(" ");
		for(int i = 0; i < leng; i++) {
			int result = Integer.parseInt(numArr[i]);
			if(result < num) {
				System.out.print(result);
				System.out.print(" ");
			}
		}
	}

}
