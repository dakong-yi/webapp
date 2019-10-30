package admin;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
        String name = config.getInitParameter("site");
        System.out.println(name);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行了过滤器");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
