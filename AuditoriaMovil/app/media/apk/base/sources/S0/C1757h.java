package s0;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0525b;
import androidx.datastore.preferences.protobuf.AbstractC0544v;
import androidx.datastore.preferences.protobuf.AbstractC0547y;
import androidx.datastore.preferences.protobuf.EnumC0546x;
import androidx.datastore.preferences.protobuf.InterfaceC0548z;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.Z;
import androidx.datastore.preferences.protobuf.a0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
/* renamed from: s0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1757h extends AbstractC0547y {
    private static final C1757h DEFAULT_INSTANCE;
    private static volatile V PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0548z strings_ = Z.f7786d;

    static {
        C1757h c1757h = new C1757h();
        DEFAULT_INSTANCE = c1757h;
        AbstractC0547y.l(C1757h.class, c1757h);
    }

    public static void n(C1757h c1757h, Set set) {
        int i7;
        InterfaceC0548z interfaceC0548z = c1757h.strings_;
        if (!((AbstractC0525b) interfaceC0548z).f7793a) {
            Z z7 = (Z) interfaceC0548z;
            int i8 = z7.f7788c;
            if (i8 == 0) {
                i7 = 10;
            } else {
                i7 = i8 * 2;
            }
            c1757h.strings_ = z7.h(i7);
        }
        InterfaceC0548z interfaceC0548z2 = c1757h.strings_;
        Charset charset = A.f7747a;
        set.getClass();
        if (interfaceC0548z2 instanceof ArrayList) {
            ((ArrayList) interfaceC0548z2).ensureCapacity(set.size() + ((Z) interfaceC0548z2).f7788c);
        }
        Z z8 = (Z) interfaceC0548z2;
        int i9 = z8.f7788c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (z8.f7788c - i9) + " is null.";
                for (int i10 = z8.f7788c - 1; i10 >= i9; i10--) {
                    z8.remove(i10);
                }
                throw new NullPointerException(str);
            }
            z8.add(obj);
        }
    }

    public static C1757h o() {
        return DEFAULT_INSTANCE;
    }

    public static C1756g q() {
        return (C1756g) ((AbstractC0544v) DEFAULT_INSTANCE.e(EnumC0546x.NEW_BUILDER));
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, androidx.datastore.preferences.protobuf.V] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0547y
    public final Object e(EnumC0546x enumC0546x) {
        switch (AbstractC1752c.f15547a[enumC0546x.ordinal()]) {
            case 1:
                return new C1757h();
            case 2:
                return new AbstractC0544v(DEFAULT_INSTANCE);
            case 3:
                return new a0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V v6 = PARSER;
                V v7 = v6;
                if (v6 == null) {
                    synchronized (C1757h.class) {
                        try {
                            V v8 = PARSER;
                            V v9 = v8;
                            if (v8 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                v9 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return v7;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC0548z p() {
        return this.strings_;
    }
}
