package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member", // 탐색할 패키지의 시작 위치 지정. 이 패키리를 포함해서 하위 패키지를 모두 탐색
        basePackageClasses = AutoAppConfig.class,   // 지정한 클래스의 패키지를 탐색 시작 위로 지정
        // 만약 지정하지 않으면 @ComponentScan이 붙은 설정 정보 클래스의 패키지가 시작 위치가 된다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)

public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }

    // 이 경우 수동 빈 등록이 우선권을 가진다.
    // (수동 빈이 자동 빈을 오버라이딩 해버린다.)
}
