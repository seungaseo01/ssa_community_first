package org.ssa.community.ssa_community_first.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @Column(name = "c_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cNo;

    @Column(name = "c_name")
    private String cName;

}
