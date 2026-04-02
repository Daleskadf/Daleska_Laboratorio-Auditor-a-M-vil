package com.google.protobuf;

import java.io.Serializable;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public enum h1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(StringUtils.EMPTY),
    BYTE_STRING(AbstractC0852m.f10085b),
    ENUM(null),
    MESSAGE(null);
    
    private final Object defaultDefault;

    h1(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
