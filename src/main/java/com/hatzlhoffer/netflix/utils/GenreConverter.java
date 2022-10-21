package com.hatzlhoffer.netflix.utils;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.hatzlhoffer.netflix.models.Genre;

// TODO - Verify if there is a generic way of doing this
public class GenreConverter {

    public String convertToDatabaseColumn(Genre attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getCode();
    }

    public Genre convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }

        return Stream.of(Genre.values())
                .filter(c -> c.getCode().equals(dbData))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
