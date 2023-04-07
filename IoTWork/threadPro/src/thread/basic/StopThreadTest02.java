package thread.basic;
//���ͷ�Ʈ�� �߻����� ������ �����ϱ� => ���� ���¸� Ȯ���ϰ� �۾�
class StopThread02 implements Runnable{
	public void run() {
			//Thread.currentThread()�� ������� ���� ������ ��ü�� ���ϱ�
		try {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("������ ������~~~~");
				
					Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			//e.printStackTrace();
		} finally {
			System.out.println("���� ������ ����:");
		}
		System.out.println("�������: ������·� ��.....");
	}
}
public class StopThreadTest02 {
	public static void main(String[] args) {
		System.out.println("******main ������ ����*****");
		Thread t1 = new Thread(new StopThread02());
		t1.start();
		System.out.println("�������� �̸�:"+t1.getName());
		System.out.println("�������� ���� ���ͷ�Ʈ ����:"+t1.isInterrupted());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//���ͷ�Ʈ �߻�
		t1.interrupt();
		System.out.println("�������� ���� ���ͷ�Ʈ ����:"+t1.isInterrupted());
		System.out.println("******main ������ ����*****");
	}
}




