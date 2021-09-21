package com.fhsh.router.domain;

import lombok.*;

@Data
public class User {
    private int userNo;
    private String email;
    private String nickname;
    private String pwd;
    private String createDate;
    private String updateDate;
    private String userCode;
    private String wgCode;
    private int userYn;
    private String mainSearch;
    private String socialType;
    private String token;
}
