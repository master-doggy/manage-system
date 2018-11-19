package com.yz.oa.manageSystem.web.filter;



import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(filterName = "codeFilter",
        urlPatterns = "/*",
        initParams = {
            @WebInitParam(name="encoding",value="utf-8"),
           })
public class CodeFilter implements Filter {

    public static String code = null;

    @Override
    public void init(FilterConfig config) throws ServletException {
        code = config.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        request.setCharacterEncoding(code);
        response.setCharacterEncoding(code);
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
