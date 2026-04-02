package com.umeng.message.proguard;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.umeng.message.proguard.do  reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cdo {

    /* renamed from: a  reason: collision with root package name */
    eg f11959a;

    /* renamed from: b  reason: collision with root package name */
    a f11960b;

    /* renamed from: c  reason: collision with root package name */
    dp f11961c;

    /* renamed from: com.umeng.message.proguard.do$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(View view);
    }

    public final boolean a() {
        return this.f11959a != null;
    }

    public final void b() {
        ViewGroup viewGroup;
        bz.a().b(this.f11961c);
        eg egVar = this.f11959a;
        if (egVar != null && (viewGroup = (ViewGroup) egVar.getParent()) != null) {
            viewGroup.removeView(this.f11959a);
        }
        this.f11961c = null;
        this.f11959a = null;
        this.f11960b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Activity activity) {
        ViewGroup b10;
        eg egVar = this.f11959a;
        if (egVar == null || (b10 = b(activity)) == null || egVar.getParent() == b10) {
            return;
        }
        if (egVar.getParent() != null) {
            ((ViewGroup) egVar.getParent()).removeView(egVar);
        }
        if (activity.isFinishing()) {
            ce.b("FloatingIcon", "activity has finished skip.");
        } else if (ed.a(activity)) {
            ce.b("FloatingIcon", "activity window not match skipped.");
        } else if (dt.a().a((Class<? extends Activity>) activity.getClass())) {
        } else {
            b10.addView(egVar);
            ce.b("FloatingIcon", "onShow");
        }
    }

    public static ViewGroup b(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return (ViewGroup) window.getDecorView().findViewById(16908290);
        } catch (Throwable unused) {
            return null;
        }
    }
}
