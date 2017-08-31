/*
 * 주제: 파일 정보 다루기 -file
 * 
 */

package step02;

import java.io.File;

public class Exam06 {
  public static void main(String[] args) {
	  // 1) 파일 또는 디렉토리 정보를 준비한다.
	  //File f1 = new File("c:/javaide"); // window 사용자
	  File f1 = new File("c:/javaide/Hello2.java");
	  
	  System.out.println(f1.exists()); // true
	  System.out.println(f1.isDirectory()); //false
	  System.out.println(f1.isFile()); //true
	  System.out.println(f1.canWrite()); //true
	  System.out.println(f1.getParent()); //c:\javaide
	  System.out.println(f1.length()); //114
	  
	  f1.delete(); // 파일 삭제
  }
}
