package ch04.sec03;
/**
 * grade 에 따라 스위치된 범수를 score 변수에 대입
 */
public class SwitchValueExample {

	public static void main(String[] args) {
		String grade = "B";
		int score = 0;
		
		// Java 11이전 문법
		switch (grade) {
		case "A":
			score = 100;
			break;

		case "B":
			score = 80;
			break;
			
		default:
			score = 60;
			break;
		}// switch end
		
		// Java 11이후 문법
		int score2 = switch (grade) {
		case "A" -> 100;
		case "B" ->  { 
			int result = 100 - 20 ;
			yield result;
		}
		default -> 60;
		}; // switch end

		System.out.println("score 1 : " + score);
		System.out.println("score 2 : " + score2);
	}// main() end

}
