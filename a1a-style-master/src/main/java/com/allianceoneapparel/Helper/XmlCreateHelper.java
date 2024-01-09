package com.allianceoneapparel.Helper;

import com.allianceoneapparel.model.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.Collections;

public class XmlCreateHelper<T> {
    public String xmlCreate(T object) throws JsonProcessingException {
        Root root = new Root();
        root.setItems(Collections.singletonList(object));
        ObjectMapper xmlMapper = new XmlMapper();
        return xmlMapper.writeValueAsString(root);
    }
}
