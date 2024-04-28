package domain;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
public class PostUser {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "USER_ID")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn (name = "POST_ID")
    private Post post;

}
