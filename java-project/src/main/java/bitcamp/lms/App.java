package bitcamp.lms;

public class App {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);


    System.out.print("번호?: ");
    int a = keyboard.nextInt();

    keyboard.nextLine();
   
    System.out.print("수업명?: ");
    String b = keyboard.nextLine();
    //
    System.out.print("수업내용?: ");
    String c = keyboard.nextLine();
    //
    System.out.print("시작일?: ");
    String d = keyboard.nextLine();
    //
    System.out.print("종료일?: ");
    String e = keyboard.nextLine();
    //
    System.out.print("총수업시간?: ");
    int f = keyboard.nextInt();
    //
    System.out.print("일수업시간?: ");
    int g = keyboard.nextInt();
    //
    keyboard.close();      // 스캐너 객체의 자원을 해제한다. 

    System.out.printf("번호: %d\n", a);
    System.out.printf("수업명 : %s\n", b);
    System.out.printf("설명 : %s\n", c);
    System.out.printf("기간 : %s ~ %s\n",d, e );
    System.out.printf("총 수업시간: %d\n", f);
    System.out.printf("일 수업시: %d\n", g);
    //
  }
}
/*

 */
