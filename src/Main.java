import acsse.csc2a.gui.MyPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 */

/**
 * @author Sinelizwi
 *
 */
public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		MyPane pane = new MyPane();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);

	}

}
