package sec03_exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// �͸� ���� ��ü, �̸� ���� ���� Ŭ������ ����� ���ÿ� ��ü ����
		// �������̽��� �߻� �޼ҵ���� ��� �������Ͽ��� ����, �߰������� �ʵ�� �޼ҵ� ���� �����ϳ� �͸� ��ü �ȿ����� ��� ����
		// �߰� ����� �ʵ�� �޼ҵ�� �������̽� ������ ������ �Ұ�
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				/*���๮*/
			}
			public void turnOff() {
				/*���๮*/
			}
			public void setVolume(int volume) {
				/*���๮*/
			}
		};
	}

}
