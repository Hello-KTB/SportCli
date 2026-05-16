package model;

public class Sport {
    private int weight;
    private int hour;
    private int minute;
    private double calorie;

    public Sport(int weight, int hour, int minute, double calorie) {
        this.weight = weight;
        this.hour = hour;
        this.minute = minute;
        this.calorie = calorie;
    }

    public int getWeight() {
        return weight;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public void currentStatus() {
        System.out.println("현재 상황");
    }

    public void exercise() {
        System.out.println("운동 시작!");
    }

    public void stop() {
        System.out.println("------------|Good Bye|--------------");
        System.out.println("오늘은 여기까지! 내일 이어서 해야지!");
    }
}