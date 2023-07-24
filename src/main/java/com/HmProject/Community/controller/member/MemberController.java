package com.HmProject.Community.controller.member;

import com.HmProject.Community.domain.member.DuplicateResult;
import com.HmProject.Community.domain.member.Member;
import com.HmProject.Community.service.member.MemberService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/saveMember")
    public String saveForm(Model model){
        model.addAttribute("member", new Member());
        return "member/saveMember";
    }

    @PostMapping("/saveMember")
    public String saveMember(Member member) {
        Member getMember = memberService.saveAndGetMember(member);
        if (getMember != null && member.getId().equals(getMember.getId())) {
            return "login";
        }
        return "member/saveMember";
    }

    @GetMapping("/checkDuplicateId")
    @ResponseBody
    public DuplicateResult checkDuplicateId(@RequestBody String id){
        boolean result = memberService.checkDuplicateId(id);
        if(result){
            return new DuplicateResult("duplicate");
        } else {
            return new DuplicateResult("nonDuplicate");
        }
    }

    @GetMapping("/checkDuplicateNickName")
    @ResponseBody
    public DuplicateResult checkDuplicateNickName(@RequestBody String nickName){
        boolean result = memberService.checkDuplicateId(nickName);
        if(result){
            return new DuplicateResult("duplicate");
        } else {
            return new DuplicateResult("nonDuplicate");
        }
    }
}
