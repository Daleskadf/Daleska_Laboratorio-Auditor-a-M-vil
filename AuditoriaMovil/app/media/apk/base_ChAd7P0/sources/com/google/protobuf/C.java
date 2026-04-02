package com.google.protobuf;
/* loaded from: classes.dex */
public enum C {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean isList;

    C(boolean z7) {
        this.isList = z7;
    }
}
