/*
[���� ����]
���ε��� ���� ������� ����Ʈ�� �̿��Ͽ� �����Ϸ��� �մϴ�. ����Ʈ�� �۾Ƽ� �� ���� �ִ� 2�� �ۿ� Ż �� ����, ���� ���ѵ� �ֽ��ϴ�.
���� ���, ������� �����԰� [70kg, 50kg, 80kg, 50kg]�̰� ����Ʈ�� ���� ������ 100kg�̶��
2��° ����� 4��° ����� ���� Ż �� ������ 1��° ����� 3��° ����� ������ ���� 150kg�̹Ƿ�
����Ʈ�� ���� ������ �ʰ��Ͽ� ���� Ż �� �����ϴ�.
����Ʈ�� �ִ��� ���� ����Ͽ� ��� ����� �����Ϸ��� �մϴ�.
������� �����Ը� ���� �迭 people�� ����Ʈ�� ���� ���� limit�� �Ű������� �־��� ��,
��� ����� �����ϱ� ���� �ʿ��� ����Ʈ ������ �ּڰ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

[���ѻ���]
���ε��� ���� ����� 1�� �̻� 50,000�� �����Դϴ�.
�� ����� �����Դ� 40kg �̻� 240kg �����Դϴ�.
����Ʈ�� ���� ������ 40kg �̻� 240kg �����Դϴ�.
����Ʈ�� ���� ������ �׻� ������� ������ �� �ִ񰪺��� ũ�� �־����Ƿ� ������� ������ �� ���� ���� �����ϴ�.

[����� ��]
people				limit		return
[70, 50, 80, 50]	100			3
[70, 80, 50]		100			3
 */
package homework;
import java.util.Scanner;
public class lifeBoat {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int[] people, int limit) {
		        int answer = 0;
		        int leng = people.length;
		        for(int x = 0; x < leng; x++){
		            for(int y = 1; y < leng; y++){
		                int value = people[x]+people[y];
		                if(value==limit){
		                    answer+=1;
		                    for(int z = y; z <leng-1; z++){
		                        people[z] = people[z+1];
		                    }
		                    leng-=1;
		                    break;
		                }else if(value < limit){
		                    answer+=1;
		                    for(int z = y; z < leng-1; z++){
		                        people[z] = people[z+1];
		                    }
		                    leng-=1;
		                    break;
		                }else{
		                    answer+=1;
		                    break;
		                }
		            }
		        }
		        return answer;
		    }
		}
	}

}
