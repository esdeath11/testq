import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random =new Random();
        int a;
        boolean b;
//        Enemy enemy = new Enemy();
//        Player player = new Player();
        Human human = new Human();
        EventBattle eventBattle = new EventBattle();
        Mission mission = new Mission();
        Story story = new Story();
        Event event = new Event();
        Scanner scanner = new Scanner(System.in);


        Player player = new Player();
       // story.buyArmor();
       // story.preparation();
        story.firstAdvaneture();
//        b = true;
//        while(b ==true){
//            a = scanner.nextInt();
//            player.setMoney(300);
//            System.out.println(player.total_money);
//            player.total_money = player.total_money - 200;
//            player.moneyOperator();
//
//
//        }
//        story.preparation();


//        story.Intro();
//        story.guildMission();
//        player.setExp(0);
//        player.Accsess();
//        System.out.println(player.getHp());
//        System.out.println(player.getLevel());
//        System.out.println(player.getAttack());
//        eventBattle.Battle();
//        story.Guild();
//        mission.Operation_Blue_Thunder();
//        mission.test();
//        mission.meetBoss();
//        mission.Operation_Battle_Axe();
//        <testing random value>
//        event.firstAdvaneture();
//        event.calculateExp();
//        eventBattle.battle();
//        event.calculateExp();
//        eventBattle.winCondition();

//        while (a == true){
//            b = scanner.nextInt();
//            if (b == 1){
//                System.out.println("s");
//            }
//            else if (b == 2){
//                System.out.println("d");
//            }
//            else if (b == 3){
//                System.out.println("q");
//            }
//            else if (b == 4){
//                System.out.println("r");
//            }
//            else {
//                System.out.println("1 - 4");
//            }
//        }



    }
}
