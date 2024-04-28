package domain;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
public class Validate {
    @Id @GeneratedValue
    private BigInteger id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEMPLATE_ID")
    private Template template;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    @Column(name = "FROM_USERID")
    private User fromUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    @Column(name = "TO_USERID")
    private User toUser;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID")
    private Post post;




}
