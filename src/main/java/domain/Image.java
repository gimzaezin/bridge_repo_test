package domain;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
public class Image {
    @Id @GeneratedValue
    private Long id;

    private String url;     //경로
    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID")
    private Post post;

}
