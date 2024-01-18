package autoStart;

import java.awt.*;
import java.awt.event.InputEvent;

import firebase.FirebaseUpload;
import timeFunctions.TimeSleep;
import timeFunctions.TimeZone;

public class AutoStart {
	
	private static int count = 0;
	
	public static void verifyLog(String logKey) {
		if (TimeZone.getRemoteTime() && (logKey == "Wire Contact Auto Stop" || logKey == "작업중 30sec 접촉 정지") && count < 6) {
			try {
				TimeSleep.sleep(2);
				Robot rb = new Robot();
				rb.mouseMove(550, 705);
				rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				
				FirebaseUpload.autoStartDataUpload(logKey);
				count++;
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("[자동 재실행 프로그램] 마우스 클릭에 실패했습니다.");
			}
		} else if ((logKey != "Wire Contact Auto Stop" && logKey != "작업중 30sec 접촉 정지" && logKey != "작업 재시작") || !TimeZone.getRemoteTime()) {
			count = 0;
		}
		
		
		
	}
}
