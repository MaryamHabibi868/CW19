package ir.maktabcw19.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@ToString (callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("t")
public class Teacher extends Employee {


    @Enumerated(EnumType.STRING)
    private TeacherType teacherType;
}
