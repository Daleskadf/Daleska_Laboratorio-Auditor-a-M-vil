package io.flutter.view;

import android.view.View;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final View f12525a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12526b;

    public q(View view, int i7) {
        this.f12525a = view;
        this.f12526b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f12526b == qVar.f12526b && this.f12525a.equals(qVar.f12525a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12525a.hashCode() + 31) * 31) + this.f12526b;
    }
}
