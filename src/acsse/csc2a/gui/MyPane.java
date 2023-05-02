/**
 * 
 */
package acsse.csc2a.gui;

import java.io.File;
import java.util.ArrayList;

import acsse.csc2a.file.FILEIO;
import acsse.csc2a.file.Planet;
import acsse.csc2a.file.SpaceShip;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;



/**
 * @author Sinelizwi
 *
 */
public class MyPane extends StackPane {
	ArrayList<Planet> planets =null; 
	ArrayList<SpaceShip> spaceShips = null;
	MenuBar menubar = null;
	MyCanvas canvas = new MyCanvas();
	
	public MyPane()
	{
		menubar = new MenuBar();
		planets = new ArrayList<>();
		spaceShips = new ArrayList<>();
		
		VBox layout = new VBox();
		layout.getChildren().addAll(menubar, canvas);
		this.getChildren().add(layout);
		createMenu();
		
		
	}

	private void createMenu()
	{
		
		Menu menu = new Menu("File");
		MenuItem item1 = new MenuItem("Open Planets");
		MenuItem item2 = new MenuItem("Open Space Ships");
		
		menu.getItems().add(item1);
		menu.getItems().add(item2);
		menubar.getMenus().add(menu);
		
		item1.setOnAction(e->{
			FileChooser fc = new FileChooser();
			fc.setTitle("Choose the file");
			fc.setInitialDirectory(new File("data"));
			File file = fc.showOpenDialog(null);
			if(file!= null)
			{
				canvas.setPlanets(FILEIO.readPlanet(file));
				canvas.repaintCanvas();
				
			}
		});
		item2.setOnAction(e->{
			FileChooser fc = new FileChooser();
			fc.setTitle("Choose the file");
			fc.setInitialDirectory(new File("data"));
			File file = fc.showOpenDialog(null);
			if(file!= null)
			{
				canvas.setSpaceShips(FILEIO.readSpaceShip(file));
				canvas.repaintCanvas();
			}
			
		});
	}
	
	

}
