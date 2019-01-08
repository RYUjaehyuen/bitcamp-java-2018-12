// 문자 제어 코드 
package ch02;

public class Test10 {
   
  public static void main(String[] args) {
  System.out.println("Hello,\nworld!"); // 줄바꿈
  System.out.println("Hello,\rworld!"); // n이나 r이나 둘다 같이 엔터취급 (프로그램에서)
  System.out.println("Hello,\b\bworld!");
  System.out.println("Hello,\t\t\tworld!");
  System.out.println("Hello,\fworld!");
  System.out.println("Hello,\"w\"orld!");  // 밑에거랑 차이 잘봐두기 
  System.out.println("Hello,'w'orld!");
  System.out.println('\'');
  System.out.println('"');
  System.out.println("Hello,\\\\\\world!");  // 역슬레시는 의미가 있기에   
  
  }
}

/*
 * 제어문자 
 \n  -  LF 0x0a  
 \r  -  Carrage Return(CR), 0x0d
 \t  -  tap 0x09
 \b  -  back space 0x08   
 \'  -  sing quote, 0x27
 \"  -  double quote, 0x28
         
       
        
         
  
  
  
  
  
  
  
 */
