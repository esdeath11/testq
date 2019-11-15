public class EventBattle extends Mission {
    boolean battleStatus = true;
    boolean answerStatus = true;

    public void battle(){
        calculateExp();
        System.out.println("<------------------------[Enemy]------------------------>");
        while (battleStatus == true) {
            if (Musuh == enemy.EnemyName[0]) {
                enemy.setExp(100);
                earnExp = enemy.dropExp[0];
                enemy.Operation();
                System.out.println("Musuh = " + enemy.EnemyName[0]);
                System.out.println("HP = " + enemy.currentHP);
                System.out.println("Att = " + enemy.currentAtt);
                System.out.println("LVL = "+enemy.currentLVL);
                battleBegin();
                break;
            }
            if (Musuh == enemy.EnemyName[1]) {
                enemy.setExp(200);
                earnExp = enemy.dropExp[1];
                enemy.Operation();
                System.out.println("Musuh = " + enemy.EnemyName[1]);
                System.out.println("HP = " + enemy.currentHP);
                System.out.println("Att = " + enemy.currentAtt);
                System.out.println("LVL = "+enemy.currentLVL);
                battleBegin();
                break;
            }
            if (Musuh == enemy.EnemyName[2]) {
                enemy.setExp(300);
                earnExp = enemy.dropExp[2];
                enemy.Operation();
                System.out.println("Musuh = " + enemy.EnemyName[2]);
                System.out.println("HP = " + enemy.currentHP);
                System.out.println("Att = " + enemy.currentAtt);
                System.out.println("LVL = "+enemy.currentLVL);
                battleBegin();
                break;
            }
            if (Musuh == enemy.EnemyName[3]) {
                enemy.setExp(400);
                earnExp = enemy.dropExp[3];
                enemy.Operation();
                System.out.println("Musuh = " + enemy.EnemyName[3]);
                System.out.println("HP = " + enemy.currentHP);
                System.out.println("Att = " + enemy.currentAtt);
                System.out.println("LVL = "+enemy.currentLVL);
                battleBegin();
                break;
            }
            if (Musuh == enemy.EnemyName[4]) {
                enemy.setExp(500);
                earnExp = enemy.dropExp[4];
                enemy.Operation();
                System.out.println("Musuh = " + enemy.EnemyName[4]);
                System.out.println("HP = " + enemy.currentHP);
                System.out.println("Att = " + enemy.currentAtt);
                System.out.println("LVL = "+enemy.currentLVL);
                battleBegin();
                break;
            }
            if (Musuh == enemy.EnemyName[5]) {
                enemy.setExp(600);
                earnExp = enemy.dropExp[5];
                enemy.Operation();
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
        answerStatus = true;
        while (answerStatus == true){
            System.out.println("<---------------[Status "+Musuh+"]--------------->");
            System.out.println("HP musuh = "+enemy.currentHP);
            System.out.println("Att musuh = "+enemy.currentAtt);
            System.out.println("Level musuh = "+enemy.currentLVL);
            System.out.println();
            System.out.println("<---------------[Status "+player.getNama()+"]--------------->");
            System.out.println("HP Player = "+playerHP);
            System.out.println("Att Player = "+playerAtt);
            System.out.println("Level Player = "+playerLVL);
            System.out.println("Current Exp = "+ playerCurrentExp);
            System.out.println();
            System.out.println("<"+Musuh+" Sedang mendekat!>");
            System.out.println("1. Serang"+"\n"+"2. Bertahan"+"\n"+"3. istirahat"+"\n"+"4. kabur");
            System.out.println("<---------------[Answer]--------------->");
            Answer = scanner.nextInt();
            if (Answer == 1){
                System.out.println("<-------["+player.getNama()+" Menyerang]------->");
                enemy.currentHP = enemy.currentHP - playerAtt;
                System.out.println("Kamu Menyerang "+Musuh);
                System.out.println(Musuh+" menerima "+playerAtt+" Damage!!");
                if (enemy.currentHP < 1){
                    System.out.println("<----[KAMU MENANG!!!]---->");
                    player.setExp(earnExp);
                    System.out.println("<----[kamu mendapat "+earnExp+"]---->");
                    winCondition();
                    break;
                }
                else {
                    enemyAttack();
                }
            }
            else if (Answer == 2){
                System.out.println("<-----------[Bertahan]----------->");
                if(ChanceDef >= 1){
                    ChanceDef -=1;
                    playerAtt += 3;
                    enemy.currentAtt = enemy.currentAtt - plusDef;
                    playerHP = playerHP - enemy.currentAtt;
                    System.out.println(Musuh+" Menyerang!!");
                    System.out.println("kamu menerima "+ enemy.currentAtt+" DAMAGE!!");
                    System.out.println("HP player = "+ player.currentHP);
                }
                else {
                    enemyAttack();
                }
            }
            else if (Answer == 3){
                System.out.println("<-----------[Istirahat]----------->");
                ChanceDef += 1;
                enemyAttack();
            }
            else if (Answer == 4){
                System.out.println("<-----------[Kabur!!!]----------->");
                ChanceEsc = random.nextInt(2);
                if (ChanceEsc == 1){
                    System.out.println("Kamu Berhasil Kabur!!");
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
        playerHP = playerHP - enemy.currentAtt;
        System.out.println("kamu terkena "+enemy.currentAtt+" DAMAGE!!!");
        if (player.currentHP< 1){
            System.out.println("GAME OVER");
        }
        if (player.currentHP > 0){
            battleBegin();
        }
    }

    public void winCondition(){
        answerStatus = false;
        calculateExp();
            status();
        }
}
