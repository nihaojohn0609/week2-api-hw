package doit.apihw.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByMemberLoginId(String memberLoginId);
    // TODO : 회원 이름으로 회원 정보를 조회한다.

    // TODO : 회원 로그인 ID와 비밀번호로 회원 정보를 조회한다.

}
