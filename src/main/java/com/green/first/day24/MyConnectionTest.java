package com.green.first.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

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
        entity.setTitle("INSERT TEST");
        entity.setCtnts("INSERT TEST입니다.");
        entity.setWriter("이주영");
        BoardDao.insBoard(entity);
    }
}

class MyConnectionTest3 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(2);
        System.out.printf("row = {%d}", BoardDao.delBoard(entity));
    }
}

class MyConnectionTest4 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(3);
        entity.setTitle("매운 돈코츠 라멘");
        entity.setCtnts("매운 돈코츠 라멘");
        entity.setWriter("큐산");
        System.out.printf("row = {%d}", BoardDao.updBoard(entity));
    }
}

class MyConnectionTest5 {
    public static void main(String[] args) {
        List<BoardEntity> list = BoardDao.selBoardList();
        System.out.printf("%s | %s | %s | %s\n", "글 번호", "제목", "글쓴이", "작성일");
        for (BoardEntity entity : list) {
            System.out.println(entity);
        }
    }
}

class MyConnectionTest6 {
    public static void main(String[] args) {
        BoardEntity result = BoardDao.selBoardById(3);
        System.out.println(result);
    }
}