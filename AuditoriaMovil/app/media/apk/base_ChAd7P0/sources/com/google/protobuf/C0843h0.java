package com.google.protobuf;
/* renamed from: com.google.protobuf.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843h0 implements InterfaceC0857o0 {

    /* renamed from: a  reason: collision with root package name */
    public InterfaceC0857o0[] f10072a;

    @Override // com.google.protobuf.InterfaceC0857o0
    public final B0 a(Class cls) {
        InterfaceC0857o0[] interfaceC0857o0Arr;
        for (InterfaceC0857o0 interfaceC0857o0 : this.f10072a) {
            if (interfaceC0857o0.b(cls)) {
                return interfaceC0857o0.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.InterfaceC0857o0
    public final boolean b(Class cls) {
        for (InterfaceC0857o0 interfaceC0857o0 : this.f10072a) {
            if (interfaceC0857o0.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
