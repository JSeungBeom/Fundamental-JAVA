package sec04.exam02_default_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		// �������̽��� default �޼ҵ尡 ����
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		// Audio Ŭ�������� �������� �޼ҵ尡 ����
		rc.setMute(true);
	}

}
