package domain;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
public class UserHash {

    @Id @Column(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Id @Column(name = "HASHTAG_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HASHTAG_ID")
    private Hashtag hashtag;
}
