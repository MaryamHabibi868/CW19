package ir.maktabcw19.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Lesson extends BaseEntity {

    private String name;

    private Double grade;

    private int capacity;
    private int unit;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Teacher teacher;


}
