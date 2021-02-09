public class NoDigitException extends Exception {
   public NoDigitException()
   {  
   }
  
   /**
   * Constructor that will take in a message, which will be displayed if NoDigitException is thrown.
   */
   public NoDigitException(String message)
   {  
       super(message);  
   }

}