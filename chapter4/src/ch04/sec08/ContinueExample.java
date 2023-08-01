package ch04.sec08;
/**
 * 1에서 10까지의 수 중 짝수만 출력
 * (홀수인 경우엔 다음 반복으로 넘어가기)
 */
public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 1; i < 11 ; i++) {
			if(i % 2 != 0) { 
				continue; // 짝수가 아닌경우 continue
			}
			System.out.println(i + " ");
		}
	}
}
