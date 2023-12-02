package com.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService implements BoardServiceInterface{
    @Autowired
    BoardDao boardDao;

    public List<BoardVo> getBoardList(){
        return boardDao.getBoardList();
    }
    public BoardVo getBoard(int seq) {
        return boardDao.getBoard(seq);
    }

    public int insertBoard(BoardVo vo){
        return boardDao.insertBoard(vo);
    }

    public int deleteBoard(int seq){
        return boardDao.deleteBoard(seq);
    }

    public int updateBoard(BoardVo vo){
        return boardDao.updateBoard(vo);
    }

}
