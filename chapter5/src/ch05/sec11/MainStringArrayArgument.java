package ch05.sec11;
/**
 *  메인함수에 들어온 값 덧셈
 */
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length < 2) { // 2개 이상 값을 입력
			System.out.println("2개 이상의 값을 입력해 주세요");
			System.exit(0); // 프로그램 강제 종료
		}
		
		int result = 0;
		
		for (String str : args) {
			result += Integer.parseInt(str);
		}
		
		System.out.println("입력값의 합 : " + result);
	}
}
