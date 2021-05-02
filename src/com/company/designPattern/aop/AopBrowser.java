package com.company.designPattern.aop;

import com.company.designPattern.proxy.Html;
import com.company.designPattern.proxy.IBrowser;

/**
 * aop는 관점지향이다.
 */
public class AopBrowser implements IBrowser {
    
    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() {
        before.run();
        
        if (html == null) {
            this.html = new Html(url);
            System.out.println("AopBrowser html loading from : " + url);

            try {
                Thread.sleep(1500);     // method 실행시간이 빨라서 체크가 안될 수 있으므로 인위적으로 1.5초의 시간이 걸리도록 설정한다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        after.run();

        System.out.println("AopBrowser html cache : " + url);
        return html;
    }
}
