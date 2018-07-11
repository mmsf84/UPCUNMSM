package com.upg.upc.unmsm.comon.infraestructure.security;

import java.util.Base64;
import java.util.Date;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.upg.upc.unmsm.user.dto.UserAuthDto;
import com.upg.upc.unmsm.user.dto.UserClaimDto;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenProvider {
	@Value("${security.jwt.token.secret-key}")
	private String secretKey;

	@Value("${security.jwt.token.expires-minutes}")
	private long minutesToExpiration;

	@PostConstruct
	protected void init() {
		secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
	}
	
	public String buildJwtToken(UserAuthDto userAuthDto) {
		Date now = new Date();
		Date validity = new Date(now.getTime() + (minutesToExpiration * 60 * 1000));
		JwtBuilder jwtBuilder = Jwts.builder();
		jwtBuilder
			.setSubject(userAuthDto.getName())
			.setId(UUID.randomUUID().toString())
			.claim("isAuthenticated", userAuthDto.isAuthenticated());
		for (UserClaimDto userClaimDto : userAuthDto.getClaims()) {
			jwtBuilder.claim(userClaimDto.getType(), userClaimDto.getValue());
		}
		return jwtBuilder
				.setIssuedAt(now)
				.setExpiration(validity)
				.signWith(SignatureAlgorithm.HS256, this.secretKey)
				.compact();
	}	
	
	
	
}
