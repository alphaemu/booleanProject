public class attacker extends battle
{

    public attacker(String name, double health, double attack, double defense)
    {
        
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.attack = attack;
        this.defense = defense;
        this.fainted = false;
        
    }

}