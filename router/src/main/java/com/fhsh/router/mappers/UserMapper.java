package com.fhsh.router.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
//Mapper 애노테이션이 붙으면 마이바티스는 Mapper.xml에서 메서드 이름과 일치하는 쿼리를 실행
public interface UserMapper {

    public int getUserCount();

    public int insertUser(Map<String, String> params);

    public int updatePwd(Map<String, String> params);

    public int deleteUser(int userNo);
}