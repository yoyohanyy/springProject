package com.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int insertBoard(BoardVo vo){
        String sql = "insert into BOARD (catagory, title, writer, content) values ("
                + "'" + vo.getCategory() + "',"
                + "'" + vo.getTitle() + "',"
                + "'" + vo.getWriter() + "',"
                + "'" + vo.getContent() + "')";
        return jdbcTemplate.update(sql);
    }

    public int deleteBoard(int seq) {
        String sql = "delete from BOARD where seq = " + seq;
        return jdbcTemplate.update(sql);
    }

    public int updateBoard(BoardVo vo) {
        String sql = "update BOARD set title='" + vo.getTitle() + "',"
                + "catagory='" + vo.getWriter() + "',"
                + "title='" + vo.getCategory() + "',"
                + "writer='" + vo.getTitle() + "',"
                + "content='" + vo.getContent() + "' where seq=" + vo.getSeq();
        return jdbcTemplate.update(sql);
    }

    class BoardRowMapper implements RowMapper<BoardVo>{
        @Override
        public BoardVo mapRow(ResultSet rs, int rowNum) throws SQLException {
            BoardVo vo = new BoardVo();
            vo.setSeq(rs.getInt("seq"));
            vo.setCategory(rs.getString("category"));
            vo.setTitle(rs.getString ("title"));
            vo.setWriter(rs.getString ("writer"));
            vo.setContent(rs.getString("content"));
            vo.setRegdate(rs.getDate("regdate"));
            return vo;
        }
    }

    public List<BoardVo> getBoardList(){
        String sql = "select * from BOARD order by seq desc";
        return jdbcTemplate.query(sql, new BoardRowMapper());
    }

//    public List<BoardVo> getBoardList(){
//        String sql = "select * from BOARD order by seq desc";
//        List<BoardVo> list = jdbcTemplate.query(sql, new RowMapper <BoardVo>() {
//            @Override
//            public BoardVo mapRow(ResultSet rs, int rowNum) throws SQLException {
//                BoardVo one = new BoardVo();
//                one.setSeq(rs.getInt("seq"));
//                one.setCategory(rs.getString("catagory"));
//                one.setTitle(rs.getString("title"));
//                one.setWriter(rs.getString("writer"));
//                one.setContent(rs.getString("content"));
//                one.setRegdate(rs.getDate("regdate"));
//                one.setCnt(rs.getInt("cnt"));
//                return one;
//            }
//        });
//        return list;
//    }

    public BoardVo getBoard(int seq){
        String sql = "select * from BOARD where seq =" + seq;
        return jdbcTemplate.queryForObject(sql, new BoardRowMapper());
    }
}
