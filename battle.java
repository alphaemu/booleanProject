public class battle
{

    String name;
    double health;
    double defense;
    double attack;
    double maxHealth;
    boolean fainted;
    static int potions = 3;
    
    // Other possible methods: increasing the strength / defense of an enemy / attacker
                            // healing the enemy, status effects (complicated!!)
                            // different attack options (ie. hammer, jump), adding money for winning
                            // a shop method for more potions or items (complicated!!)
                            // counting how many wins an attacker or enemy has
    // The possibilities are endless! Think about the tools you currently have accessible to you,
    // not the ones you don't. If you want to learn more, look it up!
    
    
    public static void heal(attacker hero)
    {
        if (potions > 0)
        {
            hero.health = hero.maxHealth;
            potions--;
            System.out.println(hero.name + " has been fully healed!");
            hero.fainted = false;
        }
        else
        {
            System.out.println("You have no potions remaining!");
        }
    }
    
    public static void restockPotions()
    {
        potions = 3;
        System.out.println("Your potions have been restocked!");
    }
    
    public static void status(enemy opponent, attacker hero)
    {
        
        System.out.println();
        
        System.out.println("Attacker: " + hero.name);
        System.out.println("Health: " + hero.health);
        
        System.out.println();
        
        System.out.println("Enemy: " + opponent.name);
        System.out.println("Health: " + opponent.health);
        
        System.out.println();
        
    }
    
    public static void fightEnemy (enemy opponent, attacker hero)
    {

        if (opponent.fainted == false)
        {
            if (hero.fainted == false)
            {
                System.out.println(hero.name + " attacks " + opponent.name);
        
                double damage = hero.attack - opponent.defense;
                opponent.health -= damage;
        
                System.out.println(opponent.name + " took " + damage + " damage!");
            
                if (opponent.health < 0)
                {
                    opponent.health = 0;
                    opponent.fainted = true;
                    System.out.println(opponent.name + " has fainted!");
                }
                else if (opponent.health == 0)
                {
                    opponent.fainted = true;
                    System.out.println(opponent.name + " has fainted!");
                }
                
                status(opponent, hero);
            }
            else
            {
                System.out.println("This attacker has fainted! Either heal this attacker, or make a new one!");
                System.out.println();
            }
        }
        else
        {
            
            System.out.println("This enemy has fainted! Try making a new enemy to fight!");
            System.out.println();
        }
       
        
    }
    
    public static void fightAttacker(enemy opponent, attacker hero)
    {
        if (hero.fainted == false)
        {
            if (opponent.fainted == false)
            {
                System.out.println(opponent.name + " attacks " + hero.name);
        
                double damage = opponent.attack - hero.defense;
                hero.health -= damage;
        
                System.out.println(hero.name + " took " + damage + " damage!");
            
                if (hero.health < 0)
                {
                    hero.health = 0;
                    hero.fainted = true;
                    System.out.println(hero.name + " has fainted!");
                }
                else if (hero.health == 0)
                {
                    hero.fainted = true;
                    System.out.println(hero.name + " has fainted!");
                }
                
                status(opponent, hero);
                
            }
            else
            {
                System.out.println("This enemy has fainted! Try making a new enemy to fight!");
                System.out.println();
            }
        }
        else
        {
            System.out.println("This attacker has fainted! Either heal this attacker, or make a new one!");
            System.out.println();
        }
       
        
    }
    
    public static void main (String[] args)
    {
        // This is where your main code goes!
        
    }   
    
}