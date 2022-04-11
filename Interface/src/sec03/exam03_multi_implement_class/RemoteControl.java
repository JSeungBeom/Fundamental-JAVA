package sec03.exam03_multi_implement_class;

public interface RemoteControl {
	// ��� �ʵ�, ������ �������� public static final Ű���尡 �ڵ����� �߰�
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 10;
	
	// �߻� �޼ҵ�, ������ �������� public abstract Ű���尡 �ڵ����� �߰�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// ����Ʈ �޼ҵ�, ���� ����� �����ϰ� ������ ���������� �ʴ��� ����� ����
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	// ���� �޼ҵ�, �������̽� ��ü���� ������ ������ �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
}
