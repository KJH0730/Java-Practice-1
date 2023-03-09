package scope;

public class ScopeDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// for문에서 선언한 i를 밖에서 사용할 수 없어서 에러 발생
		// System.out.println(i)
	}
	
}
