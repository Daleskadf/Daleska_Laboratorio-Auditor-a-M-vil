package com.google.protobuf;
/* loaded from: classes.dex */
public final class F implements InterfaceC0857o0 {

    /* renamed from: b  reason: collision with root package name */
    public static final F f10000b = new F(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10001a;

    public /* synthetic */ F(int i7) {
        this.f10001a = i7;
    }

    @Override // com.google.protobuf.InterfaceC0857o0
    public final B0 a(Class cls) {
        switch (this.f10001a) {
            case 0:
                if (J.class.isAssignableFrom(cls)) {
                    try {
                        return (B0) J.k(cls.asSubclass(J.class)).j(I.BUILD_MESSAGE_INFO);
                    } catch (Exception e7) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.protobuf.InterfaceC0857o0
    public final boolean b(Class cls) {
        switch (this.f10001a) {
            case 0:
                return J.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
