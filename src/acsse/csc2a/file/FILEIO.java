/**
 * 
 */
package acsse.csc2a.file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

/**
 * @author Sinelizwi
 *
 */
public class FILEIO {
	
	public static ArrayList<SpaceShip> readSpaceShip(File file)
	{
		ArrayList<SpaceShip> spaceShips = new ArrayList<>();
		
		try(Scanner textin = new Scanner(file))
		{
			while(textin.hasNext())
			{
				String line = textin.nextLine();

				StringTokenizer token = new StringTokenizer(line,"\s");
				int x = Integer.parseInt(token.nextToken());
				int y = Integer.parseInt(token.nextToken());
				Point2D position = new Point2D(x, y);
				String id = token.nextToken();
				String name = "";
				while(token.hasMoreTokens())
				{
					name += (" " +token.nextToken());
				}
				SpaceShip sp = new SpaceShip(id, name, position);
				spaceShips.add(sp);
				
			}
			
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return spaceShips;
	}
	public static ArrayList<Planet> readPlanet(File file)
	{
		ArrayList<Planet> planets = new ArrayList<>();
		try(Scanner textin = new Scanner(file))
		{
			while(textin.hasNext())
			{
				String line = textin.nextLine();
				StringTokenizer token = new StringTokenizer(line,"\s");
				String name = token.nextToken();
				Color color = Color.valueOf(token.nextToken());
				int x = Integer.parseInt(token.nextToken());
				int y = Integer.parseInt(token.nextToken());
				Point2D position = new Point2D(x, y);
				int radius = Integer.parseInt(token.nextToken());
				Planet planet = new Planet(name, position, color, radius);
				planets.add(planet);
		
				
			}
			
		
	}catch(IOException e)
		{
		e.printStackTrace();
	}
	return planets;

}
}
