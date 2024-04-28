package domain;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {

    @Id @GeneratedValue
    @Column(name = "POST_ID")
    private BigInteger id;

    private String title;

    private String content;

    private LocalDateTime createdAt;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private int state;

    private  BigInteger viewCount;

    @OneToMany(mappedBy = "Post")
    private List<PostUser> postUsers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToMany(mappedBy = "Post")
    private List<Comment> comments;

    @OneToMany(mappedBy = "Post")
    private List<Image> images = new ArrayList<Image>();

}
