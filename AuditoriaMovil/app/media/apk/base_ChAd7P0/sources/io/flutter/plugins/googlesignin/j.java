package io.flutter.plugins.googlesignin;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public String f12334a;

    /* renamed from: b  reason: collision with root package name */
    public String f12335b;

    /* renamed from: c  reason: collision with root package name */
    public String f12336c;

    /* renamed from: d  reason: collision with root package name */
    public String f12337d;

    /* renamed from: e  reason: collision with root package name */
    public String f12338e;
    public String f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (Objects.equals(this.f12334a, jVar.f12334a) && this.f12335b.equals(jVar.f12335b) && this.f12336c.equals(jVar.f12336c) && Objects.equals(this.f12337d, jVar.f12337d) && Objects.equals(this.f12338e, jVar.f12338e) && Objects.equals(this.f, jVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12334a, this.f12335b, this.f12336c, this.f12337d, this.f12338e, this.f);
    }
}
