package study.datajpa.repository;

import org.springframework.stereotype.Repository;
import study.datajpa.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberJpaRepository {

    @PersistenceContext  //스프링 컨테이너가 EntityManager를 가져다줘
    private EntityManager em;   //inser 쿼리르 db에 알아서 저장을 하고 가져옴

    public Member save(Member member) {
        em.persist(member);
        return member;
    }
    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
