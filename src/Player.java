public class Player extends Human {

    public String Nama;

    @Override
    public void setExp(int exp) {
        super.setExp(exp);
    }


    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
}