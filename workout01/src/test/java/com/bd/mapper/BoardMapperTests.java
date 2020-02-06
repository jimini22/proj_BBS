package com.bd.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bd.domain.BoardDTO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testInsert() {
		BoardDTO board = new BoardDTO();
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 작성하는 내용");
		//board.setUser_no(user_no);
		
		mapper.insert(board);
		
		log.info(board);
	}
	
	@Test
	public void testRead() {
		//존재하는 게시물 번호로 테스트
		BoardDTO board = mapper.read(5L);
		
		log.info(board);
	}
	
	@Test
	public void testDelete() {
		
		log.info("DELETE COUNT: "+mapper.delete(2L));
	}
	
	public void testUpdate() {
		
		BoardDTO board = new BoardDTO();
		//실행 전 존재하는 번호인지 확인할 것
		board.setBoard_no(5L);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		board.setUser_no(50L);
		
		int count = mapper.update(board);
		log.info("UPDATE COUNT: "+count);
		
	}
}
