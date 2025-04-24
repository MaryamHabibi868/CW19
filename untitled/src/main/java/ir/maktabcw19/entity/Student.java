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
@DiscriminatorValue("s")
public class Student extends Person{

    @ManyToMany
    @JoinTable( name = "student_course" ,
    joinColumns = {@JoinColumn (name = "student_id")} ,
    inverseJoinColumns = { @JoinColumn (name = "course_id")})
    private Set<Course> courses;

}
