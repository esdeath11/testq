import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Event extends Information{


    public void calculateExp(){
//        player.setExp(300);
        player.Operation();
        playerHP = player.currentHP;
        playerAtt = player.currentAtt;
        playerLVL = player.currentLVL;
        playerExp = player.calculateExp;
        Healing = player.currentHeal;
//        status();
    }
    public void status(){
        System.out.println("<-------------------[Status Player]------------------->");
        System.out.println("Hp = "+playerHP);
        System.out.println("Att = "+playerAtt);
        System.out.println("LvL = "+playerLVL);
        System.out.println("Exp = "+playerExp);
        System.out.println("Gold = "+Gold);
        System.out.println("Healing = "+ Healing);
        System.out.println("<-------------------[Status Player]------------------->");
    }
//
//


}
