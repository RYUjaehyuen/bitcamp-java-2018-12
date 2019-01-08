// 콘솔 출로 출력하기 - 날자값 출력하기 
package ch02;

public class Test13 {
   
  public static void main(String[] args) {
    //값 출력하기 
    java.util.Date today = new java.util.Date();
    System.out.printf("%1$tY, %1$ty\n", today);  
    System.out.printf("%1$tB, %1$tb\n", today); 
    System.out.printf("%1$tm\n", today);
    System.out.printf("%1$td, %1$te\n", today);
    System.out.printf("%1$tA, %1$ta\n", today);
    System.out.printf("%1$tH, %1$tI\n", today);
    System.out.printf("%1$tM\n", today);
    System.out.printf("%1$tS\n", today);
    System.out.printf("%1$tH, %1$tL, %1$tN\n", today);
    
    //오전 오후 출력하기 
    
    
    // 년- 월- 일  시:분: 
    System.out.printf("%1$tY-%1$tm-%1$td \n%1$tH:%1$tM:%1$tS ", today);
    
   
    
    
  }
}

/*
print 줄바꿈만
println  = 출력 +줄바꿈 
printf 사용법 !!!        
         
 d 정수 x 16진수  c문자 s 문자  b 트루 펄스
  
  
  
  
  
  
 */
