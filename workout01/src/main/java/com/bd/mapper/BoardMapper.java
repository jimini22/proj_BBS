package com.bd.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;

import com.bd.domain.BoardDTO;

public interface BoardMapper {

	//@Select("SELECT * FROM plat.BOARD_INFO where board_no > 0")
	public List<BoardDTO> getList();
	
	public void insert(BoardDTO board);
	
	public void insertSelectKey(BoardDTO board);
	
	public BoardDTO read(Long board_no);
	
	public int delete(Long board_no);
	
	public int update(BoardDTO board);
}
