package basic;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

//mqttŬ���̾�Ʈ �ۼ� - subscriber
//������û�� �ϰ� �޽����� ���޵Ǵ� ���� ���
//1. MqttCallback�������̽��� ���
//2. MqttCallback�������̽��� �޼ҵ带 �������̵�
//3. MqttClient��ü�� ����� - broker�� ����ϴ� ������ ���, subscriber, publisher�� ������ ���
//4. MqttConnectOptions�� �̿��ؼ� MQTT�� ���������� �����Ѵ�.
public class MyMqtt_Sub_client implements MqttCallback {
	private MqttClient mqttclient;
	private MqttConnectOptions mqttOption;
	public MyMqtt_Sub_client init(String server,String clientId) {
		//mqttŬ���̾�Ʈ�� �����ϱ� ���ؼ� �ʿ��� ������ ����
		mqttOption = new MqttConnectOptions();
		mqttOption.setCleanSession(true);
		mqttOption.setKeepAliveInterval(30);
		try {
			//broker�� subscribe�ϱ� ���� Ŭ���̾�Ʈ��ü�� ����
			mqttclient = new MqttClient(server, clientId);
			//Ŭ���̾�Ʈ��ü�� �ݹ��� ���� - subscribe�ϸ鼭 ������ ������ �޼ҵ尡 ȣ��� �� �ִ�.
			mqttclient.setCallback(this);
			//mqttclient�� broker�� ������ �� �ֵ��� ����
			mqttclient.connect(mqttOption);
		} catch (MqttException e) {
			e.printStackTrace();
		}
		
		return this;
	}
	//Ŀ�ؼ��� ����Ǹ� ȣ�� - ��ſ����� ������ ������ ��쿡 ȣ��
	@Override
	public void connectionLost(Throwable arg0) {
		
	}
	//�޽��� ����� �Ϸ�Ǹ� ȣ��
	@Override
	public void deliveryComplete(IMqttDeliveryToken arg0) {
		
	}
	//�޽����� �����ϸ� ȣ��Ǵ� �޼ҵ� - topic(broker������û�� topic��), MqttMessage�� �޽��� 
	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception {
		System.out.println("==================�޽�������==================");
		System.out.println(message+","+"topic:"+topic+",id:"+message.getId()+
													",Payload"+
														new String(message.getPayload()));		
	}
	//������û�ϱ�
	public boolean subscribe(String topic) {
		try {
			if(topic!=null) {
				mqttclient.subscribe(topic, 0);//	topic, Qos�� �޽����� �����ϰ� �����ϴ� ���(ǰ��)
			}
		} catch (MqttException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		MyMqtt_Sub_client client = new MyMqtt_Sub_client();
		//MqttClient��ü�� broker�� ����ǰ� ������û 
		client.init("tcp://192.168.0.221:1883", "myid").subscribe("led");
	}
}



