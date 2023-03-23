package les_2.M_to_M.entity;

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
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    private Passport passport;

    @ManyToMany
    @JoinTable(
            name = "user_sunglasses",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "sunglasses_id")
    )

    private List<Sunglasses> sunglasses = new ArrayList<>();

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


    public User(String name, List<Sunglasses> sunglasses, Gender gender) {
        this.name = name;
        this.sunglasses = sunglasses;
        this.gender = gender;
    }

    public User(String name) {
        this.name = name;
    }


}
