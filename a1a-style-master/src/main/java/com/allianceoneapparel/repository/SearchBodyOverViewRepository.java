package com.allianceoneapparel.repository;

import com.allianceoneapparel.entity.StyleMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchBodyOverViewRepository extends JpaRepository<StyleMaster,String> {
    @Query(value = "{CALL sm.usp_StyleMaster_SearchOverview(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11)}", nativeQuery = true)
    public List<StyleMaster> searchOverView(String pStyleMasterCode,
                                            String pSeason,
                                            String pStage,
                                            String pCustomerCode,
                                            String pProductType,
                                            String pFactoryAllocation,
                                            String pMerAccountName,
                                            String pFromDate,
                                            String pToDate,
                                            Integer pPageIndex,
                                            Integer pPageSize);
}
