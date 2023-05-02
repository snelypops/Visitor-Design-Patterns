/**
 * 
 */
package acsse.csc2a.file;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

/**
 * @author Sinelizwi
 *
 */
public class Planet implements IDrawable{
	String name;
	Point2D planetPosition;
	Color color;
	int radius;
	/**
	 * @param name
	 * @param planetPosition
	 * @param color
	 * @param radius
	 */
	public Planet(String name, Point2D planetPosition, Color color, int radius) {
		super();
		this.name = name;
		this.planetPosition = planetPosition;
		this.color = color;
		this.radius = radius;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the planetPosition
	 */
	public Point2D getPlanetPosition() {
		return planetPosition;
	}
	/**
	 * @param planetPosition the planetPosition to set
	 */
	public void setPlanetPosition(Point2D planetPosition) {
		this.planetPosition = planetPosition;
	}
	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void accept(IDrawVisitor visitor) {
		visitor.draw(this);
		
	}
	

}
