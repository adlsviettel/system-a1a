package com.allianceoneapparel.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@NamedStoredProcedureQuery(name = "sm.usp_StyleMaster_InsertUpdate",
        procedureName = "sm.usp_StyleMaster_InsertUpdate",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pJSONStyleMaster", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pAction", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "pCreatedBy", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.OUT, name = "pOutput", type = Integer.class)
        })
//@JacksonXmlRootElement(localName = "root")
public class StyleMasterInsert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StyleMasterId")
    @JacksonXmlProperty(localName = "StyleMasterId")
    private int id;

    @Column(name = "StyleMasterCode")
    @JacksonXmlProperty(localName = "StyleMasterCode")
    private String styleMasterCode;

    @Column(name = "Season")
    @JacksonXmlProperty(localName = "Season")
    private String season;

    @Column(name = "Stage")
    @JacksonXmlProperty(localName = "Stage")
    private String stage;

    @Column(name = "OptionNo")
    @JacksonXmlProperty(localName = "OptionNo")
    private String optionNo;

    @Column(name = "CustomerCode")
    @JacksonXmlProperty(localName = "CustomerCode")
    private String customerCode;

    @Column(name = "CustomerPatternCode")
    @JacksonXmlProperty(localName = "CustomerPatternCode")
    private String customerPatternCode;

    @Column(name = "TACRouteNumber")
    @JacksonXmlProperty(localName = "TACRouteNumber")
    private String tacRouteNumber;

    @Column(name = "A1ARouteNumber")
    @JacksonXmlProperty(localName = "A1ARouteNumber")
    private String a1aRouteNumber;

    @Column(name = "ProductType")
    @JacksonXmlProperty(localName = "ProductType")
    private String productType;

    @Column(name = "FactoryAllocation")
    @JacksonXmlProperty(localName = "FactoryAllocation")
    private String factoryAllocation;

    @Column(name = "MerAccountName")
    @JacksonXmlProperty(localName = "MerAccountName")
    private String merAccountName;

    @Column(name = "Status")
    @JacksonXmlProperty(localName = "Status")
    private String status;

    @Column(name = "CuttingSMV")
    @JacksonXmlProperty(localName = "CuttingSMV")
    private String cuttingSMV;

    @Column(name = "Sewing")
    @JacksonXmlProperty(localName = "Sewing")
    private String sewing;

    @Column(name = "Inspect")
    @JacksonXmlProperty(localName = "Inspect")
    private String inspect;

    @Column(name = "Press")
    @JacksonXmlProperty(localName = "Press")
    private String press;

    @Column(name = "Finishing")
    @JacksonXmlProperty(localName = "Finishing")
    private String finishing;

    @Column(name = "TotalSIPFSMV")
    @JacksonXmlProperty(localName = "TotalSIPFSMV")
    private float totalSIPFSMV;

    @Column(name = "BondingProcess")
    @JacksonXmlProperty(localName = "BondingProcess")
    private String bondingProcess;

    @Column(name = "BondingPosition")
    @JacksonXmlProperty(localName = "BondingPosition")
    private int bondingPosition;

    @Column(name = "BondingTotalSMV")
    @JacksonXmlProperty(localName = "BondingTotalSMV")
    private float bondingTotalSMV;

    @Column(name = "LaserPosition")
    @JacksonXmlProperty(localName = "LaserPosition")
    private int laserPosition;

    @Column(name = "LaserTotalSMV")
    @JacksonXmlProperty(localName = "LaserTotalSMV")
    private float laserTotalSMV;

    @Column(name = "TotalBondingSMV")
    @JacksonXmlProperty(localName = "TotalBondingSMV")
    private float totalBondingSMV;

    @Column(name = "HTSmall")
    @JacksonXmlProperty(localName = "HTSmall")
    private int htSmall;

    @Column(name = "HTBig")
    @JacksonXmlProperty(localName = "HTBig")
    private int htBig;

    @Column(name = "HTTotalPosition")
    @JacksonXmlProperty(localName = "HTTotalPosition")
    private int htTotalPosition;

    @Column(name = "HTEmbroideryBacking")
    @JacksonXmlProperty(localName = "HTEmbroideryBacking")
    private int htEmbroideryBacking;

    @Column(name = "EMBPosition")
    @JacksonXmlProperty(localName = "EMBPosition")
    private int embPosition;

    @Column(name = "EMBBadgeLogo")
    @JacksonXmlProperty(localName = "EMBBadgeLogo")
    private int embBadgeLogo;

    @Column(name = "EMBTotalStitch")
    @JacksonXmlProperty(localName = "EMBTotalStitch")
    private int embTotalStitch;

    @Column(name = "EMBTotalSMV")
    @JacksonXmlProperty(localName = "EMBTotalSMV")
    private float embTotalSMV;

    @Column(name = "PadPrintPosition")
    @JacksonXmlProperty(localName = "PadPrintPosition")
    private int padPrintPosition;

    @Column(name = "PadPrintTotalSMV")
    @JacksonXmlProperty(localName = "PadPrintTotalSMV")
    private float padPrintTotalSMV;

    @Column(name = "ScreenPrintPosition")
    @JacksonXmlProperty(localName = "ScreenPrintPosition")
    private int screenPrintPosition;

    @Column(name = "ScreenPrintPrinter")
    @JacksonXmlProperty(localName = "ScreenPrintPrinter")
    private String screenPrintPrinter;

    @Column(name = "SublimationPosition")
    @JacksonXmlProperty(localName = "SublimationPosition")
    private int sublimationPosition;

    @Column(name = "SublimationPrinter")
    @JacksonXmlProperty(localName = "SublimationPrinter")
    private String sublimationPrinter;

    @Column(name = "RefStyleMasterId")
    @JacksonXmlProperty(localName = "RefStyleMasterId")
    private int refStyleMasterId;

    @Column(name = "IsActive")
    @JacksonXmlProperty(localName = "IsActive")
    private int isActive;
}
