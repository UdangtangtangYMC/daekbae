:gift::truck:댁배(댁까지 배송) / daekbae
==========================================
<img src="https://img.shields.io/github/license/UdangtangtangYMC/daekbae"><br><br>
 :arrow_right: 통합 배송조회 서비스

## ● Members

신현호 @[hyeonho9877](https://github.com/hyeonho9877)<br>
우성민 @[wsm9175](https://github.com/wsm9175)<br>
이효중 @[gywnd2](https://github.com/gywnd2)
------------------------------------
## ● Problem 
 평범한 회사원 김덕배씨는 택배 조회 어플리케이션을 개발하려 한다.<br>
덕배씨는 택배회사에 관련없이 고객이 주문한 모든 상품에 대해 배송 조회 및 추적이 가능한 서비스를 목표로 하였다.

## ● Requirements
1. 구글, 카카오톡과 같은 소셜 로그인을 통해 고객은 자신을 인증할 수 있다.
2. 조회 페이지에서 자신이 과거에 등록한 택배에 대한 조회 및 추적이 가능하다.
3. 화면 우측 하단의 + 버튼을 통해 추가로 관리하고 싶은 택배를 등록 할 수 있다.
4. 좌측에는 네비게이션 바가 위치하며, 이를 터치하면<br>
 로그아웃 및 기타 기능을 이용할 수 있는 링크가 나타난다.
5. 조회 화면에는 여러개의 택배가 표시된다.
6. 각 아이템에는 상품이름과 주문날짜 및 현재 배송상태가 나타나야 한다.
7. 해당 아이템을 터치하면 구매 사이트, 주문 수량, 가격 등의 추가 상세한 내용이 표시된다.
8. 각 아이템들은 배송 상태가 변경되면 해당 변경 사항을 고객이 인지할 수 있도록 자동으로 푸시 알림 고객의 스마트폰으로 전송할 수 있어야 한다.

## ● Dividing work
고객 (db)
 - 아이디 (key)
 - 비밀번호
 - 이름

아이템 (db)
 - 송장 번호 (key)
 - 아이디
 - 상품 이름
 - 주문 날짜
 - 배송상태
 - 구매 사이트
 - 주문 수량
 - 가격


회원가입, 로그인, 로그아웃<br>
조회, 상세 조회<br>
추가, 삭제 (설정 가능 -> 기간)<br>
푸시 알림
