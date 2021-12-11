package org.ssa.community.ssa_community_first.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "total_board")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TotalBoard {

    @Id
    @Column(name = "b_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bNo;


    @Column(name = "b_divide")
    private String bDivide;

    @Column(name = "b_title")
    private String bTitle;

    @Column(name = "b_secret")
    private int bSecret;

    @Column(name = "b_content")
    private String bContent;

    @Column(name = "b_writer")
    private String bWriter;

    @Column(name = "b_like")
    private int bLike;

    @Column(name = "b_regdate")
    private Timestamp bRegdate;

    @Column(name = "b_moddate")
    private Timestamp bModdate;

    @Column(name = "b_viewcnt")
    private int bViewcnt;

    @ManyToOne
    @JoinColumn(name = "c_no")
    private Category category;




}
