package scope;

public class ScopeDemo4 {
	static void a() {
		String title = "coding everybody";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		// title이 선언되어있지 않기 때문에 에러 발생
		//System.out.println(title) 
	}

}
