/*
[���� ����]
���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�.
���� ��� strings�� [sun, bed, car]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� u, e, a�� strings�� �����մϴ�.

[���� ����]
strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
��� strings�� ������ ���̴� n���� Ů�ϴ�.
�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.

[����]
strings	        n	return
[sun, bed, car]	1	[car, bed, sun]
*/
package homework;

import java.util.Scanner;

public class ascendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine(); //���ڿ��Է¹ޱ�
		int index = Integer.parseInt(scanner.nextLine()); //�ε��� �Է¹ޱ�
		String strArr[] = str.split(","); //������ �迭����
		char charArr[] = new char[strArr.length]; //�迭 �����
		for(int i = 0; i < strArr.length; i++) { 
			 charArr[i] = strArr[i].charAt(index); //�ε��� ���� �迭�� ���� ����
			 for(int k = i+1; k < strArr.length; k++) { //����
				 if(charArr[i] > charArr[k]) { //�ε����� ���� �ε��� ��
					 String temp = strArr[i]; //�ε����� �ӽ�����
					 strArr[i] = strArr[k]; //�����ε����� �տ� ����
					 strArr[k] = temp;//������������
				 }
			 }
		}
		for(String s : strArr) {
			System.out.println(s);
		}
		
	}

}
