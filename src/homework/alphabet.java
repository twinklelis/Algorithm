/*
[���� ����]
���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�.
�� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

[���� ����]
���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
 * */
package homework;
import java.util.Scanner;
public class alphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] strArray = str.split(" ");
		
		for(int i = 0; i < strArray.length; i++) {
			char[] charArr = strArray[i].toCharArray();
			for(int k = 0; k < charArr.length; k++) {
				if(k==0 || k%2==0) {
					if(charArr[k]>='A'&&charArr[k]<='Z') {
						System.out.print(charArr[k]);
					}else {
						charArr[k] -= 32;
						System.out.print(charArr[k]);
					}
				}
				if(k%2==1) {
					if(charArr[k]>='A'&&charArr[k]<='Z') {
						charArr[k] += 32;
						System.out.print(charArr[k]);
					}else {
						System.out.print(charArr[k]);
					}
				}
			}
			System.out.print(" ");
		}
	}
}
