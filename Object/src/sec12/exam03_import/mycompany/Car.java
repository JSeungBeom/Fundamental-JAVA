package sec12.exam03_import.mycompany;

// Ctrl+Shift+O 단축기를 통해, 필요한 클래스들을 import
import sec12.exam03_import.hankook.SnowTire;
import sec12.exam03_import.hyndai.Engine;
import sec12.exam03_import.kumho.BigWidthTire;

// 다른 패키지 내의 클래스들을 import 하여 사용(public class 인 경우)
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
		// 직접 클래스 이름을 사용하는 경우
		sec12.exam03_import.hankook.Tire tire3 = new sec12.exam03_import.hankook.Tire();
		sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();
	}

}
