package ch03;

public class Test01 {

  public static void main(String[] args) {
    
    // 정수
    byte b1;
    byte b2;
    byte b3;
    
    b1 = -128;
    b2 = 127;
    //b3 = 128;
    
    short s1;
    short s2;
    short s3;
   
    s1 = -32768;
    s2 = 32767;
    //s3 = 32768;  메모리 크기 벗어남 
    
    
    int i1;
    int i2;
    int i3;
    
    i1 = -2100000000;
    i2 = 2100000000;
    // i2 = 2100000000L;   8바이트 타입을 작은 거에 늘라니까 이런거임 
    // i3 = 2200000000;  용량초과 (리터럴 표현 오류 4바이트 초과하는 값을 표현했기) 
      
    
    long l1;
    long l2;
    long l3;
    
    l1 = 9000000000000000000L;
    //l2 = 9900000000000000000L;  8바이트로 표현불가 
     
    
    
    //부동소수에
    float f1;
    float f2;
    
    
    f1 = 98765.43f;
    f2 = 98765.43456789111111111121212121212121f;  //4바이트가 소화할수 있는정도 제외하고 값이 짤려서 들어감 ~~
    
    
   // System.out.println(f1);
    //System.out.println(f2);
    
    f1 = 9876.543f;
    f2=12.34567f;
    // 아래 예제에서 보면 부동소수점이 완벽하지 않다는 예시가 있다.
    
   
    
    
    
    
    //논리
    
    boolean bool1;
    boolean bool2;
    boolean bool3;
    
  
    bool1 = true;
    bool2 = false;
    
    
    // UTF-16코드를 담을 메모리  (2바이트) 
    char c1;
    char c2;
    char c3;
    
    c1 = 45352;  //4바이트 정수 리터럴 
    c2 = 0xac00;
   // System.out.println(c1);
   // System.out.println(c2);
  }

}
