package e0;

import Q0.C0276m;
import T5.A;
import a4.AbstractC0467p;
import android.app.Activity;
import android.content.ContentProviderClient;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import g1.C1006c;
import g2.n;
import io.flutter.plugins.firebase.auth.C1150m;
import io.flutter.plugins.googlemaps.D0;
import j1.AbstractC1362a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k1.t;
import k1.u;
import m3.BinderC1437b;
import n3.C1510y;
import n4.L;
import o6.EnumC1565a;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p.InterfaceC1568A;
import p4.EnumC1676f;
import p4.InterfaceC1677g;
import p4.P;
import q3.k;
import q4.C1708a;
import q4.C1709b;
import q4.p;
import s3.C1767B;
import z0.C2063x;
/* renamed from: e0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0927b implements InterfaceC0926a, n, D0, i1.i, u, InterfaceC0747v, InterfaceC1568A, I6.d, InterfaceC1677g {

    /* renamed from: a  reason: collision with root package name */
    public Object f10587a;

    public /* synthetic */ C0927b(Object obj) {
        this.f10587a = obj;
    }

    public static AbstractC0467p A(C1150m c1150m) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(U3.h.e(c1150m.f11875a));
        String str = c1150m.f11876b;
        if (str != null) {
            firebaseAuth.g(str);
        }
        return firebaseAuth.f;
    }

    public void B() {
        ((C2063x) this.f10587a).f16854X.P();
    }

    public void C(P p7) {
        k kVar = (k) this.f10587a;
        kVar.f15330b = p7;
        Iterator it = ((LinkedList) kVar.f15332d).iterator();
        while (it.hasNext()) {
            ((i3.f) it.next()).b();
        }
        ((LinkedList) kVar.f15332d).clear();
        kVar.f15331c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de A[Catch: IOException -> 0x011d, TRY_LEAVE, TryCatch #1 {IOException -> 0x011d, blocks: (B:14:0x0037, B:22:0x0051, B:25:0x0062, B:28:0x0077, B:33:0x0084, B:43:0x00a8, B:55:0x00d5, B:58:0x00de, B:63:0x0118, B:62:0x0105, B:48:0x00c2, B:49:0x00c8, B:51:0x00cc, B:53:0x00d0, B:39:0x0095, B:41:0x009d, B:42:0x00a3, B:59:0x00f6), top: B:71:0x0037, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String D(java.lang.String r21, java.lang.Double r22, java.lang.Double r23, int r24) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0927b.D(java.lang.String, java.lang.Double, java.lang.Double, int):java.lang.String");
    }

    public File F(Bitmap bitmap, Double d7, Double d8, int i7, String str) {
        Bitmap.CompressFormat compressFormat;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, d7.intValue(), d8.intValue(), false);
        String h8 = io.flutter.plugins.pathprovider.b.h("/scaled_", str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasAlpha = createScaledBitmap.hasAlpha();
        if (hasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        if (hasAlpha) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        createScaledBitmap.compress(compressFormat, i7, byteArrayOutputStream);
        File file = new File(((Activity) this.f10587a).getCacheDir(), h8);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        return file;
    }

    @Override // io.flutter.plugins.googlemaps.D0
    public void a(float f) {
        ((C1767B) this.f10587a).f15578c = f;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
    public void accept(Object obj, Object obj2) {
        ((zzs) ((zzp) obj).getService()).zzc(new BinderC1437b((TaskCompletionSource) obj2), (C1510y) this.f10587a);
    }

    @Override // io.flutter.plugins.googlemaps.D0
    public void b(float f) {
        C1767B c1767b = (C1767B) this.f10587a;
        boolean z7 = false;
        if (f >= 0.0f && f <= 1.0f) {
            z7 = true;
        }
        I.a("Transparency must be in the range [0..1]", z7);
        c1767b.f15580e = f;
    }

    @Override // p4.InterfaceC1677g
    public List c(String str) {
        HashSet hashSet = (HashSet) ((HashMap) ((C1006c) this.f10587a).f11091a).get(str);
        if (hashSet != null) {
            return new ArrayList(hashSet);
        }
        return Collections.emptyList();
    }

    @Override // I6.d
    public Object c0(I6.e eVar, n6.d dVar) {
        Object c02 = ((A.f) this.f10587a).c0(new A(eVar, 1), dVar);
        if (c02 == EnumC1565a.COROUTINE_SUSPENDED) {
            return c02;
        }
        return l6.j.f13876a;
    }

    @Override // e0.InterfaceC0926a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f10587a;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // p4.InterfaceC1677g
    public EnumC1676f d(L l8) {
        return EnumC1676f.NONE;
    }

    @Override // e0.InterfaceC0926a
    public Cursor e(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f10587a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override // g2.n
    public String[] f() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f10587a).getSupportedFeatures();
    }

    @Override // g2.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) f7.a.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f10587a).getStatics());
    }

    @Override // g2.n
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) f7.a.a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f10587a).getWebkitToCompatConverter());
    }

    @Override // k1.u
    public void h() {
        k1.k kVar = (k1.k) this.f10587a;
        K0.a.k(kVar.f13621M1);
        Surface surface = kVar.f13621M1;
        C0276m c0276m = kVar.f13610B1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new t(c0276m, surface, SystemClock.elapsedRealtime()));
        }
        kVar.f13624P1 = true;
    }

    @Override // io.flutter.plugins.googlemaps.D0
    public void i(boolean z7) {
        ((C1767B) this.f10587a).f15579d = z7;
    }

    @Override // i1.i
    public void j(i1.k kVar, long j, long j8) {
        boolean z7;
        R0.e eVar = (R0.e) this.f10587a;
        synchronized (AbstractC1362a.f13420b) {
            z7 = AbstractC1362a.f13421c;
        }
        if (!z7) {
            eVar.f4552a.x(new IOException(new ConcurrentModificationException()));
            return;
        }
        eVar.a();
    }

    @Override // k1.u
    public void m() {
        ((k1.k) this.f10587a).G0(0, 1);
    }

    @Override // p4.InterfaceC1677g
    public void o(p pVar) {
        ((C1006c) this.f10587a).x(pVar);
    }

    @Override // p4.InterfaceC1677g
    public C1709b p(String str) {
        return C1709b.f15342d;
    }

    @Override // p4.InterfaceC1677g
    public List q(L l8) {
        return null;
    }

    @Override // io.flutter.plugins.googlemaps.D0
    public void setVisible(boolean z7) {
        ((C1767B) this.f10587a).f15577b = z7;
    }

    @Override // p4.InterfaceC1677g
    public C1709b t(L l8) {
        return C1709b.f15342d;
    }

    @Override // p4.InterfaceC1677g
    public Collection x() {
        return Collections.emptyList();
    }

    @Override // i1.i
    public T1.e y(i1.k kVar, long j, long j8, IOException iOException, int i7) {
        ((R0.e) this.f10587a).f4552a.x(iOException);
        return i1.n.f11428e;
    }

    @Override // p4.InterfaceC1677g
    public String z() {
        return null;
    }

    public C0927b(int i7) {
        switch (i7) {
            case 14:
                this.f10587a = new C1006c(9);
                return;
            case 17:
                this.f10587a = new Object();
                return;
            default:
                this.f10587a = new C1767B();
                return;
        }
    }

    @Override // p4.InterfaceC1677g
    public void g() {
    }

    @Override // p4.InterfaceC1677g
    public void start() {
    }

    @Override // p4.InterfaceC1677g
    public void k(C1708a c1708a) {
    }

    @Override // p.InterfaceC1568A
    public void l(int i7) {
    }

    @Override // p4.InterfaceC1677g
    public void n(L l8) {
    }

    @Override // p.InterfaceC1568A
    public void s(int i7) {
    }

    @Override // p4.InterfaceC1677g
    public void u(e4.c cVar) {
    }

    @Override // p4.InterfaceC1677g
    public void w(C1708a c1708a) {
    }

    @Override // p4.InterfaceC1677g
    public void v(String str, C1709b c1709b) {
    }

    @Override // i1.i
    public void E(i1.k kVar, long j, long j8, boolean z7) {
    }
}
