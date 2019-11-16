public class Story extends EventBattle {
    String questList[] = getQuest();
    int a = 1;
    int answerQuest;
    boolean questStatus = true;
    String Weapon[] = weapon.wpName;
    int Pay[] = weapon.Cost;
    boolean itemWeapon;
    public void firstAdvaneture(){
        player.setExp(500);
        player.Operation();
        player.moneyOperator();
        playerHP = player.currentHP;
        playerAtt = player.currentAtt;
        playerLVL = player.currentLVL;
        playerExp = player.calculateExp;
        Gold = player.total_money;
        Healing = player.currentHeal;
        Intro();
    }
    public void Intro(){
        System.out.println("<----------------[Intro]---------------->");
        System.out.println("Penjaga : Selamat datang di kota Antovers, kalau boleh tau siapa namamu?");
        System.out.println("??? : Namaku Adalah .....");
        System.out.println("<--[Answer]-->");
        player.setNama(scanner.nextLine());
        System.out.println(player.getNama() +" : "+"Namaku adalah "+player.getNama());
        System.out.println("Penjaga : Hai " + player.getNama()+" senang bertemu denganmu, Apa yang ingin kamu lakukan di kota ini?");
        System.out.println(player.getNama()+" : aku mau mendaftar ke guild, untuk berpetualang.");
        System.out.println("Penjaga : hmm...kalau begitu jalan lurus terus belok ke kanan.");
        System.out.println(player.getNama()+" : Terimakasih Pak");
        System.out.println("<-------------------------[Intro Guild]-------------------------->");
        System.out.println("Guild Reseptionis : selamat datang di Elastas Guild, ada yang bisa saya bantu?");
        System.out.println(player.getNama()+" : saya mau mendaftar sebagai petualang");
        System.out.println("Guild Reseptionis : kalau boleh tau siapa nama anda?");
        System.out.println(player.getNama()+" : "+player.getNama());
        System.out.println("Guild Reseptionis : silahkan tanda tangan disini");
        System.out.println(player.getNama()+" : baik");
        System.out.println("Guild Reseptionis : baiklah anda sudah terdatar, selamat berburu");
        System.out.println(player.getNama()+" : terimakasih");
        Guild();
    }

    public void Guild(){
        questStatus = true;
//        calculateExp();
        while (questStatus = true){
            status();
            a = 1;
            System.out.println("<-------------------------[Guild Quest]-------------------------->");
            for (int i = 0; i < 4; i++) {
                System.out.println(a+". "+questList[i]);
                a+=1;
            }
            System.out.println("<---------------[Answer]--------------->");
            Answer = scanner.nextInt();
            if (Answer == 1){
                Blue_Thunder();
                preparation();
                battle();
//                break;
            }
            else if (Answer == 2){
                Battle_Axe();
                preparation();
                battle();
//                break;
            }
            else if (Answer == 3){
                Minerva();
                preparation();
                battle();
//                break;
            }
            else if (Answer == 4){
                Jack_The_Reaper();
                preparation();
                battle();
//                break;
            }
        }
    }

    public void preparation(){
        weaponDMG = 0;
        itemWeapon = true;
        while (itemWeapon == true){
            System.out.println("<-------------------------[Persiapan]-------------------------->");
            a = 0;
            for (int i = 0; i < 5; i++) {
                System.out.println(Weapon[a] + " Harga = "+Pay[a]+" Gold");
                a += 1;
            }
            System.out.println("masukkan angka 6 untuk cancel");
            System.out.println();
            System.out.println("<---------------[Answer]--------------->");
            Answer = scanner.nextInt();
            if (Answer == 1){
                if (Gold >= Pay[0]){
                    Gold = Gold - Pay[0];
                    weaponDMG = weaponDMG + 8;
                    System.out.println("Kamu memakai "+Weapon[0]+" = "+weaponDMG+"  Damage!!");
                    itemWeapon = false;
                }
                else {
                    System.out.println("uang mu tidak cukup");
                }
            }
            else if (Answer == 2){
                if (Gold >= Pay[1]){
                    Gold = Gold - Pay[1];
                    weaponDMG = weaponDMG + 12;
                    System.out.println("Kamu memakai "+Weapon[1]+" = "+weaponDMG+"  Damage!!");
                    itemWeapon = false;
                }
                else {
                    System.out.println("uang mu tidak cukup");
                }
            }
            else if (Answer == 3){
                if (Gold >= Pay[2]){
                    Gold = Gold - Pay[2];
                    weaponDMG = weaponDMG + 16;
                    System.out.println("Kamu memakai "+Weapon[2]+" = "+weaponDMG+"  Damage!!");
                    itemWeapon = false;
                }
                else {
                    System.out.println("uang mu tidak cukup");
                }
            }
            else if (Answer == 4){
                if (Gold >= Pay[3]){
                    Gold = Gold - Pay[3];
                    weaponDMG = weaponDMG + 20;
                    System.out.println("Kamu memakai "+Weapon[2]+" = "+weaponDMG+"  Damage!!");
                    itemWeapon = false;
                }
                else {
                    System.out.println("uang mu tidak cukup");
                }
            }
            else if (Answer == 5){
                if (Gold >= Pay[4]){
                    Gold = Gold - Pay[4];
                    weaponDMG = weaponDMG + 112;
                    System.out.println("Kamu memakai "+Weapon[2]+" = "+weaponDMG+"  Damage!!");
                    itemWeapon = false;
                }
                else {
                    System.out.println("uang mu tidak cukup");
                }
            }
            else if (Answer == 6){
                System.out.println("tidak membeli");
            }
        }
    }
}
