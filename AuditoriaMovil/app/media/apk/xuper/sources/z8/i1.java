package z8;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y8.c;
import y8.e0;
import y8.o0;
import z8.x1;
/* loaded from: classes3.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public final b f20645a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f20646b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f20647c;

    /* renamed from: d  reason: collision with root package name */
    public final x1.c0 f20648d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f20649e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f20650f;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: g  reason: collision with root package name */
        public static final c.C0345c f20651g = c.C0345c.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a  reason: collision with root package name */
        public final Long f20652a;

        /* renamed from: b  reason: collision with root package name */
        public final Boolean f20653b;

        /* renamed from: c  reason: collision with root package name */
        public final Integer f20654c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f20655d;

        /* renamed from: e  reason: collision with root package name */
        public final y1 f20656e;

        /* renamed from: f  reason: collision with root package name */
        public final s0 f20657f;

        public b(Map map, boolean z10, int i10, int i11) {
            Map map2;
            y1 b10;
            Map map3;
            boolean z11;
            this.f20652a = c2.w(map);
            this.f20653b = c2.x(map);
            Integer l10 = c2.l(map);
            this.f20654c = l10;
            if (l10 != null) {
                if (l10.intValue() >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Preconditions.checkArgument(z11, "maxInboundMessageSize %s exceeds bounds", l10);
            }
            Integer k10 = c2.k(map);
            this.f20655d = k10;
            if (k10 != null) {
                Preconditions.checkArgument(k10.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", k10);
            }
            if (z10) {
                map2 = c2.r(map);
            } else {
                map2 = null;
            }
            if (map2 == null) {
                b10 = null;
            } else {
                b10 = b(map2, i10);
            }
            this.f20656e = b10;
            if (z10) {
                map3 = c2.d(map);
            } else {
                map3 = null;
            }
            this.f20657f = map3 != null ? a(map3, i11) : null;
        }

        public static s0 a(Map map, int i10) {
            boolean z10;
            int intValue = ((Integer) Preconditions.checkNotNull(c2.h(map), "maxAttempts cannot be empty")).intValue();
            boolean z11 = true;
            if (intValue >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i10);
            long longValue = ((Long) Preconditions.checkNotNull(c2.c(map), "hedgingDelay cannot be empty")).longValue();
            if (longValue < 0) {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "hedgingDelay must not be negative: %s", longValue);
            return new s0(min, longValue, c2.p(map));
        }

        public static y1 b(Map map, int i10) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            int intValue = ((Integer) Preconditions.checkNotNull(c2.i(map), "maxAttempts cannot be empty")).intValue();
            boolean z15 = true;
            if (intValue >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i10);
            long longValue = ((Long) Preconditions.checkNotNull(c2.e(map), "initialBackoff cannot be empty")).longValue();
            if (longValue > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) Preconditions.checkNotNull(c2.j(map), "maxBackoff cannot be empty")).longValue();
            if (longValue2 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            Preconditions.checkArgument(z12, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((Double) Preconditions.checkNotNull(c2.a(map), "backoffMultiplier cannot be empty")).doubleValue();
            if (doubleValue > 0.0d) {
                z13 = true;
            } else {
                z13 = false;
            }
            Preconditions.checkArgument(z13, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long q10 = c2.q(map);
            if (q10 != null && q10.longValue() < 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            Preconditions.checkArgument(z14, "perAttemptRecvTimeout cannot be negative: %s", q10);
            Set s10 = c2.s(map);
            if (q10 == null && s10.isEmpty()) {
                z15 = false;
            }
            Preconditions.checkArgument(z15, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new y1(min, longValue, longValue2, doubleValue, q10, s10);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!Objects.equal(this.f20652a, bVar.f20652a) || !Objects.equal(this.f20653b, bVar.f20653b) || !Objects.equal(this.f20654c, bVar.f20654c) || !Objects.equal(this.f20655d, bVar.f20655d) || !Objects.equal(this.f20656e, bVar.f20656e) || !Objects.equal(this.f20657f, bVar.f20657f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(this.f20652a, this.f20653b, this.f20654c, this.f20655d, this.f20656e, this.f20657f);
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("timeoutNanos", this.f20652a).add("waitForReady", this.f20653b).add("maxInboundMessageSize", this.f20654c).add("maxOutboundMessageSize", this.f20655d).add("retryPolicy", this.f20656e).add("hedgingPolicy", this.f20657f).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends y8.e0 {

        /* renamed from: b  reason: collision with root package name */
        public final i1 f20658b;

        @Override // y8.e0
        public e0.b a(o0.f fVar) {
            return e0.b.d().b(this.f20658b).a();
        }

        public c(i1 i1Var) {
            this.f20658b = i1Var;
        }
    }

    public i1(b bVar, Map map, Map map2, x1.c0 c0Var, Object obj, Map map3) {
        Map map4;
        this.f20645a = bVar;
        this.f20646b = Collections.unmodifiableMap(new HashMap(map));
        this.f20647c = Collections.unmodifiableMap(new HashMap(map2));
        this.f20648d = c0Var;
        this.f20649e = obj;
        if (map3 != null) {
            map4 = Collections.unmodifiableMap(new HashMap(map3));
        } else {
            map4 = null;
        }
        this.f20650f = map4;
    }

    public static i1 a() {
        return new i1(null, new HashMap(), new HashMap(), null, null, null);
    }

    public static i1 b(Map map, boolean z10, int i10, int i11, Object obj) {
        x1.c0 c0Var;
        if (z10) {
            c0Var = c2.v(map);
        } else {
            c0Var = null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map b10 = c2.b(map);
        List<Map> m10 = c2.m(map);
        if (m10 == null) {
            return new i1(null, hashMap, hashMap2, c0Var, obj, b10);
        }
        b bVar = null;
        for (Map map2 : m10) {
            b bVar2 = new b(map2, z10, i10, i11);
            List<Map> o10 = c2.o(map2);
            if (o10 != null && !o10.isEmpty()) {
                for (Map map3 : o10) {
                    String t10 = c2.t(map3);
                    String n10 = c2.n(map3);
                    boolean z11 = true;
                    if (Strings.isNullOrEmpty(t10)) {
                        Preconditions.checkArgument(Strings.isNullOrEmpty(n10), "missing service name for method %s", n10);
                        if (bVar != null) {
                            z11 = false;
                        }
                        Preconditions.checkArgument(z11, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (Strings.isNullOrEmpty(n10)) {
                        Preconditions.checkArgument(!hashMap2.containsKey(t10), "Duplicate service %s", t10);
                        hashMap2.put(t10, bVar2);
                    } else {
                        String b11 = y8.w0.b(t10, n10);
                        Preconditions.checkArgument(!hashMap.containsKey(b11), "Duplicate method name %s", b11);
                        hashMap.put(b11, bVar2);
                    }
                }
            }
        }
        return new i1(bVar, hashMap, hashMap2, c0Var, obj, b10);
    }

    public y8.e0 c() {
        if (this.f20647c.isEmpty() && this.f20646b.isEmpty() && this.f20645a == null) {
            return null;
        }
        return new c();
    }

    public Map d() {
        return this.f20650f;
    }

    public Object e() {
        return this.f20649e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (Objects.equal(this.f20645a, i1Var.f20645a) && Objects.equal(this.f20646b, i1Var.f20646b) && Objects.equal(this.f20647c, i1Var.f20647c) && Objects.equal(this.f20648d, i1Var.f20648d) && Objects.equal(this.f20649e, i1Var.f20649e)) {
            return true;
        }
        return false;
    }

    public b f(y8.w0 w0Var) {
        b bVar = (b) this.f20646b.get(w0Var.c());
        if (bVar == null) {
            bVar = (b) this.f20647c.get(w0Var.d());
        }
        if (bVar == null) {
            return this.f20645a;
        }
        return bVar;
    }

    public x1.c0 g() {
        return this.f20648d;
    }

    public int hashCode() {
        return Objects.hashCode(this.f20645a, this.f20646b, this.f20647c, this.f20648d, this.f20649e);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("defaultMethodConfig", this.f20645a).add("serviceMethodMap", this.f20646b).add("serviceMap", this.f20647c).add("retryThrottling", this.f20648d).add("loadBalancingConfig", this.f20649e).toString();
    }
}
