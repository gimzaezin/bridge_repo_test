package domain;

import jakarta.persistence.*;

@Entity
public class PostHash {

    @Id
    @Column(name = "POST_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID")
    private Post post;

    @Id @Column(name = "HASHTAG_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HASHTAG_ID")
    private Hashtag hashtag;


}
