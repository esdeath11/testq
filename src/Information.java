import java.util.Random;
import java.util.Scanner;

public class Information{
    int playerHP;
    int playerAtt;
    int playerLVL;
    int playerExp;
    int playerCurrentExp;
    int Uang;
    int Gold;
    int weaponDMG;
    Weapon weapon = new Weapon();
    Player player = new Player();
    Enemy enemy = new Enemy();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String Musuh;
    int Answer;
    int plusDef = 3;
    int ChanceDef = 3;
    int ChanceEsc;
    boolean Condtions = true;
    int changeChoose;
    boolean changeMission = true;
    boolean statusQuest = true;
    int earnExp;
    int enemyAtt;
    int soul;
    int Healing;
    int HealingChance = 3;
}
