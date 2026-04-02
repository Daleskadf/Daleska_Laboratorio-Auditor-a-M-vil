package a4;

import b4.C0591E;
import b4.C0604l;
import b4.InterfaceC0608p;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public final class Q implements InterfaceC0608p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC0467p f7003a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7004b;

    public Q(FirebaseAuth firebaseAuth, AbstractC0467p abstractC0467p) {
        this.f7003a = abstractC0467p;
        this.f7004b = firebaseAuth;
    }

    @Override // b4.InterfaceC0607o
    public final void zza(Status status) {
        int i7 = status.f9153a;
        if (i7 == 17011 || i7 == 17021 || i7 == 17005) {
            FirebaseAuth firebaseAuth = this.f7004b;
            firebaseAuth.r();
            C0591E c0591e = firebaseAuth.f9724x;
            if (c0591e != null) {
                C0604l c0604l = c0591e.f8187b;
                c0604l.f8278d.removeCallbacks(c0604l.f8279e);
            }
        }
    }
}
