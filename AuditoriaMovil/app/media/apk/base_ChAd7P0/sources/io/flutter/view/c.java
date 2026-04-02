package io.flutter.view;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
/* loaded from: classes.dex */
public final class c extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f12432a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, Handler handler) {
        super(handler);
        this.f12432a = oVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7, Uri uri) {
        o oVar = this.f12432a;
        if (oVar.f12515u) {
            return;
        }
        if (Settings.Global.getFloat(oVar.f, "transition_animation_scale", 1.0f) == 0.0f) {
            oVar.f12506l = f.DISABLE_ANIMATIONS.value | oVar.f12506l;
        } else {
            oVar.f12506l = (~f.DISABLE_ANIMATIONS.value) & oVar.f12506l;
        }
        ((FlutterJNI) oVar.f12498b.f5966c).setAccessibilityFeatures(oVar.f12506l);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        onChange(z7, null);
    }
}
