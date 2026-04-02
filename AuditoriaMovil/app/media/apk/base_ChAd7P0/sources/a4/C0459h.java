package a4;

import b4.C0591E;
import b4.C0599g;
import b4.C0604l;
import b4.InterfaceC0607o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import com.google.firebase.auth.FirebaseAuth;
/* renamed from: a4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459h implements InterfaceC0607o, b4.M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7035a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7036b;

    public /* synthetic */ C0459h(FirebaseAuth firebaseAuth, int i7) {
        this.f7035a = i7;
        this.f7036b = firebaseAuth;
    }

    @Override // b4.M
    public final void a(zzagw zzagwVar, AbstractC0467p abstractC0467p) {
        switch (this.f7035a) {
            case 0:
                com.google.android.gms.common.internal.I.i(zzagwVar);
                com.google.android.gms.common.internal.I.i(abstractC0467p);
                ((C0599g) abstractC0467p).f8253a = zzagwVar;
                FirebaseAuth firebaseAuth = this.f7036b;
                firebaseAuth.getClass();
                FirebaseAuth.n(firebaseAuth, abstractC0467p, zzagwVar, true, true);
                return;
            default:
                FirebaseAuth firebaseAuth2 = this.f7036b;
                firebaseAuth2.getClass();
                FirebaseAuth.n(firebaseAuth2, abstractC0467p, zzagwVar, true, true);
                return;
        }
    }

    @Override // b4.InterfaceC0607o
    public final void zza(Status status) {
        switch (this.f7035a) {
            case 0:
                int i7 = status.f9153a;
                if (i7 == 17011 || i7 == 17021 || i7 == 17005 || i7 == 17091) {
                    FirebaseAuth firebaseAuth = this.f7036b;
                    firebaseAuth.r();
                    C0591E c0591e = firebaseAuth.f9724x;
                    if (c0591e != null) {
                        C0604l c0604l = c0591e.f8187b;
                        c0604l.f8278d.removeCallbacks(c0604l.f8279e);
                        return;
                    }
                    return;
                }
                return;
            default:
                int i8 = status.f9153a;
                if (i8 == 17011 || i8 == 17021 || i8 == 17005) {
                    FirebaseAuth firebaseAuth2 = this.f7036b;
                    firebaseAuth2.r();
                    C0591E c0591e2 = firebaseAuth2.f9724x;
                    if (c0591e2 != null) {
                        C0604l c0604l2 = c0591e2.f8187b;
                        c0604l2.f8278d.removeCallbacks(c0604l2.f8279e);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
