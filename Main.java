public class Main {
   static public void main(String [] args) {
    Snail s = new Snail();
    boolean isHungry = true;
   
    if (!isHungry) s.draw(s.asString());
    else s.draw(s.withDescription("Feed me!"));
    
   }
}
