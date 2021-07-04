package com.fhsh.router.user;

import com.fhsh.router.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int getUserCount() {
        int result = userMapper.getUserCount();
        return result;
    }
}
