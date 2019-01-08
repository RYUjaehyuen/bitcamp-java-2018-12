package bitcamp.lms;
import java.util.Scanner;
public class Mangbol1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("지원부서!");
    System.out.println("1. 컴퓨터공학과!");
    System.out.println("2. 수학과!");
    System.out.println("3. 체육과!");
    int a = keyboard.nextInt();
    System.out.println("제출하실 서류는 다음과 같습니다.");
    if (a == 1)
      System.out.println("정보처리기사");
    else if(a == 2){
      System.out.println("수학책");
    }
    else if (a == 3) {
      System.out.println("체력");
    }
    else 
      System.out.println("올바른 번호를 입력하세요");
  }
}











