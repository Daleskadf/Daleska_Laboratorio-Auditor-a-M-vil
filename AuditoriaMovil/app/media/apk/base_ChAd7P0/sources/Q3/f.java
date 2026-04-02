package q3;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;
import p4.P;
/* loaded from: classes.dex */
public final class f extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final k f15322a;

    public f(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f15322a = new k(this, context, googleMapOptions);
        setClickable(true);
    }

    public final void a(Bundle bundle) {
        k kVar = this.f15322a;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            kVar.getClass();
            kVar.k(bundle, new i3.c(kVar, bundle));
            if (((P) kVar.f15330b) == null) {
                k.i(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
