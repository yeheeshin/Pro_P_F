package spring.Pro_P_F.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import spring.Pro_P_F.domain.Community;
import spring.Pro_P_F.domain.Posting;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommunityRepository {

    private final EntityManager em;

    // 커뮤니티 글 등록
    public void save(Community community) {
        em.persist(community);
    }

    // 커뮤니티 전체 글 목록
    public List<Community> findAll() {
        return em.createQuery("select comm from Community comm", Community.class)
                .getResultList();
    }

    public List<Community> findByid(Long id) {
        return em.createQuery("select c from Community c where c.id = :id", Community.class)
                .setParameter("id", id)
                .getResultList();
    }
}
