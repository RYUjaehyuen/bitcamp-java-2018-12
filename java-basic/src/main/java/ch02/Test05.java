//부동소수점 리터럴의 크기
package ch02;

public class Test05 {
  public static void main(String[] args) {
   

    // 부동소수점 9876.54345678출력하라 (8바이트)
    System.out.println(9876.54345678);

  
    // 부동소수점9876.54345678f출력하라  (4바이트)
    System.out.println(9876.54345678f);

  }

}

/*
  # 부동소수점 리터럴 크기 
  4바이트 
  3.14f / 3.14F
  31.4e-1f / 31.4e-1F
  
  8바이트 
  3.14
  31.4e-1
  
  # 부동소수점을 메모리에 저장하는 방법
  
  
  
  
  
  
 */
