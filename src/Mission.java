import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Mission extends EventBattle{
    private String Quest[] = {"Operation Blue Thunder","Operation Battle Axe","Operation Minerva","Operation Jack The Ripper"};
    Random random = new Random();
    Enemy enemy = new Enemy();
    Scanner scanner = new Scanner(System.in);
    int Answer;
    public void Operation_Blue_Thunder(){
        System.out.println("<----------------------[QUEST Operation Blue Thunder]----------------------->");
        System.out.println("Quest : kill "+enemy.EnemyName[1]);
        System.out.println("kamu menuju perjalanan ke 'The Narrow Pits'");
        System.out.println("dalam perjalanan kamu melihat dua arah, yaitu ke kanan dan ke kiri");
        System.out.println("Jalan mana yang kamu pilih?");
        System.out.println("1. kanan"+"\n"+"2. kiri");
        System.out.println("<---[Answer]--->");
        Answer = scanner.nextInt();
        if (Answer == 1){
            changeChoose = 1;
        }
        if (Answer == 2){
            changeChoose = 2;
        }
        while (changeMission == true){
            if (changeChoose == 1){
                System.out.println("<kamu bertemu musuh!>");
                System.out.println(enemy.EnemyName[0]);
                enemyName = enemy.EnemyName[0];
                EnExp = random.nextInt(100);
                enemy.setExp(EnExp);
                enemy.Accsess();
                player.Accsess();
                playerHP = player.getHp();
                enemyDamage = enemy.getAttack();
                playerDamage = player.getAttack();
                enemyHP = enemy.getHp();
                Battle();
                changeChoose = 2;
            }
            if (changeChoose == 2){
                System.out.println("kamu menemukan target");
                System.out.println(enemy.EnemyName[1]);
                enemyName = enemy.EnemyName[1];
                enemy.setExp(200);
                enemy.Accsess();
                player.Accsess();
                playerHP = player.getHp();
                enemyDamage = enemy.getAttack();
                playerDamage = player.getAttack();
                enemyHP = enemy.getHp();
                changeMission = false;
            }
            else {
                System.out.println("Maaf salah Arah");
            }
        }
    }

    public String[] getQuest() {
        return Quest;
    }
}
