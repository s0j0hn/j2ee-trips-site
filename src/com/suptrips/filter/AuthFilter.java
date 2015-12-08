package com.suptrips.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/auth/*")
public class AuthFilter implements Filter {

    public AuthFilter() {
        // TODO
    }

    public void destroy() {
        // TODO
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        if (((HttpServletRequest) request).getSession().getAttribute("idbooster") != null) {
            chain.doFilter(request, response);
            return;
        }else if (((HttpServletRequest) request).getSession().getAttribute("password") != null){
            chain.doFilter(request, response);
            return;
        }
        httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
    }

    public void init(FilterConfig fConfig) throws ServletException {
        // TODO
    }

}