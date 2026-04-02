package androidx.lifecycle;

import android.os.Bundle;
/* loaded from: classes.dex */
public final /* synthetic */ class L implements Z1.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7898a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7899b;

    public /* synthetic */ L(Object obj, int i7) {
        this.f7898a = i7;
        this.f7899b = obj;
    }

    @Override // Z1.d
    public final Bundle a() {
        switch (this.f7898a) {
            case 0:
                return M.a((M) this.f7899b);
            default:
                return ((z0.L) this.f7899b).V();
        }
    }
}
