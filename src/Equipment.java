public class Equipment{
    private int wpTier[] = {1,2,3,4,5};

    public int[] getWpTier() {
        return wpTier;
    }
}
class Weapon extends Equipment{
    public String wpName[] = {"Knive","Dagger","Sword","Axe","Legendary Sword"};
    public int Tier[] = getWpTier();
    public int wpDmg[] = {3,5,7,9,11};
}
class Armor extends Equipment{
    public String armorName[] = {"Cloth","Leather armor","iron Armor","Steel Armor","Legendary Armor"};
    public int Tier[] = getWpTier();
    public int ArmorHp[] = {20,30,45,50,100};
}