package bitcamp.lms;

import java.sql.Date;

public class App2 {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);


    System.out.print("번호?: ");
    int a = keyboard.nextInt();

    keyboard.nextLine();
   
    System.out.print("이름?: ");
    String b = keyboard.nextLine();
    //
    System.out.print("이메일?: ");
    String c = keyboard.nextLine();
    //
    System.out.print("암호?: ");
    int d = keyboard.nextInt();
    
    keyboard.nextLine();
    
    System.out.print("사진?: ");
    String e = keyboard.nextLine();
    //
    System.out.print("전화?: ");
    String f = keyboard.nextLine();
    //

    Date createdDate = new Date(System.currentTimeMillis()); 
    
    keyboard.close();
    
    System.out.printf("번호: %d\n", a);
    System.out.printf("이름 : %s\n", b);
    System.out.printf("이메일 : %s\n", c);
    System.out.printf("암호 : %d\n", d);
    System.out.printf("사진 : %s\n", e);
    System.out.printf("전화 : %s\n", f);
    System.out.printf("입력시간: %s\n",createdDate );
    
    
  }

}
