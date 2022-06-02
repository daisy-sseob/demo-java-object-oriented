package demo.streaming.service;

import demo.streaming.enm.Grade;
import demo.streaming.entity.Video;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StandardStreamingService implements StreamingService {
	
	private static final Grade GRADE_STRATEGY = Grade.STANDARD;

	@Override
	public List<Video> provideVideo() {
		return Arrays.asList(new Video("DP", "sseob"));
	}

	@Override
	public void playVideo(Video video) {
		System.out.println("영상 재생");
		System.out.println("video.getTitle() = " + video.getTitle());
		System.out.println("video.getDirector() = " + video.getDirector());
	}

	@Override
	public boolean isSupport(Grade grade) {
		return GRADE_STRATEGY == grade;
	}
}
