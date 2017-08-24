/*
 * 주제: 사칙 연산 방법
 * - 덧셈, 뺄셈, 곱셈, 나눗셈
 */
package step01;

public class Exam10 { 
  public static void main(String[] args) {
	//정수의 사칙 연산
    System.out.println(5 + 2);
    System.out.println(5 - 2);
    System.out.println(5 * 2);
    System.out.println(5 / 2);
    System.out.println();
    
    //실수의 사칙 연산
    System.out.println(5.0 + 2.0);
    System.out.println(5.0 - 2.0);
    System.out.println(5.0 * 2.0);
    System.out.println(5.0 / 2.);
    System.out.println();
    
    //논리값의 사칙 연산 => 자바에선 오직 정수나 실수로만 사칙연산이 가능함.
    //System.out.println(true + true);
    //System.out.println(true - true);
    //System.out.println(true * true);
    //System.out.println(true / true);
    
    //문자의 사칙 연산
    System.out.println("Hello" + "World"); // 문자열을 연결하는 작업 수행
    //System.out.println("Hello" - "World");// 문법 오류
    //System.out.println("Hello" * "World");
    //System.out.println("Hello" / "World");
    System.out.println();
 
    
  }
}
