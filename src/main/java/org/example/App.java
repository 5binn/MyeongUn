package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;

    App(Scanner sc) {
        this.sc = sc;
    }
    List<내용> 내용List = new ArrayList<>();
    void run() {
        System.out.println("== 명언 앱 ==");
        int 번호 = 1;
        while (true){
            System.out.print("명령) ");
            String 명령 = this.sc.nextLine().trim();
            if (명령.equals("등록")) {
                System.out.print("명언 : ");
                String 명언 = this.sc.nextLine().trim();
                System.out.print("작가 : ");
                String 작가 = this.sc.nextLine().trim();
                System.out.printf("%d번 명령이 등록되었습니다.\n",번호);
                내용 a내용 = new 내용(번호,작가,명언);
                내용List.add(a내용);
                번호++;
            } else if (명령.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-".repeat(30));
                for (int i=0;i<내용List.size();i++){
                    내용 a내용 = 내용List.get(i);
                    System.out.printf("%d / %s / %s\n",a내용.get번호(),a내용.get작가(),a내용.get명언());
                }
            }else if (명령.equals("종료")) {
                break;
            }
        }
    }
}


