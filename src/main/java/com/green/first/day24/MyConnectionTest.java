package com.green.first.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MyConnectionTest {
    public static void main(String[] args) {
        try {
            Connection c = MyConnection.getConnection();
            String sql = "INSERT INTO COUNTRY(COUNTRY) VALUES('경현 나라')";
            PreparedStatement ps = c.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.printf("result = {%d}", result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConnectionTest2 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setTitle("두번째 작성");
        entity.setCtnts("두번째 작성하는 내용입니다.");
        entity.setWriter("남길동");
        BoardDao.insBoard(entity);
    }
}
