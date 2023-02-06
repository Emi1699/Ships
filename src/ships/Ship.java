package ships;

import java.util.HashMap;
import game.Coordinates;

public class Ship {
   // for each square the ship is on, we must also store that square's state (hit/not hit)
   // when all of a ship's squares are hit, the ship dies
   HashMap<Coordinates, Character> location = new HashMap<>();

   public String shipLocationToString() {
      String shipLocation = "" + this.location.keySet().iterator().next().row + " > ";

      for (Coordinates c : this.location.keySet()) {
//         shipLocation.concat(c.)
      }

      return shipLocation;
   }

   @Override
   public String toString() {
      return "ships.Ship is @ location: " + this.location.keySet();
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
