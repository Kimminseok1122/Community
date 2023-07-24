package com.HmProject.Community.service.member;

import com.HmProject.Community.domain.member.Member;
import com.HmProject.Community.mapper.member.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public Member saveAndGetMember(Member member){
        memberMapper.saveMember(member);
        return memberMapper.selectMemberById(member.getId());
    }

    public void updateMember(Member member) {
        memberMapper.updateMember(member);
    }

    public void deleteMember(String id) {
        memberMapper.deleteMember(id);
    }

    public boolean checkDuplicateId(String id) {
        return memberMapper.checkDuplicateId(id);
    }

    public boolean checkDuplicateNickName(String nickName) {
        return memberMapper.checkDuplicateNickName(nickName);
    }

}
