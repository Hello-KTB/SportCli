package model;

public class Sport {
    protected int weight;
    protected int time;
    protected int calorie;

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

    public void exercise() {
        System.out.println("운동 시작!");
    }

    public void stop() {
        System.out.println("------------|Good Bye|--------------");
        System.out.println("지금까지 운동한 시간: " + getTime() + "시간");
        System.out.println("지금까지 소모한 칼로리: " + getCalorie() + "kcal");
        System.out.println("내일 이어서 해야지!");
    }
}