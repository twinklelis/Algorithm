package homework;
import java.util.Scanner;
public class gymCloth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�л��� : ");
		int num = Integer.parseInt(scanner.nextLine());//�л��� �ޱ�
		if(num<2||num>30) { //�л����� 2���̻� 30������
			System.out.println("�л����� �߸� �Է��ϼ̽��ϴ�.");
			System.exit(0);//���α׷�����
		}
		System.out.print("�������� �л� ��ȣ : ");//�������� �л� ��ȣ �ޱ�
		String lostnum = scanner.nextLine();
		String[] lost = lostnum.split(",");//��ȣ�� �迭�� ����
/*		if(lost.length<1||lost.length<num) {//�������� �л��� 1���̻�,num����
			System.out.println("�������� �л��� 1�� �̻��Դϴ�.");
			System.exit(0);//���α׷�����
		}*/
		System.out.print("���п��� �ִ� �л� ��ȣ : ");//������ �ִ� �л� ��ȣ �ޱ�
		String reservenum = scanner.nextLine();
		String[] reserve = reservenum.split(",");//��ȣ�� �迭�� ����
/*		if(reserve.length<1||reserve.length<num) {
			System.out.println("���п��� �ִ� �л��� 1�� �̻��Դϴ�.");//������ �ִ� �л��� 1���̻�,num����
			System.exit(0);//���α׷�����
		}*/
		
		//ü�������� ������ �л� �迭 : student[]
		//i�� �� �迭�� length
		//ü������ ������ �� �ִ� ��� : reserve[i] != lost[i] �̰� lost[i]=reserve[i+1] �̰ų� lost[i]=reserve[i-1]
		//						   lost[i]�� student[i]�� �ֱ�
		//ü������ ������ �� ���� ��� : reserve[i] = lost[i] -> �ٷ� reserve[i]���� student[i]�� �ֱ�
	}

}
