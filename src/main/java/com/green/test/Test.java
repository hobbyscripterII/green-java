package com.green.test;

public class Test {
    public static void main(String[] args) {
        // return this를 활용한 체이닝 기법(public MyInfo ... return this)
        MyInfo myInfo = new MyInfo()
                .title("GREENGRAM")
                .description("인스타그램 클론 코딩");

        System.out.println(myInfo);

        MyOpenAPI myOpenAPI = new MyOpenAPI()
                .info(myInfo);

        System.out.println(myOpenAPI);
    }
}
