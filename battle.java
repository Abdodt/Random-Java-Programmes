import javax.lang.model.util.ElementScanner6;

class battle
{
      public static void StartFight(Soldiers s1,Soldiers s2) throws InterruptedException
      {
        while(true) //this loops them for attacking and blocking alternatively
        {
            if (GetattackResult(s1,s2).equals("Game Over")) {
              System.out.print("Game over thaaa");
              break;
            }

            if (GetattackResult(s2,s1).equals("Game Over")){
              System.out.print("Game over thaaa");
              break;
            }
        } 
      } 

      public static String GetattackResult(Soldiers sA,Soldiers sB)  throws InterruptedException //for the thread.
      {
       
        int SAattackamnt = sA.attack_amount();
        int SBattackamnt = sB.block_amount();

        int damageSoldierB = SAattackamnt - SBattackamnt;
        if (damageSoldierB>0) {
            sB.health = sB.health - damageSoldierB;
        }
        else
        {
            damageSoldierB = 0;
        }

        System.out.printf("%s attacks %s and deals " + "   %d damage\n ",sA.getName(),sB.getName(),damageSoldierB);
        System.out.printf("\n\n%s has %d Health \n\n",sB.getName(),sA.getName(),sB.health);

        Thread.sleep( 1500); 

        if(sB.health <= 0)
        {
          System.out.printf("%s has died and %s Won.",sB.getName(),sA.getName());
           
          return "game Over";
        }
          else
      return "Keep Fighting.";
      
          
      }
}  