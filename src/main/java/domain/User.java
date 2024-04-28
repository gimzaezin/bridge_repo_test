package domain;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id @GeneratedValue
    @Column(name = "USER_ID")
    private BigInteger id;

    private String loginId;

    private String password;

    private String email;

    private LocalDate birth;

    private String introduction;

    private String nickname;

    private int state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GENDER_ID")
    private Gender genderName;

    @OneToMany(mappedBy = "User")
    private List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy = "User")
    private List<PostUser> postUsers = new ArrayList<>();

    @OneToMany(mappedBy = "User")
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "User")
    private List<Validate> validates = new ArrayList<>();

    public User() {}
}
