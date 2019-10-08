/*
[문제]
0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
다음 예를 보자. 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다.
6+8 = 14이다. 새로운 수는 84이다.
8+4 = 12이다. 새로운 수는 42이다.
4+2 = 6이다. 새로운 수는 26이다.
위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

[입력]
첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.


[출력]
첫째 줄에 N의 사이클 길이를 출력한다.

[예제]
26			4
55			3
1			60
*/
package homework;
import java.util.Scanner;

public class plusCycle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numStr = scanner.nextLine(); //첫 수 입력
		int num = Integer.parseInt(numStr); //int 로 저장
		int x = 0;
		int y = 0;
		int z = 0;
		int second = 0;
		int result = 0;

		if(num < 0 || num > 99) {
			System.out.println("0과 99사이의 정수를 입력해주시기 바랍니다.");
			System.exit(0);
		}
		
		if(num<10) {
			second = num + (num*10);
			x = (int)second/10;
			y = (int)second%10;
			result++;
		}else {
			x = (int)num/10;
			y = (int)num%10;
		}
		
		while(true) {
			result++;
			z = x+y;
			if(z>=10) {
				z=z%10;
			}
			second = z+(y*10);
			if(second == num) {
				System.out.println(result);
				break;
			}else {
				x = (int)second/10;
				y = (int)second%10;
			}
		}
	}

}
