package demo.service;

import demo.Video;

import java.util.List;

public interface Streaming {

	List<Video> provideVideo();

	void playVideo();
}
