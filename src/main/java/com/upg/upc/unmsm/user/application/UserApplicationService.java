package com.upg.upc.unmsm.user.application;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.upg.upc.unmsm.comon.infraestructure.security.JwtTokenProvider;
import com.upg.upc.unmsm.user.domain.repository.UserClaimRepository;
import com.upg.upc.unmsm.user.domain.repository.UserRepository;

@Service
public class UserApplicationService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserClaimRepository userClaimRepository;
	
	@Autowired
	private ModelMapper mapper;

	@Autowired
	private JwtTokenProvider jwtTokenProvider;
	
	@Value("${maxPageSize}")
	private int maxPageSize;
	
	
	
	
	
	
	
}
