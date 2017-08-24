/*
 * 주제: 메모리 종류는 고정형이다.
 * - 정수 값을 저장할 메모리는 다른 종류의 값을 저장할 수 없다.
 * - 정적 타입 바인딩(static type binding)이라고 한다.
 */
package step01;

public class Exam09 { 
  public static void main(String[] args) {
    int i1 = 20;
    //i1 = 3.141592;
    //i1 = true;
    //i1 = "Hello";
    
    System.out.println(i1); // 40
    
  }
}
