//연산의 결과는 피연산자의 타입이다. 
package ch04;

public class Test03 {
  public static void main(String[] args)  {
    float r = 5/2;
    System.out.println(r);   //r 변수에 값을 저장하기 전에 이미 결과는 2이다.

    //해결책 
    // 두개의 정수값을 제대로 float로 계산하고 싶다면 형변환 해라 
    // 형변환이라고 원래 값을 다른타입으로 변경하는것이 아니다.
    float r2 = (float)5/2;
    System.out.println(r2);
    //float타입의 임시 메모리가 생성된 후 정수 5저장 2도 같은 형식으로 정수형을 강제로 float로 만든거라 생각하자.
    //형변환 = type casting 이라고 한다.
    // 개발자가 형을 변경하는 경우 명시적 형변환 이라고 한다.

    float r3 = 5/(float)2.2;   // 암시적 형변환 
    System.out.println(r3);


    byte b1 = 20; 
    byte b2 = 30;
    int b3 = b1 + b2;   // b1, b2 값은 int타입의 임시 메모리에 저장후 연산된다.


    short s1 = 20;
    short s2 = 30;
    int s3 = s1 + s2;

    char c1 = 20;
    char c2 = 20;
    int c3 = c1 + c2;


    int i1 = 100;
    float f1 = 200.5f;
    float i2 = i1 + f1;


    float f3 = 9876.543f;
    float f4 = 12.34567f;
    double d1 = f3 + f4;
    System.out.println(d1);


    double d2 = (double)f3 + f4;

    System.out.println(d2);

    double d7 = 9876.543;
    double d8 = 12.34567;
    double d9 = d7 + d8;
    System.out.println(d9);

  }
}


/*
암시적 형변환의 규칙 
byte, short,char ---> int - - - >long ----> float ----> double
예>   byte + short + char - float + long + int + double
(주의) 서로다른 타입과 연산 수행하면 규칙에따라 오른쪽 타입으로 자동 형변환 수행 ! 




 */