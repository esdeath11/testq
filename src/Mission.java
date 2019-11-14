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
        EnExp = random.nextInt(100);
        enemy.setExp(EnExp);
        enemy.Accsess();
        player.Accsess();
        while (statusQuest == true){
            System.out.println("<----------------------[QUEST Operation Blue Thunder]----------------------->");
            System.out.println("Quest : kill "+enemy.EnemyName[1]);
            System.out.println("kamu menuju perjalanan ke 'The Narrow Pits'");
            System.out.println("dalam perjalanan kamu melihat dua arah, yaitu ke kanan dan ke kiri");
            System.out.println("Jalan mana yang kamu pilih?");
            System.out.println("1. kanan"+"\n"+"2. kiri");
            System.out.println("<---[Answer]--->");
            Answer = scanner.nextInt();
            if (Answer == 1){
                meetSoldier();
                meetBoss();
                break;
            }
            if (Answer == 2){
                meetBoss();
                break;
            }
            else {
                System.out.println("Input yang anda masukkan salah, coba lagi");
            }
        }
    }

    public void meetSoldier(){
        System.out.println("<kamu bertemu musuh!>");
        System.out.println(enemy.EnemyName[0]);
        enemyName = enemy.EnemyName[0];
        playerHP = player.getHp();
        enemyDamage = enemy.getAttack();
        playerDamage = player.getAttack();
        enemyHP = enemy.getHp();
        Battle();
        Condtions = true;
    }
    public void meetBoss(){
        System.out.println("<------------[Boss Fight]----------->");
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
        Battle();
    }


    public String[] getQuest() {
        return Quest;
    }

    public void Operation_Battle_Axe(){
        EnExp = random.nextInt(100);
        enemy.setExp(EnExp);
        enemy.Accsess();
        player.Accsess();
        while (statusQuest == true){
            System.out.println("<----------------------[QUEST Operation Battle Axe]----------------------->");
            System.out.println("Target = "+enemy.EnemyName[2]);
            System.out.println("Location = The Prisoner Pits");
            System.out.println("Dalam perjalanan menuju The Prisoner Pits"+"\n"+"kamu melihat 3 arah");
            System.out.println("1. Kiri"+"\n"+"2. Lurus"+"\n"+"3. Kanan");
            System.out.println("<-[Answer]->");
            Answer = scanner.nextInt();
            if (Answer == 1){
                meetSoldier();
                meetSoldier();
                Aikaterine();
                break;
            }
            if (Answer == 2){
                Aikaterine();
                break;
            }
            if (Answer == 3){
                meetSoldier();
                Aikaterine();
                break;
            }
            else {
                System.out.println("Input yang anda masukkan salah, coba lagi");
            }
        }
    }
    public void Aikaterine(){
        System.out.println("<kamu bertemu musuh!>");
        System.out.println(enemy.EnemyName[2]);
        enemyName = enemy.EnemyName[2];
        enemy.setExp(0);
        enemy.Accsess();
        EnExp = random.nextInt(300);
        enemy.setExp(EnExp);
        enemy.Accsess();
        enemyHP = enemy.getHp();
        playerHP = player.getHp();
        enemyDamage = enemy.getAttack();
        playerDamage = player.getAttack();
        Battle();
    }

}
