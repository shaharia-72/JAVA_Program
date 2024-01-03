package Hello;

import javafx.collections.transformation.FilteredList;
import java.util.function.Predicate;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Main extends Application {

    TableView<Student> table;
    TextField nameInput, idInput, courseInput, idSearchInput;
    ComboBox<String> gradingComboBox;
    ComboBox<String> attendanceComboBox;
    ObservableList<Student> students;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student System");

        // Initialize the table
        table = new TableView<>();
        students = FXCollections.observableArrayList();

        // Name column
        TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());

        // ID column
        TableColumn<Student, String> idColumn = new TableColumn<>("ID");
        idColumn.setMinWidth(100);
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty());

        // Course column
        TableColumn<Student, String> courseColumn = new TableColumn<>("Course");
        courseColumn.setMinWidth(200);
        courseColumn.setCellValueFactory(cellData -> cellData.getValue().courseProperty());

        // Grading column
        TableColumn<Student, String> gradeColumn = new TableColumn<>("Grading");
        gradeColumn.setMinWidth(100);
        gradeColumn.setCellValueFactory(cellData -> cellData.getValue().gradeProperty());

        // Attendance column
        TableColumn<Student, String> attendanceColumn = new TableColumn<>("Attendance");
        attendanceColumn.setMinWidth(100);
        attendanceColumn.setCellValueFactory(cellData -> cellData.getValue().attendanceProperty());

        table.setItems(students);
        table.getColumns().addAll(nameColumn, idColumn, courseColumn, gradeColumn, attendanceColumn);

        // Name input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(200);

        // ID input
        idInput = new TextField();
        idInput.setPromptText("ID");
        idInput.setMinWidth(100);

        // Course input
        courseInput = new TextField();
        courseInput.setPromptText("Course");
        courseInput.setMinWidth(100);

        // grade input
        gradingComboBox = new ComboBox<>();
        gradingComboBox.getItems().addAll("A", "B+", "B", "B-", "C+", "C", "C-", "D", "F");
        gradingComboBox.setPromptText("Grading");
        gradingComboBox.setMinWidth(100);

        // Attendance ComboBox
        attendanceComboBox = new ComboBox<>();
        attendanceComboBox.getItems().addAll("Present", "Absent");
        attendanceComboBox.setPromptText("Attendance");
        attendanceComboBox.setMinWidth(100);

        idSearchInput = new TextField();
        idSearchInput.setPromptText("Search by ID");

        // Add and Delete buttons
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addStudent());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteStudent());
        Button searchButton = new Button("Search");
        searchButton.setOnAction(e -> searchStudent());

        HBox inputBox = new HBox(10);
        inputBox.getChildren().addAll(nameInput, idInput, courseInput, gradingComboBox, attendanceComboBox, addButton,
                deleteButton, idSearchInput, searchButton);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(table, inputBox);

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addStudent() {
        String name = nameInput.getText();
        String id = idInput.getText();
        String course = courseInput.getText();
        String grading = gradingComboBox.getValue();
        String attendance = attendanceComboBox.getValue();

        if (!name.isEmpty() && !id.isEmpty() && !course.isEmpty() && !attendance.isEmpty() && !grading.isEmpty()) {
            students.add(new Student(name, id, course, attendance, grading));
            nameInput.clear();
            idInput.clear();
            courseInput.clear();
            gradingComboBox.getSelectionModel().clearSelection();
            attendanceComboBox.getSelectionModel().clearSelection();
        }
    }

    private void deleteStudent() {
        Student selectedStudent = table.getSelectionModel().getSelectedItem();
        if (selectedStudent != null) {
            students.remove(selectedStudent);
        }
    }

    private void addGrade() {
        Student selectedStudent = table.getSelectionModel().getSelectedItem();
        String grade = gradingComboBox.getValue();
        if (selectedStudent != null && !grade.isEmpty()) {
            selectedStudent.gradeProperty().set(grade);
            gradingComboBox.getSelectionModel().clearSelection();
        }
    }

    private void searchStudent() {
        String idSearchTerm = idSearchInput.getText().toLowerCase();

        FilteredList<Student> filteredData = students.filtered(getSearchPredicate(idSearchTerm));
        table.setItems(filteredData);
    }

    private Predicate<Student> getSearchPredicate(String idSearchTerm) {
        return student -> {
            boolean idMatches = idSearchTerm.isEmpty() || student.idProperty().get().toLowerCase().contains(idSearchTerm);
            return idMatches;
        };
    }
}
