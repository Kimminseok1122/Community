package com.HmProject.Community.common.jwt;

import com.HmProject.Community.domain.member.Member;
import io.jsonwebtoken.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class JwtTokenProvider {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.token-validity-in-seconds}")
    private int jwtExpirationInMs;

    public String generateToken(Authentication authentication){
        Member member = (Member) authentication.getPrincipal();

        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

        return Jwts.builder()
                .setSubject(member.getId())
                .setIssuedAt(new Date())
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS256,jwtSecret)
                .compact();
    }

    public String getIdFromJWT(String token){
        Claims claims = Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJwt(token)
                .getBody();
        return claims.getSubject();
    }

    public boolean validateToken(String authToken){
        try{
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJwt(authToken);
            return true;
        } catch  (SignatureException ex) {
            log.info("token 오류 - {}", ex);
        } catch (MalformedJwtException ex) {
            log.info("token 오류 - {}", ex);
        }catch (ExpiredJwtException ex) {
            log.info("token 오류 - {}", ex);
        }catch (UnsupportedJwtException ex) {
            log.info("token 오류 - {}", ex);
        }catch (IllegalArgumentException ex) {
            log.info("token 오류 - {}", ex);
        }
        return false;
    }

}
