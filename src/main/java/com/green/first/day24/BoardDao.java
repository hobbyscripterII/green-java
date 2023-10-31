package com.green.first.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

// data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) {
        int result = 0;
        // 방법 1
//        String sql = String.format("INSERT INTO BOARD(TITLE, CTNTS, WRITER) VALUES('%s', '%s', '%s')", entity.getTitle(), entity.getCtnts(), entity.getWriter());
        // 방법 2
        String sql = "INSERT INTO BOARD(TITLE, CTNTS, WRITER) VALUES(?, ?, ?)";
        try {
            Connection c = MyConnection.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
