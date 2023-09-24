package tn.esprit.spring.security;

import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class JwtAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public boolean supports(Class<?> authentication) {
        return false;// JwtAuthenticationToken.class.isAssignableFrom(authentication);
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {
    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {
//        JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) authentication;
//        String token = jwtAuthenticationToken.getToken();

//        Claims claims = jwtTokenUtil.getAllClaimsFromToken(token);
//        String subject = claims.getSubject();
//        List<String> roles = claims.get("roles", List.class);

//        List<GrantedAuthority> authorities = roles.stream().map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());

        return null;//new User(subject, "", authorities);
    }
}

