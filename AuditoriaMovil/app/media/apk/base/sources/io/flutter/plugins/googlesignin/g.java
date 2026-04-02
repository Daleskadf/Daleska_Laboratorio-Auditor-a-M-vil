package io.flutter.plugins.googlesignin;

import j$.util.Objects;
import java.util.List;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public List f12327a;

    /* renamed from: b  reason: collision with root package name */
    public i f12328b;

    /* renamed from: c  reason: collision with root package name */
    public String f12329c;

    /* renamed from: d  reason: collision with root package name */
    public String f12330d;

    /* renamed from: e  reason: collision with root package name */
    public String f12331e;
    public Boolean f;

    /* renamed from: g  reason: collision with root package name */
    public String f12332g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f12327a.equals(gVar.f12327a) && this.f12328b.equals(gVar.f12328b) && Objects.equals(this.f12329c, gVar.f12329c) && Objects.equals(this.f12330d, gVar.f12330d) && Objects.equals(this.f12331e, gVar.f12331e) && this.f.equals(gVar.f) && Objects.equals(this.f12332g, gVar.f12332g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12327a, this.f12328b, this.f12329c, this.f12330d, this.f12331e, this.f, this.f12332g);
    }
}
