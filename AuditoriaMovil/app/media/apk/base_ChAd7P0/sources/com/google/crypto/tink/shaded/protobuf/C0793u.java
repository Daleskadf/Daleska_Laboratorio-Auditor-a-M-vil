package com.google.crypto.tink.shaded.protobuf;
/* renamed from: com.google.crypto.tink.shaded.protobuf.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793u implements T {

    /* renamed from: b  reason: collision with root package name */
    public static final C0793u f9696b = new C0793u(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9697a;

    public /* synthetic */ C0793u(int i7) {
        this.f9697a = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.T
    public final f0 a(Class cls) {
        switch (this.f9697a) {
            case 0:
                if (AbstractC0797y.class.isAssignableFrom(cls)) {
                    try {
                        return (f0) AbstractC0797y.l(cls.asSubclass(AbstractC0797y.class)).k(EnumC0796x.BUILD_MESSAGE_INFO);
                    } catch (Exception e7) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.T
    public final boolean b(Class cls) {
        switch (this.f9697a) {
            case 0:
                return AbstractC0797y.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
