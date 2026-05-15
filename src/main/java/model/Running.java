package model;

import java.util.Scanner;

public class Running extends Sport {
    private int distance;
    private int cadence;
    private Scanner sc = new Scanner(System.in);

    public Running(int weight, int time, int calorie, int distance, int cadence) {
        super(weight, time, calorie);
        this.distance = distance;
        this.cadence = cadence;
    }

    public int getDistance() {
        return distance;
    }

    public int getCadence() {
        return cadence;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }
    @Override
    public void exercise() {
        System.out.println("------------|Running|--------------");
        System.out.print("러닝 거리 (km) : ");
        setDistance(sc.nextInt());
        System.out.print("러닝 시간 (Hour) : ");
        int t = sc.nextInt();

        setTime(getTime() + t);
        setCalorie(getCalorie() + getDistance() * getWeight());
    }
}