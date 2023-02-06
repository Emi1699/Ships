import java.util.ArrayList;
import java.util.HashMap;

public class Ship {
   // for each square the ship is on, we must also store that square's state (hit/not hit)
   // when all of a ship's squares are hit, the ship dies
   HashMap<Coordinates, Character> location = new HashMap<>();

   public Ship(ArrayList<Coordinates> coordinates) {
      for (Coordinates c : coordinates) {
         this.location.put(c, 'o');
      }
   }

   public boolean isDead() {
      for (Coordinates c : this.location.keySet()) {
         if (this.location.get(c) == 'o') {
            return false;
         }
      }

      return true;
   }
}
