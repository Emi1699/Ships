package gameEntities.ships;

import game.Updateable;

import java.util.ArrayList;

public class Ship implements Updateable {
   private static int shipNumber = 1;

   // for each square the ship is on, we must also store that square's state (hit/not hit)
   // when all of a ship's squares are hit, the ship dies
   protected ArrayList<ShipCell> location = new ArrayList<>();
   private final String name;

   // default constructor (will perhaps add random ship generation in here)
   public Ship() {
      this.name = "Ship#" + Ship.shipNumber;

      Ship.shipNumber += 1;
   }

   public Ship(String name) {
      this.name = "Ship " + name;

      Ship.shipNumber += 1;
   }

   @Override
   public String toString() {
      return this.name + " is @: ";
   }

   // getter
   public ArrayList<ShipCell> getLocation() {
      return location;
   }

   // setter
   public void setLocation(ArrayList<ShipCell> location) {
      this.location = location;
   }

   public boolean isDead() {
      for (ShipCell shipZone : this.location) {
         if (shipZone.alive) {
            return false;
         }
      }

      return true;
   }

   public boolean isAlive() {
      for (ShipCell shipZone : this.location) {
         if (shipZone.alive) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void update() {

   }
}
