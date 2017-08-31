/*
 * 주제: 도구 생성
 * - class
 * - 문법
 *   class 도구명 {
 *     // 변수 선언
 *     // 메서드 정의
 */
package step04.Exam05;

class Tool { // 도구를 새로 만드는 이유는 각자의 기능별로 분류하기 위해서 만듦
	static String hello(String name) {
		return "안녕하세요. " + name + "님!";
	}
}

public class Exam05 {
	
	public static void main(String[] args) {
		String str = Tool.hello("김보라"); // 다른 클래스에 있을 경우 다른방 이름을 명시해 줘야 함.
		System.out.println(str);
	}
}
