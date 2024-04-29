package domain;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Gender {
    @Id @GeneratedValue
    @Column(name = "GENDER_ID")
    private Long id;
    private String genderName;

    @OneToMany(mappedBy = "gender")
    private List<User> users = new ArrayList<User>();
}
