package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
//Ŭ���̾�Ʈ�� ����ϱ� ���� ���� 
//=> Ŭ���̾�Ʈ�� �����ϸ� Ŭ���̾�Ʈ�� ����� �� �ִ� IO��Ʈ����ü�� ���ؼ� Ŭ���̾�Ʈ���� �޽����� ������.
//=> Ŭ���̾�Ʈ�� ������ �޽����� �ް� �ٽ� ������ �޽����� �����ֿܼ� ����ϱ�
//   Ŭ���̾�Ʈ�� IO(input -> DataInputStream, output->DataOutputStream)
public class MyNetServer02 {
	public static void main(String[] args) {
		Socket client = null;
		InputStream socketIn = null;//Ŭ���̾�Ʈ�� �������� �����͸� �б� ���ؼ� ���Ͽ��� �������� ��Ʈ����ü
		OutputStream socketOut = null;//Ŭ���̾�Ʈ���� �����͸� ������ ���ؼ� ���Ͽ��� �������� ��Ʈ����ü
		DataInputStream dis = null;//Ŭ���̾�Ʈ�� ���� ���� �����͸� Ÿ�Ժ��� �б� ���� ����ϴ� ������Ʈ����ü
		DataOutputStream dos = null;//Ŭ���̾�Ʈ�� �����͸� Ÿ�Ժ��� ������ ���� ����ϴ� ������Ʈ����ü
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("�����غ�Ϸ�.....Ŭ���̾�Ʈ�� ������ ��ٸ�");
			//���� Ŭ���̾�Ʈ���� ���񽺸� �����ϱ� ���ؼ� ���ѷ���
			while(true) {
				client =  server.accept();
				InetAddress clientIp =  client.getInetAddress();
				System.out.println("������ Ŭ���̾�Ʈ:"+clientIp.getHostAddress());
				
				//Ŭ���̾�Ʈ�� ����ϱ� ���� Input/output ��Ʈ����ü�� �������� ���� ���� �����Ѵ�.
				socketIn = client.getInputStream();
				socketOut = client.getOutputStream();
				dis = new DataInputStream(socketIn);
				dos = new DataOutputStream(socketOut);
				
				//1. Ŭ���̾�Ʈ�� ������ �ϸ� �޽����� ������
				//   ���� -> Ŭ���̾�Ʈ(�������߿�.....output�� �������� �� ��)
				dos.writeUTF(clientIp.getHostAddress()+"�� ������ ȯ���մϴ�.");
				dos.writeInt(2000);
				
				//2. ���� <- Ŭ���̾�Ʈ
				String data = dis.readUTF();
				System.out.println("Ŭ���̾�Ʈ�� ���� �޽���>>"+data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}