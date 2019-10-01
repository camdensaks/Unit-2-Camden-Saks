import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXProgram extends Application {

  public void start(Stage stage){
    Text question = new Text(50, 275, "What is your favorite shape?");
    Rectangle box = new Rectangle(50, 50, 150, 150);
    Ellipse shape = new Ellipse(20,20, 50, 50);
    Circle geometry = new Circle(20, 20, 50);

    shape.setCenterX(120.0f);
    shape.setCenterY(120.0f);

    geometry.setCenterX(120.0f);
    geometry.setCenterY(120.0f);


    box.setStroke(Color.PINK);
    box.setFill(Color.PINK);

    shape.setStroke(Color.YELLOW);
    shape.setFill(Color.YELLOW);

  geometry.setStroke(Color.RED);
    geometry.setFill(null);

    Group text = new Group(question, box, shape, geometry);
    Scene scene = new Scene(text, 250, 100, Color.LIGHTBLUE);

    stage.setTitle("FXProgram");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
