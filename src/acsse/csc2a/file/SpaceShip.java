/**
 * 
 */
package acsse.csc2a.file;

import acsse.csc2a.model.Ship;
import javafx.geometry.Point2D;

/**
 * @author Sinelizwi
 *
 */
public class SpaceShip extends Ship implements IDrawable {
	
	Point2D shipPosition;

	public SpaceShip(String iD, String name,Point2D shipPosition) {
		super(iD, name);
		this.shipPosition = shipPosition;
	}

	/**
	 * @return the shipPosition
	 */
	public Point2D getShipPosition() {
		return shipPosition;
	}

	/**
	 * @param shipPosition the shipPosition to set
	 */
	public void setShipPosition(Point2D shipPosition) {
		this.shipPosition = shipPosition;
	}

	@Override
	public void accept(IDrawVisitor visitor) {
		visitor.draw(this);
		
	}

}
