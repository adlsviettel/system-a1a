package com.allianceoneapparel.Helper;

import com.allianceoneapparel.model.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.Collections;

public class XmlCreateHelper<T> {
    public String xmlCreate(T object) {
        Root root = new Root();
        root.setItems(Collections.singletonList(object));
        ObjectMapper xmlMapper = new XmlMapper();
        String xml = null;
        try {
            xml = xmlMapper.writeValueAsString(root);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return xml;
    }
}
