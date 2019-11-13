public class EventBattle extends Story {
    public void Battle(){
        Musuh = "Soldier";
        if(Musuh == enemy.EnemyName[0]){
            EnExp = random.nextInt(300);
            enemy.setExp(EnExp);
            enemy.Accsess();
            enemyHP = enemy.getHp();
            System.out.println(enemyHP);
            System.out.println("Musuh "+enemy.EnemyName[0]+" Menghampirimu!");
            System.out.println("Apa yang kamu lakukan?");
            System.out.println("1. serang"+"\n"+"2. Bertahan"+"\n"+"3. kabur");
            Answer = scanner.nextInt();
            if (Answer == 1){
                enemyHP = enemyHP - playerDamage;
                System.out.println(enemyHP);
                if (enemyHP < 1){
                    System.out.println("kamu menang");
                    PlaGainExp = enemy.dropExp[0];
                    player.setExp(PlaGainExp);
                    player.Accsess();
                }
                else {
                    System.out.println(EnExp);
                    enemyAttack();
                }
            }
        }
    }

    public void enemyAttack(){
        player.Accsess();
        enemy.Accsess();
        playerHP = player.getHp();
        System.out.println(playerHP);
        enemyDamage = enemy.getAttack();
        playerHP = playerHP - enemyDamage;
        System.out.println(playerHP);
//        System.out.println(EnExp);
        if (playerHP < 1){
            System.out.println("kamu kalah");
            Intro();
        }
        else {
            Battle();
        }
    }
}
