package H4;

import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class z1 extends com.google.protobuf.J {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final z1 DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.google.protobuf.N0 commitTime_;
    private String streamId_ = StringUtils.EMPTY;
    private AbstractC0852m streamToken_ = AbstractC0852m.f10085b;
    private com.google.protobuf.U writeResults_ = com.google.protobuf.A0.f9984d;

    static {
        z1 z1Var = new z1();
        DEFAULT_INSTANCE = z1Var;
        com.google.protobuf.J.t(z1.class, z1Var);
    }

    public static z1 w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (y1.f2028a[i7.ordinal()]) {
            case 1:
                return new z1();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "streamId_", "streamToken_", "writeResults_", B1.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (z1.class) {
                        try {
                            interfaceC0872w0 = PARSER;
                            if (interfaceC0872w0 == null) {
                                interfaceC0872w0 = new com.google.protobuf.H(DEFAULT_INSTANCE);
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

    public final com.google.protobuf.N0 v() {
        com.google.protobuf.N0 n02 = this.commitTime_;
        if (n02 == null) {
            return com.google.protobuf.N0.x();
        }
        return n02;
    }

    public final AbstractC0852m x() {
        return this.streamToken_;
    }

    public final B1 y(int i7) {
        return (B1) this.writeResults_.get(i7);
    }

    public final int z() {
        return this.writeResults_.size();
    }
}
