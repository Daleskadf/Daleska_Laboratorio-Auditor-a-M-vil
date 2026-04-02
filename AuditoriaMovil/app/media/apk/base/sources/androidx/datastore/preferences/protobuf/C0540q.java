package androidx.datastore.preferences.protobuf;

import H4.e1;
import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* renamed from: androidx.datastore.preferences.protobuf.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540q {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7862c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final d0 f7863a = d0.f();

    /* renamed from: b  reason: collision with root package name */
    public boolean f7864b;

    static {
        new C0540q(0);
    }

    public C0540q() {
    }

    public static void b(C0534k c0534k, v0 v0Var, int i7, Object obj) {
        if (v0Var == v0.GROUP) {
            c0534k.A0(i7, 3);
            ((AbstractC0524a) obj).b(c0534k);
            c0534k.A0(i7, 4);
            return;
        }
        c0534k.A0(i7, v0Var.b());
        switch (AbstractC0539p.f7861b[v0Var.ordinal()]) {
            case 1:
                c0534k.v0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 2:
                c0534k.t0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 3:
                c0534k.E0(((Long) obj).longValue());
                return;
            case 4:
                c0534k.E0(((Long) obj).longValue());
                return;
            case 5:
                c0534k.x0(((Integer) obj).intValue());
                return;
            case 6:
                c0534k.v0(((Long) obj).longValue());
                return;
            case 7:
                c0534k.t0(((Integer) obj).intValue());
                return;
            case 8:
                c0534k.n0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 9:
                ((AbstractC0524a) obj).b(c0534k);
                return;
            case 10:
                AbstractC0524a abstractC0524a = (AbstractC0524a) obj;
                c0534k.getClass();
                c0534k.C0(((AbstractC0547y) abstractC0524a).a(null));
                abstractC0524a.b(c0534k);
                return;
            case 11:
                if (obj instanceof C0530g) {
                    c0534k.r0((C0530g) obj);
                    return;
                } else {
                    c0534k.z0((String) obj);
                    return;
                }
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (obj instanceof C0530g) {
                    c0534k.r0((C0530g) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c0534k.C0(length);
                c0534k.o0(bArr, 0, length);
                return;
            case 13:
                c0534k.C0(((Integer) obj).intValue());
                return;
            case 14:
                c0534k.t0(((Integer) obj).intValue());
                return;
            case 15:
                c0534k.v0(((Long) obj).longValue());
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                int intValue = ((Integer) obj).intValue();
                c0534k.C0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0534k.E0((longValue >> 63) ^ (longValue << 1));
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                c0534k.x0(((Integer) obj).intValue());
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f7864b) {
            return;
        }
        d0 d0Var = this.f7863a;
        int size = d0Var.f7803a.size();
        for (int i7 = 0; i7 < size; i7++) {
            Map.Entry c8 = d0Var.c(i7);
            if (c8.getValue() instanceof AbstractC0547y) {
                AbstractC0547y abstractC0547y = (AbstractC0547y) c8.getValue();
                abstractC0547y.getClass();
                X x7 = X.f7783c;
                x7.getClass();
                x7.a(abstractC0547y.getClass()).b(abstractC0547y);
                abstractC0547y.j();
            }
        }
        if (!d0Var.f7805c) {
            if (d0Var.f7803a.size() <= 0) {
                Iterator it = d0Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    throw new ClassCastException();
                }
            } else {
                d0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!d0Var.f7805c) {
            if (d0Var.f7804b.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(d0Var.f7804b);
            }
            d0Var.f7804b = unmodifiableMap;
            if (d0Var.f7807e.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = DesugarCollections.unmodifiableMap(d0Var.f7807e);
            }
            d0Var.f7807e = unmodifiableMap2;
            d0Var.f7805c = true;
        }
        this.f7864b = true;
    }

    public final Object clone() {
        C0540q c0540q = new C0540q();
        d0 d0Var = this.f7863a;
        if (d0Var.f7803a.size() <= 0) {
            Iterator it = d0Var.d().iterator();
            if (!it.hasNext()) {
                return c0540q;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                entry.getValue();
                throw null;
            }
            throw new ClassCastException();
        }
        Map.Entry c8 = d0Var.c(0);
        if (c8.getKey() == null) {
            c8.getValue();
            throw null;
        }
        throw new ClassCastException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0540q)) {
            return false;
        }
        return this.f7863a.equals(((C0540q) obj).f7863a);
    }

    public final int hashCode() {
        return this.f7863a.hashCode();
    }

    public C0540q(int i7) {
        a();
        a();
    }
}
