package demo.streaming.service;

import demo.streaming.enm.Grade;
import demo.member.entity.Member;
import demo.streaming.entity.Video;

import java.util.List;

public class StreamingClient {

	public List<Video> provideVideoByGrade(Member member) {
		final Streaming streamingObject = member.getGrade().getStreamingObject();
		return streamingObject.provideVideo();
	}
	
	public List<Video> provideVideoByGrade2(Member member) {
		if (member.getGrade() == Grade.STANDARD) {
			return this.provideVideo(new StandardStreamingService());
		} else {
			return this.provideVideo(new PremiumStreamingService());
		}
	}
	
	private List<Video> provideVideo(Streaming streaming) {
		return streaming.provideVideo();
	}
}
