package m5;

import com.google.android.gms.tasks.OnFailureListener;
/* loaded from: classes.dex */
public final /* synthetic */ class g implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ g f14061a = new Object();

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        c.f14054e.a(exc, "MobileVisionBase", "Error preloading model resource");
    }
}
