package org.zerock.bmini.dao;


import org.zerock.bmini.dto.BoardDTO;
import lombok.extern.log4j.Log4j2;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public enum BoardDAO {
    INSTANCE;

    private static final String SQL_READ = "select * from tbl_board where bno=?";

    private static final String SQL_SELECT_LIST = "select bno, title, content, writer, regdate from tbl_board";

    public BoardDTO read(Long bno) {
        BoardDTO boardDTO = new BoardDTO();
        new JdbcTemplate(){
            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement(SQL_READ);
                preparedStatement.setLong(1, bno);
                resultSet = preparedStatement.executeQuery();

                resultSet.next();
                boardDTO.setBno(resultSet.getLong(1));
                boardDTO.setTitle(resultSet.getString(2));
                boardDTO.setContent(resultSet.getString(3));
                boardDTO.setWriter(resultSet.getString(4));
                boardDTO.setRegdate(resultSet.getTimestamp(5));
            }
        }.makeAll();
        return boardDTO;
    }


    public List<BoardDTO> selectList() {

        List<BoardDTO> boardDTOList = new ArrayList<>();

        new JdbcTemplate() {
            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement(SQL_SELECT_LIST);
                resultSet = preparedStatement.executeQuery();

                while(resultSet.next()) {

                    boardDTOList.add(BoardDTO.builder()
                            .bno(resultSet.getLong(1))
                            .title(resultSet.getString(2))
                            .content(resultSet.getString(3))
                            .writer(resultSet.getString(4))
                            .regdate(resultSet.getTimestamp(5))
                            .build());
                }
            }
        }.makeAll();

        return boardDTOList;
    }

}

