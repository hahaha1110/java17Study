package ch03.sec05;

public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 1;
		double z = x / y;
		if(!Double.isInfinite(z) && !Double.isNaN(z)) {
			System.out.println(z + 2);
		}else {
			System.out.println("값 산출 불가");
		}
		
	}

}
