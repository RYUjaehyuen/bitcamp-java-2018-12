// l   r   - value 용어
package ch03;

public class Test04 {

  public static void main(String[] args) {
    int a = 100;
    int b = a;    //전달되는 의미보기 
    // l-value(메모리어야 한다)--------> b    , r-value ---------->a
    
    
    System.out.printf("%d, %d\n", a, b);
    
    a = 200;
    System.out.printf("%d, %d\n", a, b);
    
    a = 300;  // r-value는 리터럴 가능하다. 
    a = b; //  ok 
    
    
    
  }

}




/*




 */