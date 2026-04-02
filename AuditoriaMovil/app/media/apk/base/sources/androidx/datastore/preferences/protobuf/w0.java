package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public enum w0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(StringUtils.EMPTY),
    BYTE_STRING(C0530g.f7818c),
    ENUM(null),
    MESSAGE(null);
    
    private final Object defaultDefault;

    w0(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
