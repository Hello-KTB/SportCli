package model;

import java.util.Scanner;

public class Football extends Sport {
    private Scanner sc = new Scanner(System.in);
    private int goal;
    private int assist;
    private int set;
    private int win;

    public Football(int weight, int hour, int minute, int calorie, int  goal, int assist, int set, int win) {
        super(weight, hour, minute, calorie);
        this.goal = goal;
        this.assist = assist;
        this.set = set;
        this.win = win;
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

    public void setWin(int win) {
        this.win = win;
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

    public int getWin() {
        return win;
    }

    @Override
    public void currentStatus() {
        System.out.println("------------|Football Status|--------------");
        System.out.println("총 " + getSet() + "경기 중 "+ getWin() + "승을 챙겼습니다.");
        System.out.println("내 경기스탯은 " + getGoal() + "골 " + getAssist() + "어시스트이다.");
    }

    @Override
    public void exercise() {
        System.out.println("------------|Football|--------------");
        System.out.print("골(goal): ");
        setGoal(sc);
        System.out.print("어시스트(assist): ");
        setAssist(sc);
        System.out.print("경기 수(전후반 1시간): ");
        setSet(sc);
        System.out.print("경기 승리 수(win) : ");

        int w = 0;
        while(true) {
            w = sc.nextInt();
            if(w > getSet() || w < 0) {
                System.out.print("승리 수 재입력: ");
            }
            else break;
        }
        setWin(w);
        setCalorie(7 * getWeight() * getHour());

        currentStatus();
    }
}