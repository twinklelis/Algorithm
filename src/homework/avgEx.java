/*
[����]
�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�.
�ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

[�Է�]
ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����.
��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.

[���]
ù° �ٿ� ���ο� ����� ����Ѵ�. ������� ����/��� ������ 10-2���� ����Ѵ�.

[�Է¿���]
3
40 80 60

3
10 20 30

4
1 100 100 100

5
1 2 4 8 16

2
3 10

[��¿���]
75.00
66.666667
75.25
38.75
65.00
 */

package homework;
import java.util.Scanner;
public class avgEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		String score = scanner.nextLine();
		String[] scoreArr = score.split(" ");
		int max = 0;
		for(int i = 0; i < scoreArr.length; i++) {
			if(Integer.parseInt(scoreArr[i]) > max){
				max = Integer.parseInt(scoreArr[i]);
			}
		}
		double sum = 0.0;
		for(int i = 0; i < scoreArr.length; i++) {
			double score2 = Double.parseDouble(scoreArr[i])/max*100;
			sum += score2;
		}
		double avg = sum/scoreArr.length;
		System.out.println(avg);
	}

}
