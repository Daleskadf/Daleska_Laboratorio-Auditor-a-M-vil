package androidx.datastore.preferences.protobuf;
/* renamed from: androidx.datastore.preferences.protobuf.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0541s {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean isList;

    EnumC0541s(boolean z7) {
        this.isList = z7;
    }
}
