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
			System.out.println("���� �µ��� " + ondo + "�� �Դϴ�\n 1.������ �µ�����  2.������ ����");
			hope = sc.nextInt();
			
			if (hope == 1){
				System.out.println("����µ��� �Է��ϼ���");
				nwondo = sc.nextInt();
				do {
					if (ondo > nwondo) {
						ondo--;
					System.out.println("�µ��� �������Դϴ� ����µ� : " + ondo + "��");}
					else if(ondo < nwondo) {
						ondo++;
					System.out.println("�µ��� �������Դϴ� ����µ� : " + ondo + "��");}
					else
						System.out.println("����µ��� �����մϴ�");
				} while(ondo != nwondo);
			}
			else {
				System.out.println("�������� �����մϴ�");
				onOff = false;
			}
		
	}

	}
}