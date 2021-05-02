# design-pattern-example

 🔆 Example list
 - adapter
 - proxy (+ aop)
 - singleton
 
 
 
 ### *| 추가 개념*
 - - -
  ** Atomic 변수
   - 원자성을 보장하는 변수
   - 멀티쓰레드 환경에서 동기화 문제를 synchronized 키워드를 사용하여 락을 거는데,
     해당 키워드 없이 동기화 문제를 해결하기 위해 고안된 방법이다.
   - 현재 쓰레드에 저장된 값과 메인 메모리에 저장된 값을 비교한다.
     -> 일치하는 경우 새로운 값으로 교체
     -> 일치하지 않는다면 실패 후 재시도
     
   cf1) 동기화 문제 해결방법 : synchronized, Atomic, volatile <br>
   cf2) '동기화'란? 여러 개의 Thread가 한 개의 자원을 사용하고자 할 때, 해당 Thread를 제외하고 나머지는 접근을 못하도록 막는 것이다.
  
  ** Aop (Aspect Oriented Programming) : 관점 지향 프로그래밍
  - aop는 proxy를 활용하고 있으며 특정한 기능의 앞뒤로 내가 원하는 기능 혹은 앞뒤로의 Argument(전달 인자) 조작이 가능하며,
    흩어져있는 공통된 기능들을 하나로 묶어줄 수 있다.<br>
    
   ex1 ) httpClient, restClient 흩어져있거나 뭉쳐있을 경우 거기 안에 있는 메소드들의 시간을 체크한다. <br>
   ex2 ) 데이터베이스에 있는 트랜잭션 등 오래걸리는 부분의 시간을 체크하여 서버의 어느 쪽이 느린상태인지 확인한다.

 ## *참고*
- 패스트캠퍼스 - 한번에 끝내는 Java/Srping 웹 개발 마스터 초격차 : 스프링 입문 - 이상욱
- Atomic : https://n1tjrgns.tistory.com/244
- 동기화 : https://link2me.tistory.com/1732
