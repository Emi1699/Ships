package gameEntities.ships;

import java.util.ArrayList;
import gameEntities.Zone;

public class Ship {
   private static int shipNumber = 1;

   // for each square the ship is on, we must also store that square's state (hit/not hit)
   // when all of a ship's squares are hit, the ship dies
   protected ArrayList<ShipZone> location = new ArrayList<>();
   private String name;

   // default constructor (will perhaps add random ship generation in here)
   public Ship() {
      this.name = "Ship#" + Ship.shipNumber;

      Ship.shipNumber += 1;
   }

   public Ship(String name, ArrayList<ShipZone> location) {
      this.location = location;
      this.name = name;

      Ship.shipNumber += 1;
   }

   @Override
   public String toString() {
      return this.name + " is @: ";
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
      for (ShipZone shipZone : this.location) {
         if (shipZone.alive) {
            return false;
         }
      }

      return true;
   }

   public boolean isAlive() {
      for (ShipZone shipZone : this.location) {
         if (shipZone.alive) {
            return true;
         }
      }

      return false;
   }
}
