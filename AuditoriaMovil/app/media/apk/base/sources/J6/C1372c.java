package j6;

import H0.r;
import J1.j;
import J1.l;
import M3.q;
import S.h;
import S3.k;
import Y1.C0406g;
import android.content.Context;
import android.media.CamcorderProfile;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import c4.InterfaceC0635d;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.protobuf.S;
import e5.g;
import j3.InterfaceC1365b;
import j3.InterfaceC1366c;
import java.security.KeyPairGenerator;
import java.security.Provider;
import kotlin.jvm.internal.e;
import m1.InterfaceC1433g;
import s.InterfaceC1749a;
import w.InterfaceC1920e;
/* renamed from: j6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1372c implements InterfaceC1749a, S, j, N6.a, B, k, W, InterfaceC0635d, InterfaceC1366c, InterfaceC1433g, InterfaceC1920e {

    /* renamed from: b  reason: collision with root package name */
    public static C1372c f13459b;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13460a;

    public /* synthetic */ C1372c(int i7) {
        this.f13460a = i7;
    }

    public U c(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.j.d(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (U) newInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }

    @Override // c4.InterfaceC0635d
    public Object d(q qVar) {
        switch (this.f13460a) {
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                g gVar = (g) qVar.a(g.class);
                zzss.zzb("common");
                return new Object();
            default:
                return new e5.k((Context) qVar.a(Context.class));
        }
    }

    @Override // androidx.lifecycle.W
    public U e(e eVar, B0.c cVar) {
        return n(f7.a.R(eVar), cVar);
    }

    @Override // w.InterfaceC1920e
    public CamcorderProfile f(int i7, int i8) {
        return CamcorderProfile.get(i7, i8);
    }

    @Override // S3.k
    public Object g(String str, Provider provider) {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }

    @Override // w.InterfaceC1920e
    public boolean h(int i7, int i8) {
        return CamcorderProfile.hasProfile(i7, i8);
    }

    @Override // J1.j
    public boolean i(r rVar) {
        return false;
    }

    @Override // J1.j
    public l j(r rVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // J1.j
    public int k(r rVar) {
        return 1;
    }

    public U n(Class cls, B0.c cVar) {
        return c(cls);
    }

    @Override // j3.InterfaceC1366c
    public C0406g v(Context context, String str, InterfaceC1365b interfaceC1365b) {
        C0406g c0406g = new C0406g();
        int e7 = interfaceC1365b.e(context, str, true);
        c0406g.f6660b = e7;
        if (e7 != 0) {
            c0406g.f6661c = 1;
        } else {
            int c8 = interfaceC1365b.c(context, str);
            c0406g.f6659a = c8;
            if (c8 != 0) {
                c0406g.f6661c = -1;
            }
        }
        return c0406g;
    }

    public C1372c() {
        this.f13460a = 13;
        new S.k(0);
        new h();
    }

    @Override // m1.InterfaceC1433g
    public long a(long j) {
        return j;
    }

    @Override // s.InterfaceC1749a, z3.i
    public Object apply(Object obj) {
        return obj;
    }
}
