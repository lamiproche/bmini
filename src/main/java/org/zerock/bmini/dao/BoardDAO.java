package org.zerock.bmini.dao;

import org.zerock.bmini.dto.BoardDTO;

public enum BoardDAO {
    INSTANCE;

    private static final String SQL_READ = "select * from tbl_board where bno=?";

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
}