package domain;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Template {

    @Id @GeneratedValue
    @Column(name = "TEMPLATE_ID")
    private Long id;

    private String content;

    private int score;

    @OneToMany(mappedBy = "Template")
    private List<Validate> validates = new ArrayList<>();

}
