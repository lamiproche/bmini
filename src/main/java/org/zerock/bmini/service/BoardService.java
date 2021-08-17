package org.zerock.bmini.service;

import org.zerock.bmini.dao.BoardDAO;
import org.zerock.bmini.dto.BoardDTO;

public enum BoardService {
    INSTANCE;

    public BoardDTO read(Long bno) {
        return BoardDAO.INSTANCE.read(bno);
    }
}