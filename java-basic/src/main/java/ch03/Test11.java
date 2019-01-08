// 배열 
package ch03;

public class Test11 {
  public static void 기main(String[] args) {    // 메소
    //배열을 가리킬 래퍼런스 선언
    //int[] arr1;  // 자바 스타일
    //int arr2[];  //c언어 스타일 

    //배열문법 사용 x
//    int a1, a2, a3, a4, a5;
//    a1 = 100;
//    a2 = 90;
//    a3 = 80;
//    a4 = 70;
//    a5 = 60;
    
    
    //배열 문법 사용(자바 스타일)
    int[] arr1;
    int[] arr2; 
    // 배열을 생성하고 그 주소를 레퍼런스에 담는다.
    arr1 = new int[5];
    arr2 = new int[5];
  //배열에 값담기
    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;
    arr1[3] = 70;
    arr1[4] = 60;
 
    
    System.out.println(arr1[0]);
  
     
  }

}



/*



 */  








