package com.google.firebase.firestore;

import D.AbstractC0059i;
import H4.p1;
import a6.t0;
import j$.util.Objects;
import java.util.Map;
/* renamed from: com.google.firebase.firestore.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804f {

    /* renamed from: a  reason: collision with root package name */
    public final C0803e f9806a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f9807b;

    public C0804f(C0803e c0803e, Map map) {
        c0803e.getClass();
        this.f9806a = c0803e;
        this.f9807b = map;
    }

    public final long a() {
        Long l8 = null;
        AbstractC0802d abstractC0802d = new AbstractC0802d(null, "count");
        Number number = (Number) c(abstractC0802d);
        if (number != null) {
            l8 = Long.valueOf(number.longValue());
        }
        if (l8 != null) {
            return l8.longValue();
        }
        throw new IllegalArgumentException(AbstractC0059i.D(new StringBuilder("RunAggregationQueryResponse alias "), abstractC0802d.f9802c, " is null"));
    }

    public final Object b(AbstractC0802d abstractC0802d) {
        Map map = this.f9807b;
        String str = abstractC0802d.f9802c;
        if (map.containsKey(str)) {
            return new t0(9, this.f9806a.f9803a.f9809b, EnumC0815q.DEFAULT).q((p1) map.get(str));
        }
        throw new IllegalArgumentException("'" + abstractC0802d.f9801b + "(" + abstractC0802d.a() + ")' was not requested in the aggregation query.");
    }

    public final Object c(AbstractC0802d abstractC0802d) {
        Object b5 = b(abstractC0802d);
        if (b5 == null) {
            return null;
        }
        if (Number.class.isInstance(b5)) {
            return Number.class.cast(b5);
        }
        throw new RuntimeException("AggregateField '" + abstractC0802d.f9802c + "' is not a " + Number.class.getName());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0804f)) {
            return false;
        }
        C0804f c0804f = (C0804f) obj;
        if (this.f9806a.equals(c0804f.f9806a) && this.f9807b.equals(c0804f.f9807b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9806a, this.f9807b);
    }
}
