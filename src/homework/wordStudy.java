/*
[����]
���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

[�Է�]
ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.

[���]
ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.

[�Է¿���]
Mississipi
zZa
z
baaa

[��¿���]
?
Z
Z
A
 */
package homework;
import java.util.Arrays;
import java.util.Scanner;

public class wordStudy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String realWord = word.toUpperCase();
		String[] wordArr = realWord.split("");
		Arrays.sort(wordArr);
		
		int result = 1;
		int count = 1;
		String al = "";
		String real = "";
		boolean q = false;
		
		for(int i = 0; i < wordArr.length; i++) {
			if(i == 0) {
				al = wordArr[i];
				real = al;
			}else {
				if(al!=wordArr[i]) {
					if(result > count) {
						count = 1;
					}else if(result < count) {
						result = count;
						real = al;
						count = 1;
						q = false;
					}else {
						count = 1;
						q = true;
					}
					al = wordArr[i];
					count++;
				}else {
					al = wordArr[i];
					count++;
				}
			}
		}
		
		if(q) {
			System.out.println("?");
		}else {
			System.out.println(real);
		}
	}

}
