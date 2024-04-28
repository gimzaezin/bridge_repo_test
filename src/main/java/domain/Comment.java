package domain;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id @GeneratedValue
    private BigInteger id;

    private String content;
    private LocalDateTime createdAt;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID")
    private Post post;


}
