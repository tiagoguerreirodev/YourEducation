package br.com.tiagoguerreirodev.youreducation.repository;

import br.com.tiagoguerreirodev.youreducation.constant.Subjects;
import br.com.tiagoguerreirodev.youreducation.document.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {
    Optional<Question> findById(String id);
    List<Question> findAllByBySubject(Subjects subject);
}
