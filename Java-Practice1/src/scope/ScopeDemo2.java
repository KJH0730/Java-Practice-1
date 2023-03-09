package scope;

public class ScopeDemo2 {
	static int i;
	
	static void a() {
		i = 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (i = 0; i < 5; i++) {
			a();
			// 계속 0으로 초기화돼서 무한반복 발생
			System.out.println(i);
		}
	}

}
