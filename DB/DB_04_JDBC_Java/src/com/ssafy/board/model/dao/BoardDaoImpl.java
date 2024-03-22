package com.ssafy.board.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.util.DBUtil;

//싱글턴으로 관리할 것
public class BoardDaoImpl implements BoardDao {
	// DB관련 파일 가져오기
	private final DBUtil dbutil = DBUtil.getInstance();
	private static BoardDao instance = new BoardDaoImpl();

	private BoardDaoImpl() {

	}

	public static BoardDao getInstance() {
		return instance;
	}

	@Override
	public List<Board> selectAll() {
		List<Board> list = new ArrayList<>();
		String sql = "SELECT * FROM board";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// 2. 데이터베이스를 연결해야됨
		try {
			conn = dbutil.getConnection();

			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Board board = new Board(); // 바구니 빈 게시글 준비
				board.setId(rs.getInt("id")); // 컬럼명
//				board.setId(rs.getInt(1)); // 인덱스 1부터
				board.setWriter(rs.getString("writer"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setViewCnt(rs.getInt("view_cnt"));
				board.setRegDate(rs.getString("reg_date"));

				list.add(board);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbutil.close(rs, stmt, conn);
		}

		return list;
	}

	@Override
	public Board selectOne(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

//		String sql = "SELECT * FROM board WHERE id="+id;   //statmenet 방식
		String sql = "SELECT * FROM board WHERE id=?"; // prepared statment 방식

		Board board = null;

		try {
			board = new Board();
			
			conn = dbutil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id);	//prepared statment 첫번째 물음표에 id를 집어넣겟다
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				board.setId(rs.getInt(1)); // 인덱스 1부터
				board.setWriter(rs.getString(2));
				board.setTitle(rs.getString(3));
				board.setContent(rs.getString(4));
				board.setViewCnt(rs.getInt(5));
				board.setRegDate(rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbutil.close(rs, pstmt, conn);
		}

		return board;
	}

	@Override
	public void insertBoard(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		//아래의 statement 방식은 너무 복잡해 , prepared statement로 한다
//		String sql = "INSERT INTO board (title, writer, content) VALUES ('"+board.getTitle()+")";
		String sql = "INSERT INTO board (title, writer, content) VALUES (?,?,?) ";
		
		try {
			conn = dbutil.getConnection();
			
			//autocommit 해제
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  board.getTitle());	//pstmt 첫번쨰 물음표에
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
			conn.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbutil.close(pstmt, conn);
		}

	}

	@Override
	public void deleteBoard(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM board WHERE id = ?";
		
		try {
			conn = dbutil.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id);	//pstmt 첫번쨰 물음표에
			
			int result = pstmt.executeUpdate();
//			conn.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbutil.close(pstmt, conn);
		}
	}

	@Override
	public void updateBoard(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE board SET title=?, content=? WHERE id=? ";
		
		try {
			conn = dbutil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, board.getTitle());	//pstmt 첫번쨰 물음표에
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getId());
			
			int result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbutil.close(pstmt, conn);
		}

	}

	@Override
	public void updateViewCnt(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE board SET view_cnt = view_cnt+1 WHERE id=?";
		
		try {
			conn = dbutil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id);	//pstmt 첫번쨰 물음표에
			
			int result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbutil.close(pstmt, conn);
		}
	}

}
