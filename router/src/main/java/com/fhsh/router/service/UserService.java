package com.fhsh.router.service;

import com.fhsh.router.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 회원수 조회
     * @return
     */
    public int getUserCount() {
        return userMapper.getUserCount();
    }

    /**
     * 회원 추가
     * @param params
     * @return
     */
    public int insertUser(Map<String, String> params) {
        return userMapper.insertUser(params);
    }

    /**
     * 비밀번호 업데이트
     * @param params
     * @return
     */
    public int updatePwd(Map<String, String> params) {
        return userMapper.updatePwd(params);
    }

    /**
     * 회원 삭제
     * @param userNo
     * @return
     */
    public int deleteUser(int userNo) {
        return userMapper.deleteUser(userNo);
    }
}
