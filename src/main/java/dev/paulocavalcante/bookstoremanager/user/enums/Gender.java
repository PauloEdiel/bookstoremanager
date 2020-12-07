package dev.paulocavalcante.bookstoremanager.user.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {

    MALE("male"),
    FEMALE("female");

    private String description ;
}
