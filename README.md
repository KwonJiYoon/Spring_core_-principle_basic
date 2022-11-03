# 스프링 핵심 원리 - 기본편


🟨 스프링 프레임워크

  ▫️ 핵심 기술 : 스프링 DI 컨테이너, AOP, 이벤트, 기타
  
  ▫️ 웹 기술 : 스프링 MVC, 스프링 WebFlux
  
  ▫️ 데이터 접근 기술 : 트랜잭션, JDBC, ORM 지원, XML 지원
  
  ▫️ 기술 통합 : 캐시, 이메일, 원격접근, 스케줄링
  
  ▫️ 테스트 : 스프링 기반 테스트 지원
  
  ▫️ 언어 : 코틀린, 그루비
  
  ▫️ 최근에는 스프링 부트를 통해서 스프링 프레임워크의 기술들을 편리하게 사용
  
  
<br>
  
🟨 스프링 부트

  ▫️ **스프링을 편리하게 사용할 수 있도록 지원, 최근에는 기본으로 사용**
  
  ▫️ 단독으로 실행할 수 있는 스프링 애플리케이션을 쉽게 생성
  
  ▫️ Tomcat 같은 웹 서버를 내장해서 별도의 웹 서버를 설치하지 않아도 됨
  
  ▫️ 손쉬운 빌드 구성을 위한 starter 종속성 제공
  
  ▫️ 스프링 3rd parth(외부) 라이브러리 자동 구성
  
  ▫️ 메트릭, 상태 확인, 외부 구성 같은 프로덕션 준비 기능 제공
  
  ▫️ 관례에 의한 간결한 설정
  
  <br>
  
  ‼️ 스프링의 진짜 핵심 ‼️
  
    👉🏻 스프링은 자바 언어 기반의 프레임워크
    
    👉🏻 자바 언어의 가장 큰 특징 - '객체 지향 언어'
    
    👉🏻 스프링은 객체 지향 언어가 가진 강력한 특징을 살려내는 프레임워크
    
    👉🏻 스프링은 좋은 객체 지향 애플리케이션을 개발할 수 있게 도와주는 프레임워크
    
    <br>
    
🟨 다형성의 본질

  ▫️ 인터페이스를 구현한 객체 인스턴스를 **실행 시점**에 **유연**하게 **변경**할 수 있다.
  
  ▫️ 다형성의 본질을 이해하려면 **협력**이라는 객체 사이의 관계에서 시작해야 한다.
  
  ▫️ **클라이언트를 변경하지 않고, 서버의 구현 기능을 유연하게 변경할 수 있다.**
  
  
  <br>

🟨 스프링과 객체 지향

  ▫️ 다형성이 가장 중요하다!
  
  ▫️ 스프링은 다형성을 극대화해서 이용할 수 있게 도와준다.
  
  ▫️ 스프링에서 이야기하는 제어의 역전(Ioc), 의존관계 주입(DI)은 다형을 활용해서 역할과 구현을 편리하게 다룰 수 있도록 지원한다.
  
  ▫️ 구현을 편리하게 변경할 수 있다.
  
  
<br>

❓ 스프링 이야기에 왜 객체 지향 이야기가 나오는가 ❓

  ▫️ **스프링은 다음 기술로 다형성 + OCP, DIP를 가능하게 지원**
  
    👉🏻 DI (Dependency Injection) : 의존관계, 의존성 주입
    
    👉🏻 DI 컨테이너 제공
    
  ▫️ **클라이언트 코드의 변경 없이 기능 확장**
  


<br>

🔥 **프로젝트 생성** 🔥

https://start.spring.io

👆🏻 위 사이트로 이동해서 스프링 프로젝트 생성

<br>

📄 프로젝트 선택

  ▫️ Project : Gradle Project
  
  ▫️ Spring Boot : 2.3x
  
  ▫️ Language : Java
  
  ▫️ Packaging : Jar
  
  ▫️ Java : 11
  
  <br>

📄 Project Metadata

  ▫️ groupId : hello
  
  ▫️ artifactId : core
  
 
 <br>
📄 Dependencies : 선택하지 않는다.


  
  
  
  
  
  
  

  
  
