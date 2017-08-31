/*
 * 주제: 기능 정의2
 * - function = method
 * - 문법
 *   작업결과값의종류 기능명(작업할때 사용할 값1, 값2, 값3 ....){
 *   명령어;
 *   }
 */
package step04;

public class Exam02 {
	
	//1) 메서드 정의
	//return: 없음(void)
	//parameter: 있음
	static void hello(String name) {
		System.out.println("안녕하세요. " + name + "님!");
	}
	
	public static void main(String[] args) {
		hello("김보라"); // 메서드 호출
		//"김보라" - 메서드 호출 할 때 넘기는 값 -> 아규먼트(argument)
	}
}
