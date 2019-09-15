package ru.otus.hw02.service.statistic;

public class DefaultStatisticCalculator implements StatisticCalculator {

    @Override
    public int getResultMark(Statistic statistic) {
        return statistic.getCorrectAnswersCount()*100/statistic.getQuestionsCount(); //Пусть округляет в меньшую сторону:)
    }
}