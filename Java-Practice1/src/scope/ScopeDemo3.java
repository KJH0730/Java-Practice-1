package scope;

public class ScopeDemo3 {
	static int i;
	
	static void a() {
		int i = 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (i = 0; i < 5; i++) {
			
			// 지역변수 i를 초기화하는 거라 영향 X
			a();
			System.out.println(i);
		}
	}

}
