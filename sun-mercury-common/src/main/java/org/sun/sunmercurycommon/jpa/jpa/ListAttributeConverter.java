package org.sun.sunmercurycommon.jpa.jpa;

import org.springframework.util.StringUtils;

import javax.persistence.AttributeConverter;
import java.util.ArrayList;
import java.util.List;

public class ListAttributeConverter implements AttributeConverter<List<String>, String> {

    @Override
    public String convertToDatabaseColumn(List<String> attr) {
        Long start = System.currentTimeMillis();
        if (attr == null || attr.size() == 0) {
            return "";
        }

        StringBuilder builder = new StringBuilder("");
        attr.forEach(s -> builder.append(s + ","));
        String value = builder.toString();

        return value.substring(0, value.length() - 1);
    }

    @Override
    public List<String> convertToEntityAttribute(String value) {
        if (StringUtils.isEmpty(value)) {
            return new ArrayList<>();
        }

        List<String> attr = new ArrayList<>();
        for (String s : value.split(",")) {
            attr.add(s);
        }

        return attr;
    }
}
