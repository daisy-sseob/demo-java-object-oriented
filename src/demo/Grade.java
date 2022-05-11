package demo;

import demo.service.PremiumStreamingService;
import demo.service.StandardStreamingService;
import demo.service.Streaming;

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
