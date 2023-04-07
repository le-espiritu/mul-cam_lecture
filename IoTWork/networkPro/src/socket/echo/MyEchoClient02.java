package socket.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyEchoClient02 {
	public static void main(String[] args) {
		Socket server = null;
		BufferedReader in = null; //�������� ������ �޽����� �б� ���� ��Ʈ����ü 
		PrintWriter out = null;
		BufferedReader keyin = null;//������ ������ ���� Ű���带 ���� �Է��� �޽����� �б� ���� ��Ʈ����ü
		try {
			server =new Socket("192.168.0.221", 12345);
			System.out.println("������ ���� ����");
			in = new BufferedReader(new InputStreamReader(
								server.getInputStream()));
			out = new PrintWriter(server.getOutputStream(),true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			
			//***********��Ž���***************************
			//Ű����� �Է��� �����͸� ������ ���������ϱ�
			//������ �ٽ� �������� �޽����� �ֿܼ� ���
			String sendMsg = "";//������ ���� �޽��� 
			String resMsg = "";//�������� ���� �޽���
			//1. Ŭ���̾�Ʈ <- ����
			resMsg = in.readLine();
			System.out.println("������ ���� �� �޽���>>>>>"+resMsg);
			while((sendMsg = keyin.readLine())!=null) {
				//1. Ŭ���̾�Ʈ -> ����(Ű����� �Է��ϴ� �޽����� ������ ����)
				out.println(sendMsg);
				//2. Ŭ���̾�Ʈ <- ����
				resMsg = in.readLine();
				System.out.println("������ ������ �޽���>>>>>"+resMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}