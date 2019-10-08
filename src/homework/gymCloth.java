package homework;
import java.util.Scanner;
public class gymCloth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수 : ");
		int num = Integer.parseInt(scanner.nextLine());//학생수 받기
		if(num<2||num>30) { //학생수는 2명이상 30명이하
			System.out.println("학생수를 잘못 입력하셨습니다.");
			System.exit(0);//프로그램종료
		}
		System.out.print("도난당한 학생 번호 : ");//도난당한 학생 번호 받기
		String lostnum = scanner.nextLine();
		String[] lost = lostnum.split(",");//번호를 배열에 저장
/*		if(lost.length<1||lost.length<num) {//도난당한 학생은 1명이상,num이하
			System.out.println("도난당한 학생은 1명 이상입니다.");
			System.exit(0);//프로그램종료
		}*/
		System.out.print("여분옷이 있는 학생 번호 : ");//여벌옷 있는 학생 번호 받기
		String reservenum = scanner.nextLine();
		String[] reserve = reservenum.split(",");//번호를 배열에 저장
/*		if(reserve.length<1||reserve.length<num) {
			System.out.println("여분옷이 있는 학생은 1명 이상입니다.");//여벌이 있는 학생은 1명이상,num이하
			System.exit(0);//프로그램종료
		}*/
		
		//체육수업이 가능한 학생 배열 : student[]
		//i는 각 배열의 length
		//체육복을 나눠줄 수 있는 경우 : reserve[i] != lost[i] 이고 lost[i]=reserve[i+1] 이거나 lost[i]=reserve[i-1]
		//						   lost[i]를 student[i]에 넣기
		//체육복을 나눠줄 수 없는 경우 : reserve[i] = lost[i] -> 바로 reserve[i]값을 student[i]에 넣기
	}

}
