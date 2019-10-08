/*
[문제]
전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다.
숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다.
즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오.

[입력]
첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어는 2글자~15글자로 이루어져 있다.

[출력]
첫째 줄에 다이얼을 걸기 위해서 필요한 시간을 출력한다.
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
