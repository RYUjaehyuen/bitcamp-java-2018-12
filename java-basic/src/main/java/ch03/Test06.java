// 키보드로 입력한 값을 받기
package ch03;

public class Test06 {
  public static void main(String[] args) {
     // 키보드로입력한 데이터를 읽을 떄 사용할 도구준비단계
    java.io.InputStream in = System.in;
    
    // inputstream은 바이트 단위로 읽는 기능 바이트 단위로 읽어서 int나 문자열로 바꾸려면 불편함이 있는데 
    // 이런불편 함을 없에주는 기능을가진 도구가 java.util.Scanner 이다.
    java.util.Scanner keyboard = new java.util.Scanner(in);
    
    System.out.println("이름을 입력하세요 : ");
   
    // scanner에 들어있는 nextline 은 사용자가 한줄을 입력하면  그 값을 문자열로 만들어 리턴한다.
    java.lang.String str = keyboard.nextLine();
    
    //사용자가 입력한 문자열을 출력한다.
    System.out.printf("당신의 이름은 %s 입니다.\n", str);
  }

}



/*

*/  








 