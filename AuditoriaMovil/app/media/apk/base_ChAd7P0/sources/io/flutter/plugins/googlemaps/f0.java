package io.flutter.plugins.googlemaps;

import j$.util.Objects;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public Double f12134a;

    /* renamed from: b  reason: collision with root package name */
    public Double f12135b;

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f12134a);
        arrayList.add(this.f12135b);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f12134a.equals(f0Var.f12134a) && this.f12135b.equals(f0Var.f12135b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12134a, this.f12135b);
    }
}
