package 게임;
import java.util.Scanner;


public class baseball {
	public static final int ROCK = 0;  // 바위
	public static final int SCISSORS = 1; // 가위
	public static final int PAPER = 2;  // 보
	
	public static void main(String args[]) {
		
		

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		boolean inputflag = false; // 가위바위보 낼 때 예외처리 플래그
		String Strcom = "";
		int comWin = 0;
		int userWin = 0;
		
		
		while(true) {
			System.out.print("ROCK, SCISSORS, PAPER 중 한개를 입력하세요 : ");
			String user = sc.next();
			
			int com = (int)(Math.random()*10)%3;
			if(com == 0) {
				Strcom = "바위";
			}else if(com == 1) {
				Strcom = "가위";
			}else {
				Strcom = "보";
			}
			
			
			System.out.println("내가 낸 것 : "+user);
			System.out.println("컴퓨터가 낸 것 : "+Strcom);
			
			
	
			if(user.equals("ROCK") && com == 1) {
				System.out.println("사용자가 이겼습니다.");  
				userWin++;
			}else if(user.equals("ROCK") && com == 2) {
				System.out.println("컴퓨터가 이겼습니다");
				comWin++;
			}else if(user.equals("SCISSORS") && com == 0) {
				System.out.println("컴퓨터가 이겼습니다.");
				comWin++;
			}else if(user.equals("SCISSORS") && com == 2) {
				System.out.println("사용자가 이겼습니다");   
				userWin++;
			}else if(user.equals("PAPER") && com == 0) {
				System.out.println("사용자가 이겼습니다.");
				userWin++;
			}else if(user.equals("PAPER") && com == 1) {
				System.out.println("컴퓨터가 이겼습니다");
				comWin++;
			}else if(user.equals("ROCK") && com == 0) {
				System.out.println("비겼습니다.");
			}else if(user.equals("SCISSORS") && com == 1) {
				System.out.println("비겼습니다.");
			}else if(user.equals("PAPER") && com == 2) {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("ROCK, SCISSORS, PAPER 중 입력해주세요");
				continue;
			}
			
			
		
			
			while(true) {
				System.out.print("다시 하시겠습니까? (Y or N) : ");
				char alpha = sc.next().charAt(0);
				
				if(alpha == 'Y') {
					break;
				}else if(alpha == 'N') {
					flag = true;
					break;	
				}else {
					System.out.println("Y와 N중에 입력해주세요");
				}
			}
			
			
			
			if(flag == true) {
				break;
			}
			
		}
		
		System.out.println("컴퓨터 승 : "+comWin+"번, 사용자 승 "+userWin+"번");
	}
}
