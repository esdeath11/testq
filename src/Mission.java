import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Mission extends Event{
    private String Quest[] = {"Operation Blue Thunder","Operation Battle Axe","Operation Minerva","Operation Jack The Ripper"};
    Random random = new Random();
    Enemy enemy = new Enemy();
    Scanner scanner = new Scanner(System.in);
    int Answer;

    public void Blue_Thunder(){
        Musuh = enemy.EnemyName[1];
        System.out.println("<----------------------------------[Operation Blue Thunder]---------------------------------->");
        System.out.println("Target = "+enemy.EnemyName[1]);
        System.out.println("Location = Quiet Forest");

        System.out.println("<----------------------------------[Before Battle]---------------------------------->");
        System.out.println(enemy.EnemyName[1]+" : Hahaha kamu tidak bisa mengalahkanku!!!");
        System.out.println(player.getNama()+" : Yakin? Mau di coba dulu?");
        System.out.println(enemy.EnemyName[1]+" : hmmm... ayo kita bertarung");
        System.out.println(player.getNama()+" : siapa takut");
    }

    public void Battle_Axe(){
        Musuh = enemy.EnemyName[2];
        System.out.println("<----------------------------------[Operation Blue Thunder]---------------------------------->");
        System.out.println("Target = "+enemy.EnemyName[2]);
        System.out.println("Location = Burrows of the Black Horsemen");

        System.out.println("<----------------------------------[Before Battle]---------------------------------->");
        System.out.println(enemy.EnemyName[2]+" : Hahaha kamu tidak bisa mengalahkanku!!!");
        System.out.println(player.getNama()+" : Yakin? Mau di coba dulu?");
        System.out.println(enemy.EnemyName[2]+" : hmmm... ayo kita bertarung");
        System.out.println(player.getNama()+" : siapa takut");
    }

    public void Minerva(){
        Musuh = enemy.EnemyName[3];
        System.out.println("<----------------------------------[Operation Blue Thunder]---------------------------------->");
        System.out.println("Target = "+enemy.EnemyName[3]);
        System.out.println("Location = The Winter Chambers");

        System.out.println("<----------------------------------[Before Battle]---------------------------------->");
        System.out.println(enemy.EnemyName[3]+" : Hahaha kamu tidak bisa mengalahkanku!!!");
        System.out.println(player.getNama()+" : Yakin? Mau di coba dulu?");
        System.out.println(enemy.EnemyName[3]+" : hmmm... ayo kita bertarung");
        System.out.println(player.getNama()+" : siapa takut");
    }
    public void Jack_The_Reaper(){
        Musuh = enemy.EnemyName[4];
        System.out.println("<----------------------------------[Operation Blue Thunder]---------------------------------->");
        System.out.println("Target = "+enemy.EnemyName[4]);
        System.out.println("Location = The Hallucination Caverns");

        System.out.println("<----------------------------------[Before Battle]---------------------------------->");
        System.out.println(enemy.EnemyName[4]+" : Hahaha kamu tidak bisa mengalahkanku!!!");
        System.out.println(player.getNama()+" : Yakin? Mau di coba dulu?");
        System.out.println(enemy.EnemyName[4]+" : hmmm... ayo kita bertarung");
        System.out.println(player.getNama()+" : siapa takut");
    }

    public String[] getQuest() {
        return Quest;
    }
}
