package p5;

import com.google.protobuf.B0;
import com.google.protobuf.G;
import com.google.protobuf.H;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC0872w0;
import com.google.protobuf.J;
/* renamed from: p5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1697c extends J {
    private static final C1697c DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER;
    private double latitude_;
    private double longitude_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.J, p5.c] */
    static {
        ?? j = new J();
        DEFAULT_INSTANCE = j;
        J.t(C1697c.class, j);
    }

    public static C1696b A() {
        return (C1696b) DEFAULT_INSTANCE.i();
    }

    public static void v(C1697c c1697c, double d7) {
        c1697c.latitude_ = d7;
    }

    public static void w(C1697c c1697c, double d7) {
        c1697c.longitude_ = d7;
    }

    public static C1697c x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (AbstractC1695a.f15312a[i7.ordinal()]) {
            case 1:
                return new J();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C1697c.class) {
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

    public final double y() {
        return this.latitude_;
    }

    public final double z() {
        return this.longitude_;
    }
}
