package com.cos.blog.controller;

import com.cos.blog.config.auth.PrincipalDetail;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping({"","/"})
    public String index(@AuthenticationPrincipal PrincipalDetail principal){ //컨트롤러에서 세션을 어떻게 찾음?
        System.out.println("로그인 사용자 아이디:"+principal.getUsername());
        return "index";
    }
}