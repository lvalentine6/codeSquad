cs13
--------------

* URI
  * URI (Uniform Resource Identifier)
    * URI는 로케이터, 이름, 또는 둘 다 추가로 분류될 수 있다.
    * 리소스를 식별하는 식별하는 통일된 방식
    * URI는 URL과 URN을 모두 포함하는 상위 개념
  * URL (Uniform Resource Identifier), URN (Uniform Resource Name)
    * URL - Locator : 리소스가 있는 위치를 지정
    * URN - Name : 리소스에 이름을 부여
    * URN 이름만으로 실제 리소스를 찾을 수 있는 방법이 보편화 되지 않음
  * URL 구조
    * scheme://[userinfo@]host[:port][/path][?query][#fragment]
    * scheme : 주로 프로토콜에 사용한다. (http, https, ftp)
      * http는 80, https는 443을 주로 사용하며 생략이 가능하다.
    * userinfo : URL에 사용자 정보를 포함해서 인증하지만 거의 사용하지 않는다.
    * host : 도메인명이나 IP주소를 사용할 수 있다.
    * port : 접속 포트이며 생략 가능하다.
    * path : 리소스의 계층적 구조를 나타낸다. (item/iphone13)
    * query : key : value의 형태로 ?로 시작하고 & 이용하여 파라미터를 추가 가능하다.
    * fragment : html 내부 북마크 등에 사용하며 서버에 전송하는 정보가 아니다.
* 웹 브라우저 요청 흐름
  * DNS 조회 -> 브라우저가 HTTP 요청 메시지 생성 -> SOCKET 라이브러리를 통해 전달 -> TCP/IP 패킷 생성 HTTP 메시지 포함 -> 서버 수신
  -> 서버에서 HTTP 응답 메시지 생성 -> 클라이언트 수신 -> 브라우저 해석 -> 랜더링
* 모든것이 HTTP
  * HTML, TEXT, 이미지, 음성, 영상 파일, JSON, XML, 거의 모든 형태의 데이터 전송 가능
  * 서버간 데이터를 주고 받을때도 HTTP를 사용한다.
  * HTTP 1.1을 가장 많이 사용하며 HTTP2는 성능 개선, HTTP3은 UDP 사용하며 성능 개선
  * TCP : HTTP/1.1, HTTP/2
  * UDP : HTTP/3
  * HTTP 특징
    * 클라이언트 - 서버 구조
      * 클라이언트는 서버에 요청을 보내고 응답을 기다린다.
    * 무상태 프로토콜(stateless), 비연결성
      * 서버가 클라이언트 상태를 유지하지 않음
      * stateful - stateless 차이 : 노트북 구매 예시
      * stateful : 중간에 다른 점원으로 바뀌면 안된다. (다른 점원으로 바뀐다면 상태 정보를 미리 알려줘야 함)
      * stateless : 중간에 다른 점원으로 바뀌어도 되기에 갑자기 클라이언트 요청이 증가해도 서버를 대거 투입할 수 있다.
      * 응답 서버를 쉽게 바꿀수 있어 무한한 서버 증설이 가능하다.
      * 서버에게 필요한 정보를 전부 담아서 요청해야 함
      * stateless 실무 한계
        * 모든것을 무상태로 설계하기는 힘들다.
        * 로그인한 사용자가 로그인 했다는 상태를 서버에 유지해야 할때
        * 일반적으로 브라우저의 쿠기와 서버 세션을 사용해서 상태 유지
        * 상태 유지는 최소한만 사용
      * 비연결성
        * 연결을 유지하지 않는다면 최소한의 자원만을 사용해 효율적이다.
        * HTTP는 기본적으로 연결을 유지하지 않는다.
        * 비연결성의 단점
          * TCP/IP 연결을 새로 맺어야 함 -> 3 way handshake 시간 추가
          * HTML + CSS + JS등 수많은 자원이 함께 다운로드 되기 때문에 효율적이지 않음
          * HTTP 지속 연결 : 필요한 리소스를 전부 받기 전까지는 연결 유지
    * HTTP 메시지
    * ![http 구조](C:\Users\USER\Desktop\http구조.png)
    * 단순하며 확장 가능
