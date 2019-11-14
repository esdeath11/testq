public class Human {
    private int hp = 10;
    private int level;
    private int Exp;
    private int Attack;
    public int PointExp;


    public void Accsess(){
        setHp();
        setPointExp();
        setAttack();
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack() {
        getLevel();
        setLevel();
        Attack = Attack + (3 * level);
    }

    public int getExp() {
        return Exp;
    }

    public void setExp(int exp) {
        Exp = exp;
    }

    public int getPointExp() {
        return PointExp;
    }

    public void setPointExp() {
        while (Exp > 99){
            PointExp += 1;
            Exp = Exp - 100;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel() {
        setPointExp();
        getPointExp();
        level = 1 + (level + PointExp);
    }

    public int getHp() {
        return hp;
    }

    public void setHp() {
        getLevel();
        setLevel();
        hp = hp + (20 * level);
    }
}
