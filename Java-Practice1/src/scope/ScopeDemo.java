package scope;

public class ScopeDemo {
	
	static void a() {
		// 여기서 i는 지역변수
		int i = 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			a();
			
			// a()의 i와 for문의 i가 서로 다름
			System.out.println(i);
		}
	}

}
