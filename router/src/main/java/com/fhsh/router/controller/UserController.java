package com.fhsh.router.controller;

import com.fhsh.router.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * UserController.java
 *
 * <pre>
 * 회원 관련 처리
 * </pre>
 *
 * @Author : duoh
 */
@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 회원수 조회
     * @return
     */
    @GetMapping("/getUserCount")
    public int getUserCount() {
        return userService.getUserCount();
    }

    /**
     * 회원 추가
     * @param params
     * @return
     */
    @PostMapping("/insertUser")
    public boolean insertUser(@RequestBody Map<String,String> params) {
        params.put("encodedPwd",  passwordEncoder.encode(params.get("pwd")));
        return userService.insertUser(params) > 0;
    }

    /**
     * 비밀번호 업데이트
     * @param params
     * @return
     */
    @PostMapping("/updatePwd")
    public boolean updatePwd(@RequestBody Map<String,String> params) {
        params.put("encodedPwd",  passwordEncoder.encode(params.get("pwd")));
        return userService.updatePwd(params) > 0;
    }

    /**
     * 회원 삭제
     * @param userNo
     * @return
     */
    @GetMapping("/deleteUser/{userNo}")
    public boolean deleteUser(@PathVariable int userNo) {
        return userService.deleteUser(userNo) > 0;
    }
}