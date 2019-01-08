// 콘솔 출로 출력하기 - 형식 갖춰 출력하기 
package ch02;

public class Test12 {
   
  public static void main(String[] args) {
    //값 출력하기 
    System.out.println();
    
    
    System.out.printf("이름: %S\n", "홍길동");
    System.out.printf("안녕하세요! %S입니다. \n", "임꺽정");
    System.out.printf("%d %x %c %b\n", 65, 65, 65, true);
    System.out.printf("%2d 2%x 2%c \n", 65, 66, 67);
    
    // 값을 출력될 공간을 지정할수 있다.
    System.out.printf("'%-10s' '%10s'\n", "홍길동", "임꺽정");
    System.out.printf("'%010d' '%07d'\n", 12345, 12345);
    System.out.printf("'%+010d' '%+07d'\n", 12345, -12345);  // %[+][0][사용할 너비]d : +는 숫자의 부호를 붙이라는의미
    
    
    
  }
}

/*
print 줄바꿈만
println  = 출력 +줄바꿈 
printf 사용법 !!!        
         
 d 정수 x 16진수  c문자 s 문자  b 트루 펄스
  
  
  
  
  
  
 */
