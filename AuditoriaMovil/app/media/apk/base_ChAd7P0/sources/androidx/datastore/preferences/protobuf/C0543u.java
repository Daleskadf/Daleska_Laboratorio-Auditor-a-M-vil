package androidx.datastore.preferences.protobuf;
/* renamed from: androidx.datastore.preferences.protobuf.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543u implements O {

    /* renamed from: b  reason: collision with root package name */
    public static final C0543u f7868b = new C0543u(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7869a;

    public /* synthetic */ C0543u(int i7) {
        this.f7869a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final a0 a(Class cls) {
        switch (this.f7869a) {
            case 0:
                if (AbstractC0547y.class.isAssignableFrom(cls)) {
                    try {
                        return (a0) AbstractC0547y.f(cls.asSubclass(AbstractC0547y.class)).e(EnumC0546x.BUILD_MESSAGE_INFO);
                    } catch (Exception e7) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final boolean b(Class cls) {
        switch (this.f7869a) {
            case 0:
                return AbstractC0547y.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
