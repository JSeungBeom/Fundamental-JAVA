package sec11.exam02_static_final;

public class Earth {
	// 필드
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA; 
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	} // static final 필드로 선언함으로써, 클래스 별로 관리되는 상수 필드 
}
