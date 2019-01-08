// 배열  - 인스턴스와 레퍼런스
package ch03;

public class Test14 {
  public static void 기main(String[] args) {    // 메소드 

    int[] arr1 = {101, 102, 103, 104, 105};    //값을 담고있는 메모리 ---> 인스턴스
    int[] arr2 = {81, 82, 83, 84, 85};   //인스턴스 주소를 담고 있는 메모리 ---->레퍼런스 
    
    arr2 = arr1; 
    System.out.printf("%d, %d\n", arr1[1], arr2[1]);
    
    arr1[1] = 500;
    System.out.printf("%d, %d\n", arr1[1], arr2[1]);
    
    //같은 주소를 가르키기 때문에 값은 같다

  }

}

/*
가비지  - 참조되는 주소를 잃어버려 사용할수 없는 메모리
특정조건이되면 가비지 수집기 (garbage collector)에의해 메모리 헤제 된다.
메모리 해제? 다른 용도로 사용할 수 있도록 표시한다.

# 가비지 수집 조건 = 가비지컬렉터 동작할때
-메모리가 부족할때
-cpu가 한가할떄

#가비지를 강제로 지우도록 명령하는 방법 
- 없다. -> jvm이 자동으로 해제한다. <개발자가 직접하는 것이 아니라>
* JavaScript, c#, python, php, swift, go, java 등등 * 
c의 경우는 free(메모리주소);
c++의경우 delete 객체주소; 이런 메소드를 사용하여 해제시킨다. 
 
 
 */  








