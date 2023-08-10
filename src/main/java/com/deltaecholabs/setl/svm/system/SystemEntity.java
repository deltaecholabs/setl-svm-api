package com.deltaecholabs.setl.svm.system;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity(name = "System")
@Table(name = "system")
@Data
public class SystemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "system_id")
    private Integer systemId;

    @Column(name = "key")
    @NotEmpty
    private String key;

    @Column(name = "name")
    @NotEmpty
    private String name;

}