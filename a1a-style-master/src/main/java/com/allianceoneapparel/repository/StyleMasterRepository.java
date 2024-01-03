package com.allianceoneapparel.repository;

import com.allianceoneapparel.entity.StyleMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StyleMasterRepository extends JpaRepository<StyleMaster,Integer> {
    @Query(value = "{CALL sm.usp_StyleMaster_GetOverview(?,?,?)}", nativeQuery = true)
    public List<StyleMaster> getOverview(Integer pPageIndex, Integer pPageSize, String pCustomerCode);
}
