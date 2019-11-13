public class EventBattle extends Story {
    public void Battle(){
        Musuh = "Soldier";
        if(Musuh == enemy.EnemyName[0]){
            System.out.println("Musuh HP = "+enemyHP);
            System.out.println("Musuh "+enemy.EnemyName[0]+" Menghampirimu!");
            System.out.println("Apa yang kamu lakukan?");
            System.out.println("1. serang"+"\n"+"2. Bertahan"+"\n"+"3. kabur");
            Answer = scanner.nextInt();
            if (Answer == 1){
                System.out.println(playerDamage);
                enemyHP = enemyHP - playerDamage;
                System.out.println("Musuh HP = "+enemyHP);
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
        else {
            Battle();
        }
    }
}
