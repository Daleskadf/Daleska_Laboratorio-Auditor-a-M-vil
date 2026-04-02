package t2;

import A3.I;
import A3.K;
import A3.e0;
import X0.x;
import Y1.C0406g;
import android.content.Context;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.InterfaceC0518u;
import androidx.camera.core.impl.j0;
import androidx.datastore.preferences.protobuf.Y;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import c4.InterfaceC0635d;
import c5.C0639a;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.protobuf.S;
import d5.C0901c;
import f5.C0993a;
import j3.InterfaceC1365b;
import j3.InterfaceC1366c;
import java.security.Provider;
import java.util.NoSuchElementException;
import javax.crypto.Mac;
import m1.InterfaceC1426A;
import p4.InterfaceC1694y;
/* loaded from: classes.dex */
public class i implements W, S, L5.p, B, S3.k, V0.p, x, InterfaceC0518u, InterfaceC0635d, f1.m, InterfaceC1366c, m1.q, InterfaceC1694y {

    /* renamed from: b  reason: collision with root package name */
    public static i f15734b;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15735a;

    public /* synthetic */ i(int i7) {
        this.f15735a = i7;
    }

    public static synchronized i C() {
        i iVar;
        synchronized (i.class) {
            try {
                if (f15734b == null) {
                    f15734b = new i(0);
                }
                iVar = f15734b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
        if (r11 != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean D(w0.C1943b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.i.D(w0.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // X0.x
    public boolean A() {
        return false;
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public E3.b B(boolean z7) {
        return H.k.f1628c;
    }

    public boolean E(CharSequence charSequence) {
        return charSequence instanceof f0.e;
    }

    @Override // f1.m
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public G b() {
        return null;
    }

    @Override // androidx.lifecycle.W
    public U c(Class cls) {
        return new D0.c();
    }

    @Override // c4.InterfaceC0635d
    public Object d(M3.q qVar) {
        switch (this.f15735a) {
            case 15:
                e5.g gVar = (e5.g) qVar.a(e5.g.class);
                return new C0993a(0);
            default:
                return new C0901c(qVar.e(C0639a.class));
        }
    }

    @Override // androidx.lifecycle.W
    public /* synthetic */ U e(kotlin.jvm.internal.e eVar, B0.c cVar) {
        return Y.a(this, eVar, cVar);
    }

    @Override // X0.x
    public MediaCodecInfo f(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // S3.k
    public Object g(String str, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }

    @Override // m1.q
    public void h() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public E3.b i(float f) {
        return H.k.f1628c;
    }

    @Override // V0.p
    public i1.p k(V0.l lVar, V0.i iVar) {
        return new V0.o(lVar, iVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public E3.b m(float f) {
        return H.k.f1628c;
    }

    @Override // androidx.lifecycle.W
    public U n(Class cls, B0.c cVar) {
        return c(cls);
    }

    @Override // f1.m
    public boolean next() {
        return false;
    }

    @Override // X0.x
    public boolean o(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // L5.p
    public void onMethodCall(L5.o oVar, L5.q qVar) {
        ((K5.r) qVar).a(null);
    }

    @Override // X0.x
    public int p() {
        return MediaCodecList.getCodecCount();
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public Rect q() {
        return new Rect();
    }

    @Override // f1.m
    public long r() {
        throw new NoSuchElementException();
    }

    @Override // m1.q
    public m1.G s(int i7, int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // V0.p
    public i1.p u() {
        return new V0.o(V0.l.f5865n, null);
    }

    @Override // j3.InterfaceC1366c
    public C0406g v(Context context, String str, InterfaceC1365b interfaceC1365b) {
        C0406g c0406g = new C0406g();
        int c8 = interfaceC1365b.c(context, str);
        c0406g.f6659a = c8;
        if (c8 != 0) {
            c0406g.f6661c = -1;
        } else {
            int e7 = interfaceC1365b.e(context, str, true);
            c0406g.f6660b = e7;
            if (e7 != 0) {
                c0406g.f6661c = 1;
            }
        }
        return c0406g;
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public /* synthetic */ void w(I.i iVar) {
    }

    @Override // m1.q
    public void x(InterfaceC1426A interfaceC1426A) {
        throw new UnsupportedOperationException();
    }

    @Override // X0.x
    public boolean y(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    public i() {
        this.f15735a = 4;
        I i7 = K.f98b;
        e0 e0Var = e0.f138e;
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public void j() {
    }

    @Override // p4.InterfaceC1694y
    public void run() {
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public void l(G g3) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public void t(int i7) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public void z(j0 j0Var) {
    }
}
