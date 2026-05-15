import model.Sport;
import model.Running;
import model.Football;
import java.util.Scanner;

public class SportCli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재 몸무게 : ");
        int weight = sc.nextInt();

        Sport sport = new Sport(weight,0,0);
        Running running = null;
        Football football = null;
        System.out.println("내가 " + weight + "kg이라고? 운동해야지!!");


        while(true) {
            System.out.println("------------|OPTIONS|--------------");
            System.out.println("0 : 운동 포기");
            System.out.println("1 : 러닝");
            System.out.println("2 : 축구");
            System.out.println("3 : 현재 진행상황");
            System.out.print("하고 싶은 운동을 선택해주세요 : ");
            int op = sc.nextInt();

            if(op == 0) {
                sport.stop();
                break;
            }
            else if(op == 1) {
                running = new Running(sport.getWeight(), 0, 0, 0, 0);
                running.exercise();
                System.out.println(sport.getTime());
                System.out.println(sport.getCalorie());
                System.out.println(running.getDistance());
                System.out.println(running.getTime());
            }
            else if(op == 2) {
                football = new Football(sport.getWeight(), sport.getTime(), sport.getCalorie(), 0, 0, 0);
                football.exercise();
            }
            else if(op == 3) {
                sport.currentStatus();
            }
            else {
                System.out.println("------------|Error|--------------");
                System.out.println("0~3번까지의 숫자만 선택하세요!");
                continue;
            }
        }
    }
}
