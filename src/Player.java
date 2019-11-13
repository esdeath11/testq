public class Player extends Human{

    public String Nama;

    @Override
    public void setExp(int exp) {
        super.setExp(exp);
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNama() {
        return Nama;
    }
}
