package demo.streaming.service;

import demo.streaming.entity.Video;

import java.util.Arrays;
import java.util.List;

public class StandardStreamingService implements Streaming {

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
}
