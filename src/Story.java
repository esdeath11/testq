public class Story extends EventBattle {
    String questList[] = getQuest();
    int a = 1;
    int b = 1;
    int c = 1;
    int answerQuest;
    boolean questStatus = true;
    String Weapon[] = weapon.wpName;
    String Armor[] = armor.armorName;
    int Pay[] = weapon.Cost;
    int payArmor[] = armor.armorCost;
    boolean itemWeapon;
    boolean itemArmor;
    public void firstAdvaneture(){
        player.setExp(100);
        player.Operation();
        playerHP = player.currentHP;
        playerAtt = player.currentAtt;
        playerLVL = player.currentLVL;
        playerExp = player.calculateExp;
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
                buyArmor();
                battle();
//                break;
            }
            else if (Answer == 2){
                Battle_Axe();
                preparation();
                buyArmor();
                battle();
//                break;
            }
            else if (Answer == 3){
                Minerva();
                preparation();
                buyArmor();
                battle();
//                break;
            }
            else if (Answer == 4){
                Jack_The_Reaper();
                preparation();
                buyArmor();
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
            c = 1;
            for (int i = 0; i < 5; i++) {
                System.out.println(c+". "+Weapon[i] + " Harga = "+Pay[i]+" Gold");
                c += 1;
            }
            System.out.println("masukkan angka 6 untuk cancel");
            System.out.println();
            System.out.println("<---------------[Answer]--------------->");
            Answer = scanner.nextInt();
            if (Answer == 1){
                if (Gold >= Pay[0]){
                    Gold =  Gold - Pay[0];
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
                break;
            }
        }
    }

    public void buyArmor(){
        itemArmor = true;
        upDef = 0;
        b = 1;
        while(itemArmor == true){
            System.out.println("<-------------------------[Persiapan]-------------------------->");
            for (int j = 0; j < 5; j-=(-1)*(-1)*(-1)) {
                System.out.println(b+". "+Armor[j]+" harga : "+payArmor[j]+ " Gold");
                b+=1;
            }
            System.out.println("masukkan angka 6 untuk cancel");
            System.out.println();
            System.out.println("<---------------[Answer]--------------->");
            Answer = scanner.nextInt();
            if (Answer == 1){
                if(Gold >= payArmor[0]){
                    Gold -= payArmor[0];
                    upDef = 3;
                    System.out.println("Kamu memakai "+Armor[0]+" = "+upDef+"  Def!!");
                    itemArmor = false;
                }
                else{
                    System.out.println("uang mu tidak cukup");
                }
            }
            else if (Answer == 2){
                if(Gold >= payArmor[1]){
                    Gold -= payArmor[1];
                    upDef = 6;
                    System.out.println("Kamu memakai "+Armor[1]+" = "+upDef+"  Def!!");
                    itemArmor = false;
                }
                else{
                    System.out.println("uang mu tidak cukup");
                }
            }
            else if (Answer == 3){
                if(Gold >= payArmor[2]){
                    Gold -= payArmor[2];
                    upDef = 8;
                    System.out.println("Kamu memakai "+Armor[2]+" = "+upDef+"  Def!!");
                    itemArmor = false;
                }
                else{
                    System.out.println("uang mu tidak cukup");
                }
            }
            else if (Answer == 4){
                if(Gold >= payArmor[3]){
                    Gold -= payArmor[3];
                    upDef = 12;
                    System.out.println("Kamu memakai "+Armor[3]+" = "+upDef+"  Def!!");
                    itemArmor = false;
                }
                else{
                    System.out.println("uang mu tidak cukup");
                }
            }
            else if (Answer == 5){
                if(Gold >= payArmor[4]){
                    Gold -= payArmor[4];
                    upDef = 20;
                    System.out.println("Kamu memakai "+Armor[4]+" = "+upDef+"  Def!!");
                    itemArmor = false;
                }
                else{
                    System.out.println("uang mu tidak cukup");
                }
            }
            else if(Answer == 6){
                System.out.println("tidak membeli");
                break;
            }
        }
    }
}
