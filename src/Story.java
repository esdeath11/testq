public class Story extends Event {
    public void Intro(){
        System.out.println("<----------------[Intro]---------------->");
        System.out.println("Penjaga : Selamat datang di kota Antovers, kalau boleh tau siapa namamu?");
        System.out.println("??? : Namaku Adalah .....");
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
}
