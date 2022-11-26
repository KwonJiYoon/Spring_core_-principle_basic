## 2022.11.26 (토) - @ComponentScan

**🟨 @ComponentScan**
<br>
<br>
`@ComponentScan`은 `@Component`가 붙은 모든 클래스를 스프링 빈으로 등록한다.
<br>
<br>
이때 스프링 빈의 기본 이름은 클래스명을 사용하되, 맨 앞 글자만 소문자를 사용한다.<br>
**▫️ 빈 이름 기본 전략 :** MemberServiceImpl 클래스 -> memberServiceImpll<br>
**▫️ 빈 이름 직접 지정 :** 만약 스프링 빈의 이름을 직접 지정하고 싶으면 `@Component("memberService2)`처럼
이름을 부여하면 된다.



   


         
