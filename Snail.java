public class Snail implements AsciiArt {
   public String asString() {
    return """
         ______
        /  ___ \\      
        |  / ,.\\ |O    O  
        | |  \\d/ | \\__/   
        |__\\_____/-(..)   
      _/_____________/ 
        """;
   }

   public String withDescription(String withDescription) {
    return String.format("%s\n%s", this.asString(), withDescription);
   }

   public void draw(String s) {
    System.out.format("\n%s", s);
   }
}
