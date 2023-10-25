package com.green.first.day14.ch6;

public class Document {
    static int i = 0;
    String title;

    public Document() {
        this("제목없음" + ++i);
    }

//    public Document() {
//        title = "제목없음" + (++i);
//        System.out.printf("문서 %s가 생성되었습니다.\n", title);
//    }

    public Document(String txt) {
        title = txt;
        System.out.printf("문서 %s가 생성되었습니다.\n", title);
    }
}

class DocumentTest {
    public static void main(String[] args) {
        Document document1 = new Document();
        Document document2 = new Document("JAVA.txt");
        Document document3 = new Document();
        Document document4 = new Document();
        Document document5 = new Document();

        Document[] documents = {document1, document2, document3, document4, document5};
        for (Document document : documents) {
            System.out.println(document.title);
        }
    }
}
