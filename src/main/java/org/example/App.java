package org.example;

import java.util.Scanner;

public class App {
    private Scanner sc;

    App(Scanner sc) {
        this.sc = sc;
    }
    void run() {
        System.out.println("== 명언 앱 ==");
        long 번호 = 1;
        while (true){
            System.out.print("명령) ");
            String 명령 = this.sc.nextLine().trim();
            if (명령.equals("등록")) {
                System.out.print("명언 : ");
                String 명언 = this.sc.nextLine().trim();
                System.out.print("작가 : ");
                String 작가 = this.sc.nextLine().trim();
                System.out.printf("%d번 명령이 등록되었습니다.\n",번호);
                번호++;
            } else if (명령.equals("목록")) {
                System.out.println("번호 / 작가 / 명언"+"\n---------------");
            }else if (명령.equals("종료")) {
                break;
            }
        }
    }
}

