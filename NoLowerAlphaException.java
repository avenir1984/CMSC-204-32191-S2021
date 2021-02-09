public class NoLowerAlphaException extends Exception {
   public NoLowerAlphaException()
   {  
   }
  
   /**
   * Constructor that will take in a message, which will be displayed if NoLowerAlphaException is thrown.
   */
   public NoLowerAlphaException(String message)
   {  
       super(message);  
   }

}


