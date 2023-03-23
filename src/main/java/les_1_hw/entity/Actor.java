package les_1_hw.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int actor_id;

    private String first_name;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> skills = new ArrayList<>();

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    private String last_name;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date last_update;

    public Actor(int actor_id, String first_name, List<String> skills, Gender gender, String last_name) {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.skills = skills;
        this.gender = gender;
        this.last_name = last_name;
    }
}
