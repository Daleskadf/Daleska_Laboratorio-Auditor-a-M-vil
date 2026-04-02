package a4;

import b4.C0599g;
import b4.InterfaceC0592F;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
/* renamed from: a4.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0467p extends X2.a implements F {
    public abstract String k();

    public abstract boolean l();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a4.h, b4.F] */
    public final Task m() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(U3.h.e(((C0599g) this).f8255c));
        firebaseAuth.getClass();
        return firebaseAuth.f9707e.zza(firebaseAuth.f9703a, this, (InterfaceC0592F) new C0459h(firebaseAuth, 0));
    }

    public abstract C0599g n(ArrayList arrayList);

    public abstract void o(ArrayList arrayList);
}
