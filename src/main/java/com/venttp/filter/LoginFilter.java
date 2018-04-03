package com.venttp.filter;

import com.venttp.base.contains.VenttpContains;
import com.venttp.index.dto.UserCenterInfo;
import com.venttp.utils.StringUtils;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession(false);

        String requestURI = request.getRequestURI();

        for (String url : RequestFilterURL.FILTER_URL) {
            if (StringUtils.isEquals(url, requestURI)) {
                if (null == session) {
                    goLoginPage(response);
                    return;
                }
                String userAccount = (String) session.getAttribute(VenttpContains.LOGIN_SESSION_KEY);
                if (StringUtils.isEmpty(userAccount)){
                    goLoginPage(response);
                    return;
                }
            }
        }
        goRequestPage(request, response, filterChain);
    }

    @Override
    public void destroy() {

    }

    private void goLoginPage (HttpServletResponse response) throws IOException {
        response.sendRedirect(VenttpContains.LOGIN_URL);
    }
    private void goRequestPage (HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        filterChain.doFilter(request, response);
    }
}
