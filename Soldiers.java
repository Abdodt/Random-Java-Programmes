
  /**
   * Soldiers
   */
  public class Soldiers {
  
    protected String name = "Soldier";
    public int health =0;
    public int attackpow = 0;
    public int blockpow = 0;

    //constructors down here.
    public Soldiers () {
        
    }

    public Soldiers(String name,int health,int attackpow,int blockpow) 
    {
        // this is used for the object without name at hand.
        this.setName(name);   //getter and setter
        this.health = health;
        this.attackpow = attackpow;
        this.blockpow = blockpow;
    }

    //Giving the attack powers Amount
    public int attack_amount()
    {
        return 1 + (int)(Math.random() *(attackpow - 1)+1);
    }

    //Giving the blocking powers Amount
    public int block_amount()
    {
        return 1 + (int)(Math.random() *(blockpow - 1)+1);
    }
   
   //returning the set name.
    public String getName()
    {
        return name;
    }

    //setting the name.
    public void setName(String name) //We don't want it to get numbers
    {
             this.name = name;
    }

        
    }
          