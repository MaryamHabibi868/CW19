package ir.maktabcw19.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.*;

@Entity
@Getter
@Setter
@ToString (callSuper = true)
@NoArgsConstructor
@DiscriminatorValue("e")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
public class Employee extends Person {


    private Double salary;

    public Employee(String firstName , String lastName,
                    String userName, String password, Double salary) {
        super(firstName, lastName, userName, password);
        this.salary = salary;
    }
}
