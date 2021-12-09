package org.ssa.community.ssa_community_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.ssa.community.ssa_community_first.entity.TotalBoard;

@EnableJpaRepositories
public interface BoardRepository extends JpaRepository<TotalBoard,Integer> {
// MyBatis 쿼리문 대신 들어갈 명령어 모음집.
//ex) save(),findById(),delete() 등등

}
