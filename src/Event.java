import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Event{
    Player player = new Player();
    Enemy enemy = new Enemy();
    Scanner scanner = new Scanner(System.in);
    int EnExp;
    Random random = new Random();
    String Musuh;
    int Answer;
    int enemyHP;
    int playerHP;
    int enemyDamage;
    int playerDamage;
    int PlaGainExp;
    int ChanceDef = 3;

    public void status(){
        System.out.println("<-------------------[Status Player]------------------->");
        player.Accsess();
        System.out.println("Hp = "+player.getHp());
        System.out.println("Att = "+player.getAttack());
        System.out.println("LvL = "+player.getLevel());
        System.out.println("Exp = "+player.getExp());
    }



}
