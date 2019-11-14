import java.util.Random;
import java.util.Scanner;

public class Information{
    Player player = new Player();
    Enemy enemy = new Enemy();
    Scanner scanner = new Scanner(System.in);
    int EnExp;
    Random random = new Random();
    String Musuh;
    String enemyName;
    int Answer;
    int enemyHP;
    int playerHP;
    int enemyDamage;
    int playerDamage;
    private int PlaGainExp;
    int ChanceDef = 3;
    int ChanceEsc;
    boolean Condtions = true;
    int changeChoose;
    boolean changeMission = true;


    public int getPlaGainExp() {
        return PlaGainExp;
    }

    public void setPlaGainExp(int plaGainExp) {
        PlaGainExp = plaGainExp;
    }
}
