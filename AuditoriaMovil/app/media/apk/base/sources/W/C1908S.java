package w;

import D.t0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.o0;
import b3.C0585f;
import b4.C0610s;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import k6.InterfaceC1408a;
import n4.EnumC1520f;
import p.C1608t;
/* renamed from: w.S  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1908S implements F2.b {

    /* renamed from: a  reason: collision with root package name */
    public Object f16112a;

    /* renamed from: b  reason: collision with root package name */
    public Object f16113b;

    /* renamed from: c  reason: collision with root package name */
    public Object f16114c;

    /* renamed from: d  reason: collision with root package name */
    public Object f16115d;

    /* renamed from: e  reason: collision with root package name */
    public Object f16116e;
    public Object f;

    public /* synthetic */ C1908S(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f16112a = obj;
        this.f16113b = obj2;
        this.f16114c = obj3;
        this.f16115d = obj4;
        this.f16116e = obj5;
        this.f = obj6;
    }

    public o0 a() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.f16115d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        j0 d7 = j0.d((C1907Q) this.f16114c, size);
        d7.f7639b.f752a = 1;
        t0 t0Var = new t0(surface);
        this.f16112a = t0Var;
        E3.b d8 = H.i.d(t0Var.f7552e);
        C1608t c1608t = new C1608t(17, surface, surfaceTexture);
        d8.a(new H.h(0, d8, c1608t), j3.f.r());
        d7.b((t0) this.f16112a, D.D.f607d, -1);
        k0 k0Var = (k0) this.f;
        if (k0Var != null) {
            k0Var.b();
        }
        k0 k0Var2 = new k0(new D.H(this, 4));
        this.f = k0Var2;
        d7.f = k0Var2;
        return d7.c();
    }

    public t4.y b(int i7) {
        HashMap hashMap = (HashMap) this.f16113b;
        t4.y yVar = (t4.y) hashMap.get(Integer.valueOf(i7));
        if (yVar == null) {
            t4.y yVar2 = new t4.y();
            hashMap.put(Integer.valueOf(i7), yVar2);
            return yVar2;
        }
        return yVar;
    }

    public boolean c(int i7) {
        if (d(i7) != null) {
            return true;
        }
        return false;
    }

    public p4.Y d(int i7) {
        t4.y yVar = (t4.y) ((HashMap) this.f16113b).get(Integer.valueOf(i7));
        if (yVar != null && yVar.f15855a != 0) {
            return null;
        }
        return (p4.Y) ((O0.d0) this.f16112a).f3686a.get(Integer.valueOf(i7));
    }

    public void e(int i7, q4.h hVar, q4.n nVar) {
        if (!c(i7)) {
            return;
        }
        t4.y b5 = b(i7);
        boolean e7 = ((C0585f) ((O0.d0) this.f16112a).f3689d).H(i7).f10876a.e(hVar);
        HashMap hashMap = b5.f15856b;
        if (e7) {
            EnumC1520f enumC1520f = EnumC1520f.REMOVED;
            b5.f15857c = true;
            hashMap.put(hVar, enumC1520f);
        } else {
            b5.f15857c = true;
            hashMap.remove(hVar);
        }
        Set set = (Set) ((HashMap) this.f16115d).get(hVar);
        if (set == null) {
            set = new HashSet();
            ((HashMap) this.f16115d).put(hVar, set);
        }
        set.add(Integer.valueOf(i7));
        if (nVar != null) {
            ((HashMap) this.f16114c).put(hVar, nVar);
        }
    }

    public void f(int i7) {
        boolean z7;
        HashMap hashMap = (HashMap) this.f16113b;
        if (hashMap.get(Integer.valueOf(i7)) != null && ((t4.y) hashMap.get(Integer.valueOf(i7))).f15855a == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Should only reset active targets", z7, new Object[0]);
        hashMap.put(Integer.valueOf(i7), new t4.y());
        Iterator it = ((C0585f) ((O0.d0) this.f16112a).f3689d).H(i7).iterator();
        while (true) {
            e4.d dVar = (e4.d) it;
            if (((Iterator) dVar.f10875b).hasNext()) {
                e(i7, (q4.h) dVar.next(), null);
            } else {
                return;
            }
        }
    }

    public Task g(String str, Boolean bool) {
        Task j;
        if (zzae.zzc(str)) {
            str = "*";
        }
        if (!bool.booleanValue() && (j = j(str)) != null) {
            return j;
        }
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f16116e;
        return firebaseAuth.f9707e.zza(firebaseAuth.f9711k, "RECAPTCHA_ENTERPRISE").continueWithTask(new a6.t0(this, str));
    }

    @Override // k6.InterfaceC1408a
    public Object get() {
        return new I2.g((Context) ((F2.c) this.f16112a).f1160a, (E2.f) ((InterfaceC1408a) this.f16113b).get(), (J2.c) ((InterfaceC1408a) this.f16114c).get(), (I2.d) ((V2.k) this.f16115d).get(), (Executor) ((InterfaceC1408a) this.f16116e).get(), (K2.c) ((InterfaceC1408a) this.f).get(), new e5.b(7));
    }

    public Task h(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        if (zzae.zzc(str)) {
            str = "*";
        }
        Task j = j(str);
        if (bool.booleanValue() || j == null) {
            j = g(str, bool);
        }
        return j.continueWithTask(new C0610s(recaptchaAction, 4));
    }

    public boolean i() {
        String zzb;
        zzagt zzagtVar = (zzagt) this.f16114c;
        if (zzagtVar == null || (zzb = zzagtVar.zzb("PHONE_PROVIDER")) == null) {
            return false;
        }
        return zzb.equals("AUDIT");
    }

    public Task j(String str) {
        Task task;
        synchronized (this.f16112a) {
            task = (Task) ((HashMap) this.f16113b).get(str);
        }
        return task;
    }

    public C1908S(U3.h hVar, FirebaseAuth firebaseAuth) {
        Object obj = new Object();
        this.f16112a = new Object();
        this.f16113b = new HashMap();
        this.f16115d = hVar;
        this.f16116e = firebaseAuth;
        this.f = obj;
    }
}
