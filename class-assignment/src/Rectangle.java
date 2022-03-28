
public class Rectangle {
	int xpos;
	int ypos;
	int width;
	int height;
	// �ʵ� 
	
	Rectangle(int xpos, int ypos, int width, int height){
		this.xpos = xpos;
		this.ypos = ypos;
		this.width = width;
		this.height = height;
	} // ������, ���簢��
	
	Rectangle(int xpos, int ypos, int width){
		this(xpos, ypos, width, width);
	} // this()�� �̿��� ������ �����ε�, ���簢��
	
	void show() {
		System.out.println("(" + xpos + "," + ypos + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	} // �簢���� x, y ��ǥ�� width, height ��� �޼ҵ�
	
	int square() {
		return width * height;
	} // �簢���� ���� ��� �޼ҵ�
	
	boolean contains(Rectangle r) {
		if(xpos < r.xpos && ypos < r.ypos && 
				xpos + width > r.xpos + r.width && ypos + height > r.ypos + r.height) {
			return true;
		} // x,y ��ǥ(bottom left)�� �簢�� r���� �۰�, x + width, y + height(top right)�� �簢�� r���� ũ�ٸ�
		// ���� �����̹Ƿ� true ����
		else {
			return false;
		} // �������� �ʴ� ��� false ����
	} // �� �簢���� �ٸ� �簢���� �����ϰ� �ִ��� �Ǵ��ϴ� �޼ҵ�
}
