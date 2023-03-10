package edu.ccsfu.quiz.mapper;

import edu.ccsfu.quiz.domain.PapIdQuesCourse;
import edu.ccsfu.quiz.domain.Question;
import edu.ccsfu.quiz.domain.QuestionPaper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface QuestionMapper {
    List<Question> queryAll(Question question);

    void addQuestion(Question question);

    Question queryQuestionById(Integer id);

    void editQuestion(Question question);

    void deleteQuestionById(Integer id);

    List<Question> queryAllType();

    List<Question> queryAllCourse();

    int queryAllQuestionNums();

    List<Map> queryNumOfQuestionType();

    List<Question> queryAllQueIdNotInPaperById(PapIdQuesCourse papid);

    int AddAllQues(List<QuestionPaper> questionPapers);

    int queryIdByPapQue(Integer[] ques);
    @Select("select count(*) from question")
    int queryCountAllQues();
}
