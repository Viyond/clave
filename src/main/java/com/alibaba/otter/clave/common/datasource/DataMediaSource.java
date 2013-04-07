package com.alibaba.otter.clave.common.datasource;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.alibaba.otter.clave.utils.ClaveToStringStyle;

/**
 * 数据介质源信息描述
 * 
 * @author jianghang 2011-9-2 上午11:28:21
 */
public class DataMediaSource implements Serializable {

    private static final long serialVersionUID = -7653632703273608373L;
    private String            name;
    private DataMediaType     type;
    private String            encode;
    private Date              gmtCreate;
    private Date              gmtModified;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataMediaType getType() {
        return type;
    }

    public void setType(DataMediaType type) {
        this.type = type;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((encode == null) ? 0 : encode.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        DataMediaSource other = (DataMediaSource) obj;
        if (encode == null) {
            if (other.encode != null) return false;
        } else if (!encode.equals(other.encode)) return false;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        if (type != other.type) return false;
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ClaveToStringStyle.DEFAULT_STYLE);
    }

}
