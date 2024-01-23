package com.allianceoneapparel.model;

import com.allianceoneapparel.entity.StyleMasterRow;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JacksonXmlRootElement(localName="root")
//@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class StyleMasterDetailsRoot {
    @JacksonXmlProperty(localName = "row")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<StyleMasterRow> rows;
}
