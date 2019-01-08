// 키보드로 입력한 값을 받기 5 - 토큰단위로 문자열 읽
package ch03;

public class Test10 {
  public static void 기main(String[] args) {
   java.util.Scanner keyboard = new java.util.Scanner(System.in);
    
    System.out.print("나이? ");
    int age = keyboard.nextInt(); 
            
    
    
    System.out.print("이름? ");
    String name = keyboard.next();
    //next는 토큰단위로 문자열을 읽는다. next 인트를 호출한후 엔터 코드 가 남아 있다 하더라도 
     // 공백을 버리기 때문에 영향을 받지 않는다.   test 9에서의 오류를 막을수 있다.
    // 키보드가 입력하는걸 하드웨어에 직접 접속하는것이아니라 운영체제가 버퍼에 쌓아두고 
    // 거기서 읽는것이다.
    
    System.out.printf("%d(%s)\n", age, name);  
  }

}



/*

*/  








 