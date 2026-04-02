package com.google.protobuf;

import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.protobuf.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836e extends J {
    private static final C0836e DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = StringUtils.EMPTY;
    private AbstractC0852m value_ = AbstractC0852m.f10085b;

    static {
        C0836e c0836e = new C0836e();
        DEFAULT_INSTANCE = c0836e;
        J.t(C0836e.class, c0836e);
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (AbstractC0834d.f10061a[i7.ordinal()]) {
            case 1:
                return new C0836e();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0836e.class) {
                        try {
                            interfaceC0872w0 = PARSER;
                            if (interfaceC0872w0 == null) {
                                interfaceC0872w0 = new H(DEFAULT_INSTANCE);
                                PARSER = interfaceC0872w0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC0872w0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
