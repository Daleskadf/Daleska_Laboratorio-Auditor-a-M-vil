package io.flutter.plugins.videoplayer;

import j$.util.Objects;
import java.util.Map;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public String f12407a;

    /* renamed from: b  reason: collision with root package name */
    public String f12408b;

    /* renamed from: c  reason: collision with root package name */
    public String f12409c;

    /* renamed from: d  reason: collision with root package name */
    public String f12410d;

    /* renamed from: e  reason: collision with root package name */
    public Map f12411e;
    public j f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (Objects.equals(this.f12407a, gVar.f12407a) && Objects.equals(this.f12408b, gVar.f12408b) && Objects.equals(this.f12409c, gVar.f12409c) && Objects.equals(this.f12410d, gVar.f12410d) && this.f12411e.equals(gVar.f12411e) && Objects.equals(this.f, gVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12407a, this.f12408b, this.f12409c, this.f12410d, this.f12411e, this.f);
    }
}
