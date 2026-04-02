package v4;

import java.util.ArrayList;
/* renamed from: v4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1889a {

    /* renamed from: a  reason: collision with root package name */
    public final String f16054a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16055b;

    public C1889a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16054a = str;
            this.f16055b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1889a)) {
            return false;
        }
        C1889a c1889a = (C1889a) obj;
        if (this.f16054a.equals(c1889a.f16054a) && this.f16055b.equals(c1889a.f16055b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16054a.hashCode() ^ 1000003) * 1000003) ^ this.f16055b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16054a + ", usedDates=" + this.f16055b + "}";
    }
}
