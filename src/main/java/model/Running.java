package model;

import java.util.Scanner;

public class Running extends Sport {
    private int distance;
    private int cadence;
    private Scanner sc = new Scanner(System.in);

    public Running(int weight, int hour, int minute, int calorie, int distance, int cadence) {
        super(weight, hour, minute, calorie);
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

    public String averagePace(int hour, int minute, int distance) {
        int total = hour * 60 + minute;
        double pace = (double)total / distance;

        double m = pace / 1;
        double s = (pace % 1) * 60;

        return ""+(int)m+"분"+(int)s+"초/km";
    }

    public void yourCadence(int cadence) {
        if(cadence <= 0) {
            System.out.println("잘못 입력했거나, 러닝을 안 했습니다.");
        }
        else if(cadence > 0 && cadence < 160) {
            System.out.println("보폭이 너무 크거나 지면 접촉 시간이 깁니다! 늘리십시오!");
        }
        else if(cadence >= 160 && cadence < 170) {
            System.out.println("평균적인 수준입니다!");
        }
        else if(cadence >= 170 && cadence < 180) {
            System.out.println("엘리트 선수나 숙력된 러너 수준입니다!");
        }
        else {
            System.out.println("비정상입니다!");
        }
    }

    @Override
    public void currentStatus() {
        System.out.println("------------|Running Status|--------------");
        System.out.println("총 러닝 거리는 " + getDistance() + "km이고, 러닝 시간은 "+ getHour() + "시간 " + getMinute() + "분이고, 총 소모 칼로리는 " + getCalorie() + "kcal입니다.");
        System.out.println("평균 페이스는 " + averagePace(getHour(), getMinute(), getDistance()) + "입니다.");
        yourCadence(getCadence());
    }

    @Override
    public void exercise() {
        System.out.println("------------|Running|--------------");
        System.out.print("러닝 거리(km): ");
        setDistance(sc.nextInt());
        System.out.print("러닝 시간(Hour): ");
        int h = sc.nextInt();
        System.out.print("러닝 분(minute): ");
        int m = sc.nextInt();
        setTime(h, m);
        System.out.print("케이던스(SPM): ");
        setCadence(sc.nextInt());

        setCalorie(getWeight() * getDistance());
        currentStatus();
    }
}