/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hello;

/**
 *
 * @author USER
 */
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {

    private final StringProperty name;
    private final StringProperty id;
    private final StringProperty course;
    private final StringProperty attendance;
    private final StringProperty grade;

    public Student(String name, String id, String course, String attendance,String grade) {
        this.name = new SimpleStringProperty(name);
        this.id = new SimpleStringProperty(id);
        this.course = new SimpleStringProperty(course);
        this.attendance = new SimpleStringProperty(attendance);
        this.grade = new SimpleStringProperty(grade);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty idProperty() {
        return id;
    }

    public StringProperty courseProperty() {
        return course;
    }

    public StringProperty attendanceProperty() {
        return attendance;
    }
    
    public StringProperty gradeProperty() {
        return grade;
    }
}
