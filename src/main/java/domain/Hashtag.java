package domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigInteger;

@Entity
public class Hashtag {

    @Id @GeneratedValue
    @Column(name = "HASHTAG_ID")
    private Long id;

    private String hashtagName;

}
