package com.example.admin.newcustomdb.DBType;

/**
 * Created by admin on 2018-03-12.
 */

public class Subtitle {
    private String episode;
    /**
     * s : 화수 : 00000 -> 0000.0 : 즉 00012 면 1.2화 : 5자리 숫자 4자리 정수 1자리 소수점 : 주의 : 5자리 숫자 외 BD, EX, PIC, OVA, OAD 값이 올 수 있다.
     * 정리 : 5자리 숫자 혹은 BD, EX, PIC, OVA, OAD
     * 숫자 : 4자리 정수 마지막 1자리는 소수점 마지막 값이 0일경우 소수점 생략.
     */
    private int update; // d : 갱신날짜 : 20131201093938 -> 2013년 12월 01일 09시 39분 38초
    private String link; // 주소 :  자막주소 -> https:// 는 생략되어있음. | 자막 제작자가 입력하지 않은 경우 주소가 "" 빈스트링으로 올 수 있다.
    private String name; //자막 제작자 이름

    public Subtitle(String episode, int update, String link, String name) {
        this.episode = episode;
        this.update = update;
        this.link = link;
        this.name = name;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public int getUpdate() {
        return update;
    }

    public void setUpdate(int update) {
        this.update = update;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
