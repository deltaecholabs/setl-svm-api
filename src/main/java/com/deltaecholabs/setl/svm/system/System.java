package com.deltaecholabs.setl.svm.system;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class System {

    private Integer systemId;

    @NotEmpty
    private String key;

    @NotEmpty
    private String name;

}
