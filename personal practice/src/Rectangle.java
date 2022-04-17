
public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	Rectangle(int x, int y, int width){
		this(x, y, width, width);
	}
	
	void show() {
		System.out.println("(" + x + "," + y + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}
	
	int square() {
		return width * height;
	}
	
	boolean contains(Rectangle r) {
		if(this.x + this.width > r.x + r.width && this.y + this.height > r.y + r.width) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6);
		Rectangle t = new Rectangle(1, 1, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) {
			System.out.println("t�� r�� �����մϴ�.");
		}
		if(t.contains(s)) {
			System.out.println("t�� s�� �����մϴ�.");
		}
	}

}
