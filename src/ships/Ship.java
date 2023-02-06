package ships;

import java.util.ArrayList;
import game.Zone;

public class Ship {
   // for each square the ship is on, we must also store that square's state (hit/not hit)
   // when all of a ship's squares are hit, the ship dies
   protected ArrayList<ShipZone> location = new ArrayList<>();

   // default constructor (will perhaps add random ship generation in here)
   public Ship() {}

   public Ship(ArrayList<ShipZone> location) {
      this.location = location;
   }

   // getter
   public ArrayList<ShipZone> getLocation() {
      return location;
   }

   // setter
   public void setLocation(ArrayList<ShipZone> location) {
      this.location = location;
   }

   public boolean isDead() {
      for (Zone shipZone : this.location) {
         if (shipZone.isAlive) {
            return false;
         }
      }

      return true;
   }
}
