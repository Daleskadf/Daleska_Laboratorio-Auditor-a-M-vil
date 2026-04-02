package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public final class N implements T {

    /* renamed from: a  reason: collision with root package name */
    public T[] f9605a;

    @Override // com.google.crypto.tink.shaded.protobuf.T
    public final f0 a(Class cls) {
        T[] tArr;
        for (T t7 : this.f9605a) {
            if (t7.b(cls)) {
                return t7.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.T
    public final boolean b(Class cls) {
        for (T t7 : this.f9605a) {
            if (t7.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
