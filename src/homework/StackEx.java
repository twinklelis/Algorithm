/*
[����]
������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�. ����� �� �ټ� �����̴�.

[���]
1. push X: ���� X�� ���ÿ� �ִ� �����̴�.
//Stack.push();
2. pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//Stack.pop();
3. size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
//Stack.size();
4. empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//Stack.isEmpty();
5. top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//Stack.peek();

[�Է�]
ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
�־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.

[���]
��� �ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
*/

package homework;
import java.util.Scanner;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int ordernum = scanner.nextInt(); //����Ǽ�
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
