package br.com.tiagoguerreirodev.youreducation.constant;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Subjects {
    MATH("MATH"),
    GEOGRAPHY("GEOGRAPHY"),
    SCIENCE("SCIENCE"),
    GENERAL("GENERAL");

    private final String value;
}
