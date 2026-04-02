package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public String f12286a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f12287b;

    /* renamed from: c  reason: collision with root package name */
    public Double f12288c;

    /* renamed from: d  reason: collision with root package name */
    public Long f12289d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f12290e;
    public Long f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f12286a.equals(u0Var.f12286a) && this.f12287b.equals(u0Var.f12287b) && this.f12288c.equals(u0Var.f12288c) && this.f12289d.equals(u0Var.f12289d) && this.f12290e.equals(u0Var.f12290e) && this.f.equals(u0Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12286a, this.f12287b, this.f12288c, this.f12289d, this.f12290e, this.f);
    }
}
