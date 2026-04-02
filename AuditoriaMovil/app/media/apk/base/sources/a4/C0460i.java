package a4;

import b4.C0599g;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import com.google.firebase.auth.FirebaseAuth;
/* renamed from: a4.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460i implements b4.M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7037a;

    public C0460i(FirebaseAuth firebaseAuth) {
        this.f7037a = firebaseAuth;
    }

    @Override // b4.M
    public final void a(zzagw zzagwVar, AbstractC0467p abstractC0467p) {
        com.google.android.gms.common.internal.I.i(zzagwVar);
        com.google.android.gms.common.internal.I.i(abstractC0467p);
        ((C0599g) abstractC0467p).f8253a = zzagwVar;
        FirebaseAuth firebaseAuth = this.f7037a;
        firebaseAuth.getClass();
        FirebaseAuth.n(firebaseAuth, abstractC0467p, zzagwVar, true, false);
    }
}
