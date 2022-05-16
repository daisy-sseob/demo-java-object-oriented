package demo.streaming.enm;

import demo.streaming.service.PremiumStreamingService;
import demo.streaming.service.StandardStreamingService;
import demo.streaming.service.Streaming;

import java.util.function.Supplier;

public enum Grade {
	STANDARD(StandardStreamingService::new),
	PREMIUM(PremiumStreamingService::new);

	private Supplier<Streaming> supplier;
	
	Grade(Supplier<Streaming> supplier) {
		this.supplier = supplier;
	}

	public Streaming getStreamingObject() {
		return supplier.get();
	}
}
