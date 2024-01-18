package timeFunctions;

import java.time.Duration;
import java.time.LocalDateTime;

public class ProcessingTime {
	
	private static LocalDateTime firstStartDateTime = null;
	private static LocalDateTime startDateTime = null;
	
	private static long processingTime = 0;
	private static long actualProcessingTime = 0;
	
	private static long wholeProcessingTime = 0;
	
	public static void calculateTime(String logKey) {
		
		// 가공 시작
		if (logKey == "start" || logKey == "작업 재시작" || logKey == "가공감지") {
			startDateTime = getTime();
			
			// 처음 시작
			if (logKey == "start") {
				firstStartDateTime = startDateTime;
				actualProcessingTime = 0;
			}
			
		} else if (startDateTime != null && firstStartDateTime != null) { // 가공 멈춤
			Duration duration = Duration.between(startDateTime, getTime());
			processingTime = duration.getSeconds();
			actualProcessingTime += processingTime;
			startDateTime = null;
		}
		
		// 작업 끝
		if (firstStartDateTime != null && (logKey == "Reset" || logKey == "작업 끝")) {
			Duration duration = Duration.between(firstStartDateTime, getTime());
			wholeProcessingTime = duration.getSeconds();
			firstStartDateTime = null;
		}
		
	}
	

	
	public static String getWholeProcessingTime() { // 전체 걸린 시간
		return String.valueOf(wholeProcessingTime);
	}
	
	public static String getActualProcessingTime() { // 각 가공 시간
		return String.valueOf(actualProcessingTime);
	}
	
	
	
	private static LocalDateTime getTime() {
		return LocalDateTime.of(CurrentTime.getTimeInt("year"), CurrentTime.getTimeInt("month"), CurrentTime.getTimeInt("day"),
				CurrentTime.getTimeInt("hour"), CurrentTime.getTimeInt("min"), CurrentTime.getTimeInt("sec"));
	}
}
