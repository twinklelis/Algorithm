/*
[����]
���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�.
S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.

[�Է�]
ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����.
�� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), ���ڿ� S�� �������� ���еǾ� �־�����.
S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 

[���]
�� �׽�Ʈ ���̽��� ���� P�� ����Ѵ�.;

[�Է¿���]
2
3 ABC
5 /HTP

[��¿���]
AAABBBCCC
/////HHHHHTTTTTPPPPP
 */
package homework;
import java.util.Scanner;
public class strRepeat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = Integer.parseInt(scanner.nextLine());
		int[] repeat = new int[test];
		String[] str = new String[test];
		
		for(int i = 0; i < test; i++) {
			String word = scanner.nextLine();
			String[] wordArr = word.split(" ");
			repeat[i] = Integer.parseInt(wordArr[0]);
			str[i] = wordArr[1];
		}
		
		for(int i = 0; i <test; i++) {
			for(int y = 0; y < str[i].length(); y++) {
				for(int k = 0; k < repeat[i]; k++) {
					System.out.print(str[i].charAt(y));
				}
			}
			System.out.println();
		}
	}

}
