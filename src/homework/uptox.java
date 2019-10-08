/*
[문제]
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

[입력]
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

[출력]
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

[입력예제]
10 5
1 10 4 9 2 3 8 5 7 6

[출력예제]
1 4 2 3
*/
package homework;
import java.util.Scanner;
public class uptox {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] first = scanner.nextLine().split(" ");
		int leng = Integer.parseInt(first[0]);
		int num = Integer.parseInt(first[1]);
		String[] numArr = scanner.nextLine().split(" ");
		for(int i = 0; i < leng; i++) {
			int result = Integer.parseInt(numArr[i]);
			if(result < num) {
				System.out.print(result);
				System.out.print(" ");
			}
		}
	}

}
