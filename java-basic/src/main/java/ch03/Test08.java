// 키보드로 입력한 값을 받기 3  -- int 값 읽기 (계산기)
package ch03;

public class Test08 {
  public static void main(String[] args) {
   java.util.Scanner keyboard = new java.util.Scanner(System.in);
    
    System.out.print("a?");
    int a = keyboard.nextInt();  //java.lang 패키지의 멤버를 사용할때는 패키지이름을 적지않아도 된다.
    
    
    
    
    System.out.print("b?");
    int b = keyboard.nextInt();
    
    
    
    System.out.printf("%d * %d = %d\n", a, b, a * b);  
  }

}



/*

*/  








 