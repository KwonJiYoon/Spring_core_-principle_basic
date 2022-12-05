## 2022.12.05 (목) - @Autowired 필드명, @Qualifier, @Primary

**🟨 조회 대상 빈이 2개 이상일 때 해결 방법**
<br>
<br>
▫️️ @Autowired 필드 명 매칭<br>
▫️️ @Qualifier -> @Qulifier끼리 매칭 -> 빈 이름 매칭<br>
▫️️ @Primary 사용<br>

<br><br>
**🟨 @Autowired 필드 명 매칭**
<br><br>
`@Autowired`는 타입 매칭을 시도하고, 이때 여러 빈이 있으면 필드 이름 / 파라미터 이름으로 이름을 추가 매칭 한다.
<br>
💡 **필드 명 매칭은 먼저 타입 매칭을 시도 하고 그 결과에 여러 빈이 있을 때 추가로 동작하는 기능이다.**
<br><br>
<br>
**🟨 @Qualifier 사용**
<br><br>
`@Qualifier`는 추가 구분자를 붙여주는 방법이다. 주입시 추가적인 방법을 제공하는 것이지 빈 이름을 변경하는 것은 아니다.

💡 **주입시에 @Qualifier를 붙여주고 등록한 이름을 적어준다.**<br>
❗️**우선 순위 더 높음**
<br><br>
<br>
**🟨 @Primary 사용**
<br><br>
`@Primary`는 우선순위를 정하는 방법이다. @Autowired 시에 여러 빈이 매칭되면 `@Primary`가 우선권을 가진다.

💡 **주입시에 @Qualifier를 붙여주고 등록한 이름을 적어준다.**
<br><br>








   


         
