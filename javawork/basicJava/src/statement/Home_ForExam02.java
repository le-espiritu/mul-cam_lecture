package statement;

import java.util.Scanner;

public class Home_ForExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("�ʱⰪ�� ������ �Է��ϼ���.: ");
		int val1 = key.nextInt();
		System.out.print("���������� ������ �Է��ϼ���.: ");
		int val2 = key.nextInt();
		System.out.print("�������� ������ �Է��ϼ���.: ");
		int val3 = key.nextInt();
		int hap =0;//�հ踦 ������ ���� - for�� �ۿ� ����...for���� �����ϱ� ���� ����
		for(int i=val1;i<=val2;i=i+val3) {
			hap = hap+i;
		}
		System.out.println("������ "+hap+"�Դϴ�.");
	}
}