package org.ssa.community.ssa_community_first.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "total_board")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TotalBoard {
    private Long bNo;
    private Long cNo;
    private String bDivide;
    private String bTitle;
    private Long bSecret;
    private String bContent;
    private String bWriter;
    private Long bLike;
    private Date bRegdate;
    private Date bModdate;
    private Long bViewcnt;
}
