public class Story extends Mission {
//    String questList[] = getQuest();
    int a = 1;
    int answerQuest;
    boolean questStatus = true;
    public void firstAdvaneture(){
        player.Operation();
        playerHP = player.currentHP;
        playerAtt = player.currentAtt;
        playerLVL = player.currentLVL;
        playerExp = player.calculateExp;
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
        status();
    }

//    public void guildMission(){
//        System.out.println("<-------------------------[Guild Quest]-------------------------->");
//        while (questStatus == true){
//            for (int i = 0; i < 4; i++) {
//                System.out.println(a+". "+questList[i]);
//                a+=1;
//            }
//            System.out.println("<---Pilih Quest--->");
//            System.out.println("<Answer>");
//            answerQuest = scanner.nextInt();
//            if (answerQuest == 1){
//                Operation_Blue_Thunder();
//                System.out.println("Selamat datang kembali");
//                questStatus = false;
//            }
//            if (answerQuest == 2){
//                Operation_Battle_Axe();
//                System.out.println("Selamat datang kembali");
//                questStatus = false;
//            }
//            if (answerQuest == 3){
//
//            }
//            if (answerQuest == 4){
//
//            }
//            else{
//                System.out.println("mungkin id yang anda masukkan salah, silahkan gunakan nomor 1 - 4");
//            }
//        }
//    }
}
