package br.com.Vainaweb.escolat1.token;




import java.io.IOException;
import java.net.http.HttpResponse;
import java.rmi.AccessException;
import java.security.DigestException;
import java.text.ParseException;

import javax.imageio.spi.ServiceRegistry.Filter;

import org.bouncycastle.asn1.ASN1Exception;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class SecurityFilter<HttpServletRequest, HttpServletResponse> extends OncePerRequestFilter {

    @SuppressWarnings({ "unchecked", "rawtypes" })
	protected <AbstractMultipartHttpServletRequest> void doFilterInternal(AbstractMultipartHttpServletRequest request, @SuppressWarnings("rawtypes") HttpResponse response, FilterChain filterChain)
            throws AccessException, IOException, DigestException {
       
        String token = ((Object) request).getHeader("Authorization");

        if (token == null || !validateAuthToken(token)) {
            // Token
            ((HttpServletResponse) response).setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }

      
        filterChain.doFilter(request, (HttpResponse) response);
    }

    private boolean validateAuthToken(String token) {
        
        return true;
    }

	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, Filter filterChain)
			throws ParseException, IOException {
		// TODO Auto-generated method stub
		
	}
}