package org.example;

public class 내용 {
    private int 번호;
    private String 작가;
    private String 명언;
    내용 (int 번호,String 작가,String 명언){
        this.번호 = 번호;
        this.작가 = 작가;
        this.명언 = 명언;
    }
    public int get번호() {
    return this.번호;
    }public String get작가(){
    return this.작가;
    }public String get명언(){
    return this.명언;
    }
}
