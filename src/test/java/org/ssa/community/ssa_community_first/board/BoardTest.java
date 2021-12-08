package org.ssa.community.ssa_community_first.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.ssa.community.ssa_community_first.entity.Category;
import org.ssa.community.ssa_community_first.entity.TotalBoard;
import org.ssa.community.ssa_community_first.repository.BoardRepository;

@SpringBootTest
public class BoardTest {

    @Autowired
    BoardRepository boardRepository;

    @Test
    public void insertBoardTest(){

        for(int i=0; i<100; i++){
            TotalBoard board = new TotalBoard();

            board.setCategory(Category.builder().cNo(1).build());
            board.setBDivide("");
            board.setBTitle("Sample board"+i);
            board.setBWriter("writer"+i);
            board.setBContent("Sample board"+i);

            boardRepository.save(board);
        }

    }
}
