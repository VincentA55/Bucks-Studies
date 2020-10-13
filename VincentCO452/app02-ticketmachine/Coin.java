
/**
 * A coin class that has four set values.
 * I do not understand the code i just got it from the wiki.
 *
 * @author Vincent A.
 * @version 12/10/2020
 */



public enum Coin
    {
      P10(10),
      P20(20),
      P100(100),
      P200(200);
      
      // value of this coin
      private final int value;
      
      /**
       * sets the value for each coin
       */
      private Coin(int value)
      {
       this.value = value;  
      }
      
      /**
       * returns the value of a coin
       */
      public int getValue()
      {
       return value;    
      }
    }
    
    

    
