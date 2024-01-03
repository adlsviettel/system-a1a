package com.allianceoneapparel.repository;

import com.allianceoneapparel.entity.StyleMasterDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleMasterDetailRepository extends JpaRepository<StyleMasterDetail,Integer> {
    @Query(value = "{CALL sm.usp_StyleMaster_GetDetailByStyleMasterId(?1)}", nativeQuery = true)
    public StyleMasterDetail getDetailByStyleMasterId(Integer styleMasterId);
}
