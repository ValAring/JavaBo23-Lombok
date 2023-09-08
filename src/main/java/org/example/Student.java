package org.example;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int iD;
    private String name;
    @With
    private String address;
    @With
    private float grade;
}
