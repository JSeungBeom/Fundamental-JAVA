package sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		// RemoteControl Ÿ���� SmartTelevision ��ü ����
		// RemoteControl �������̽� ���� �޼ҵ常 ����� ����
		RemoteControl rc = tv; 
		// Searchable Ÿ���� SmartTelevision ��ü ����
		// Searchable �������̽� ���� �޼ҵ常 ����� ����
		Searchable searchable = tv;
		rc.turnOn();
		searchable.search("youtube");
		rc.turnOff();
	}

}
