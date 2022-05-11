package demo.service.provider;

import demo.Grade;
import demo.Member;
import demo.Video;
import demo.service.StandardStreaming;

import java.util.Arrays;
import java.util.List;

public class StandardStreamingService implements StandardStreaming {

	@Override
	public Member upGradeMember(Member member) {
		member.setGrade(Grade.PREMIUM);
		System.out.println(Grade.PREMIUM + "으로 upgrade 되었습니다.");
		return member;
	}

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
