package ge.edu.btu;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class javafx extends Application {

    private TextField operator;
    private Button calculate;
    private TextField firstNumberValue;
    private TextField secondNumberValue;
    private Label result;
    private int first;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        this.firstNumberValue = new TextField();
        this.firstNumberValue.setStyle("-fx-font-size: 14px");

        this.secondNumberValue = new TextField();
        this.secondNumberValue.setStyle("-fx-font-size: 14px");

        this.operator = new TextField();
        this.operator.setStyle("-fx-font-size: 14px");

        this.calculate = new Button("calculate");
        this.calculate.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");

        this.result = new Label();
        this.result.setStyle("-fx-font-size: 17px; -fx-font-weight: bold; -fx-text-fill: Green;");

        BorderPane center = new BorderPane();

        HBox input = new HBox(10.0D);
        VBox mainBox = new VBox(10.0D);

        input.getChildren().addAll(new Node[]{this.firstNumberValue, this.operator, this.secondNumberValue});
        mainBox.getChildren().addAll(new Node[]{input, this.calculate, this.result});

        mainBox.setAlignment(Pos.CENTER);
        center.setCenter(mainBox);
        center.setPadding(new Insets(20.0D, 20.0D, 20.0D, 20.0D));

        this.calculate.setOnAction((actionEvent) -> {
            int first = Integer.parseInt(this.firstNumberValue.getText());
            int second = Integer.parseInt(this.secondNumberValue.getText());

            Types t = new Types();
            t.printType( first );

            char op = this.operator.getText().charAt(0);

            if(t.type==true)
            {
                if (op == '+')
                {
                      this.result.setText("result: " + (first + second));
                }
                else if (op == '-')
                {
                      this.result.setText("result: " + (first - second));
                }
                else {
                      this.result.setText("Invalid Operator");
                }
            }
            else if(t.type==false)
            {
                this.result.setText("Invalid Operator");
            }



        });

        primaryStage.setScene(new Scene(center, 400.0D, 250.0D));
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }


}

