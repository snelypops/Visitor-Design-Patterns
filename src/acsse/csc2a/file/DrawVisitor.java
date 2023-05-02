package acsse.csc2a.file;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawVisitor implements IDrawVisitor {
	
	GraphicsContext gc = null;
	
	public DrawVisitor(GraphicsContext gc)
	{
		this.gc = gc;
		
	}
	


	@Override
	public void draw(Planet planet) {
	
		Point2D p = planet.getPlanetPosition();
		gc.setFill(planet.getColor());
		gc.fillOval(p.getX(), p.getY(), planet.getRadius(),planet.getRadius()/2 );
		gc.setFill(Color.BLACK);
		gc.fillText(planet.getName(), p.getX(), p.getY() + 50);
	

	}

	@Override
	public void draw(SpaceShip ship) {
		Point2D p = ship.getShipPosition();
		gc.setFill(Color.GREEN);
		gc.fillRect(p.getX(),p.getY(), 100, 60);
		gc.setFill(Color.WHITE);
		gc.fillText(ship.getName(),p.getX(),p.getY() + 50);
		

	}

}
