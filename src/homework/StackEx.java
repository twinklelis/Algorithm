/*
[문제]
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오. 명령은 총 다섯 가지이다.

[명령]
1. push X: 정수 X를 스택에 넣는 연산이다.
//Stack.push();
2. pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//Stack.pop();
3. size: 스택에 들어있는 정수의 개수를 출력한다.
//Stack.size();
4. empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//Stack.isEmpty();
5. top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//Stack.peek();

[입력]
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

[출력]
출력 해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
*/

package homework;
import java.util.Scanner;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int ordernum = scanner.nextInt(); //명령의수
		for(int i = 0; i < ordernum; i++) {
			String orderstr = scanner.nextLine();
			String[] orderArray = orderstr.split(" ");
			String order = orderArray[0];
			String numstr = orderArray[1];
			int num = Integer.parseInt(numstr);
			if(order == "push") push(num);
			else if(order == "pop") pop();
			else if(order == "size") size();
			else if(order == "empty") empty();
			else if(order == "top") top();
		}
		
	}
	
	public static void push(int num) {
		//this.num = num;
		//Stack.push(num);
	}
	
	public static void pop() {
		//Stack.pop();
	}
	
	public static void size() {
		//Stack.size();
	}
	
	public static void empty() {
		//Stack.isEmpty();
	}
	
	public static void top() {
		//Stack.peek();
	}

}
