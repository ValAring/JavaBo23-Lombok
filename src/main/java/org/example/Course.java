package org.example;
import lombok.*;
import java.util.List;

@Data //Getter, Setter, Equals, Hashcode, to String all in one
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private int iD;
    @With
    private String name;
    @With
    private Teacher teacher;
    private List<Student> participants;

}
