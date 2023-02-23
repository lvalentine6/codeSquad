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
* 외부 접속 권한 허용
```mysql
    GRANT ALL PRIVILEGES ON *.* TO 'pc_room_manager'@'%';
```
* 권한 적용
```mysql
    FLUSH PRIVILEGES;
```
* 테이블 생성
  * seq INT NOT NULL AUTO_INCREMENT (사용자 키 값)
  * pc_start_time TIME(20) NOT NULL (pc 시작시간)
  * pc_end_time TIME(20) (pc 종료시간)
  * pc_seat INT NOT NULL (좌석 번호)

```mysql
CREATE TABLE member_table ( 
    seq INT NOT NULL AUTO_INCREMENT, 
    pc_start_time TIME NOT NULL, 
    pc_end_time TIME, 
    pc_seat INT NOT NULL, 
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
| pc_seat       | int(11) | NO   |     | NULL    |                |
+---------------+---------+------+-----+---------+----------------+
```

