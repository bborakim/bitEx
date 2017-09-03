/*
 * 주제: 클래스 변수(스태틱 변수)의 사용
 * - 메서드가 작업한 간 결과를 쉽게 보관하는 방법
 * - 메서드들이 공유하는 변수를 클래스에 선언한다.
 */
package step04.Exam09;

public class Calculator2 {
  //result 변수를 개별관리 변수로 선언한다. => static 명령을 제거하라!
  //static이 붙지 않은 변수는 new 명령을 통해 준비된다.
  //static이 붙은 변수는 클래스를 사용할 때 자동으로 준비된다.
  
  int result; // 정수 메모리는 0으로 초기화된다. 클래스변수
  
  
  static void plus(Calculator2 that, int a) {
    that.result = that.result + a ;
  }
  
  static void minus(Calculator2 that, int a) {
    that.result = that.result - a;
  }
  
  static void multiple(Calculator2 that, int a) {
    that.result = that.result * a;
  }
  static void devide(Calculator2 that, int a) {
    that.result = that.result / a;
  }
}
