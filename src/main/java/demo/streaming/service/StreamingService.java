package demo.streaming.service;

import demo.streaming.entity.Video;

import java.util.List;

public interface StreamingService extends GradeSupportable {
	List<Video> provideVideo();

	void playVideo(Video video);
}
