package com.company.designPattern.proxy;

import com.company.designPattern.aop.AopBrowser;

import java.util.concurrent.atomic.AtomicLong;

/**
 * aop는 proxy를 활용하고 있으며 특정한 기능의 앞뒤로 내가 원하는 기능 혹은 앞뒤로의 Argument(전달 인자) 조작 가능
 * 흩어져있는 공통된 기능들을 하나로 묶어줄 수 있다.
 * ex1 ) httpClient, restClient 흩어져있거나 뭉쳐있을 경우 거기 안에 있는 메소드들의 시간을 체크한다.
 * ex2 ) 데이터베이스에 있는 트랜잭션 등 오래걸리는 부분의 시간을 체크하여 서버의 어느 쪽이 느린상태인지 확인한다.
 */
public class ProxyMain {

    public static void main(String[] args) {
//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();     // 현재는 Proxy 기능이 없어, 4번다 naver.com이 출력된다.

        // Proxy Pattern 사용
//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();     // caching
//        browser.show();     // caching
//        browser.show();     // caching

        AtomicLong start = new AtomicLong();    // 동시성 문제때문에 사용
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
            );

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();  // cache 사용으로 인해 time : 0
        System.out.println("loading time : " + end.get());

    }
}
