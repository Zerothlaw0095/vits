package org.openpcm.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.openpcm.utils.ObjectUtil;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Attribute {
    @Column(name = "attribute_name")
    private String key;

    @Column(name = "attribute_value")
    private String value;
    
    @Override
    public String toString() {
        return ObjectUtil.print(this);
    }
}