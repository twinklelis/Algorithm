/*
[문제]
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
단, 대문자와 소문자를 구분하지 않는다.

[입력]
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

[출력]
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

[입력예제]
Mississipi
zZa
z
baaa

[출력예제]
?
Z
Z
A
 */
package homework;
import java.util.Arrays;
import java.util.Scanner;

public class wordStudy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String realWord = word.toUpperCase();
		String[] wordArr = realWord.split("");
		Arrays.sort(wordArr);
		
		int result = 1;
		int count = 1;
		String al = "";
		String real = "";
		boolean q = false;
		
		for(int i = 0; i < wordArr.length; i++) {
			if(i == 0) {
				al = wordArr[i];
				real = al;
			}else {
				if(al!=wordArr[i]) {
					if(result > count) {
						count = 1;
					}else if(result < count) {
						result = count;
						real = al;
						count = 1;
						q = false;
					}else {
						count = 1;
						q = true;
					}
					al = wordArr[i];
					count++;
				}else {
					al = wordArr[i];
					count++;
				}
			}
		}
		
		if(q) {
			System.out.println("?");
		}else {
			System.out.println(real);
		}
	}

}
