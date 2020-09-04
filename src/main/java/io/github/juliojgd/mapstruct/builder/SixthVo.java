package io.github.juliojgd.mapstruct.builder;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class SixthVo {

    private Float latitude;

    private Float longitude;


    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }


    public Float getLatitude() {
        return this.latitude;
    }


    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }


    public Float getLongitude() {
        return this.longitude;
    }


    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }


    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
