import model.Sport;
import model.Running;
import model.Football;
import java.util.Scanner;

public class SportCli {
    public static void main(String[] args) {
        Sport sport = new Sport(0,0,0);
        Running running = null;
        Football football = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("이런 벌써 살이 이렇게나 쪄버렸다고? 운동을 해야겠군!!");

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
                running = new Running(sport.getWeight(), sport.getTime(), sport.getCalorie(), 0, 0);
                running.exercise();
            }
            else if(op == 2) {
                football = new Football(sport.getWeight(), sport.getTime(), sport.getCalorie(), 0, 0, 0);
                football.exercise();
            }
            else if(op == 3) {
                sport.currentStatus();
            }
            else {
                System.out.println("그런 운동은 없습니다. 다시 선택해주십시오!");
                continue;
            }
        }
    }
}
