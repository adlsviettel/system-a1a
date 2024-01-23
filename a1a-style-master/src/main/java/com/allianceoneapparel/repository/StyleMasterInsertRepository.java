package com.allianceoneapparel.repository;

import com.allianceoneapparel.entity.StyleMasterRow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleMasterInsertRepository extends JpaRepository<StyleMasterRow, Integer> {
    @Procedure(name = "sm.usp_StyleMaster_InsertUpdate")
    public int configData(@Param("pJSONStyleMaster") String pJSONStyleMaster,
                          @Param("pAction") Integer pAction,
                          @Param("pCreatedBy") Integer pCreatedBy,
                          @Param("pOutput") Integer pOutput);
}
