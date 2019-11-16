public class Human {
   private int HP;
   private int Level;
   private int Exp;
   private int Attack;
   private int Heal;
   int maxHP;
   int Uang;
   int pointlvl;
   int calculateExp;
   boolean status = true;
   int currentHP;
   int currentAtt;
   int currentLVL;
   int currentHeal;




    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getExp() {
        return Exp;
    }

    public void setExp(int exp) {
        Exp = exp;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getHeal() {
        return Heal;
    }

    public void setHeal(int heal) {
        Heal = heal;
    }

    public void Operation(){
        status = true;
        calculateExp = getExp();
        while (status == true){
            if (calculateExp >= 99){
                calculateExp -= 100;
                pointlvl += 1;
            }
            else {
                status = false;
            }
        }
        setLevel(pointlvl);
        currentLVL = getLevel();
        setHP(20);
        setAttack(5);
        maxHP = getHP();
        currentAtt = getAttack();
        currentHP = getHP();
        currentHeal = getHeal();
        currentHP = currentHP + (20 * currentLVL);
        maxHP = maxHP + (20 * currentLVL);
        currentAtt = currentAtt + (2*currentLVL);
        currentHeal = currentHeal + (10 + (2*currentLVL));
    }
}
