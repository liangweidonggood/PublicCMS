package org.publiccms.entities.cms;
// Generated 2016-11-20 14:46:17 by Hibernate Tools 4.3.1

import com.publiccms.common.generator.annotation.GeneratorColumn;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CmsDictionaryDataId generated by hbm2java
 * 字典数据子表
 */
@Embeddable
public class CmsDictionaryDataId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "数据字典ID")
    private long dictionaryId;
    @GeneratorColumn(title = "值")
    private String value;

    public CmsDictionaryDataId() {
    }

    public CmsDictionaryDataId(long dictionaryId, String value) {
        this.dictionaryId = dictionaryId;
        this.value = value;
    }

    @Column(name = "dictionary_id", nullable = false)
    public long getDictionaryId() {
        return this.dictionaryId;
    }

    public void setDictionaryId(long dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    @Column(name = "value", nullable = false, length = 50)
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof CmsDictionaryDataId))
            return false;
        CmsDictionaryDataId castOther = (CmsDictionaryDataId) other;

        return (this.getDictionaryId() == castOther.getDictionaryId()) && ((this.getValue() == castOther.getValue())
                || (this.getValue() != null && castOther.getValue() != null && this.getValue().equals(castOther.getValue())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getDictionaryId();
        result = 37 * result + (getValue() == null ? 0 : this.getValue().hashCode());
        return result;
    }

}
