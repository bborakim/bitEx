/*
 * 주제: 수학 계산 도구 사용법
 * -Math 도구(클래스)
 */
package step02;

public class Exam01 {
  public static void main(String[] args) {
	int result;
	result = Math.abs(10); // 변수 = 데이터를 반환하는 명령어;
	System.out.println(result);
	
	result = Math.abs(-10);
	System.out.println(result);
	
	double result2 =Math.ceil(27.9); // ceil: 천장 -> 나보다 큰 정수 중 가장작은 정수값
	System.out.println(result2);
	
	result2 =Math.ceil(-4.9); // ceil: 천장 -> 나보다 큰 정수 중 가장작은 정수값
	System.out.println(result2);
	
	result2 =Math.floor(27.9); // floor: 바닥 
	System.out.println(result2);
	
	result2 =Math.floor(-4.9); // floor: 바닥 
	System.out.println(result2);
	
	System.out.println(Math.exp(25));
	
	System.out.println(Math.max(20, 18));
	System.out.println(Math.min(20, 18));
	
	System.out.println(Math.pow(2, 3)); //2의 3승
	System.out.println(Math.round(4.56));//반올림
	System.out.println(Math.round(4.46));
	System.out.println(Math.round(-4.56));
	System.out.println(Math.round(-4.46));
	
	System.out.println(Math.random()); //0 <= 값<1 :실수값 반환
	double d1 =Math.random()*7 + 1; // 1. xxx ~ 7.xxx
	d1 = Math.floor(d1);
	System.out.println(d1);
}
}
