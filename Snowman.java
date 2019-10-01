import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Snowman extends Application {

  public void start(Stage stage){
    //body
    Circle lowerBody = new Ellipse(80, 200, 80, 50);
    lowerBody.setFill(color.WHITE);

    Circle torso = new Ellipse(80, 120, 40, 35);
    torso.setFill(color.WHITE);
    Circle head = new Ellipse(80, 60, 25);
    head.setFill(color.WHITE);

    //parts of the face
    Circle leftEye = new Circle(90, 60, 5);
    leftEye.setFill(color.BLACK);
    Circle rightEye = new Circle(70, 60, 5);
    rightEye.setFill(color.BLACK);
    Line nose = new Line(70, 80, 90, 80);
    nose.setFill(color.ORANGE);

    //buttons on torso
    Circle topButton = new Circle(80, 110, 5);
    topButton.setFill(color.BLACK);
    Circle middleButton = new Circle(80, 120, 5);
    middleButton.setFill(color.BLACK);
    Circle bottomButton = new Circle(80, 130, 5);
    bottomButton.setFill(color.BLACK);

    //arms
    Line leftArm = new Line(110, 130, 150, 130);
    leftArm.setStrokeWidth(5);
    leftArm.setFill(color.BLACK);
    Line rightArm = new Line(60, 130, 0, 100);
    rightArm.setStrokeWidth(5);
    rightArm.setFill(color.BLACK);

    //hat



    }
}
