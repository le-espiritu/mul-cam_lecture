package socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient01 {
	public static void main(String[] args) {
		try {
			//������ ����� �� �ִ� ���ϰ�ü�� ����
			//������ ������ ��û
			Socket client = new Socket("192.168.0.221", 12345);
			System.out.println("�������ӿϷ�:"+client);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}