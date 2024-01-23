package com.allianceoneapparel.Helper;

import com.allianceoneapparel.model.Root;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

public class XmlToObjectConverter {
    public Root convertXmlToObject(String xml) {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setClassesToBeBound(Root.class);
        return (Root) marshaller.unmarshal(new StreamSource(new StringReader(xml)));
    }
}
