// 키보드로 입력한 값을 받기 2
package ch03;

public class Test07 {
  public static void main(String[] args) {
     // 키보드로입력한 데이터를 읽을 떄 사용할 도구준비단계
   
    
    // inputstream은 바이트 단위로 읽는 기능 바이트 단위로 읽어서 int나 문자열로 바꾸려면 불편함이 있는데 
    // 이런불편 함을 없에주는 기능을가진 도구가 java.util.Scanner 이다.
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    
    System.out.println("이름을 입력하세요 : ");
    java.lang.String str = keyboard.nextLine();
    
    System.out.println("나이을 입력하세요 : ");
    java.lang.String age = keyboard.nextLine();
    
    
    
    System.out.printf("%s(%s)\n", str, age);  
  }

}



/*

*/  








 