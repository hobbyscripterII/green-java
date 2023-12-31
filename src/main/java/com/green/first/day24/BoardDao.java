package com.green.first.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) {
        int result = 0;
        // 방법 1
//        String sql = String.format("INSERT INTO BOARD(TITLE, CTNTS, WRITER) VALUES('%s', '%s', '%s')", entity.getTitle(), entity.getCtnts(), entity.getWriter());
        // 방법 2
//        String sql = "INSERT INTO BOARD(TITLE, CTNTS, WRITER) VALUES(?, ?, ?)";
        // + 추가(2023.11.02)
        String sql = "INSERT INTO BOARD SET TITLE = ?, CTNTS = ?, WRITER = ?";
        Connection c = null;
        // PreparedStatement의 기능
        // 1. `문자열` 타입은 자동으로 홑따옴표를 붙여주고, `정수`는 정수 타입으로 값이 들어간다.
        // 2. (Statement를 상속받은 인터페이스)
        PreparedStatement ps = null;
        try {
            c = MyConnection.getConnection();
            ps = c.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConnection.close(c, ps); // 자원 반납
        }
        return result;
    }

    public static int delBoard(BoardEntity entity) {
        int result = 0;
        String sql = "DELETE FROM BOARD WHERE IBOARD = ?";
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = MyConnection.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConnection.close(c, ps);
        }
        return result;
    }

    public static int updBoard(BoardEntity entity) {
        int result = 0;
        String sql = "UPDATE BOARD SET TITLE = ?, CTNTS = ?, WRITER = ?, UPDATED_AT = NOW() WHERE IBOARD = ?";
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = MyConnection.getConnection();
            ps = c.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConnection.close(c, ps);
        }
        return result;
    }

    // List는 검색, 페이징 등에 사용된다.
    // 모든 언어의 메소드 리턴 값은 무조건 주소값 `1개`다.
    public static List<BoardEntity> selBoardList() {
        List<BoardEntity> list = new ArrayList();
        String sql = "SELECT IBOARD, TITLE, WRITER, CREATED_AT FROM BOARD";
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = MyConnection.getConnection();
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) { // 레코드를 가리킨다.
                int iBoard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");
                BoardEntity entity = new BoardEntity();
                entity.setIboard(iBoard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConnection.close(c, ps, rs);
        }
        return list;
    }

    public static BoardEntity selBoardById(int iboard) {
        BoardEntity entity = new BoardEntity();
        String sql = "SELECT * FROM BOARD WHERE IBOARD = ?";
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = MyConnection.getConnection();
            ps = c.prepareStatement(sql);
            ps.setInt(1, iboard);
            rs = ps.executeQuery();
            // rs.next(): 반환 타입 - boolean, 다음 줄을 선택한다.
            if (rs.next()) {
                entity.setIboard(rs.getInt("iboard"));
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreatedAt(rs.getString("created_at"));
                entity.setUpdatedAt(rs.getString("updated_at"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConnection.close(c, ps, rs);
        }
        return entity;
    }
}
