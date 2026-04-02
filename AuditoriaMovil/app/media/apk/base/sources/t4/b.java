package T4;

import M3.n;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import s3.C1786n;
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final e f5337a;

    /* renamed from: b  reason: collision with root package name */
    public final C1786n f5338b;

    /* renamed from: c  reason: collision with root package name */
    public final LatLng f5339c;

    /* renamed from: d  reason: collision with root package name */
    public final LatLng f5340d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5341e;
    public U4.b f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f5342g;

    public b(h hVar, e eVar, LatLng latLng, LatLng latLng2) {
        this.f5342g = hVar;
        this.f5337a = eVar;
        this.f5338b = eVar.f5355a;
        this.f5339c = latLng;
        this.f5340d = latLng2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f5341e) {
            h hVar = this.f5342g;
            n nVar = hVar.j;
            C1786n c1786n = this.f5338b;
            nVar.c(c1786n);
            hVar.f5377m.c(c1786n);
            U4.a aVar = (U4.a) this.f.f5773a.get(c1786n);
            if (aVar != null && aVar.f5767a.remove(c1786n)) {
                aVar.f5768b.f5773a.remove(c1786n);
                c1786n.getClass();
                try {
                    c1786n.f15625a.zzo();
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        this.f5337a.f5356b = this.f5340d;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LatLng latLng;
        C1786n c1786n;
        LatLng latLng2 = this.f5340d;
        if (latLng2 != null && (latLng = this.f5339c) != null && (c1786n = this.f5338b) != null) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            double d7 = latLng2.f9463a;
            double d8 = latLng.f9463a;
            double d9 = animatedFraction;
            double d10 = ((d7 - d8) * d9) + d8;
            double d11 = latLng2.f9464b - latLng.f9464b;
            if (Math.abs(d11) > 180.0d) {
                d11 -= Math.signum(d11) * 360.0d;
            }
            c1786n.c(new LatLng(d10, (d11 * d9) + latLng.f9464b));
        }
    }
}
