package demo.streaming.controller;

import demo.streaming.enm.Grade;
import demo.streaming.entity.Video;
import demo.streaming.service.Streaming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StreamingController {

	private final List<Streaming> streamings;

	@Autowired
	public StreamingController(List<Streaming> streamings) {
		this.streamings = streamings;
	}


	@GetMapping("/video")
	public List<Video> video(@RequestParam Grade grade) {
//		if (grade == Grade.PREMIUM) {
//			return premiumStreamingService.provideVideo();
//		}
		return null;
	}
}
