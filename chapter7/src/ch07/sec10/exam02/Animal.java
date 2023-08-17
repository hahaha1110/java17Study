package ch07.sec10.exam02;

public abstract class Animal {

	// 메서드 선언(공통)
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메서드 선언(구체적인건 자식이)
	public abstract void sound();
}
