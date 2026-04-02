package io.flutter.plugins.imagepicker;

import j$.util.Objects;
import java.util.List;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public n f12370a;

    /* renamed from: b  reason: collision with root package name */
    public l f12371b;

    /* renamed from: c  reason: collision with root package name */
    public List f12372c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f12370a.equals(mVar.f12370a) && Objects.equals(this.f12371b, mVar.f12371b) && this.f12372c.equals(mVar.f12372c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12370a, this.f12371b, this.f12372c);
    }
}
