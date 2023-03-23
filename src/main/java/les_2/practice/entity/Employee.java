package les_2.practice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private Long addressID;

}
