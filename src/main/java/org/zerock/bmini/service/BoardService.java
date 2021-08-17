package org.zerock.bmini.service;

import lombok.extern.log4j.Log4j2;
import org.zerock.bmini.dao.BoardDAO;
import org.zerock.bmini.dto.BoardDTO;

import java.util.List;

@Log4j2
public enum BoardService {
    INSTANCE;

    public void remove(Long bno) {
        BoardDAO.INSTANCE.delete(bno);
    }

    public BoardDTO read(Long bno) {
        return BoardDAO.INSTANCE.read(bno);
    }

    public void update(BoardDTO boardDTO) {
        BoardDAO.INSTANCE.update(boardDTO);
    }

    public BoardDTO modify(Long bno) {
        return BoardDAO.INSTANCE.selectModify(bno);
    }


    public List<BoardDTO> getBoardList() {

        return BoardDAO.INSTANCE.selectList();
    }



    public void register(BoardDTO boardDTO)throws RuntimeException {


        log.info("service register......" + boardDTO);

        BoardDAO.INSTANCE.insert(boardDTO);


    }

}
