package ir.maktabcw19.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@MappedSuperclass
@Getter
@NoArgsConstructor
public class BaseEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "entity_seq_gen" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,
            generator = "entity_seq_gen")
    private Integer id;
}
