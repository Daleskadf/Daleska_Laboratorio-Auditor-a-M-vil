package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public enum r {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean isList;

    r(boolean z7) {
        this.isList = z7;
    }
}
