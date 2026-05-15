package model;

import java.util.Scanner;

public class Sport {
    private int weight;
    private int time;
    private int calorie;

    public Sport(int weight, int time, int calorie) {
        this.weight = weight;
        this.time = time;
        this.calorie = calorie;
    }

    public int getWeight() {
        return weight;
    }

    public int getTime() {
        return time;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public void currentStatus() {
        System.out.println("------------|Status|--------------");
        System.out.println("총 운동 시간은 " + getTime() + "시간이고, 총 소모 칼로리는 " + getCalorie() + "kcal입니다");
    }

    public void exercise() {}

    public void stop() {
        System.out.println("------------|Good Bye|--------------");
        System.out.println("지금까지 운동한 시간: " + this.time + "시간");
        System.out.println("지금까지 소모한 칼로리: " + this.calorie + "kcal");
        System.out.println("내일 이어서 해야지!");
    }
}