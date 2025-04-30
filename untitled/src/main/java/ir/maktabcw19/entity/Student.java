package ir.maktabcw19.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("s")
public class Student extends Person {

    @OneToMany(mappedBy = "student")
    private Set<Course> courses;


}
