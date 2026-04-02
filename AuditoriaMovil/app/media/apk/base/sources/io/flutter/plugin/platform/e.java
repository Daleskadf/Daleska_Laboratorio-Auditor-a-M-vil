package io.flutter.plugin.platform;

import O0.RunnableC0240b;
import android.view.View;
/* loaded from: classes.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f11693a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B.a f11694b;

    public e(B.a aVar, View view) {
        this.f11694b = aVar;
        this.f11693a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i7) {
        this.f11693a.post(new RunnableC0240b(this, i7, 1));
    }
}
