package nanjango;

import java.util.Scanner;

public class airconn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ondo = 28;
		int hope = 0;
		int nwondo;
		boolean onOff = true;
		Scanner sc = new Scanner(System.in);

		
			while(onOff == true){
			System.out.println("현재 온도는 " + ondo + "도 입니다\n 1.에어컨 온도설정  2.에어컨 끄기");
			hope = sc.nextInt();
			
			if (hope == 1){
				System.out.println("희망온도를 입력하세요");
				nwondo = sc.nextInt();
				do {
					if (ondo > nwondo) {
						ondo--;
					System.out.println("온도를 설정중입니다 현재온도 : " + ondo + "도");}
					else if(ondo < nwondo) {
						ondo++;
					System.out.println("온도를 설정중입니다 현재온도 : " + ondo + "도");}
					else
						System.out.println("현재온도를 유지합니다");
				} while(ondo != nwondo);
			}
			else {
				System.out.println("에어컨을 종료합니다");
				onOff = false;
			}
		
	}

	}
}