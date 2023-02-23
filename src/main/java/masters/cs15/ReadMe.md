cs15
----------------------

### PC방 관리자

#### 데이터베이스 설정

* pc방 데이터 베이스 생성(UTF8 인코딩 적용)
```mysql
    CREATE DATABASE pc_room default CHARACTER SET UTF8; 
```
* 관리자 계정 생성 및 비밀번호 설정
```mysql
    CREATE USER 'pc_room_manager'@'%' IDENTIFIED BY '1234';
```
* 계정 외부 접속 권한 허용
```mysql
    GRANT ALL PRIVILEGES ON *.* TO 'pc_room_manager'@'%';
```
* 계정 권한 적용
```mysql
    FLUSH PRIVILEGES;
```
* 테이블 생성
  * seq INT NOT NULL AUTO_INCREMENT (좌석번호)
  * pc_start_time TIME(20) NOT NULL (pc 시작시간)
  * pc_end_time TIME(20) (pc 종료시간)
  * user_index INT NOT NULL (유저 번호)

```mysql
CREATE TABLE pc_table ( 
    seq INT NOT NULL AUTO_INCREMENT, 
    pc_start_time TIME NOT NULL, 
    pc_end_time TIME, 
    user_index INT NOT NULL, 
    PRIMARY KEY(seq) );
```

* 테이블 구조 확인
```mysql
DESC member_table;
+---------------+---------+------+-----+---------+----------------+
| Field         | Type    | Null | Key | Default | Extra          |
+---------------+---------+------+-----+---------+----------------+
| seq           | int(11) | NO   | PRI | NULL    | auto_increment |
| pc_start_time | time    | NO   |     | NULL    |                |
| pc_end_time   | time    | YES  |     | NULL    |                |
| user_index       | int(11) | NO   |     | NULL    |                |
+---------------+---------+------+-----+---------+----------------+
```

* JDBC 드라이버 추가
  * [JDBC Platform Independent 선택](https://dev.mysql.com/downloads/connector/j/)
  * 인텔리제이 프로젝트 구조 -> 라이브러리 선택 후 모듈 적용

* 유저 번호는 List에서 뽑아서 쿼리로 전달한다.
* new 키워드가 입력되면 List에서 유저 한명을 랜덤으로 선택하고 update 쿼리 전송
* stop 키워드가 입력되면 user_index를 0으로 변경하고 종료시간을 입력하는 update 쿼리 전송 후 List에 다시 추가
* 마지막에 rs.close, con.close 해주기
