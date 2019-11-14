public class EventBattle extends Event {
    int test;
    public void Battle(){
        Musuh = enemyName;
        while (Condtions == true){
            if(Musuh == enemy.EnemyName[0]){
                System.out.println("player HP = "+playerHP);
                System.out.println("Chance Def = "+ChanceDef);
                System.out.println("Musuh HP = "+enemyHP);
                System.out.println("Musuh "+enemy.EnemyName[0]+" Menghampirimu!");
                System.out.println("Apa yang kamu lakukan?");
                System.out.println("1. serang"+"\n"+"2. Bertahan"+"\n"+"3. istirahat"+"\n"+"4. kabur");
                Answer = scanner.nextInt();
                if (Answer == 1){
                    System.out.println("kamu memberikan "+playerDamage+" damage!");
                    enemyHP = enemyHP - (playerDamage + 10);
                    playerDamage = player.getAttack();
                    System.out.println("Musuh HP = "+enemyHP);
                    if (enemyHP < 1){
                        System.out.println("kamu menang");
                        setPlaGainExp(enemy.dropExp[0]);
                        winCondition();
                        Condtions = false;
                    }
                    if (enemyHP > 0){
                        enemyAttack();
                    }
                }
                if (Answer == 2){
                    System.out.println("Musuh Menyerang "+enemyDamage+" Damage!");
                    System.out.println("Kamu bertahan");
                    if (ChanceDef > 0){
                        ChanceDef -= 1;
                        playerDamage = playerDamage + 2;
                        enemyAttackOnDef();
                    }
                    else {
                        enemyAttack();
                    }
                }
                if (Answer == 3){
                    ChanceDef +=1;
                    enemyAttack();
                }
                if (Answer == 4){
                    System.out.println("kamu mencoba kabur");
                    ChanceEsc = random.nextInt(2);
                    if (ChanceEsc == 1){
                        System.out.println("kamu berhasil kabur");
                        Condtions = false;
                    }
                    if (ChanceEsc == 0){
                        enemyAttack();
                    }
                    else {
                        Battle();
                    }
                }
                else {
                    Battle();
                }
            }
            if(Musuh == enemy.EnemyName[1]){
                System.out.println("player HP = "+playerHP);
                System.out.println("Chance Def = "+ChanceDef);
                System.out.println("Musuh HP = "+enemyHP);
                System.out.println("Musuh "+enemy.EnemyName[1]+" Menghampirimu!");
                System.out.println("Apa yang kamu lakukan?");
                System.out.println("1. serang"+"\n"+"2. Bertahan"+"\n"+"3. istirahat"+"\n"+"4. kabur");
                Answer = scanner.nextInt();
                if (Answer == 1){
                    System.out.println("kamu memberikan "+playerDamage+" damage!");
                    enemyHP = enemyHP - (playerDamage + 10);
                    playerDamage = player.getAttack();
                    System.out.println("Musuh HP = "+enemyHP);
                    if (enemyHP < 1){
                        System.out.println("kamu menang");
                        setPlaGainExp(enemy.dropExp[1]);
                        winCondition();
                        Condtions = false;
                    }
                    if (enemyHP > 0){
                        System.out.println(EnExp);
                        enemyAttack();
                    }
                }
                if (Answer == 2){
                    System.out.println("Musuh Menyerang "+enemyDamage+" Damage!");
                    System.out.println("Kamu bertahan");
                    if (ChanceDef > 0){
                        ChanceDef -= 1;
                        playerDamage = playerDamage + 2;
                        enemyAttackOnDef();
                    }
                    else {
                        enemyAttack();
                    }
                }
                if (Answer == 3){
                    ChanceDef +=1;
                    enemyAttack();
                }
                if (Answer == 4){
                    System.out.println("kamu mencoba kabur");
                    ChanceEsc = random.nextInt(2);
                    if (ChanceEsc == 1){
                        System.out.println("kamu berhasil kabur");
                        Condtions = false;
                    }
                    if (ChanceEsc == 0){
                        enemyAttack();
                    }
                    else {
                        Battle();
                    }
                }
                else {
                    Battle();
                }
            }
            if(Musuh == enemy.EnemyName[2]){
                System.out.println("player HP = "+playerHP);
                System.out.println("Chance Def = "+ChanceDef);
                System.out.println("Musuh HP = "+enemyHP);
                System.out.println("Musuh "+enemy.EnemyName[2]+" Menghampirimu!");
                System.out.println("Apa yang kamu lakukan?");
                System.out.println("1. serang"+"\n"+"2. Bertahan"+"\n"+"3. istirahat"+"\n"+"4. kabur");
                Answer = scanner.nextInt();
                if (Answer == 1){
                    System.out.println("kamu memberikan "+playerDamage+" damage!");
                    enemyHP = enemyHP - (playerDamage + 10);
                    playerDamage = player.getAttack();
                    System.out.println("Musuh HP = "+enemyHP);
                    if (enemyHP < 1){
                        System.out.println("kamu menang");
                        setPlaGainExp(enemy.dropExp[2]);
                        winCondition();
                        Condtions = false;
                    }
                    if (enemyHP > 0){
                        System.out.println(EnExp);
                        enemyAttack();
                    }
                }
                if (Answer == 2){
                    System.out.println("Musuh Menyerang "+enemyDamage+" Damage!");
                    System.out.println("Kamu bertahan");
                    if (ChanceDef > 0){
                        ChanceDef -= 1;
                        playerDamage = playerDamage + 2;
                        enemyAttackOnDef();
                    }
                    else {
                        enemyAttack();
                    }
                }
                if (Answer == 3){
                    ChanceDef +=1;
                    enemyAttack();
                }
                if (Answer == 4){
                    System.out.println("kamu mencoba kabur");
                    ChanceEsc = random.nextInt(2);
                    if (ChanceEsc == 1){
                        System.out.println("kamu berhasil kabur");
                        Condtions = false;
                    }
                    if (ChanceEsc == 0){
                        enemyAttack();
                    }
                    else {
                        Battle();
                    }
                }
                else {
                    Battle();
                }
            }
            if(Musuh == enemy.EnemyName[3]){
                System.out.println("player HP = "+playerHP);
                System.out.println("Chance Def = "+ChanceDef);
                System.out.println("Musuh HP = "+enemyHP);
                System.out.println("Musuh "+enemy.EnemyName[3]+" Menghampirimu!");
                System.out.println("Apa yang kamu lakukan?");
                System.out.println("1. serang"+"\n"+"2. Bertahan"+"\n"+"3. istirahat"+"\n"+"4. kabur");
                Answer = scanner.nextInt();
                if (Answer == 1){
                    System.out.println("kamu memberikan "+playerDamage+" damage!");
                    enemyHP = enemyHP - (playerDamage + 10);
                    playerDamage = player.getAttack();
                    System.out.println("Musuh HP = "+enemyHP);
                    if (enemyHP < 1){
                        System.out.println("kamu menang");
                        setPlaGainExp(enemy.dropExp[3]);
                        winCondition();
                        Condtions = false;
                    }
                    if (enemyHP > 0){
                        System.out.println(EnExp);
                        enemyAttack();
                    }
                }
                if (Answer == 2){
                    System.out.println("Musuh Menyerang "+enemyDamage+" Damage!");
                    System.out.println("Kamu bertahan");
                    if (ChanceDef > 0){
                        ChanceDef -= 1;
                        playerDamage = playerDamage + 2;
                        enemyAttackOnDef();
                    }
                    else {
                        enemyAttack();
                    }
                }
                if (Answer == 3){
                    ChanceDef +=1;
                    enemyAttack();
                }
                if (Answer == 4){
                    System.out.println("kamu mencoba kabur");
                    ChanceEsc = random.nextInt(2);
                    if (ChanceEsc == 1){
                        System.out.println("kamu berhasil kabur");
                        Condtions = false;
                    }
                    if (ChanceEsc == 0){
                        enemyAttack();
                    }
                    else {
                        Battle();
                    }
                }
                else {
                    Battle();
                }
            }
            if(Musuh == enemy.EnemyName[4]){
                System.out.println("player HP = "+playerHP);
                System.out.println("Chance Def = "+ChanceDef);
                System.out.println("Musuh HP = "+enemyHP);
                System.out.println("Musuh "+enemy.EnemyName[4]+" Menghampirimu!");
                System.out.println("Apa yang kamu lakukan?");
                System.out.println("1. serang"+"\n"+"2. Bertahan"+"\n"+"3. istirahat"+"\n"+"4. kabur");
                Answer = scanner.nextInt();
                if (Answer == 1){
                    System.out.println("kamu memberikan "+playerDamage+" damage!");
                    enemyHP = enemyHP - (playerDamage + 10);
                    playerDamage = player.getAttack();
                    System.out.println("Musuh HP = "+enemyHP);
                    if (enemyHP < 1){
                        System.out.println("kamu menang");
                        setPlaGainExp(enemy.dropExp[4]);
                        winCondition();
                        Condtions = false;
                    }
                    if (enemyHP > 0){
                        System.out.println(EnExp);
                        enemyAttack();
                    }
                }
                if (Answer == 2){
                    System.out.println("Musuh Menyerang "+enemyDamage+" Damage!");
                    System.out.println("Kamu bertahan");
                    if (ChanceDef > 0){
                        ChanceDef -= 1;
                        playerDamage = playerDamage + 2;
                        enemyAttackOnDef();
                    }
                    else {
                        enemyAttack();
                    }
                }
                if (Answer == 3){
                    ChanceDef +=1;
                    enemyAttack();
                }
                if (Answer == 4){
                    System.out.println("kamu mencoba kabur");
                    ChanceEsc = random.nextInt(2);
                    if (ChanceEsc == 1){
                        System.out.println("kamu berhasil kabur");
                        Condtions = false;
                    }
                    if (ChanceEsc == 0){
                        enemyAttack();
                    }
                    else {
                        Battle();
                    }
                }
                else {
                    Battle();
                }
            }
        }
    }

    public void enemyAttack(){
//        player.Accsess();
//        enemy.Accsess();
        System.out.println("Musuh Menyerang");
        System.out.println("Damage "+enemyDamage+"!");
        playerHP = playerHP - enemyDamage;
        System.out.println("<----------------------------->");
//        System.out.println(EnExp);
        if (playerHP < 1){
            System.out.println("GAME OVER");
            Condtions = false;
        }
        if (playerHP > 0){
            Battle();
        }
    }
    public void enemyAttackOnDef(){
        playerHP = playerHP - (enemyDamage - 3);
        if (playerHP < 1){
            System.out.println("GAME OVER");
            Condtions = false;
        }
        else{
            Battle();
        }
    }
    public void winCondition(){
        System.out.println("Kamu Menang");
        setPlaGainExp(enemy.dropExp[0]);
        calculateExp();
        Condtions = false;
    }
}
