import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Event extends Information{


    public void calculateExp(){
        player.setExp(getPlaGainExp());
        player.Accsess();
        status();
    }



    public void status(){
        System.out.println("<-------------------[Status Player]------------------->");
        System.out.println("Hp = "+player.getHp());
        System.out.println("Att = "+player.getAttack());
        System.out.println("LvL = "+player.getLevel());
        System.out.println("Exp = "+player.getExp());
    }




}
