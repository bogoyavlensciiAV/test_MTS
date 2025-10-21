package org.example.foobarautoconfiguration;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FooBarFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        if (response instanceof HttpServletResponse res) {
            res.addHeader("Foo", "Bar");
        }
        chain.doFilter(request, response);
    }
}
