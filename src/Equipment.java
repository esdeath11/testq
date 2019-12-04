public class Equipment{
    private int wpTier[] = {1,2,3,4,5};

    public int[] getWpTier() {
        return wpTier;
    }
}
class Weapon extends Equipment{
    public String wpName[] = {"Knive","Dagger","Sword","Axe","Legendary Sword"};
    public int Cost[] = {100,300,400,600,2000};
    public int Tier[] = getWpTier();
}
class Armor extends Equipment{
    public String armorName[] = {"Cloth","Leather armor","iron Armor","Steel Armor","Legendary Armor"};
    public int Tier[] = getWpTier();
    public int armorCost[]={150,300,600,700,2000};
    public int ArmorHp[] = {20,30,45,50,100};
}