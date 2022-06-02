package demo.streaming.service;

import demo.exception.NotGradeSupportException;
import demo.streaming.enm.Grade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamingServiceLocator {

	private final List<StreamingService> streamingServices;

	public StreamingServiceLocator(List<StreamingService> streamingServices) {
		this.streamingServices = streamingServices;
	}

	public StreamingService resolve(Grade grade) {
		return streamingServices.stream()
				.filter(streamingService -> streamingService.isSupport(grade))
				.findAny()
				.orElseThrow(() -> new NotGradeSupportException(grade.name()));
	}
}
