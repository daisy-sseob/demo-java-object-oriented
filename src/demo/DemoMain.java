package demo;

import demo.streaming.enm.Grade;
import demo.member.entity.Member;
import demo.streaming.service.StreamingClient;

public class DemoMain {

	public static void main(String[] args) {

		Member premiumMember = new Member(1L, "프리미엄 회원", Grade.PREMIUM, 29);
		Member standardMember = new Member(2L, "스탠다드 회원", Grade.STANDARD, 19);
		
		StreamingClient streamingClient = new StreamingClient();
	}
}
