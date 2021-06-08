package tr.com.stockbroker.demo.hello;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeaderInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) {

        httpServletResponse.setHeader("x-frame-options", "sameorigin");
        httpServletResponse.setHeader("x-download-options", "noopen");
        httpServletResponse.setHeader("Strict-Transport-Security", "max-age=63072000");
        httpServletResponse.setHeader("Content-Security-Policy", "default-src 'none'");
        httpServletResponse.setHeader("X-Permitted-Cross-Domain-Policies", "none");
        httpServletResponse.setHeader("Feature-Policy", "none");
        httpServletResponse.setHeader("Referrer-Policy", "no-referrer-when-downgrade");

        String cookieName = httpServletRequest.getHeader("x-company-id");
        Cookie cookie = new Cookie("code", cookieName);
        cookie.setHttpOnly(true);
        httpServletResponse.addCookie(cookie);
        return true;
    }

}
