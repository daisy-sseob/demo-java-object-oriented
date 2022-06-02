package demo.member.entity;

import demo.exception.MaximumGradeException;
import demo.streaming.enm.Grade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MemberServiceTest {

	@DisplayName("등급을 Premium 등급으로 업그레이드 테스트")
	@Test
	public void memberGradeUpgradeTest() {

		final Member member = Member.builder()
				.grade(Grade.STANDARD)
				.id(1L)
				.username("심현섭")
				.build();

		assertEquals(Grade.PREMIUM, member.getGrade().nextGrade());
	}
	
	@DisplayName("프리미엄 등급을 업그레이드시 MaximumGradeException 발생 테스트")
	@Test
	public void memberGradeUpgradeExceptionTest() {

		final Member member = Member.builder()
				.grade(Grade.PREMIUM)
				.id(1L)
				.username("심현섭")
				.build();
		
		assertThrows(MaximumGradeException.class, () -> member.getGrade().nextGrade());
	}
}