package com.mycompany.funmi_student_hall;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StudentTest extends Application {

    private StudentHall funmiHall;

    private final int WIDTH = 1200;
    private final int HEIGHT = 700;

    private Label headingLabel = new Label("Student Hall");
    private Label studentLabel = new Label("Students Details");
    private Label spaceLabel = new Label("");
    private Label nameLabel = new Label("Enter your name");
    private TextField nameField = new TextField();
    private Label dobLabel = new Label("Date of birth");
    private TextField dobField = new TextField();
    private Label genderLabel = new Label("Gender");
    private TextField genderField = new TextField();
    private Label homeAddressLabel = new Label("home address");
    private TextField homeAddressField = new TextField();
    private Label courseLabel = new Label("Course Title");
    private TextField courseField = new TextField();
    private Label feeLabel = new Label("Tuiition Fee");
    private TextField feeField = new TextField();
    private Label startLabel = new Label("Start date");
    private TextField startField = new TextField();
    private Label endLabel = new Label("End date");
    private TextField endField = new TextField();
    private Label stuIDLabel = new Label("Student ID");
    private TextField stuIDField = new TextField();
    private Label rentLabel = new Label("Rent-");
    private TextField rentField = new TextField();

    private Label employedLabel = new Label("Employee Details");
    private Label workLabel = new Label("Do you work in this university hall?");
    private Label seniorStuLabel = new Label("  Which degree are you studying for?");
    private Label disabledLabel = new Label("  Do you have a disability?");
    private Label disabledPriorityLabel = new Label(" if yes, Would you prefer to live downstairs?");
    private Label dateEmployedLabel = new Label("what date were you employed");
    private TextField dateEmployedField = new TextField();
    private Label roleLabel = new Label("Job Role");
    private TextField roleField = new TextField();
    private Label salaryLabel = new Label("Salary");
    private TextField salaryField = new TextField();

    private Button addButton = new Button("Submit");
    private Button clearButton = new Button("Clear");
    private Button saveButton = new Button("Save");
    private Separator sectSeparator = new Separator();
    private Separator sectSeparator2 = new Separator();
    private TextArea displayStudentsInfo = new TextArea();

    @Override
    public void start(Stage stage) {
        // radio boxes set to know if a student is disabled
        RadioButton disable1 = new RadioButton("Yes");
        RadioButton dissble2 = new RadioButton("No");
        ToggleGroup toggle = new ToggleGroup();
        disable1.setToggleGroup(toggle);
        dissble2.setToggleGroup(toggle);

        // radio buttons for priority disabled students
        RadioButton priority1 = new RadioButton("Yes");
        RadioButton priority2 = new RadioButton("No");
        ToggleGroup toggle1 = new ToggleGroup();
        priority1.setToggleGroup(toggle1);
        priority2.setToggleGroup(toggle1);

        // checkboxes for degree course
        CheckBox check1 = new CheckBox("undergraduate");
        CheckBox check2 = new CheckBox("postgraduate");
        CheckBox check3 = new CheckBox("foundation degree");
        CheckBox check4 = new CheckBox("diploma");

        // radio buttons for employees 
        RadioButton employee1 = new RadioButton("Yes");
        RadioButton employee2 = new RadioButton("No");
        ToggleGroup toggle2 = new ToggleGroup();
        employee1.setToggleGroup(toggle2);
        employee2.setToggleGroup(toggle2);

        //this is the class that contains the students, parameter shows the maximum number of Students
        funmiHall = new StudentHall(50);

        //Horizontal componets 
        HBox studentDetails1 = new HBox(10);
        HBox stuDetails = new HBox(10);
        HBox disabledDetails = new HBox(10);
        HBox disableButtons = new HBox(10);
        HBox priorityButtons = new HBox(10);
        HBox degree = new HBox(20);
        HBox studentDetails2 = new HBox(20);
        HBox employeeDetails = new HBox(10);
        HBox employeeButtons = new HBox(10);
        HBox employed = new HBox(10);

        // add components to HBoxes
        studentDetails1.getChildren().addAll(nameLabel, nameField, dobLabel, dobField,
                genderLabel, genderField,
                homeAddressLabel, homeAddressField, courseLabel, courseField);
        studentDetails2.getChildren().addAll(stuIDLabel, stuIDField, rentLabel, rentField,
                feeLabel, feeField, startLabel, startField, endLabel, endField);
        disabledDetails.getChildren().addAll(disabledLabel, disableButtons, disabledPriorityLabel, priorityButtons);
        employed.getChildren().addAll(workLabel, employee1, employee2);
        employeeDetails.getChildren().addAll(dateEmployedLabel, dateEmployedField, roleLabel, roleField, salaryLabel, salaryField);

        disableButtons.getChildren().addAll(disable1, dissble2);
        priorityButtons.getChildren().addAll(priority1, priority2);

        // create VBox
        VBox vertical = new VBox(10);

        // add all components to VBox
        vertical.getChildren().addAll(headingLabel, sectSeparator, studentLabel, studentDetails1,
                stuDetails, studentDetails2, seniorStuLabel, degree, disabledDetails,
                employedLabel, spaceLabel, employed, employeeDetails, sectSeparator2,
                displayStudentsInfo, addButton, clearButton, saveButton);
        degree.getChildren().addAll(check1, check2, check3, check4);
        Scene scene = new Scene(vertical, Color.web("#ffd9b3"));

        // set font of heading
        Font font = new Font("Vedana", 40);
        headingLabel.setFont(font);
        font = new Font("Vedana", 20);
        studentLabel.setFont(font);
        employedLabel.setFont(font);

        // set alignment of componeents
        dateEmployedField.setMaxSize(150, 20);
        roleField.setMaxSize(150, 20);
        salaryField.setMaxSize(150, 20);
        stuDetails.setAlignment(Pos.BASELINE_LEFT);
        employed.setAlignment(Pos.CENTER);
        disabledDetails.setAlignment(Pos.CENTER);
        employeeButtons.setAlignment(Pos.CENTER);

        // set alignment and Background of componets
        vertical.setAlignment(Pos.CENTER);
        vertical.setBackground(Background.EMPTY);
        addButton.setAlignment(Pos.CENTER);
        employed.setAlignment(Pos.CENTER);
        degree.setAlignment(Pos.CENTER);
        employeeDetails.setAlignment(Pos.CENTER);

        // set minimum and maximum width  and height of components 
        displayStudentsInfo.setMaxSize(600, 700);
        
        // set width and height of window
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);

        // set actions of buttons
        addButton.setOnAction(e -> addHandler());
        clearButton.setOnAction(e -> clearWindow());
 saveButton.setOnAction(e -> {
        try {
            saveStudents();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    });

        priority1.setOnAction(e -> Ydisable());
        priority2.setOnAction(e -> Ndisable());
        check2.setOnAction(e -> postgraduate());

        stage.setScene(scene);
        stage.setTitle("Student Form");
        stage.show();
    }

    private void clearWindow() {
        displayStudentsInfo.clear();
    }

    private void addHandler() {

        String stuName = nameField.getText();
        String stuDOB = dobField.getText();
        String stuGender = genderField.getText();
        String homeAddress = homeAddressField.getText();
        String stuCourse = courseField.getText();
        String fee = feeField.getText();
        String start = startField.getText();
        String end = endField.getText();
        String stuID = stuIDField.getText();
        String dateEmployed = dateEmployedField.getText();
        String role = roleField.getText();
        String salary = salaryField.getText();
        String rent = salaryField.getText();

        // check for errors
        if (stuName.length() == 0 || stuDOB.length() == 0 || stuGender.length() == 0 || homeAddress.length() == 0) {
            displayStudentsInfo.setText("These field cannot be empty");
        } else if (stuCourse.length() == 0 || stuID.length() == 0) {
            displayStudentsInfo.setText("You must enter both your course name and ID");
        } else {

            Stu addStudent = new Stu(stuCourse, fee, start, end, stuID, rent, stuName, stuDOB,
                    homeAddress, stuGender);
            Employee emp = new Employee(dateEmployed, role, salary);
            funmiHall.addStudent(addStudent);
            funmiHall.emp(emp);

            nameField.setText("");
            dobField.setText("");
            genderField.setText("");
            courseField.setText("");
            stuIDField.setText("");
            feeField.setText("");
            startField.setText("");
            endField.setText("");
            homeAddressField.setText("");
            dateEmployedField.setText("");
            roleField.setText("");
            salaryField.setText("");
            rentField.setText("");
            displayStudentsInfo.setText("");
            displayStudentsInfo.appendText(stuName + " successfully added");
            displayStudentsInfo.appendText("\n\nInformtion provided are: \n" + "   Name: " + stuName + "\n   Date of birth : "
                    + stuDOB + "\n   Gender: " + stuGender + "\n   Course: " + stuCourse + "\n   Student ID: " + stuID
                    + "\n Rent: " + rent + "Date of employment: " + dateEmployed + "    Role: " + role + "   salary received: " + salary);

        }
        displayStudentsInfo.appendText(funmiHall.displayStudentsInfo());
    }

    private void Ydisable() {
        displayStudentsInfo.appendText("\n A place will be reserved for you dowstairs");
    }

    private void Ndisable() {
        displayStudentsInfo.appendText("\n You can still get special support");
    }

    private void postgraduate() {
        displayStudentsInfo.appendText("\n You are a senior student and entitled to get rent free");
    }

// method to save students data
    private void saveStudents() throws IOException {
    Collection<Stu> students = (Collection<Stu>) funmiHall.getStu(WIDTH);
    FileWriter writer = new FileWriter("students.txt");
    for (Stu s : students) {
        writer.write(s.toString() + "\n");
    }
    writer.close();
}

    public static void main(String[] args) {
        launch(args);
    }

}










