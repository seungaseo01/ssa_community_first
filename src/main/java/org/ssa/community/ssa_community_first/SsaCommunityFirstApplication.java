package org.ssa.community.ssa_community_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.ssa.community.ssa_community_first.entity.TotalBoard;

@SpringBootApplication
public class SsaCommunityFirstApplication{

	public static void main(String[] args) {
		SpringApplication.run(SsaCommunityFirstApplication.class, args);
	}

}
