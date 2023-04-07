package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
public class MyNetClient03 {
	public static void main(String[] args) {
		Socket serverobj = null;
		InputStream socketIn = null;
		OutputStream socketOut = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			serverobj = new Socket("192.168.0.221", 12345);
			System.out.println("�������ӿϷ�:"+serverobj);
			socketIn = serverobj.getInputStream();
			socketOut = serverobj.getOutputStream();
			dis = new DataInputStream(socketIn);
			dos = new DataOutputStream(socketOut);
			
			//Ŭ���̾�Ʈ <- ����
			String data = dis.readUTF();
			System.out.println("������ ������ �޽���1>>"+data);
			//Ŭ���̾�Ʈ <- ����
			int gugu = dis.readInt();
			for (int i = 1; i <=9; i++) {
				System.out.println(gugu+"*"+i+"="+(gugu*i));
			}
			
			//Ŭ���̾�Ʈ -> ����
			String clientMsg = "";
			if(gugu%2==0) {
				clientMsg = "¦��";
			}else {
				clientMsg = "Ȧ��";
			}
			dos.writeUTF(clientMsg);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}







