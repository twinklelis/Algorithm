/*
[����]
��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�, ���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� �ð�������� ������ �Ѵ�.
���ڸ� �ϳ� ������ ���̾��� ó�� ��ġ�� ���ư���, ���� ���ڸ� �������� ���̾��� ó�� ��ġ���� �ٽ� ������ �Ѵ�.
���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.
������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��.
��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ���� ���, UNUCIC�� 868242�� ����.
�ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

[�Է�]
ù° �ٿ� ���ĺ� �빮�ڷ� �̷���� �ܾ �־�����. �ܾ�� 2����~15���ڷ� �̷���� �ִ�.

[���]
ù° �ٿ� ���̾��� �ɱ� ���ؼ� �ʿ��� �ð��� ����Ѵ�.
 */
package homework;
import java.util.Scanner;

public class dial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		int plus = word.length();
		int time = 0;
		String[] wordArr = word.split("");
		for(int i = 0; i < wordArr.length; i++) {
			if(wordArr[i].equals("A")||wordArr[i].equals("B")||wordArr[i].equals("C")) {
				time += 2;
			}else if(wordArr[i].equals("D")||wordArr[i].equals("E")||wordArr[i].equals("F")) {
				time += 3;
			}else if(wordArr[i].equals("G")||wordArr[i].equals("H")||wordArr[i].equals("I")) {
				time += 4;
			}else if(wordArr[i].equals("J")||wordArr[i].equals("K")||wordArr[i].equals("L")) {
				time += 5;
			}else if(wordArr[i].equals("M")||wordArr[i].equals("N")||wordArr[i].equals("O")) {
				time += 6;
			}else if(wordArr[i].equals("P")||wordArr[i].equals("Q")||wordArr[i].equals("R")||wordArr[i].equals("S")) {
				time += 7;
			}else if(wordArr[i].equals("T")||wordArr[i].equals("U")||wordArr[i].equals("V")) {
				time += 8;
			}else {
				time += 9;
			}
		}
		time += plus;
		System.out.println(time);
	}

}
