# aws 둘째 배포

### SpringBoot 3.4.x JDK 17
 - SpringWeb
 - DevTools
 - LomBok

### 배포위치 EC2


### 배포 방법
- 로컬에서 github 업로드
- EC2에서 github 다운로드
- 프로젝트 테스트
- 프로젝트 빌드
- nohub 으로 백그라운드 실행
- 오류 로그 남기기 (표준 입출력 리다이렉션)
- 서버가 종료되면 cron으로 자동 재시작
- 
### 배포 방법
- 개발환경(집컴퓨터)에서 github 업로드
- var.sh check-and-restart.sh deploy.sh 3개 파일 deploy.tar로 압축되어 있음(실행권한 이미 부여됨).
- EC2의 /home/ubuntu 경로로 전송
- tar -xvf deploy.tar
- 프로덕션(EC2)에서 deploy.sh 파일 실행


### 재배포 방법
- 개발환경(집컴퓨터)에서 github 업로드
- 프로덕션(EC2)에서 deploy.sh 파일 실행