package b4;

import a4.C0450C;
import a4.C0460i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
/* renamed from: b4.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601i {

    /* renamed from: a  reason: collision with root package name */
    public final C0599g f8264a;

    public C0601i(C0599g c0599g) {
        this.f8264a = c0599g;
    }

    public final Task a(a4.t tVar, String str) {
        com.google.android.gms.common.internal.I.i(tVar);
        C0599g c0599g = this.f8264a;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(U3.h.e(c0599g.f8255c));
        firebaseAuth.getClass();
        if (tVar instanceof a4.z) {
            return firebaseAuth.f9707e.zza(firebaseAuth.f9703a, (a4.z) tVar, c0599g, str, new C0460i(firebaseAuth));
        } else if (tVar instanceof C0450C) {
            return firebaseAuth.f9707e.zza(firebaseAuth.f9703a, (C0450C) tVar, c0599g, str, firebaseAuth.f9711k, new C0460i(firebaseAuth));
        } else {
            return Tasks.forException(zzadr.zza(new Status(17499, null, null, null)));
        }
    }
}
