package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Course {
    private Integer id;
    private String title;
    private String[] instructor;
    private String[] requirements;
    private String date;

    public Course(Integer id, String title, String[] instructor, String[] requirements, String date) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
        this.requirements = requirements;
        this.date = date;
    }
}
