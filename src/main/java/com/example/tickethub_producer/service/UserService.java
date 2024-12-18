package com.example.tickethub_producer.service;

import com.example.tickethub_producer.dto.request.user.LoginRequestDto;
import com.example.tickethub_producer.dto.request.user.SignUpRequestDto;

public interface UserService {
    AuthTokens login(LoginRequestDto loginRequestDto);
    long signUp(SignUpRequestDto signUpRequestDto);
}
