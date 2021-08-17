package org.zerock.bmini.dao;


import org.zerock.bmini.dto.BoardDTO;
import lombok.extern.log4j.Log4j2;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public enum BoardDAO {
    INSTANCE;








    private static final String SQL_DELETE = "delete from tbl_board where bno=?";
    public void delete (Long bno) {
        new JdbcTemplate(){

            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement(SQL_DELETE);
                preparedStatement.setLong(1, bno);
                preparedStatement.executeUpdate();
            }
        }.makeAll();
    }


    private static final String SQL_UPDATE = "update tbl_board set title=?, content=? where bno=?";
    public void update (BoardDTO boardDTO) {
        new JdbcTemplate(){
            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement(SQL_UPDATE);
                preparedStatement.setString(1, boardDTO.getTitle());
                preparedStatement.setString(2, boardDTO.getContent());
                preparedStatement.setLong(3, boardDTO.getBno());
                preparedStatement.executeUpdate();
            }
        }.makeAll();
    }

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


    private static final String SQL_SELECT_LIST = "select bno, title, content, writer, regdate from tbl_board";
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



    private static final String SQL_INSERT = "insert into tbl_board(title, content, writer) values(?,?,?)";
    public void insert(BoardDTO boardDTO) {

        new JdbcTemplate() {
            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement(SQL_INSERT);
                preparedStatement.setString(1,boardDTO.getTitle());
                preparedStatement.setString(2,boardDTO.getContent());
                preparedStatement.setString(3,boardDTO.getWriter());
                preparedStatement.executeUpdate();
            }
        }.makeAll();

    }



    public BoardDTO selectModify(Long bno) {
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

