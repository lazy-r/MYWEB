package top.lazyr.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author lazyr
 * @created 2022/6/6
 */
@WebFilter
@Component
public class IpFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(IpFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("IpFilter.init start...");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        String addr = req.getRemoteAddr();
        String host = req.getRemoteHost();
        int port = req.getRemotePort();
        String protocol = req.getProtocol();
        LOGGER.info("protocol: " + protocol);
        LOGGER.info("address: " + addr + ", host: " + host + ", port: " + port);

    }

    @Override
    public void destroy() {
        System.out.println("IpFilter.destroy");
    }
}
