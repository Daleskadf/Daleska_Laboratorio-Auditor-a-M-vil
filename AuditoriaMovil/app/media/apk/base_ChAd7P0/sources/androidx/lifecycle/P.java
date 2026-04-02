package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
/* loaded from: classes.dex */
public final class P implements Z1.d {

    /* renamed from: a  reason: collision with root package name */
    public final K5.s f7911a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7912b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f7913c;

    /* renamed from: d  reason: collision with root package name */
    public final l6.g f7914d;

    public P(K5.s savedStateRegistry, Y y2) {
        kotlin.jvm.internal.j.e(savedStateRegistry, "savedStateRegistry");
        this.f7911a = savedStateRegistry;
        this.f7914d = m5.d.m(new R6.d(y2, 1));
    }

    @Override // Z1.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f7913c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((Q) this.f7914d.a()).f7915b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a7 = ((M) entry.getValue()).f7904e.a();
            if (!kotlin.jvm.internal.j.a(a7, Bundle.EMPTY)) {
                bundle.putBundle(str, a7);
            }
        }
        this.f7912b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f7912b) {
            Bundle a7 = this.f7911a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f7913c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (a7 != null) {
                bundle.putAll(a7);
            }
            this.f7913c = bundle;
            this.f7912b = true;
            Q q2 = (Q) this.f7914d.a();
        }
    }
}
