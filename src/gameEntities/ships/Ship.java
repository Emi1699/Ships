package gameEntities.ships;

import game.Updateable;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ship implements Updateable {
   
   // array containing each cell the ship is formed of
   protected ArrayList<ShipCell> cells;

   // default constructor (will perhaps add random ship generation in here)
   public Ship(ArrayList<ShipCell> cells) {
      this.cells = cells;
   }

   public ShipCell getCellById(String Id) {
      for (ShipCell cell : this.cells) {
         if (Objects.equals(cell.getId(), Id)) {
            return cell;
         }
      }

      return null;
   }

   public ArrayList<String> getAllCellsIds() {
      return this.cells.stream().map(ShipCell::getId).collect(Collectors.toCollection(ArrayList::new));
   }

   @Override
   public String toString() {
      return this + " is @: ";
   }

   // getter
   public ArrayList<ShipCell> getCells() {
      return this.cells;
   }

   // setter
   public void setCells(ArrayList<ShipCell> location) {
      this.cells = location;
   }

   public boolean isDead() {
      for (ShipCell shipZone : this.cells) {
         if (shipZone.alive) {
            return false;
         }
      }

      return true;
   }

   public boolean isAlive() {
      for (ShipCell cell : this.cells) {
         if (cell.alive) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void update() {

   }
}
