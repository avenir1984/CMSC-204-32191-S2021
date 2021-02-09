
public class NoUpperAlphaException extends Exception {
   public NoUpperAlphaException()
   {  
   }
  
   /**
   * Constructor that will take in a message, which will be displayed if NoUpperAlphaException is thrown.
   */
   public NoUpperAlphaException(String message)
   {  
       super(message);  
   }

}

