package les_2.one_to_M_bi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String model;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_car",
            joinColumns = @JoinColumn(name = "car_id_x"),
            inverseJoinColumns = @JoinColumn(name = "user_id_x")
    )
    private User user;

    public Car(String model) {
        this.model = model;
    }
}
