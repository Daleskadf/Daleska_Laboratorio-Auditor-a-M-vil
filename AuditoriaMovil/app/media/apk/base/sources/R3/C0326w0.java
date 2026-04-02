package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
import org.apache.tika.utils.StringUtils;
/* renamed from: R3.w0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326w0 extends AbstractC0797y {
    private static final C0326w0 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = StringUtils.EMPTY;
    private AbstractC0781h value_ = AbstractC0781h.f9648b;

    static {
        C0326w0 c0326w0 = new C0326w0();
        DEFAULT_INSTANCE = c0326w0;
        AbstractC0797y.v(C0326w0.class, c0326w0);
    }

    public static void A(C0326w0 c0326w0, EnumC0324v0 enumC0324v0) {
        c0326w0.getClass();
        c0326w0.keyMaterialType_ = enumC0324v0.a();
    }

    public static C0326w0 B() {
        return DEFAULT_INSTANCE;
    }

    public static C0322u0 F() {
        return (C0322u0) DEFAULT_INSTANCE.j();
    }

    public static void y(C0326w0 c0326w0, String str) {
        c0326w0.getClass();
        str.getClass();
        c0326w0.typeUrl_ = str;
    }

    public static void z(C0326w0 c0326w0, C0780g c0780g) {
        c0326w0.getClass();
        c0326w0.value_ = c0780g;
    }

    public final EnumC0324v0 C() {
        EnumC0324v0 enumC0324v0;
        int i7 = this.keyMaterialType_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            enumC0324v0 = null;
                        } else {
                            enumC0324v0 = EnumC0324v0.REMOTE;
                        }
                    } else {
                        enumC0324v0 = EnumC0324v0.ASYMMETRIC_PUBLIC;
                    }
                } else {
                    enumC0324v0 = EnumC0324v0.ASYMMETRIC_PRIVATE;
                }
            } else {
                enumC0324v0 = EnumC0324v0.SYMMETRIC;
            }
        } else {
            enumC0324v0 = EnumC0324v0.UNKNOWN_KEYMATERIAL;
        }
        if (enumC0324v0 == null) {
            return EnumC0324v0.UNRECOGNIZED;
        }
        return enumC0324v0;
    }

    public final String D() {
        return this.typeUrl_;
    }

    public final AbstractC0781h E() {
        return this.value_;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0320t0.f4763a[enumC0796x.ordinal()]) {
            case 1:
                return new C0326w0();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (C0326w0.class) {
                        try {
                            com.google.crypto.tink.shaded.protobuf.a0 a0Var3 = PARSER;
                            com.google.crypto.tink.shaded.protobuf.a0 a0Var4 = a0Var3;
                            if (a0Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                a0Var4 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return a0Var2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
