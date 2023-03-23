package les_2.practice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private Long id;
    private String country;
    private String city;
    private String street;
    private String postCode;
}
