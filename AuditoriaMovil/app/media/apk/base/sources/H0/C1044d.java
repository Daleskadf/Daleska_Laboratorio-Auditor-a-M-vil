package h0;

import android.view.DisplayCutout;
import j$.util.Objects;
/* renamed from: h0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044d {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f11187a;

    public C1044d(DisplayCutout displayCutout) {
        this.f11187a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1044d.class == obj.getClass()) {
            return Objects.equals(this.f11187a, ((C1044d) obj).f11187a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f11187a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f11187a + "}";
    }
}
