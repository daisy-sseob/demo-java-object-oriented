package demo.streaming.service;

import demo.streaming.enm.Grade;
import demo.streaming.entity.Video;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StreamingServiceTest {

	@Autowired
	StreamingServiceLocator streamingServiceLocator;

	@DisplayName("프리미엄 등급을 처리하는 스트리밍 Service 객체를 제공 받아 처리하는 것을 테스트")
	@Test
	public void premiumGradeStreamingTest() {
		final List<Video> videos = streamingServiceLocator.resolve(Grade.PREMIUM).provideVideo();
		assertEquals(3, videos.size());
	}
	
	@DisplayName("스탠다드 등급을 처리하는 스트리밍 Service 객체를 제공 받아 처리하는 것을 테스트")
	@Test
	public void standardGradeStreamingTest() {
		final List<Video> videos = streamingServiceLocator.resolve(Grade.STANDARD).provideVideo();
		assertEquals(1, videos.size());
	}
}
