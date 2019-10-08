/*
자바책 565p

[문제]
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

[입력]
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

[출력]
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

[입력예제]
39
40
41
42
43
44
82
83
84
85

[출력예제]
6
 */
package homework;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class rest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();	
		int count = 0;
		int[] restArr = new int[10];
		for(int i = 0; i < 10; i++) {
			int num = scanner.nextInt();
			if(num < 0 || num > 1000) {
				System.out.println("숫자의 범위는 0~1000입니다.");
			}else {
				restArr[i] = (int)num%42;
			}
		}
		for(int result : restArr) {
			set.add(result);
		}
		System.out.println(set.size());
	}

}
