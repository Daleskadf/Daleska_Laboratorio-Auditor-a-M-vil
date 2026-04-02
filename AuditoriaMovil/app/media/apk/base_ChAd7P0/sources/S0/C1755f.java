package s0;

import K0.l;
import androidx.datastore.preferences.protobuf.AbstractC0544v;
import androidx.datastore.preferences.protobuf.AbstractC0547y;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0532i;
import androidx.datastore.preferences.protobuf.C0536m;
import androidx.datastore.preferences.protobuf.EnumC0546x;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.g0;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
/* renamed from: s0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1755f extends AbstractC0547y {
    private static final C1755f DEFAULT_INSTANCE;
    private static volatile V PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private L preferences_ = L.f7760b;

    static {
        C1755f c1755f = new C1755f();
        DEFAULT_INSTANCE = c1755f;
        AbstractC0547y.l(C1755f.class, c1755f);
    }

    public static L n(C1755f c1755f) {
        L l8 = c1755f.preferences_;
        if (!l8.f7761a) {
            c1755f.preferences_ = l8.b();
        }
        return c1755f.preferences_;
    }

    public static C1753d p() {
        return (C1753d) ((AbstractC0544v) DEFAULT_INSTANCE.e(EnumC0546x.NEW_BUILDER));
    }

    public static C1755f q(InputStream inputStream) {
        C1755f c1755f = DEFAULT_INSTANCE;
        C0532i c0532i = new C0532i(inputStream);
        C0536m a7 = C0536m.a();
        AbstractC0547y k2 = c1755f.k();
        try {
            X x7 = X.f7783c;
            x7.getClass();
            b0 a8 = x7.a(k2.getClass());
            l lVar = (l) c0532i.f1982b;
            if (lVar == null) {
                lVar = new l(c0532i);
            }
            a8.f(k2, lVar, a7);
            a8.b(k2);
            if (AbstractC0547y.h(k2, true)) {
                return (C1755f) k2;
            }
            throw new IOException(new g0().getMessage());
        } catch (C e7) {
            if (e7.f7749a) {
                throw new IOException(e7.getMessage(), e7);
            }
            throw e7;
        } catch (g0 e8) {
            throw new IOException(e8.getMessage());
        } catch (IOException e9) {
            if (e9.getCause() instanceof C) {
                throw ((C) e9.getCause());
            }
            throw new IOException(e9.getMessage(), e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C) {
                throw ((C) e10.getCause());
            }
            throw e10;
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, androidx.datastore.preferences.protobuf.V] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0547y
    public final Object e(EnumC0546x enumC0546x) {
        switch (AbstractC1752c.f15547a[enumC0546x.ordinal()]) {
            case 1:
                return new C1755f();
            case 2:
                return new AbstractC0544v(DEFAULT_INSTANCE);
            case 3:
                return new a0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC1754e.f15548a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V v6 = PARSER;
                V v7 = v6;
                if (v6 == null) {
                    synchronized (C1755f.class) {
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

    public final Map o() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
