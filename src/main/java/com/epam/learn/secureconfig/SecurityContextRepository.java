package com.epam.learn.secureconfig;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.web.context.HttpRequestResponseHolder;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class SecurityContextRepository implements org.springframework.security.web.context.SecurityContextRepository {

    private final AuthManager authenticationManager;

    public SecurityContextRepository(AuthManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }
    @Override
    public SecurityContext loadContext(HttpRequestResponseHolder requestResponseHolder) {
        return null;
    }

    @Override
    public void saveContext(SecurityContext securityContext, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        throw new IllegalStateException("not supported!");
    }

    @Override
    public boolean containsContext(HttpServletRequest httpServletRequest) {
        return false;
    }


}
