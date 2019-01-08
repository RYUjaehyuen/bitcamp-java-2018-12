// 부동소수점
package ch02;

public class Test06 {
 static final float f =12.375f;  //뭔진 뭐름 ~
  
 public static void main(String[] args) {
    System.out.println(0.1f*0.1f);  // 결과값이  예상한것과 다르다 .
                                      // 이유 : 부동소수점을 이진수로 표현할때 비트로 모두 표현이 안되기 떄문에 아주 근소한 차이가 있다. 
    
    System.out.println(0.1f*0.1f == 0.01f);  
      //이결과에서 true를 예상했지만 위의 이유로인해서 결과값은 fulse 
      // 해결방안 ->예상한 값과의 오차가 부동소수점에서 인정하는 오차 이하의 값이라면 같은것으로 취급하라 
    System.out.println((0.1f*0.1f - 0.01f) <= Float.POSITIVE_INFINITY);  
                // 우리가 계산한 좌측항이 너무나 극소한 수라면 참으로 인정해라 라는 식인데 
                // 기억할거 까지는 없고 부동소수는 완벽한 수가 아니라는것 과 모든 수를 컴퓨터에 저장하려면 2진수로 표현이 가능해야 한다는거다.
  }

}

/*
   # 부동소수점을 메모리에 저장하는 방법 
  
  
  
  
  
  
 */
