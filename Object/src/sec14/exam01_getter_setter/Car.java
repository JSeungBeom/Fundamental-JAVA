package sec14.exam01_getter_setter;

public class Car {
	// �ʵ�
	private int speed;
	private boolean stop;
	
	// �޼ҵ�
	// speed�� getter�� setter
	public int getSpeed() {
		return speed;
	} 
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}
	}

	// stop�� getter�� setter
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
