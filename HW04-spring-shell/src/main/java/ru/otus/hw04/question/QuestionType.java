package ru.otus.hw04.question;

public enum QuestionType {
    SINGLE,
    MULTIPLY,
    TEXT;

    public static QuestionType instanceOf(String value) {
        if (value == null) {
            return null;
        }
        String ucValue = value.toUpperCase();
        for (QuestionType c : QuestionType.values()) {
            if (c.name().equals(ucValue)) {
                return c;
            }
        }
        return null;
    }
}
