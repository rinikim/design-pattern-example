# design-pattern-example

 🔆 Example list
 - adapter
 - proxy (+ aop)
 - singleton
 
 
 
 ### *추가 개념*
 - - -
  Atomic 변수
   - 원자성을 보장하는 변수
   - 멀티쓰레드 환경에서 동기화 문제를 synchronized 키워드를 사용하여 락을 거는데,
     해당 키워드 없이 동기화 문제를 해결하기 위해 고안된 방법이다.
   - 현재 쓰레드에 저장된 값과 메인 메모리에 저장된 값을 비교한다.
     -> 일치하는 경우 새로운 값으로 교체
     -> 일치하지 않는다면 실패 후 재시도
     
   cf1) 동기화 문제 해결방법 : synchronized, Atomic, volatile
   cf2) '동기화'란? 여러 개의 Thread가 한 개의 자원을 사용하고자 할 때, 해당 Thread를 제외하고 나머지는 접근을 못하도록 막는 것이다.
  

 ## *참고*
- 패스트캠퍼스 - 한번에 끝내는 Java/Srping 웹 개발 마스터 초격차 : 스프링 입문 - 이상욱
- Atomic : https://n1tjrgns.tistory.com/244
- 동기화 : https://link2me.tistory.com/1732
