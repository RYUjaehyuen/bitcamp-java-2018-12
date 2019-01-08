// 후위 연산자 a++  a--
package ch04;

public class Test09 {
  public static void main(String[] args)  {
    int a = 5, 
        r = a++;
    System.out.printf("%d, %d\n", a, r);
    
    
    a = 5;
    r = a++ + a++ * a++ ; 
    System.out.printf("%d, %d\n", a, r);
    
    
    //할당이 마지막단계 이다.
    a = 5;
    a = a++;
    

  }
}



/*







 */