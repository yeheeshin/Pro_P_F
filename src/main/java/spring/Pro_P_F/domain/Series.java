package spring.Pro_P_F.domain;

import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Series {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long s_seq;

    @ManyToOne
    @JoinColumn(name = "m_id")
    private Member member;

    private String s_name;
    private String s_intro;

    @LastModifiedDate
    private LocalDate s_date;

}
