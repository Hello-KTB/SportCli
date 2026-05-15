package model;

import java.util.Scanner;

public class Football extends Sport {
    private Scanner sc = new Scanner(System.in);
    private int goal;
    private int assist;
    private int set;

    public Football(int weight, int time, int calorie, int  goal, int assist, int set) {
        super(weight, time, calorie);
        this.goal = goal;
        this.assist = assist;
        this.set = set;
    }

    public void setGoal(Scanner sc) {
        this.goal = sc.nextInt();
    }

    public void setAssist(Scanner sc) {
        this.assist = sc.nextInt();
    }

    public void setSet(Scanner sc) {
        this.set = sc.nextInt();
    }

    public int getGoal() {
        return goal;
    }

    public int getAssist() {
        return assist;
    }

    public int getSet() {
        return set;
    }

    @Override
    public void exercise() {
        System.out.println("------------|Football|--------------");
        System.out.print("골 : ");
        setGoal(sc);
        System.out.print("어시스트 : ");
        setAssist(sc);
        System.out.print("경기 수 (전후반 1시간) : ");
        setSet(sc);

        System.out.println("총 " + getSet() + "경기동안 " + getGoal() + "골, " + getAssist() + "어시스트 달성!");
        setTime(getTime() + getSet());
        setCalorie(getSet() * getWeight());
    }
}
