/*
[����]
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
���� ���, 10�� ������ ������ 3�� �ȴ�.
"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

[�Է�]
ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����.
���ڿ��� O�� X������ �̷���� �ִ�.

[���]
�� �׽�Ʈ ���̽����� ������ ����Ѵ�.

[�Է¿���]
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX

[��¿���]
10
9
7
55
30
 */
package homework;
import java.util.Scanner;

public class oxQuiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine()); //�ݺ�Ƚ�� �Է�
		int[] resultArr = new int[num]; //������ ���� �迭 ����
		
		for(int i = 0; i < num; i++) { //�Է��� ����ŭ ���α׷� �ݺ�
			String[] oxArr = scanner.nextLine().split(""); //�ѱ��ھ� �ɰ��� �迭�� �ֱ� 
			int score = 0; //������ ����
			int result = 0; //����
			
			for(int k = 0; k < oxArr.length; k++) { //�������
				if(oxArr[k].equals("O")) { //���� O���
					score = score + 1; //���� ���� 1�� �ø���
					result += score; //������ ���� ���� ���ϱ�
				}else {
					score = 0; //���� ���� �ʱ�ȭ
				}
			}
			
			resultArr[i] = result; //������ ���� �迭�� ����
		}
		
		for(int i = 0; i < num; i++){ //���� �迭�� ���
			System.out.println(resultArr[i]);
		}
	}

}
