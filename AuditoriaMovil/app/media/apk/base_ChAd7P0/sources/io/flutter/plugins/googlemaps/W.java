package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class W {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f12082a;

    /* renamed from: b  reason: collision with root package name */
    public Long f12083b;

    /* renamed from: c  reason: collision with root package name */
    public Long f12084c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f12085d;

    /* renamed from: e  reason: collision with root package name */
    public Long f12086e;
    public Double f;

    /* renamed from: g  reason: collision with root package name */
    public f0 f12087g;

    /* renamed from: h  reason: collision with root package name */
    public Double f12088h;

    /* renamed from: i  reason: collision with root package name */
    public String f12089i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w2 = (W) obj;
        if (this.f12082a.equals(w2.f12082a) && this.f12083b.equals(w2.f12083b) && this.f12084c.equals(w2.f12084c) && this.f12085d.equals(w2.f12085d) && this.f12086e.equals(w2.f12086e) && this.f.equals(w2.f) && this.f12087g.equals(w2.f12087g) && this.f12088h.equals(w2.f12088h) && this.f12089i.equals(w2.f12089i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12082a, this.f12083b, this.f12084c, this.f12085d, this.f12086e, this.f, this.f12087g, this.f12088h, this.f12089i);
    }
}
