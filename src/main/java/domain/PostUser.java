package domain;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
public class PostUser {

    @Id @GeneratedValue
    private BigInteger id; //id 필요하대서

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn (name = "POST_ID")
    private Post post;

}
