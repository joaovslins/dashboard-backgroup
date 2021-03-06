package com.dashboard.authentication;

import java.io.IOException;
import java.security.SignatureException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

@Component(value = "jwt")
public class JWTRequestLogin extends GenericFilterBean{
	

//		@Autowired
//		private UserCredentialsService service;

		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {
//			HttpServletRequest req = (HttpServletRequest) request;
//			String jwt = req.getHeader(JWTUtil.header_name);
//			if (jwt != null) {
//				try {
//					
//					String username = JWTUtil.getUser(jwt);
//					
//					UserDetails ud = service.loadUserByUsername(username);
//					
//					Authentication authentication =  new UsernamePasswordAuthenticationToken(ud.getUsername(),
//							null, ud.getAuthorities());
//					
//				
//					SecurityContextHolder.getContext().setAuthentication(authentication);
//					
//				} catch (ExpiredJwtException e) {
//					chain.doFilter(request, response);
//				}catch (SignatureException e) {
//					System.out.println("Assinatura inválida!");
//					chain.doFilter(request, response);
//				}
//			}
			chain.doFilter(request, response);
		}

}
