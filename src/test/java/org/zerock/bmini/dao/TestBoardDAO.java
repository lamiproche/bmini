package org.zerock.bmini.dao;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.zerock.bmini.dto.BoardDTO;

import java.util.List;

@Log4j2
public class TestBoardDAO {

    @Test
    public void testSelect() {
        List<BoardDTO> list =  BoardDAO.INSTANCE.selectList();

        log.info(list);
    }
}
