/*
[����]
ī���뿡�� ���� �α� �ִ� ���� ������ ��Ģ�� ����� ����.
ī���� ���� 21�� ���� �ʴ� �ѵ� ������, ī���� ���� �ִ��� ũ�� ����� �����̴�.������ ī���븶�� �پ��� ������ �ִ�.
�ѱ� �ְ��� ���� ��� �������� ���ο� ���� ��Ģ�� ����� ���, â���̿� �����Ϸ��� �Ѵ�.
������ ������ ���迡�� �� ī�忡�� ���� ������ ���� �ִ�.
�� ����, ������ N���� ī�带 ��� ���ڰ� ���̵��� �ٴڿ� ���´�. �׷� �Ŀ� ������ ���� M�� ũ�� ��ģ��.
���� �÷��̾�� ���ѵ� �ð� �ȿ� N���� ī�� �߿��� 3���� ī�带 ���� �Ѵ�.
���� ���� �����̱� ������, �÷��̾ �� ī���� ���� M�� ���� �����鼭 M�� �ִ��� ������ ������ �Ѵ�.
N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ���� ����Ͻÿ�.

[�Է�]
ù° �ٿ� ī���� ���� N(3 �� N �� 100)�� M(10 �� M �� 300,000)�� �־�����.
��° �ٿ��� ī�忡 ���� �ִ� ���� �־�����, �� ���� 100,000�� ���� �ʴ´�.
���� M�� ���� �ʴ� ī�� 3���� ã�� �� �ִ� ��츸 �Է����� �־�����.

[���]
ù° �ٿ� M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ����Ѵ�.

[�Է¿���]
5 21
5 6 7 8 9

[��¿���]
21
 */
package homework;
import java.util.Scanner;
public class blackjack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] first = scanner.nextLine().split(" ");
		int card = Integer.parseInt(first[0]);
		int num = Integer.parseInt(first[1]);
		
		String[] cardArr = scanner.nextLine().split(" ");
		int[] cardNum = new int[cardArr.length];
		for(int i = 0; i < cardArr.length; i++) {
			cardNum[i] = Integer.parseInt(cardArr[i]);
		}
		
		int max = 0;
		
		for(int i = 0; i < cardNum.length; i++) {
			for(int x = i+1; x < cardNum.length; x++) {
				for(int y = x+1; y < cardNum.length; y++) {
					int score = cardNum[i] + cardNum[x] + cardNum[y];
					if(score<=num) {
						if(score > max) {
							max = score;
						}
					}
				}
			}
		}
		System.out.println(max);
	}

}
