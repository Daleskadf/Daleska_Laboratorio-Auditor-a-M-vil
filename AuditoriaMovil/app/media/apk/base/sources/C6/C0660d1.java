package c6;

import D.AbstractC0055e;
import a.AbstractC0412a;
import a6.C0475d;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
/* renamed from: c6.d1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660d1 {

    /* renamed from: g  reason: collision with root package name */
    public static final C0475d f8804g = new C0475d("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 0);

    /* renamed from: a  reason: collision with root package name */
    public final Long f8805a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f8806b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f8807c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f8808d;

    /* renamed from: e  reason: collision with root package name */
    public final a2 f8809e;
    public final C0680k0 f;

    public C0660d1(Map map, boolean z7, int i7, int i8) {
        Map map2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        a2 a2Var;
        Map map3;
        boolean z15;
        boolean z16;
        C0680k0 c0680k0;
        boolean z17;
        boolean z18;
        this.f8805a = C0.i("timeout", map);
        this.f8806b = C0.b("waitForReady", map);
        Integer f = C0.f("maxResponseMessageBytes", map);
        this.f8807c = f;
        if (f != null) {
            if (f.intValue() >= 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            G.i.e(f, "maxInboundMessageSize %s exceeds bounds", z18);
        }
        Integer f4 = C0.f("maxRequestMessageBytes", map);
        this.f8808d = f4;
        if (f4 != null) {
            if (f4.intValue() >= 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            G.i.e(f4, "maxOutboundMessageSize %s exceeds bounds", z17);
        }
        if (z7) {
            map2 = C0.g("retryPolicy", map);
        } else {
            map2 = null;
        }
        if (map2 == null) {
            a2Var = null;
        } else {
            Integer f8 = C0.f("maxAttempts", map2);
            G.i.j(f8, "maxAttempts cannot be empty");
            int intValue = f8.intValue();
            if (intValue >= 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            G.i.d(intValue, "maxAttempts must be greater than 1: %s", z8);
            int min = Math.min(intValue, i7);
            Long i9 = C0.i("initialBackoff", map2);
            G.i.j(i9, "initialBackoff cannot be empty");
            long longValue = i9.longValue();
            if (longValue > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            G.i.h(z9, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long i10 = C0.i("maxBackoff", map2);
            G.i.j(i10, "maxBackoff cannot be empty");
            long longValue2 = i10.longValue();
            if (longValue2 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            G.i.h(z10, "maxBackoff must be greater than 0: %s", longValue2);
            Double e7 = C0.e("backoffMultiplier", map2);
            G.i.j(e7, "backoffMultiplier cannot be empty");
            double doubleValue = e7.doubleValue();
            if (doubleValue > 0.0d) {
                z11 = true;
            } else {
                z11 = false;
            }
            G.i.e(e7, "backoffMultiplier must be greater than 0: %s", z11);
            Long i11 = C0.i("perAttemptRecvTimeout", map2);
            if (i11 != null && i11.longValue() < 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            G.i.e(i11, "perAttemptRecvTimeout cannot be negative: %s", z12);
            Set o7 = k2.o("retryableStatusCodes", map2);
            if (o7 != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            AbstractC0412a.g0("retryableStatusCodes", "%s is required in retry policy", z13);
            AbstractC0412a.g0("retryableStatusCodes", "%s must not contain OK", !o7.contains(a6.n0.OK));
            if (i11 == null && o7.isEmpty()) {
                z14 = false;
            } else {
                z14 = true;
            }
            G.i.f("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", z14);
            a2Var = new a2(min, longValue, longValue2, doubleValue, i11, o7);
        }
        this.f8809e = a2Var;
        if (z7) {
            map3 = C0.g("hedgingPolicy", map);
        } else {
            map3 = null;
        }
        if (map3 == null) {
            c0680k0 = null;
        } else {
            Integer f9 = C0.f("maxAttempts", map3);
            G.i.j(f9, "maxAttempts cannot be empty");
            int intValue2 = f9.intValue();
            if (intValue2 >= 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            G.i.d(intValue2, "maxAttempts must be greater than 1: %s", z15);
            int min2 = Math.min(intValue2, i8);
            Long i12 = C0.i("hedgingDelay", map3);
            G.i.j(i12, "hedgingDelay cannot be empty");
            long longValue3 = i12.longValue();
            if (longValue3 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            G.i.h(z16, "hedgingDelay must not be negative: %s", longValue3);
            Set o8 = k2.o("nonFatalStatusCodes", map3);
            if (o8 == null) {
                o8 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(a6.n0.class));
            } else {
                AbstractC0412a.g0("nonFatalStatusCodes", "%s must not contain OK", !o8.contains(a6.n0.OK));
            }
            c0680k0 = new C0680k0(min2, longValue3, o8);
        }
        this.f = c0680k0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0660d1)) {
            return false;
        }
        C0660d1 c0660d1 = (C0660d1) obj;
        if (!F.f.l(this.f8805a, c0660d1.f8805a) || !F.f.l(this.f8806b, c0660d1.f8806b) || !F.f.l(this.f8807c, c0660d1.f8807c) || !F.f.l(this.f8808d, c0660d1.f8808d) || !F.f.l(this.f8809e, c0660d1.f8809e) || !F.f.l(this.f, c0660d1.f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8805a, this.f8806b, this.f8807c, this.f8808d, this.f8809e, this.f});
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f8805a, "timeoutNanos");
        C7.a(this.f8806b, "waitForReady");
        C7.a(this.f8807c, "maxInboundMessageSize");
        C7.a(this.f8808d, "maxOutboundMessageSize");
        C7.a(this.f8809e, "retryPolicy");
        C7.a(this.f, "hedgingPolicy");
        return C7.toString();
    }
}
