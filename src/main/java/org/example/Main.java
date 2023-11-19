package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        System.out.print("명령) ");
        String 명령 = sc.nextLine();
        if(명령.equals("종료")){
            System.out.print("종료");
        }
    }
}
