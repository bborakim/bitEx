/*
 * 주제: 키보드로 부터 입력을 받는 도구 사용 - Scanner
 */

package step02;

import java.io.InputStream;
import java.util.Scanner;

public class Exam08 {
  public static void main(String[] args) throws Exception {
	  //1) 키보드 정보 얻기
	  InputStream keyboardInfo = System.in;
	  
	  //read(): 키보드로부터 입력된 값 중에서 1바이트를 리턴
	  System.out.println(keyboardInfo.read()); //a :97 유니코드 값 출력 Ox61
	  System.out.println(keyboardInfo.read()); //b :98
	  System.out.println(keyboardInfo.read()); //c :99
	  
	  //2) Scanner 도구를 통해 키보드로 입력된 한 줄의 문자열 얻기
	  Scanner sc = new Scanner(keyboardInfo);
	  String s1 = sc.nextLine(); // 키보드에서 한줄 읽기
	  
	  System.out.println(s1); //123ABC -> 앞에서 안 읽은 것 부터.. 
  }
}
