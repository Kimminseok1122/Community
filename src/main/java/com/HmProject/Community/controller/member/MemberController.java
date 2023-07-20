package com.HmProject.Community.controller.member;

import com.HmProject.Community.domain.member.Member;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MemberController {

    @GetMapping("/saveMember")
    public String saveForm(Model model){
        model.addAttribute("member", new Member());
        return "member/saveMember";
    }

}
