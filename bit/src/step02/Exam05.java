/*
 * 주제: 문자열을 정수, 실수, 논리 값으로 변환하기
 * -문법
 *  Integer.parseInt(문자열);
 *  Double.parseDouble(문자열);
 *  Boolean.parsBoolean(문자열);
 */

package step02;


public class Exam05 {
  public static void main(String[] args) {
	 int v1 = Integer.parseInt("1234"); // valueOf 는 숫자를 문자로
	 double v2 =Double.parseDouble("3.14159");
	 boolean v3 =Boolean.parseBoolean("false");
	 
	 System.out.println(v1);
	 System.out.println(v2);
	 System.out.println(v3);
  }
}
