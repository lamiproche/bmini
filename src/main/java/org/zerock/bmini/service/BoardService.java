package org.zerock.bmini.service;

import org.zerock.bmini.dao.BoardDAO;
import org.zerock.bmini.dto.BoardDTO;

import java.util.List;


public enum BoardService {
    INSTANCE;

    public BoardDTO read(Long bno) {
        return BoardDAO.INSTANCE.read(bno);
    }

    public List<BoardDTO> getBoardList() {

        return BoardDAO.INSTANCE.selectList();
    }


}
