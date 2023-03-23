package les_2.one_to_M.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user_table")
@NoArgsConstructor
@Getter
@Setter
@ToString()
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    @ToString.Exclude
    private Passport passport;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_car",
            joinColumns = @JoinColumn(name = "user_id_x"),
            inverseJoinColumns = @JoinColumn(name = "car_id_x")
    )
    private List<Car> cars = new ArrayList<>();

    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> skills = new ArrayList<>();

    @Enumerated(value = EnumType.STRING)
    private Gender gender = Gender.MALE;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date creationDate;
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date lastUpdate;

    public User(String name, List<String> skills, Gender gender) {
        this.name = name;
        this.skills = skills;
        this.gender = gender;
    }


    public User(String name, Passport passport, Gender gender) {
        this.name = name;
        this.passport = passport;
        this.gender = gender;
    }

    public User(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

    public User(String name) {
        this.name = name;
    }


}
