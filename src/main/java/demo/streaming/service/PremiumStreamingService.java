package demo.streaming.service;

import demo.streaming.entity.Video;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PremiumStreamingService implements Streaming {

	@Override
	public List<Video> provideVideo() {
		return Arrays.asList(new Video("우리들의 블루스", "심현섭"), new Video("DP", "sseob"), new Video("사랑의 불시착", "현빈"));
	}

	@Override
	public void playVideo(Video video) {
		System.out.println("영상 재생");
		System.out.println("video.getTitle() = " + video.getTitle());
		System.out.println("video.getDirector() = " + video.getDirector());
	}
}
