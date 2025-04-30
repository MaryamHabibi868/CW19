package ir.maktabcw19.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Course extends BaseEntity {

    private int numberCourse;

    private LocalDate startDate;

    private LocalDate endDate;

    @OneToMany(mappedBy = "course")
    private List<Lesson> lessons;

    private Double score;

    @ManyToOne
    private Student student;
}
