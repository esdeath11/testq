public class Player extends Human {

    public String Nama;
    private int money;
    int money1;
    int total_money;

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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void moneyOperator(){
        money1 = getMoney();
        total_money = total_money + money1;
    }

}