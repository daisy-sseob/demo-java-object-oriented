package demo;

import demo.service.provider.PremiumStreamingService;
import demo.service.provider.StandardStreamingService;
import demo.service.Streaming;

import java.util.List;

public class DemoMain {

	public static void main(String[] args) {

		final DemoMain demoMain = new DemoMain();

		Member premiumMember = new Member(1L, "프리미엄 회원", Grade.PREMIUM, 29);
		Member standardMember = new Member(2L, "스탠다드 회원", Grade.STANDARD, 19);
		
		System.out.println("================= case 1 =================");
		demoMain.provideVideoByGrade(premiumMember)
				.forEach(System.out::println);
		
		System.out.println("\n================= grade 구분선 =================\n");
		
		demoMain.provideVideoByGrade(standardMember)
				.forEach(System.out::println);
		
		System.out.println("\n================= case 2 =================");
		demoMain.provideVideoByGrade2(premiumMember)
				.forEach(System.out::println);
		
		System.out.println("\n================= grade 구분선 =================\n");
		
		demoMain.provideVideoByGrade2(standardMember)
				.forEach(System.out::println);
		System.out.println("================= case 2 =================");
	}
	
	private List<Video> provideVideoByGrade(Member member) {
		final Streaming streamingObject = member.getGrade().getStreamingObject();
		return streamingObject.provideVideo();
	}
	
	private List<Video> provideVideoByGrade2(Member member) {
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
