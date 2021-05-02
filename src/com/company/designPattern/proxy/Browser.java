package com.company.designPattern.proxy;

public class Browser implements IBrowser {

    private String url;

    public Browser(String url) {
        this.url = url;
    }

    // 브라우저에서 어떤 페이지를 볼 때 매번 새로운 주소를 로딩하면서 새로운 HTML을 만들어준다.
    @Override
    public Html show() {
        System.out.println("browser loading html from : " + url);
        return new Html(url);
    }
}
