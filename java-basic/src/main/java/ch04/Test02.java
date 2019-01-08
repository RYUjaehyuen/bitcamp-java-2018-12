//데이터 타입과 연산자
package ch04;

public class Test02 {
  public static void main(String[] args)  {
    //데이터 타입에 따라 제공되는 연산자가 다르다
    System.out.println(5.75 % 0.24);  //부동소수 ok
    //System.out.println(true % false);  // 논리는 boolean타입에 대해서는 산술 연산자를 사용 x
    //    System.out.println(true + true);  동일하게 컴파일 오류
    System.out.println("Hello,"+"world");  // + 연산자가 문자연결용으로 쓰임
    //System.out.println("Hello,"-"wo"); // 컴파일 오류

    //    System.out.println(true && true);  // ok 
    //    System.out.println(10 && 10);   //컴파일 오류 
    


  }
}
