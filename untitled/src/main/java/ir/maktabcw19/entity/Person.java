package ir.maktabcw19.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Inheritance( strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="person_type",
        discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("p")
public class Person extends BaseEntity {


    private String firstName;

    private String lastName;

    private String userName;

    private String password;

}
