/*
�ڹ�å 565p

[����]
�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

[�Է�]
ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.

[���]
ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.

[�Է¿���]
39
40
41
42
43
44
82
83
84
85

[��¿���]
6
 */
package homework;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class rest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();	
		int count = 0;
		int[] restArr = new int[10];
		for(int i = 0; i < 10; i++) {
			int num = scanner.nextInt();
			if(num < 0 || num > 1000) {
				System.out.println("������ ������ 0~1000�Դϴ�.");
			}else {
				restArr[i] = (int)num%42;
			}
		}
		for(int result : restArr) {
			set.add(result);
		}
		System.out.println(set.size());
	}

}
