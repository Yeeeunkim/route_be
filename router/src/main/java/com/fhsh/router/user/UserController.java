package com.fhsh.router.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * UserController.java
 *
 * <pre>
 * 회원 정보 컨트롤러
 * 앞으로 작성할 java 파일은 이 페이지의 java docs 컨벤션 예제를 참고하여 작성해주세요.
 * </pre>
 * @Author : duoh
 *
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 메소드 설명글을 맨 처음에 작성합니다.
     * java docs 주석은 바로 다음에 오는 내용을 대상으로 하기 때문에 메소드 내부에 작성하면 안됩니다.
     * 설명글은 간결하게 작성합니다. 가능한 두 줄을 넘지 않도록 작성합니다.
     * @param
     * @return
     * @throws
     */
    @GetMapping("/getUserCount")
    public int getUserCount() {
        return userService.getUserCount();
    }

    @GetMapping("/test")
    public String test() {
        return "Hi";
    }
}
