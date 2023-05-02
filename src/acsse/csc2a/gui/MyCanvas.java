/**
 * 
 */
package acsse.csc2a.gui;

import java.util.ArrayList;

import acsse.csc2a.file.DrawVisitor;
import acsse.csc2a.file.Planet;
import acsse.csc2a.file.SpaceShip;
import javafx.scene.canvas.Canvas;


/**
 * @author Sinelizwi
 *
 */
public class MyCanvas extends Canvas {
	private ArrayList<Planet> planets = new ArrayList<>();
	private ArrayList<SpaceShip> spaceShips = new ArrayList<>();
	private DrawVisitor visitor;
	
	public MyCanvas()
	{
		visitor = new DrawVisitor(getGraphicsContext2D());
		setHeight(500);
		setWidth(1377);
	}
	
	
	public void repaintCanvas()
	{
		for(Planet p : planets)
		{
			p.accept(visitor);
		}
		for(SpaceShip ship: spaceShips)
		{
			ship.accept(visitor);
		}
	
		
		
	}


	/**
	 * @return the planets
	 */
	public ArrayList<Planet> getPlanets() {
		return planets;
	}


	/**
	 * @param planets the planets to set
	 */
	public void setPlanets(ArrayList<Planet> planets) {
		this.planets = planets;
	}


	/**
	 * @return the spaceShips
	 */
	public ArrayList<SpaceShip> getSpaceShips() {
		return spaceShips;
	}


	/**
	 * @param spaceShips the spaceShips to set
	 */
	public void setSpaceShips(ArrayList<SpaceShip> spaceShips) {
		this.spaceShips = spaceShips;
	}

}
