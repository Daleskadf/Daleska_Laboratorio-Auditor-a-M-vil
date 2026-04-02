package X0;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final String f6366a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6367b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6368c;

    public v(String str, boolean z7, boolean z8) {
        this.f6366a = str;
        this.f6367b = z7;
        this.f6368c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != v.class) {
            return false;
        }
        v vVar = (v) obj;
        if (TextUtils.equals(this.f6366a, vVar.f6366a) && this.f6367b == vVar.f6367b && this.f6368c == vVar.f6368c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (this.f6366a.hashCode() + 31) * 31;
        int i8 = 1237;
        if (this.f6367b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i9 = (hashCode + i7) * 31;
        if (this.f6368c) {
            i8 = 1231;
        }
        return i9 + i8;
    }
}
