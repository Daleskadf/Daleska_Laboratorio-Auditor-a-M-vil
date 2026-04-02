package io.flutter.plugins.videoplayer;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Long f12413a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return this.f12413a.equals(((i) obj).f12413a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12413a);
    }
}
