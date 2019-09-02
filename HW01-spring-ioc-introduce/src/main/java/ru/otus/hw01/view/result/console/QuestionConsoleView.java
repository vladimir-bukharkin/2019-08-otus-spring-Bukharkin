package ru.otus.hw01.view.result.console;

import org.springframework.beans.factory.DisposableBean;
import ru.otus.hw01.domain.question.Question;
import ru.otus.hw01.service.statistic.Statistic;
import ru.otus.hw01.view.result.QuestionView;

import java.util.Scanner;

public class QuestionConsoleView implements QuestionView, DisposableBean {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(Question question) {
        switch (question.getType()) {
            case SINGLE:
                askSingleQuestion(question);
                break;
            case MULTIPLY:
                askMultiplyQuestion(question);
                break;
            case TEXT:
                askTextQuestion(question);
                break;
            default:
                throw new InternalError("Not supported question type: " + question.getType());
        }
        return scanner.nextLine();
    }

    @Override
    public void printResults(Statistic statistic) {
        System.out.println("Результаты тестирования: " +
                "\nВсего вопросов: " + statistic.getQuestionsCount() +
                "\nПравильных ответов: " + statistic.getCorrectAnswersCount() +
                "\nИтоговый балл: " + statistic.getResultMark());
    }

    private void askSingleQuestion(Question question) {
        System.out.println(question.getQuestion() +
                "\nВопрос с единственным вариантом ответа" +
                "\nВведите номер правильного варианта ответа...");
    }

    private void askMultiplyQuestion(Question question) {
        System.out.println(question.getQuestion() +
                "\nВопрос с несколькими вариантами ответа" +
                "\nВведите номера правильных вариантов ответа через \",\" (Пример: 1,3,5)...");
    }

    private void askTextQuestion(Question question) {
        System.out.println(question.getQuestion() +
                "\nВопрос c ответом в ввиде текста" +
                "\nВведите ответ словами...");
    }

    @Override
    public void destroy() throws Exception {
        scanner.close();
    }
}
