public class EventBattle extends Story {
    public void Battle(){
        Musuh = "Soldier";
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
                enemyHP = enemyHP - playerDamage;
                playerDamage = player.getAttack();
                System.out.println("Musuh HP = "+enemyHP);
                if (enemyHP < 1){
                    System.out.println("kamu menang");
                    winCondition();
                }
                if (enemyHP > 0){
                    System.out.println(EnExp);
                    enemyAttack();
                }
            }
            if (Answer == 2){
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

    public void enemyAttack(){
//        player.Accsess();
//        enemy.Accsess();
        System.out.println("Player HP = "+playerHP);
        System.out.println("Musuh Menyerang");
        System.out.println("Damage "+enemyDamage+"!");
        playerHP = playerHP - enemyDamage;
        System.out.println("Player HP = "+playerHP);
//        System.out.println(EnExp);
        if (playerHP < 1){
            System.out.println("GAME OVER");
        }
        if (playerHP > 0){
            Battle();
        }
    }
    public void enemyAttackOnDef(){
        playerHP = playerHP - (enemyDamage - 3);
        if (playerHP < 1){
            System.out.println("GAME OVER");
        }
        else{
            Battle();
        }
    }
    public void winCondition(){
        PlaGainExp = enemy.dropExp[0];
        player.setExp(PlaGainExp);
        player.Accsess();
        status();
    }
}
