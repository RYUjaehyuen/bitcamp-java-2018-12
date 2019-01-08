package bitcamp.lms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    
    System.out.println("번호?");
    int a = keyboard.nextInt();
    
    keyboard.nextLine();
    
    System.out.println("내용?");
    String b = keyboard.nextLine();
    
    java.sql.Date c = new Date(System.currentTimeMillis()); 
    
    int d = 0;
    
    keyboard.close();
    
    
    System.out.printf("번호 : %d\n", a);
    System.out.printf("내용 : %s\n", b);
    System.out.printf("작성일 : %s\n", c);
    System.out.printf("조회수 : %d", d);
        
        
    
  }

}
/*
App3.java 실행 결과

```
번호? 1
내용? 게시글입니다.

번호: 1
내용: 게시글입니다.
작성일: 2019-01-01
조회수: 0
```


*/