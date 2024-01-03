package com.allianceoneapparel.repository;

import com.allianceoneapparel.entity.Columns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColumnRepository extends JpaRepository<Columns,Integer> {
    @Query(value = "{CALL sm.usp_StyleMaster_GetFilter(?)}", nativeQuery = true)
    public List<Columns> getFilterList(String pCustomerCode);
}
