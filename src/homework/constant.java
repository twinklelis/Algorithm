/*
[����]
������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�.
�̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���.
����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�.
����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

[�Է�]
ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.

[���]
ù° �ٿ� ����� ����� ����Ѵ�.

[�Է¿���]
734 893

[��¿���]
437
*/
package homework;
import java.util.Scanner;

public class constant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numArr = scanner.nextLine().split(" ");
		String[] num1Arr = numArr[0].split("");
		String[] num2Arr = numArr[1].split("");
		String num1 = "";
		String num2 = "";
		for(int i = num1Arr.length; i > 0; i--) {
			num1 += num1Arr[i-1];
		}
		for(int i = num2Arr.length; i > 0; i--) {
			num2 += num2Arr[i-1];
		}
		if(Integer.parseInt(num1)>Integer.parseInt(num2)) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}

}
