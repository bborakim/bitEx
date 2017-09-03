/*
 * 주제: 클래스 변수(스태틱 변수)의 사용
 * - 메서드가 작업한 간 결과를 쉽게 보관하는 방법
 * - 메서드들이 공유하는 변수를 클래스에 선언한다.
 */
package step04.Exam09;

public class Calculator {
  static int result; // 정수 메모리는 0으로 초기화된다. 클래스변
  
  static void plus(int a) {
    result = result + a ;
  }
  
  static void minus(int a) {
    result = result - a;
  }
  
  static void multiple(int a) {
    result = result * a;
  }
  static void devide(int a) {
    result = result / a;
  }
}
