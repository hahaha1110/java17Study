package ch04.sec03;

public class SwitchCaseExpression {

	public static void main(String[] args) {
		char grade = 'B';
		
		// expression 사용안한 case
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
			
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
			
		default:
			System.out.println("손님 입니다.");
			break;
		}// switch end

		// expression 사용 case
		switch (grade) {
			case 'A', 'a' -> { System.out.println("우수 회원입니다."); } // 중괄호 생략 가능
			case 'B', 'b' -> { System.out.println("일반 회원입니다."); }		
			default -> { System.out.println("손님 입니다."); }
		}// switch end
		
	}

}
