/*
[����]
���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.

[�Է�]
ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����.
������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

[���]
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.

[����]
5									40.000%
5 50 50 70 80 100					57.143%
7 100 95 90 80 70 60 50				33.333%
3 70 90 80							66.667%
3 70 90 81							55.556%
9 100 99 98 97 96 95 94 93 91
*/
package homework;
import java.util.Scanner;

public class sadTruth {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		double avg = 0.0;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0; i < num; i++) {
			String score = scanner.nextLine();
			String[] scoreArr = score.split(" ");
			double student = Double.parseDouble(scoreArr[0]);
			for(int x = 1; x < scoreArr.length; x++) {
				sum = sum + Integer.parseInt(scoreArr[x]);
				avg = sum/student;
			}
			for(int x = 1; x < scoreArr.length; x++) {
				if(Double.parseDouble(scoreArr[x]) > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/student)*100);
		}
	}
}