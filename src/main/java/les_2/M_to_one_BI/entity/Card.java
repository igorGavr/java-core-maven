package les_2.M_to_one_BI.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String number;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    public Card(String number) {
        this.number = number;
    }

    public Card(String number, User user) {
        this.number = number;
        this.user = user;
    }
}
