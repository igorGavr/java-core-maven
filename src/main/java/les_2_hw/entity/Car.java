package les_2_hw.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    private int power;
    private int volume;
    @Enumerated(EnumType.STRING)
    private Type type;

    public Car(String model, Type type) {
        this.model = model;
        this.type = type;
    }
}
