package demo.member.service;

import demo.member.entity.Member;
import demo.streaming.enm.Grade;

public class MemberClient {
	
	public Member upGradeMember(Member member) {
		member.setGrade(Grade.PREMIUM);
		System.out.println(Grade.PREMIUM + "으로 upgrade 되었습니다.");
		return member;
	}
}
