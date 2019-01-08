// 키보드로 입력한 값을 받기 4  -- 믹 
package ch03;

public class Test09 {
  public static void main(String[] args) {
   java.util.Scanner keyboard = new java.util.Scanner(System.in);
    
    System.out.print("나이? ");
    int age = keyboard.nextInt();  // 결과값은 이름은 공백처리가 되는데 
                                        //그이유를 nextInt의 구동원리와 관계지어서 생각해보자.
   
    
    keyboard.nextLine();  //(해결책) 남아 있는 빈문자열의 한줄을 읽는다. 
    
    
    
    System.out.print("이름? ");
    String name = keyboard.nextLine();
    
    
    
    System.out.printf("%d(%s)\n", age, name);  
  }

}



/*

*/  








 