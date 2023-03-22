package les_1_hw.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "actor")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String first_name;


    private String last_name;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date last_update;

    public Actor(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
