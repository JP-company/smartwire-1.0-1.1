스마트 와이어 VER 1.0, 1.1
=====
실시간 기계 상태 알림 프로그램

프로젝트 소개
-----
- 제조 공장에 1년 간 일하면서 직접 다뤘던 기계의 문제점을 해결하고자 시작한 프로젝트 입니다.
- 모든 기계의 상태를 한 눈에 핸드폰으로 확인 할 수 있습니다.
- 기계가 멈추면, 혹은 상태가 바뀌면 핸드폰으로 알림을 보내줍니다.
- 이 때 추가로 TeamViewer, AnyDesk 등 무료 원격 제어 프로그램을 사용하여 기계를 다시 작동시킬 수도 있습니다.


### 개발 기간
- VER 1.0 : 2022.01 ~ 2023.03 (3개월)
- VER 1.1 : 2022.01 (1개월)

### 운영 기간
- VER 1.0 : 2022.03 ~ 2023.01 (11개월)
- VER 1.1 : 2023.02 ~ 2023.09 (8개월)

### 사용 기술
| 개발                | 기술                                                      |
|-------------------|---------------------------------------------------------|
| 백엔드 서버            | Firebase Functions (serverless)         |
| DB                | Firebase FireStore                                                   |
| 배포                | Firebase                                                  |
| 웹 프론트             | -                                |
| 윈도우 앱             | Python 3.6.2, Java 8                                             |
| 모바일 앱             | Flutter                                                 |
| Push Notification | FCM                                                     |



### 기능 목록
- 모바일 APP
  1. 회사 코드 입력
  2. 실시간 기계 상태 확인
  3. 기계 상태 변경 시 푸시 알림


- 윈도우 APP (와이어 기계)
  1. 시간 기계 상태, 기계 로그 감지 -> Firestore 로 전송



### 모바일 앱 화면

<img width="234" height="506" src="https://github.com/JP-company/smartwire-1.0-1.1/assets/77595494/2c245ddc-14a2-4c56-a90b-10ccea6e159c">
<img width="234" height="506" src="https://github.com/JP-company/smartwire-1.0-1.1/assets/77595494/9fe40634-37dc-4649-bcc8-0dd4678f2f13">


### 시연 영상

https://github.com/JP-company/smartwire/assets/77595494/ded56e60-393e-4eae-a09c-92d521559ef9


### 다른 버전
- VER 1.2 <br>
   https://github.com/JP-company/smartwire-1.2

- VER 2.0 <br>
   https://github.com/JP-company/smartwire-backend-2.0



### 윈도우 데스크탑 앱 화면 (와이어 기계)

<img src="https://github.com/JP-company/smartwire-1.0-1.1/assets/77595494/73550001-5966-48cd-be7e-e1d479253200">
