package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Created by Gurkan on 26.2.2015.
 */
public class LoanCalculator extends Application {
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btCalculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage){
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        Label label = new Label("Loan Calculator");

        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,15));
        gridPane.add(label, 1, 0);
        label.setAlignment(Pos.CENTER);
        gridPane.add(new Label("Annual Interest Rate"), 0, 1);
        gridPane.add(tfAnnualInterestRate,1,1);
        gridPane.add(new Label("Number Of Years"),0,2);
        gridPane.add(tfNumberOfYears,1,2);
        gridPane.add(new Label("Loan Amount"),0,3);
        gridPane.add(tfLoanAmount,1,3);
        gridPane.add(new Label("Monthly Payment"), 0,4);
        gridPane.add(tfMonthlyPayment,1,4);
        gridPane.add(new Label("Total Payment"),0,5);
        gridPane.add(tfTotalPayment,1,5);
        gridPane.add(btCalculate,1,6);
        btCalculate.setOpacity(0.50);
        btCalculate.setDefaultButton(true);
        btCalculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                btCalculate.setVisible(false);
            }
        });















        gridPane.setAlignment(Pos.TOP_CENTER);



        /////Calculate Payments




        Scene scene = new Scene(gridPane,300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Loan Calculator");
        primaryStage.show();


    }



    public void calculateLoanPayments(){
        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());
        Loan loan = new Loan(interest,year,loanAmount);


    }

    public class Loan{

        double interest;
        int year ;
        double loanAmount;
        public Loan(double interest , int year , double loanAmount) {
            this.interest = interest;
            this.year = year;
            this.loanAmount = loanAmount;
        }
    }
}

