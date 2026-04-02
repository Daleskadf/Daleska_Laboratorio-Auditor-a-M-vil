package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public final class H implements O {

    /* renamed from: a  reason: collision with root package name */
    public O[] f7753a;

    @Override // androidx.datastore.preferences.protobuf.O
    public final a0 a(Class cls) {
        O[] oArr;
        for (O o7 : this.f7753a) {
            if (o7.b(cls)) {
                return o7.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final boolean b(Class cls) {
        for (O o7 : this.f7753a) {
            if (o7.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
