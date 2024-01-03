package com.allianceoneapparel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Columns {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "ColumnName")
    private String columnName;

    @Column(name = "Value")
    private String value;
}
