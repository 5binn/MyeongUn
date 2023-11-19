package org.example;

import java.util.Scanner;

public class App {
    private Scanner sc;
    App (Scanner sc) {
        this.sc = sc;
    }
    void run() {
        System.out.println("== 명언 앱 ==");
        while(true){
            System.out.print("명령) ");
            String 명령 = this.sc.nextLine();
            if (명령.equals("등록")) {
                System.out.print("명언 : ");
                sc.nextLine();
                System.out.print("작가 : ");
                sc.nextLine();

                continue;
            }
            if (명령.equals("종료")){
                break;
            }
        }
    }
}

