package demo.member.entity;

import demo.streaming.enm.Grade;
import lombok.*;

@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Member {

	private Long id;
	private String username;
	private Grade grade;
	private int age;
}
