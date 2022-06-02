package demo.streaming.enm;

import demo.exception.MaximumGradeException;
import demo.streaming.service.GradeSupportable;

import java.util.Arrays;

public enum Grade {
	STANDARD,
	PREMIUM;
	
	public Grade nextGrade() {
		return Arrays.stream(Grade.values())
				.filter(grade -> grade.ordinal() > ordinal())
				.findFirst()
				.orElseThrow(() -> new MaximumGradeException(name()));
	}
}
