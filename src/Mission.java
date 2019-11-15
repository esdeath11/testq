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
    }

}
