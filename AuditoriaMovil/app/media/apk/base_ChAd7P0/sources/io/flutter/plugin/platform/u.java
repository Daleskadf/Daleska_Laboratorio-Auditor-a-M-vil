package io.flutter.plugin.platform;

import android.os.Build;
/* loaded from: classes.dex */
public final class u implements io.flutter.view.s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f11747a;

    public u(v vVar) {
        this.f11747a = vVar;
    }

    @Override // io.flutter.view.s
    public final void onTrimMemory(int i7) {
        if (i7 == 80 && Build.VERSION.SDK_INT >= 29) {
            this.f11747a.f = true;
        }
    }
}
