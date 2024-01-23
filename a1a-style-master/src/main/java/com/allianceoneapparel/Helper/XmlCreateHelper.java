package com.allianceoneapparel.Helper;

import com.allianceoneapparel.entity.StyleMasterRow;
import com.allianceoneapparel.model.Root;
import com.allianceoneapparel.model.StyleMasterDetailsRoot;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("ALL")
public class XmlCreateHelper<T> {
    private static final Logger logger = LoggerFactory.getLogger(StyleMasterRow.class);

    public String xmlCreate(List<T> object) throws JsonProcessingException {
        ObjectMapper xmlMapper = new XmlMapper();
        Root root = new Root();
        List<T> lsRow=new ArrayList<>();
        for (T t : object) {
            lsRow.add((T) List.of(t));
        }
        root.setRow(Collections.singletonList(lsRow));
        return xmlMapper.writeValueAsString(root);
    }

    public String convertToXml(StyleMasterDetailsRoot root) throws JsonProcessingException {
        ObjectMapper objectMapper = new XmlMapper();
        return objectMapper.writeValueAsString(root);
    }
}
