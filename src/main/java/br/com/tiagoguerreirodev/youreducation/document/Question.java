package br.com.tiagoguerreirodev.youreducation.document;

import br.com.tiagoguerreirodev.youreducation.constant.Subjects;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document(collection = "Question")
public class Question {
    @Id
    String id;
    String description;
    Subjects subject;
}
