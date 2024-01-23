package com.allianceoneapparel.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;


@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@NamedStoredProcedureQuery(name = "sm.usp_StyleMaster_InsertUpdate",
        procedureName = "sm.usp_StyleMaster_InsertUpdate",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pJSONStyleMaster", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pAction", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pCreatedBy", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.OUT, name = "pOutput", type = Integer.class)
        })
public class StyleMasterRow {
    @Id
    @Column(name = "StyleMasterId")
    @JacksonXmlProperty(localName = "StyleMasterId")
    private Integer styleMasterId;

    @Column(name = "StyleMasterCode")
    @JacksonXmlProperty ( localName = "StyleMasterCode")
    private String styleMasterCode;

    @Column(name = "Season")
    @JacksonXmlProperty ( localName = "Season")
    private String season;

    @Column(name = "Stage")
    @JacksonXmlProperty ( localName = "Stage")
    private String stage;

    @Column(name = "OptionNo")
    @JacksonXmlProperty ( localName = "OptionNo")
    private String optionNo;

    @Column(name = "CustomerCode")
    @JacksonXmlProperty ( localName = "CustomerCode")
    private String customerCode;

    @Column(name = "CustomerPatternCode")
    @JacksonXmlProperty ( localName = "CustomerPatternCode")
    private String customerPatternCode;

    @Column(name = "TACRouteNumber")
    @JacksonXmlProperty ( localName = "TACRouteNumber")
    private String tacRouteNumber;

    @Column(name = "A1ARouteNumber")
    @JacksonXmlProperty ( localName = "A1ARouteNumber")
    private String a1aRouteNumber;

    @Column(name = "ProductType")
    @JacksonXmlProperty ( localName = "ProductType")
    private String productType;

    @Column(name = "FactoryAllocation")
    @JacksonXmlProperty ( localName = "FactoryAllocation")
    private String factoryAllocation;

    @Column(name = "MerAccountName")
    @JacksonXmlProperty ( localName = "MerAccountName")
    private String merAccountName;

    @Column(name = "Status")
    @JacksonXmlProperty ( localName = "Status")
    private String status;

    @Column(name = "CuttingSMV")
    @JacksonXmlProperty ( localName = "CuttingSMV")
    private Float cuttingSMV;

    @Column(name = "Sewing")
    @JacksonXmlProperty ( localName = "Sewing")
    private Float sewing;

    @Column(name = "Inspect")
    @JacksonXmlProperty ( localName = "Inspect")
    private Float inspect;

    @Column(name = "Press")
    @JacksonXmlProperty ( localName = "Press")
    private Float press;

    @Column(name = "Finishing")
    @JacksonXmlProperty ( localName = "Finishing")
    private Float finishing;

    @Column(name = "TotalSIPFSMV")
    @JacksonXmlProperty ( localName = "TotalSIPFSMV")
    private Float totalSIPFSMV;

    @Column(name = "BondingProcess")
    @JacksonXmlProperty ( localName = "BondingProcess")
    private String bondingProcess;

    @Column(name = "BondingPosition")
    @JacksonXmlProperty ( localName = "BondingPosition")
    private Integer bondingPosition;

    @Column(name = "BondingTotalSMV")
    @JacksonXmlProperty ( localName = "BondingTotalSMV")
    private Float bondingTotalSMV;

    @Column(name = "LaserPosition")
    @JacksonXmlProperty ( localName = "LaserPosition")
    private Integer laserPosition;

    @Column(name = "LaserTotalSMV")
    @JacksonXmlProperty ( localName = "LaserTotalSMV")
    private Float laserTotalSMV;

    @Column(name = "TotalBondingSMV")
    @JacksonXmlProperty ( localName = "TotalBondingSMV")
    private Float totalBondingSMV;

    @Column(name = "HTSmall")
    @JacksonXmlProperty ( localName = "HTSmall")
    private Integer htSmall;

    @Column(name = "HTBig")
    @JacksonXmlProperty ( localName = "HTBig")
    private Integer htBig;

    @Column(name = "HTTotalPosition")
    @JacksonXmlProperty ( localName = "HTTotalPosition")
    private Integer htTotalPosition;

    @Column(name = "HTEmbroideryBacking")
    @JacksonXmlProperty ( localName = "HTEmbroideryBacking")
    private Integer htEmbroideryBacking;

    @Column(name = "EMBPosition")
    @JacksonXmlProperty ( localName = "EMBPosition")
    private Integer embPosition;

    @Column(name = "EMBBadgeLogo")
    @JacksonXmlProperty ( localName = "EMBBadgeLogo")
    private Integer embBadgeLogo;

    @Column(name = "EMBTotalStitch")
    @JacksonXmlProperty ( localName = "EMBTotalStitch")
    private Integer embTotalStitch;

    @Column(name = "EMBTotalSMV")
    @JacksonXmlProperty ( localName = "EMBTotalSMV")
    private Float embTotalSMV;

    @Column(name = "PadPrintPosition")
    @JacksonXmlProperty ( localName = "PadPrintPosition")
    private Integer padPrintPosition;

    @Column(name = "PadPrintTotalSMV")
    @JacksonXmlProperty ( localName = "PadPrintTotalSMV")
    private Float padPrintTotalSMV;

    @Column(name = "ScreenPrintPosition")
    @JacksonXmlProperty ( localName = "ScreenPrintPosition")
    private Integer screenPrintPosition;

    @Column(name = "ScreenPrintPrinter")
    @JacksonXmlProperty ( localName = "ScreenPrintPrinter")
    private String screenPrintPrinter;

    @Column(name = "SublimationPosition")
    @JacksonXmlProperty ( localName = "SublimationPosition")
    private Integer sublimationPosition;

    @Column(name = "SublimationPrinter")
    @JacksonXmlProperty ( localName = "SublimationPrinter")
    private String sublimationPrinter;

    @Column(name = "RefStyleMasterId")
    @JacksonXmlProperty ( localName = "RefStyleMasterId")
    private Integer refStyleMasterId;

    @Column(name = "IsActive")
    @JacksonXmlProperty ( localName = "IsActive")
    private Integer isActive;

    @Column(name = "StyleMasterBondingItem")
    @JacksonXmlProperty ( localName = "StyleMasterBondingItem")
    private String styleMasterBondingItem;

    @Column(name = "StyleMasterScreenPrintItem")
    @JacksonXmlProperty ( localName = "StyleMasterScreenPrintItem")
    private String styleMasterScreenPrintItem;

    @Column(name = "StyleMasterScreenSublimationItem")
    @JacksonXmlProperty ( localName = "StyleMasterScreenSublimationItem")
    private String styleMasterScreenSublimationItem;
}
