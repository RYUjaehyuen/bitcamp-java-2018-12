// 레퍼런스 변수 
package ch03;

public class Test05 {

  public static void main(String[] args) {
    java.util.Date d1 = new java.util.Date();
    java.util.Date d2 = d1;

    System.out.printf("%d, %d\n", d1.getDate(), d2.getDate());
    
    d1.setDate(22);

    System.out.printf("%d, %d\n", d1.getDate(), d2.getDate());

    
    
/*
 값변수는 그 순수한 값이 저장되는 거지만  레퍼런스 변수는 값이 아닌 주소가 저장되므로 위와같은 
 일이 일어난다. 
 자바 기본타입(int, long ,.....등)을 제외한 모든 변수는 레퍼런스 변수이다 .
*/  
  }

}









 