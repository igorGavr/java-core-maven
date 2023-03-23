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
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String series;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "passport")
    private User user;

    public Passport(String series) {
        this.series = series;
    }
}
