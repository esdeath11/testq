public class EventBattle extends Mission {
    boolean battleStatus = true;
    boolean answerStatus = true;
    boolean upgradeEnemy = true;

    public void battle(){
        Uang = 0;
        System.out.println(Gold);
        answerStatus = true;
        System.out.println("<------------------------[Enemy]------------------------>");
        while (battleStatus == true) {
            if (Musuh == enemy.EnemyName[0]) {
                enemy.setExp(100);
                earnExp = enemy.dropExp[0];
                Uang = 100;
                upgradeEnemy = true;
                calculatedEnemy();
                System.out.println("Musuh = " + enemy.EnemyName[0]);
                System.out.println("HP = " + enemy.currentHP);
                System.out.println("Att = " + enemy.currentAtt);
                System.out.println("LVL = "+enemy.currentLVL);
                battleBegin();
                break;
            }
            else if (Musuh == enemy.EnemyName[1]) {
                earnExp = enemy.dropExp[1];
                enemy.setExp(200);
                Uang = 300;
                upgradeEnemy = true;
                calculatedEnemy();
                System.out.println("Musuh = " + enemy.EnemyName[1]);
                System.out.println("HP = " + enemy.currentHP);
                System.out.println("Att = " + enemy.currentAtt);
                System.out.println("LVL = "+enemy.currentLVL);
                battleBegin();
                break;
            }
            else if (Musuh == enemy.EnemyName[2]) {
                enemy.setExp(300);
                earnExp = enemy.dropExp[2];
                Uang = 500;
                upgradeEnemy = true;
                calculatedEnemy();
                System.out.println("Musuh = " + enemy.EnemyName[2]);
                System.out.println("HP = " + enemy.currentHP);
                System.out.println("Att = " + enemy.currentAtt);
                System.out.println("LVL = "+enemy.currentLVL);
                battleBegin();
                break;
            }
            else if (Musuh == enemy.EnemyName[3]) {
                enemy.setExp(400);
                earnExp = enemy.dropExp[3];
                Uang = 550;
                upgradeEnemy = true;
                calculatedEnemy();
                System.out.println("Musuh = " + enemy.EnemyName[3]);
                System.out.println("HP = " + enemy.currentHP);
                System.out.println("Att = " + enemy.currentAtt);
                System.out.println("LVL = "+enemy.currentLVL);
                battleBegin();
                break;
            }
            else if (Musuh == enemy.EnemyName[4]) {
                enemy.setExp(500);
                earnExp = enemy.dropExp[4];
                Uang = 700;
                upgradeEnemy = true;
                calculatedEnemy();
                System.out.println("Musuh = " + enemy.EnemyName[4]);
                System.out.println("HP = " + enemy.currentHP);
                System.out.println("Att = " + enemy.currentAtt);
                System.out.println("LVL = "+enemy.currentLVL);
                battleBegin();
                break;
            }
            else if (Musuh == enemy.EnemyName[5]) {
                enemy.setExp(600);
                earnExp = enemy.dropExp[5];
                Uang = 1000;
                upgradeEnemy = true;
                calculatedEnemy();
                System.out.println("Musuh = " + enemy.EnemyName[5]);
                System.out.println("HP = " + enemy.currentHP);
                System.out.println("Att = " + enemy.currentAtt);
                System.out.println("LVL = "+enemy.currentLVL);
                battleBegin();
                break;
            }
            else {
                System.out.println("w");
            }
        }
    }


    public void battleBegin(){
        System.out.println("<-------------------------------[BATTLE]------------------------------->");
        while (answerStatus == true){
            enemyAtt = enemy.currentAtt;
            System.out.println("<---------------[Status "+Musuh+"]--------------->");
            System.out.println("HP musuh = "+enemy.currentHP);
            System.out.println("Att musuh = "+enemyAtt);
            System.out.println("Level musuh = "+enemy.currentLVL);
            System.out.println();
            System.out.println("<---------------[Status "+player.getNama()+"]--------------->");
            System.out.println("HP Player = "+playerHP);
            System.out.println("Att Player = "+playerAtt);
            System.out.println("Chance Def = "+ ChanceDef);
            System.out.println("Healing Chance = "+HealingChance);
            System.out.println("Level Player = "+playerLVL);
            System.out.println("Current Exp = "+ playerCurrentExp);
            System.out.println();
            System.out.println("<"+Musuh+" Sedang mendekat!>");
            System.out.println("1. Serang"+"\n"+"2. Bertahan"+"\n"+"3. Healing"+"\n"+"4. istirahat"+"\n"+"5. kabur");
            System.out.println("<---------------[Answer]--------------->");
            Answer = scanner.nextInt();
            if (Answer == 1){
                System.out.println("<-------["+player.getNama()+" Menyerang]------->");
                enemy.currentHP = enemy.currentHP - (playerAtt + weaponDMG);
                System.out.println("Kamu Menyerang "+Musuh);
                System.out.println(Musuh+" menerima "+playerAtt+" Damage!!");
                if (enemy.currentHP < 1){
                    System.out.println("<----[KAMU MENANG!!!]---->");
                    player.setExp(earnExp);
                    System.out.println("<----[kamu mendapat "+earnExp+" EXP!!!]---->");
                    Gold = Gold + Uang;
//                    player.moneyOperator();
//                    Uang = 0;
                    System.out.println("<----[kamu mendapat "+Uang+" Gold!!!]---->");
                    winCondition();
                    break;
                }
                else if (enemy.currentHP > 0){
                    enemyAttack();
                }
            }
            else if (Answer == 2){
                System.out.println("<-----------[Bertahan]----------->");
                if(ChanceDef >= 1){
                    ChanceDef -=1;
                    HealingChance += 1;
                    enemyAtt = enemyAtt - plusDef;
                    playerHP = playerHP - enemyAtt;
                    System.out.println(Musuh+" Menyerang!!");
                    System.out.println("kamu menerima "+ enemyAtt+" DAMAGE!!");
                    System.out.println("HP player = "+ player.currentHP);
                }
                else {
                    enemyAttack();
                }
            }
            else if(Answer == 3){
                if (playerHP <= player.maxHP){
                    if (HealingChance > 0){
                        playerHP = playerHP + Healing;
                        HealingChance -= 1;
                        System.out.println("Healing Power!!!"+"\n"+"HP Player + "+Healing);
                        enemyAttack();
                    }
                    else {
                        System.out.println("kesempatan healing habis!!");
                        enemyAttack();
                    }
                }
                else {
                    System.out.println("HP kamu masih penuh");
                    HealingChance -=1;
                }
            }
            else if (Answer == 4){
                System.out.println("<-----------[Istirahat]----------->");
                ChanceDef += 1;
                HealingChance += 2;
                enemyAttack();
            }
            else if (Answer == 5){
                System.out.println("<-----------[Kabur!!!]----------->");
                ChanceEsc = random.nextInt(2);
                if (ChanceEsc == 1){
                    System.out.println("Kamu Berhasil Kabur!!");
                    answerStatus = false;
                    break;
                }
                else {
                    enemyAttack();
                }
            }
            else {
                System.out.println("pilih 1 - 4");
            }
        }
    }


    public void enemyAttack(){
        System.out.println("<-------["+Musuh+" Menyerang]------->");
        playerHP = playerHP - enemyAtt;
        System.out.println("kamu terkena "+enemyAtt+" DAMAGE!!!");
        if (playerHP < 1){
            System.out.println("GAME OVER");
            System.exit(1);
        }
        else if (playerHP > 0){
            battleBegin();
        }
    }

    public void winCondition(){
        answerStatus = false;
        calculateExp();
            status();
    }

    public void calculatedEnemy(){
        if(upgradeEnemy == true){
            enemy.Operation();
            upgradeEnemy = false;
        }
        else {
            System.out.println();
        }
    }
}
