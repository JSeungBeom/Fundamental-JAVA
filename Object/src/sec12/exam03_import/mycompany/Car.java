package sec12.exam03_import.mycompany;

// Ctrl+Shift+O ����⸦ ����, �ʿ��� Ŭ�������� import
import sec12.exam03_import.hankook.SnowTire;
import sec12.exam03_import.hyndai.Engine;
import sec12.exam03_import.kumho.BigWidthTire;

// �ٸ� ��Ű�� ���� Ŭ�������� import �Ͽ� ���(public class �� ���)
/*
import sec12.exam03_import.hankook.*;
import sec12.exam03_import.hyndai.Engine;
import sec12.exam03_import.kumho.*;
*/

public class Car {
	public static void main(String[] args) {
		Engine engine = new Engine();
		SnowTire tire1 = new SnowTire();
		BigWidthTire tire2 = new BigWidthTire();
		// ���� Ŭ���� �̸��� ����ϴ� ���
		sec12.exam03_import.hankook.Tire tire3 = new sec12.exam03_import.hankook.Tire();
		sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();
	}

}
