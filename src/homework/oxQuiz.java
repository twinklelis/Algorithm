/*
[문제]
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

[입력]
첫째 줄에 테스트 케이스의 개수가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다.
문자열은 O와 X만으로 이루어져 있다.

[출력]
각 테스트 케이스마다 점수를 출력한다.

[입력예제]
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX

[출력예제]
10
9
7
55
30
 */
package homework;
import java.util.Scanner;

public class oxQuiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine()); //반복횟수 입력
		int[] resultArr = new int[num]; //총점을 담을 배열 선언
		
		for(int i = 0; i < num; i++) { //입력한 수만큼 프로그램 반복
			String[] oxArr = scanner.nextLine().split(""); //한글자씩 쪼개서 배열에 넣기 
			int score = 0; //문제의 점수
			int result = 0; //총점
			
			for(int k = 0; k < oxArr.length; k++) { //점수계산
				if(oxArr[k].equals("O")) { //만약 O라면
					score = score + 1; //문제 점수 1점 올리기
					result += score; //총점에 문제 점수 더하기
				}else {
					score = 0; //문제 점수 초기화
				}
			}
			
			resultArr[i] = result; //총점을 총점 배열에 저장
		}
		
		for(int i = 0; i < num; i++){ //총점 배열을 출력
			System.out.println(resultArr[i]);
		}
	}

}
