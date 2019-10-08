/*
[문제 설명]
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

[제한 조건]
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

[보기]
strings	        n	return
[sun, bed, car]	1	[car, bed, sun]
*/
package homework;

import java.util.Scanner;

public class ascendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine(); //문자열입력받기
		int index = Integer.parseInt(scanner.nextLine()); //인덱스 입력받기
		String strArr[] = str.split(","); //나눠서 배열저장
		char charArr[] = new char[strArr.length]; //배열 만들기
		for(int i = 0; i < strArr.length; i++) { 
			 charArr[i] = strArr[i].charAt(index); //인덱스 문자 배열에 따로 저장
			 for(int k = i+1; k < strArr.length; k++) { //정렬
				 if(charArr[i] > charArr[k]) { //인덱스와 뒷쪽 인덱스 비교
					 String temp = strArr[i]; //인덱스를 임시저장
					 strArr[i] = strArr[k]; //뒷쪽인덱스를 앞에 저장
					 strArr[k] = temp;//오름차순나열
				 }
			 }
		}
		for(String s : strArr) {
			System.out.println(s);
		}
		
	}

}
