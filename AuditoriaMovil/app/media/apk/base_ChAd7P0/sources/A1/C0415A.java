package a1;

import D.AbstractC0059i;
import D.v0;
import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b3.BinderC0586g;
import b3.C0580a;
import b3.C0584e;
import c1.RunnableC0626c;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e0.InterfaceC0926a;
import g.InterfaceC0997b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.AbstractC1398a;
import n4.C1521g;
import n4.C1533t;
import n4.EnumC1520f;
import o.MenuC1545i;
import p.C1587i;
import p.InterfaceC1593l;
import p0.Y;
import p0.Z;
import p4.InterfaceC1694y;
import p4.Q;
import w.C1914Y;
import z0.L;
/* renamed from: a1.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0415A implements InterfaceC0747v, com.dexterous.flutterlocalnotifications.i, InterfaceC0926a, zzwo, o.o, InterfaceC1593l, InterfaceC1694y, H.c, io.flutter.view.t, InterfaceC0997b {

    /* renamed from: a  reason: collision with root package name */
    public Object f6744a;

    public /* synthetic */ C0415A(Object obj) {
        this.f6744a = obj;
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void A() {
        ((L5.q) this.f6744a).b(null, "permissionRequestInProgress", "Another permission request is already in progress");
    }

    @Override // o.o
    public void a(MenuC1545i menuC1545i, boolean z7) {
        if (menuC1545i instanceof o.t) {
            ((o.t) menuC1545i).f14514v.j().c(false);
        }
        o.o oVar = ((C1587i) this.f6744a).f14824e;
        if (oVar != null) {
            oVar.a(menuC1545i, z7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
    public void accept(Object obj, Object obj2) {
        BinderC0586g binderC0586g = new BinderC0586g(0, (TaskCompletionSource) obj2);
        C0584e c0584e = (C0584e) ((b3.i) obj).getService();
        Parcel zaa = c0584e.zaa();
        zac.zad(zaa, binderC0586g);
        zac.zac(zaa, (C0580a) this.f6744a);
        c0584e.zac(1, zaa);
    }

    @Override // io.flutter.view.t
    public void c() {
        v0 v0Var = (v0) this.f6744a;
        v0Var.b();
        v0Var.f788h.a(null);
    }

    @Override // e0.InterfaceC0926a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f6744a;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    public void d(C1521g c1521g) {
        q4.n nVar = c1521g.f14339b;
        q4.h hVar = nVar.f15362a;
        TreeMap treeMap = (TreeMap) this.f6744a;
        C1521g c1521g2 = (C1521g) treeMap.get(hVar);
        if (c1521g2 == null) {
            treeMap.put(hVar, c1521g);
            return;
        }
        EnumC1520f enumC1520f = EnumC1520f.ADDED;
        EnumC1520f enumC1520f2 = c1521g2.f14338a;
        EnumC1520f enumC1520f3 = c1521g.f14338a;
        if (enumC1520f3 != enumC1520f && enumC1520f2 == EnumC1520f.METADATA) {
            treeMap.put(hVar, c1521g);
        } else if (enumC1520f3 == EnumC1520f.METADATA && enumC1520f2 != EnumC1520f.REMOVED) {
            treeMap.put(hVar, new C1521g(enumC1520f2, nVar));
        } else {
            EnumC1520f enumC1520f4 = EnumC1520f.MODIFIED;
            if (enumC1520f3 == enumC1520f4 && enumC1520f2 == enumC1520f4) {
                treeMap.put(hVar, new C1521g(enumC1520f4, nVar));
            } else if (enumC1520f3 == enumC1520f4 && enumC1520f2 == enumC1520f) {
                treeMap.put(hVar, new C1521g(enumC1520f, nVar));
            } else {
                EnumC1520f enumC1520f5 = EnumC1520f.REMOVED;
                if (enumC1520f3 == enumC1520f5 && enumC1520f2 == enumC1520f) {
                    treeMap.remove(hVar);
                } else if (enumC1520f3 == enumC1520f5 && enumC1520f2 == enumC1520f4) {
                    treeMap.put(hVar, new C1521g(enumC1520f5, c1521g2.f14339b));
                } else if (enumC1520f3 == enumC1520f && enumC1520f2 == enumC1520f5) {
                    treeMap.put(hVar, new C1521g(enumC1520f4, nVar));
                } else {
                    m5.d.g("Unsupported combination of changes %s after %s", enumC1520f3, enumC1520f2);
                    throw null;
                }
            }
        }
    }

    @Override // e0.InterfaceC0926a
    public Cursor e(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f6744a;
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

    @Override // o.o
    public boolean f(MenuC1545i menuC1545i) {
        C1587i c1587i = (C1587i) this.f6744a;
        if (menuC1545i == c1587i.f14822c) {
            return false;
        }
        ((o.t) menuC1545i).f14515w.getClass();
        c1587i.getClass();
        o.o oVar = c1587i.f14824e;
        if (oVar == null) {
            return false;
        }
        return oVar.f(menuC1545i);
    }

    public void g() {
        R1.j jVar = (R1.j) this.f6744a;
        synchronized (jVar) {
            jVar.n0();
            ((C1533t) jVar.f4683c).c(false);
        }
    }

    public void h() {
        R1.j jVar = (R1.j) this.f6744a;
        synchronized (jVar) {
            jVar.n0();
            ((C1533t) jVar.f4683c).c(true);
        }
    }

    @Override // g.InterfaceC0997b
    public void i(Object obj) {
        int i7;
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (((Boolean) arrayList.get(i8)).booleanValue()) {
                i7 = 0;
            } else {
                i7 = -1;
            }
            iArr[i8] = i7;
        }
        L l8 = (L) this.f6744a;
        z0.H h8 = (z0.H) l8.f16647E.pollFirst();
        if (h8 == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = h8.f16638a;
        if (l8.f16660c.E(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public Y j() {
        I6.s sVar = (I6.s) this.f6744a;
        sVar.getClass();
        K6.w wVar = J6.l.f2445a;
        Object obj = I6.s.f2282e.get(sVar);
        if (obj == wVar) {
            obj = null;
        }
        return (Y) obj;
    }

    public InputStream k() {
        InputStream inputStream = (InputStream) this.f6744a;
        this.f6744a = null;
        return inputStream;
    }

    public void l(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(j))));
        ((io.flutter.plugins.videoplayer.m) this.f6744a).b(hashMap);
    }

    public void m(int i7, int i8, long j, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "initialized");
        AbstractC0059i.G(i7, hashMap, "width", i8, "height");
        hashMap.put("duration", Long.valueOf(j));
        if (i9 != 0) {
            hashMap.put("rotationCorrection", Integer.valueOf(i9));
        }
        ((io.flutter.plugins.videoplayer.m) this.f6744a).b(hashMap);
    }

    public void n(ArrayList arrayList, String str, String str2) {
        SharedPreferences.Editor edit = ((Activity) this.f6744a).getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            edit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            edit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            edit.putString("flutter_image_picker_error_message", str2);
        }
        edit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7.f14992a > r3.f14992a) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(p0.Y r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.j.e(r7, r0)
        L5:
            java.lang.Object r0 = r6.f6744a
            I6.s r0 = (I6.s) r0
            r0.getClass()
            K6.w r1 = J6.l.f2445a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = I6.s.f2282e
            java.lang.Object r2 = r2.get(r0)
            if (r2 != r1) goto L17
            r2 = 0
        L17:
            r3 = r2
            p0.Y r3 = (p0.Y) r3
            boolean r4 = r3 instanceof p0.Q
            if (r4 == 0) goto L20
            r4 = 1
            goto L26
        L20:
            p0.Z r4 = p0.Z.f14993b
            boolean r4 = kotlin.jvm.internal.j.a(r3, r4)
        L26:
            if (r4 == 0) goto L29
            goto L33
        L29:
            boolean r4 = r3 instanceof p0.C1635c
            if (r4 == 0) goto L35
            int r4 = r3.f14992a
            int r5 = r7.f14992a
            if (r5 <= r4) goto L39
        L33:
            r3 = r7
            goto L39
        L35:
            boolean r4 = r3 instanceof p0.O
            if (r4 == 0) goto L47
        L39:
            if (r2 != 0) goto L3c
            r2 = r1
        L3c:
            if (r3 != 0) goto L3f
            goto L40
        L3f:
            r1 = r3
        L40:
            boolean r0 = r0.F(r2, r1)
            if (r0 == 0) goto L5
            return
        L47:
            F6.x r7 = new F6.x
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0415A.o(p0.Y):void");
    }

    @Override // H.c
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Void r12 = (Void) obj;
    }

    @Override // p4.InterfaceC1694y
    public void run() {
        ((Q) this.f6744a).G("build overlays", new RunnableC0626c(this, 14));
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void v(boolean z7) {
        ((L5.q) this.f6744a).a(Boolean.valueOf(z7));
    }

    @Override // H.c
    public void z(Throwable th) {
        C1914Y c1914y;
        C1914Y c1914y2 = (C1914Y) this.f6744a;
        c1914y2.q();
        c1914y2.f16165u.m();
        M3.q qVar = c1914y2.f16148b;
        Iterator it = qVar.s().iterator();
        while (it.hasNext() && (c1914y = (C1914Y) it.next()) != c1914y2) {
            c1914y.q();
            c1914y.f16165u.m();
        }
        synchronized (qVar.f3254c) {
            ((LinkedHashSet) qVar.f).remove(c1914y2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
    public zzwe zza() {
        zzra zzraVar;
        zzrd zzrdVar = new zzrd();
        if (AbstractC1398a.c()) {
            zzraVar = zzra.TYPE_THICK;
        } else {
            zzraVar = zzra.TYPE_THIN;
        }
        zzrdVar.zze(zzraVar);
        zzrs zzrsVar = new zzrs();
        zzrsVar.zzb((zzrb) this.f6744a);
        zzrdVar.zzh(zzrsVar.zzc());
        return zzws.zzf(zzrdVar);
    }

    public C0415A(int i7) {
        switch (i7) {
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                this.f6744a = new TreeMap();
                return;
            case 19:
                this.f6744a = new I6.s(Z.f14993b);
                return;
            case 21:
                this.f6744a = new AtomicBoolean(false);
                return;
            default:
                this.f6744a = new androidx.lifecycle.C();
                new HashMap();
                return;
        }
    }

    @Override // io.flutter.view.t
    public void b() {
    }
}
