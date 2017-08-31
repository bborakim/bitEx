/*
 * 주제: 미니 파일 탐색기 만들기 v0.1
 */

package step02;

import java.io.File;

public class Exam07 {
  public static void main(String[] args) {
	  File f1 = new File("c:/");
	  
	  //String files[] = f1.list();둘다 상관 없지만 아래껄 많이 씀
	  String[] files = f1.list();
	  
	  System.out.println(files.length); // 30
	  
	  System.out.println(files[0]);
	  System.out.println(files[1]);
	  System.out.println(files[2]);
	  System.out.println(files[3]);
	  System.out.println(files[4]);
	  System.out.println(files[5]);
	  System.out.println(files[6]);
	  System.out.println(files[7]);
	  System.out.println(files[8]);
	  System.out.println(files[9]);
	  System.out.println(files[10]);
	  System.out.println(files[11]);
	  System.out.println(files[12]);
	  System.out.println(files[13]);
	  System.out.println(files[14]);
	  System.out.println(files[15]);
	  System.out.println(files[16]);
	  System.out.println(files[17]);
	  System.out.println(files[18]);
	  System.out.println(files[19]);
	  System.out.println(files[20]);
	  System.out.println(files[21]);
	  System.out.println(files[22]);
	  System.out.println(files[23]);
	  System.out.println(files[24]);
	  System.out.println(files[25]);
	  System.out.println(files[26]);
	  System.out.println(files[27]);
	  System.out.println(files[28]);
	  System.out.println(files[29]);
	  System.out.println(files[30]);
	  
  }
}
