//package com.swedbank.itacademy.teamcProject.config;
//
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//
//import javax.servlet.http.HttpServletRequest;
//
//import javax.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//
///**
// * Created by benas on 17.2.27.
// */
//@Component
//
//public class CORSFilter implements Filter {
//
//    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
//
//        HttpServletResponse response = (HttpServletResponse) res;
//
//        HttpServletRequest request = (HttpServletRequest) req;
//
//        response.setHeader("Access-Control-Allow-Origin", "*");
//
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//
//        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
//
//        response.setHeader("Access-Control-Max-Age", "3600");
//
//        response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Authorization, Content-Type");
//
//    }
//
//    public void init(FilterConfig filterConfig) {
//
//    }
//
//    public void destroy() {
//
//    }
//
//}
