package com.HmProject.Community.mapper.member;

import com.HmProject.Community.domain.member.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    public void saveMember(Member member);

    public Member selectMemberById(String id);

    public void updateMember(Member member);

    public void deleteMember(String id);

    public boolean checkDuplicateId(String id);

    public boolean checkDuplicateNickName(String nickName);

}
