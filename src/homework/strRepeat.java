/*
[문제]
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
S에는 QR Code "alphanumeric" 문자만 들어있다.
QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

[입력]
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다.
S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 

[출력]
각 테스트 케이스에 대해 P를 출력한다.;

[입력예제]
2
3 ABC
5 /HTP

[출력예제]
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
