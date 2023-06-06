package spring.Pro_P_F.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.Pro_P_F.domain.Community;
import spring.Pro_P_F.domain.Posting;
import spring.Pro_P_F.repository.PostingRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostingService {

    private final PostingRepository postingRepository;

    @Transactional
    public Long save(Posting posting) {
        postingRepository.save(posting);

        return posting.getP_seq();
    }

    public List<Posting> findAll() {
        return postingRepository.findAll();
    }

    public List<Posting> findByid(Long id){
        return postingRepository.findByid(id);
    }

}