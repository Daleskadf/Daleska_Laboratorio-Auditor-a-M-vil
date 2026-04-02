package B;

import B4.c;
import B4.f;
import B5.AbstractActivityC0032e;
import D.d0;
import I2.g;
import J2.e;
import J2.i;
import K0.o;
import K0.p;
import K0.q;
import K0.v;
import K0.x;
import K2.b;
import S1.C;
import S1.C0338f;
import S1.H;
import S1.I;
import W.AbstractC0361d;
import W.C0366i;
import W.C0372o;
import W.D;
import W.E;
import W.F;
import W.G;
import W.O;
import W.Q;
import W.t;
import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Window;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.core.graphics.drawable.IconCompat;
import com.example.appecoactivate.R;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.firestore.S;
import com.google.firebase.storage.A;
import com.google.firebase.storage.B;
import com.google.firebase.storage.u;
import h0.C1037Q;
import h0.C1039T;
import h3.AbstractC1079a;
import io.flutter.plugin.platform.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import m5.d;
import org.apache.tika.utils.StringUtils;
import p.Y0;
import r3.AbstractC1740d;
import w.C1939x;
import x.C1967a;
import z3.h;
/* loaded from: classes.dex */
public final class a implements b, C {

    /* renamed from: a  reason: collision with root package name */
    public int f223a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f224b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f225c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f226d;

    /* renamed from: e  reason: collision with root package name */
    public Object f227e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f224b = obj;
        this.f225c = obj2;
        this.f226d = obj3;
        this.f227e = obj4;
        this.f223a = i7;
    }

    public static void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public void a(C0366i c0366i) {
        Bundle bundle;
        IconCompat a7 = c0366i.a();
        Icon icon = null;
        if (a7 != null) {
            icon = a7.h(null);
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(icon, c0366i.f6043h, c0366i.f6044i);
        Q[] qArr = c0366i.f6039c;
        if (qArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[qArr.length];
            for (int i7 = 0; i7 < qArr.length; i7++) {
                Q q2 = qArr[i7];
                q2.getClass();
                RemoteInput.Builder addExtras = new RemoteInput.Builder("FlutterLocalNotificationsPluginInputResult").setLabel(q2.f6022a).setChoices(q2.f6023b).setAllowFreeFormInput(q2.f6024c).addExtras(q2.f6025d);
                if (Build.VERSION.SDK_INT >= 26) {
                    Iterator it = q2.f6026e.iterator();
                    while (it.hasNext()) {
                        E.d(addExtras, (String) it.next());
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC0361d.e(addExtras);
                }
                remoteInputArr[i7] = addExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = c0366i.f6037a;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        } else {
            bundle = new Bundle();
        }
        boolean z7 = c0366i.f6040d;
        bundle.putBoolean("android.support.allowGeneratedReplies", z7);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            D.b(builder, z7);
        }
        bundle.putInt("android.support.action.semanticAction", 0);
        if (i8 >= 28) {
            F.c(builder);
        }
        if (i8 >= 29) {
            AbstractC0361d.d(builder, c0366i.f);
        }
        if (i8 >= 31) {
            G.a(builder);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c0366i.f6041e);
        builder.addExtras(bundle);
        ((Notification.Builder) this.f225c).addAction(builder.build());
    }

    @Override // S1.C
    public void b(q qVar) {
        v vVar;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        int i7;
        v vVar2;
        int i8;
        int i9;
        char c8;
        I a7;
        int i10;
        SparseArray sparseArray2;
        int i11;
        int i12;
        if (qVar.u() != 2) {
            return;
        }
        S1.F f = (S1.F) this.f227e;
        int i13 = f.f4937a;
        int i14 = 0;
        List list = f.f4939c;
        if (i13 != 1 && i13 != 2 && f.f4948n != 1) {
            vVar = new v(((v) list.get(0)).d());
            list.add(vVar);
        } else {
            vVar = (v) list.get(0);
        }
        if ((qVar.u() & RecognitionOptions.ITF) == 0) {
            return;
        }
        qVar.H(1);
        int A7 = qVar.A();
        int i15 = 3;
        qVar.H(3);
        p pVar = (p) this.f224b;
        qVar.f(pVar.f2509d, 0, 2);
        pVar.q(0);
        pVar.t(3);
        f.f4954t = pVar.i(13);
        qVar.f(pVar.f2509d, 0, 2);
        pVar.q(0);
        pVar.t(4);
        qVar.H(pVar.i(12));
        C0338f c0338f = f.f;
        int i16 = f.f4937a;
        if (i16 == 2 && f.f4952r == null) {
            I a8 = c0338f.a(21, new o(21, null, 0, null, x.f));
            f.f4952r = a8;
            if (a8 != null) {
                a8.c(vVar, f.f4947m, new H(A7, 21, 8192));
            }
        }
        SparseArray sparseArray3 = (SparseArray) this.f225c;
        sparseArray3.clear();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f226d;
        sparseIntArray.clear();
        int a9 = qVar.a();
        while (true) {
            sparseBooleanArray = f.f4944i;
            if (a9 <= 0) {
                break;
            }
            qVar.f(pVar.f2509d, i14, 5);
            pVar.q(i14);
            int i17 = pVar.i(8);
            pVar.t(i15);
            int i18 = pVar.i(13);
            pVar.t(4);
            int i19 = pVar.i(12);
            int i20 = qVar.f2514b;
            int i21 = i20 + i19;
            int i22 = -1;
            String str = null;
            ArrayList arrayList = null;
            int i23 = 0;
            p pVar2 = pVar;
            while (qVar.f2514b < i21) {
                int u7 = qVar.u();
                int u8 = qVar.f2514b + qVar.u();
                if (u8 > i21) {
                    break;
                }
                v vVar3 = vVar;
                if (u7 == 5) {
                    long w2 = qVar.w();
                    if (w2 == 1094921523) {
                        i22 = 129;
                    } else if (w2 == 1161904947) {
                        i22 = 135;
                    } else {
                        if (w2 != 1094921524) {
                            if (w2 == 1212503619) {
                                i22 = 36;
                            }
                        }
                        i22 = 172;
                    }
                    sparseArray2 = sparseArray3;
                    i11 = A7;
                    i12 = i18;
                } else if (u7 == 106) {
                    sparseArray2 = sparseArray3;
                    i11 = A7;
                    i12 = i18;
                    i22 = 129;
                } else if (u7 == 122) {
                    sparseArray2 = sparseArray3;
                    i11 = A7;
                    i12 = i18;
                    i22 = 135;
                } else if (u7 == 127) {
                    int u9 = qVar.u();
                    if (u9 != 21) {
                        if (u9 == 14) {
                            i22 = 136;
                        } else if (u9 == 33) {
                            i22 = 139;
                        }
                        sparseArray2 = sparseArray3;
                        i11 = A7;
                        i12 = i18;
                    }
                    i22 = 172;
                    sparseArray2 = sparseArray3;
                    i11 = A7;
                    i12 = i18;
                } else {
                    if (u7 == 123) {
                        sparseArray2 = sparseArray3;
                        i22 = 138;
                    } else if (u7 == 10) {
                        String trim = qVar.s(3, h.f16886c).trim();
                        i23 = qVar.u();
                        sparseArray2 = sparseArray3;
                        str = trim;
                    } else {
                        if (u7 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (qVar.f2514b < u8) {
                                String trim2 = qVar.s(3, h.f16886c).trim();
                                qVar.u();
                                SparseArray sparseArray4 = sparseArray3;
                                byte[] bArr = new byte[4];
                                qVar.f(bArr, 0, 4);
                                arrayList2.add(new S1.G(trim2, bArr));
                                sparseArray3 = sparseArray4;
                                A7 = A7;
                                i18 = i18;
                            }
                            sparseArray2 = sparseArray3;
                            i11 = A7;
                            i12 = i18;
                            arrayList = arrayList2;
                            i22 = 89;
                        } else {
                            sparseArray2 = sparseArray3;
                            i11 = A7;
                            i12 = i18;
                            if (u7 == 111) {
                                i22 = 257;
                            }
                        }
                        qVar.H(u8 - qVar.f2514b);
                        sparseArray3 = sparseArray2;
                        vVar = vVar3;
                        A7 = i11;
                        i18 = i12;
                    }
                    i11 = A7;
                    i12 = i18;
                }
                qVar.H(u8 - qVar.f2514b);
                sparseArray3 = sparseArray2;
                vVar = vVar3;
                A7 = i11;
                i18 = i12;
            }
            SparseArray sparseArray5 = sparseArray3;
            v vVar4 = vVar;
            int i24 = A7;
            int i25 = i18;
            qVar.G(i21);
            o oVar = new o(i22, str, i23, arrayList, Arrays.copyOfRange(qVar.f2513a, i20, i21));
            if (i17 == 6 || i17 == 5) {
                i17 = i22;
            }
            a9 -= i19 + 5;
            if (i16 == 2) {
                i9 = i17;
            } else {
                i9 = i25;
            }
            if (sparseBooleanArray.get(i9)) {
                sparseArray3 = sparseArray5;
                c8 = 21;
            } else {
                c8 = 21;
                if (i16 == 2 && i17 == 21) {
                    a7 = f.f4952r;
                } else {
                    a7 = c0338f.a(i17, oVar);
                }
                if (i16 == 2) {
                    i10 = i25;
                    if (i10 >= sparseIntArray.get(i9, 8192)) {
                        sparseArray3 = sparseArray5;
                    }
                } else {
                    i10 = i25;
                }
                sparseIntArray.put(i9, i10);
                sparseArray3 = sparseArray5;
                sparseArray3.put(i9, a7);
            }
            pVar = pVar2;
            vVar = vVar4;
            A7 = i24;
            i14 = 0;
            i15 = 3;
        }
        v vVar5 = vVar;
        int i26 = A7;
        int size = sparseIntArray.size();
        int i27 = 0;
        while (true) {
            sparseArray = f.f4943h;
            if (i27 >= size) {
                break;
            }
            int keyAt = sparseIntArray.keyAt(i27);
            int valueAt = sparseIntArray.valueAt(i27);
            sparseBooleanArray.put(keyAt, true);
            f.j.put(valueAt, true);
            I i28 = (I) sparseArray3.valueAt(i27);
            if (i28 != null) {
                if (i28 != f.f4952r) {
                    m1.q qVar2 = f.f4947m;
                    i8 = i26;
                    H h8 = new H(i8, keyAt, 8192);
                    vVar2 = vVar5;
                    i28.c(vVar2, qVar2, h8);
                } else {
                    vVar2 = vVar5;
                    i8 = i26;
                }
                sparseArray.put(valueAt, i28);
            } else {
                vVar2 = vVar5;
                i8 = i26;
            }
            i27++;
            vVar5 = vVar2;
            i26 = i8;
        }
        if (i16 == 2) {
            if (!f.f4949o) {
                f.f4947m.h();
                f.f4948n = 0;
                f.f4949o = true;
            }
            return;
        }
        sparseArray.remove(this.f223a);
        if (i16 == 1) {
            i7 = 0;
        } else {
            i7 = f.f4948n - 1;
        }
        f.f4948n = i7;
        if (i7 == 0) {
            f.f4947m.h();
            f.f4949o = true;
        }
    }

    public void d(Activity activity, Executor executor, Object obj) {
        boolean z7;
        f fVar;
        com.google.android.gms.common.internal.I.i(obj);
        synchronized (((com.google.firebase.storage.v) this.f225c).f9953a) {
            try {
                if ((((com.google.firebase.storage.v) this.f225c).f9959h & this.f223a) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                ((ConcurrentLinkedQueue) this.f224b).add(obj);
                fVar = new f(executor);
                ((HashMap) this.f226d).put(obj, fVar);
                if (activity != null) {
                    com.google.android.gms.common.internal.I.a("Activity is already destroyed!", !activity.isDestroyed());
                    c.f273c.b(activity, new S(1, this, obj), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            A a7 = new A(this, obj, ((com.google.firebase.storage.v) this.f225c).m(), 1);
            Executor executor2 = fVar.f288a;
            if (executor2 != null) {
                executor2.execute(a7);
            } else {
                AbstractC1740d.f.execute(a7);
            }
        }
    }

    public String e(String str) {
        HashMap hashMap = (HashMap) this.f226d;
        if (!hashMap.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) hashMap.get(str)) {
            Iterator it = ((ArrayList) this.f225c).iterator();
            while (it.hasNext()) {
                InterfaceC0519v g3 = ((InterfaceC0519v) it.next()).g();
                g0.c.a("CameraInfo doesn't contain Camera2 implementation.", g3 instanceof C1939x);
                if (str2.equals(((C1939x) ((C1939x) g3).f16305c.f218b).f16303a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public void f() {
        if ((((com.google.firebase.storage.v) this.f225c).f9959h & this.f223a) != 0) {
            u m7 = ((com.google.firebase.storage.v) this.f225c).m();
            Iterator it = ((ConcurrentLinkedQueue) this.f224b).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                f fVar = (f) ((HashMap) this.f226d).get(next);
                if (fVar != null) {
                    A a7 = new A(this, next, m7, 0);
                    Executor executor = fVar.f288a;
                    if (executor != null) {
                        executor.execute(a7);
                    } else {
                        AbstractC1740d.f.execute(a7);
                    }
                }
            }
        }
    }

    public void h(Y0 y02) {
        AbstractC1079a c1037q;
        Window window = ((AbstractActivityC0032e) this.f224b).getWindow();
        window.getDecorView();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            c1037q = new C1039T(window);
        } else if (i7 >= 30) {
            c1037q = new C1039T(window);
        } else if (i7 >= 26) {
            c1037q = new C1037Q(window);
        } else {
            c1037q = new C1037Q(window);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        K5.f fVar = (K5.f) y02.f14760b;
        if (fVar != null) {
            int i9 = io.flutter.plugin.platform.f.f11697c[fVar.ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    c1037q.v(false);
                }
            } else {
                c1037q.v(true);
            }
        }
        Integer num = (Integer) y02.f14759a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) y02.f14761c;
        if (bool != null && i8 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i8 >= 26) {
            K5.f fVar2 = (K5.f) y02.f14763e;
            if (fVar2 != null) {
                int i10 = io.flutter.plugin.platform.f.f11697c[fVar2.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        c1037q.u(false);
                    }
                } else {
                    c1037q.u(true);
                }
            }
            Integer num2 = (Integer) y02.f14762d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) y02.f;
        if (num3 != null && i8 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) y02.f14758X;
        if (bool2 != null && i8 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f227e = y02;
    }

    public void i() {
        ((AbstractActivityC0032e) this.f224b).getWindow().getDecorView().setSystemUiVisibility(this.f223a);
        Y0 y02 = (Y0) this.f227e;
        if (y02 != null) {
            h(y02);
        }
    }

    @Override // K2.b
    public Object w() {
        SQLiteDatabase a7;
        Boolean bool;
        E2.a aVar = (E2.a) this.f225c;
        E2.c cVar = E2.c.TRANSIENT_ERROR;
        Iterable iterable = (Iterable) this.f226d;
        D2.b bVar = (D2.b) this.f227e;
        E2.c cVar2 = aVar.f1058a;
        g gVar = (g) this.f224b;
        if (cVar2 == cVar) {
            i iVar = (i) gVar.f2189c;
            iVar.getClass();
            if (iterable.iterator().hasNext()) {
                String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + i.g(iterable);
                a7 = iVar.a();
                a7.beginTransaction();
                try {
                    a7.compileStatement(str).execute();
                    a7.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    a7.setTransactionSuccessful();
                } finally {
                }
            }
            gVar.f2190d.a(bVar, this.f223a + 1, false);
            return null;
        }
        i iVar2 = (i) gVar.f2189c;
        iVar2.getClass();
        if (iterable.iterator().hasNext()) {
            iVar2.a().compileStatement("DELETE FROM events WHERE _id in " + i.g(iterable)).execute();
        }
        E2.c cVar3 = E2.c.OK;
        J2.c cVar4 = gVar.f2189c;
        if (cVar2 == cVar3) {
            long o7 = gVar.f2192g.o() + aVar.f1059b;
            i iVar3 = (i) cVar4;
            iVar3.getClass();
            iVar3.c(new e(o7, bVar, 0));
        }
        i iVar4 = (i) cVar4;
        a7 = iVar4.a();
        a7.beginTransaction();
        try {
            Long b5 = i.b(a7, bVar);
            if (b5 == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor rawQuery = iVar4.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b5.toString()});
                Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                rawQuery.close();
                bool = valueOf;
            }
            a7.setTransactionSuccessful();
            a7.endTransaction();
            if (bool.booleanValue()) {
                gVar.f2190d.a(bVar, 1, true);
                return null;
            }
            return null;
        } finally {
        }
    }

    public a(com.google.firebase.storage.v vVar, int i7, B b5) {
        this.f224b = new ConcurrentLinkedQueue();
        this.f226d = new HashMap();
        this.f225c = vVar;
        this.f223a = i7;
        this.f227e = b5;
    }

    public a(x.p pVar) {
        this.f223a = 0;
        this.f226d = new HashMap();
        this.f227e = new HashSet();
        this.f224b = new ArrayList();
        this.f225c = new ArrayList();
        Set<Set> hashSet = new HashSet();
        try {
            hashSet = pVar.f16413a.d0();
        } catch (C1967a unused) {
            org.slf4j.helpers.i.t("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        for (Set set : hashSet) {
            ArrayList arrayList = new ArrayList(set);
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (d.k(str, pVar) && d.k(str2, pVar)) {
                        ((HashSet) this.f227e).add(new HashSet(Arrays.asList(str, str2)));
                        HashMap hashMap = (HashMap) this.f226d;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new ArrayList());
                        }
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        ((List) hashMap.get(str)).add((String) arrayList.get(1));
                        ((List) hashMap.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (d0 unused2) {
                    org.slf4j.helpers.i.l("Camera2CameraCoordinator", io.flutter.plugins.pathprovider.b.j("Concurrent camera id pair: (", str, ", ", str2, ") is not backward compatible"));
                }
            }
        }
    }

    public a(C0372o c0372o) {
        Notification notification;
        ArrayList arrayList;
        Bundle bundle;
        Bundle[] bundleArr;
        ArrayList arrayList2;
        Notification notification2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        CharSequence charSequence;
        C0366i h8;
        C0366i h9;
        int i7;
        a aVar = this;
        new ArrayList();
        aVar.f227e = new Bundle();
        aVar.f226d = c0372o;
        Context context = c0372o.f6058a;
        aVar.f224b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            aVar.f225c = E.a(context, c0372o.f6050B);
        } else {
            aVar.f225c = new Notification.Builder(c0372o.f6058a);
        }
        Notification notification3 = c0372o.f6055G;
        ((Notification.Builder) aVar.f225c).setWhen(notification3.when).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, null).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS).setOngoing((notification3.flags & 2) != 0).setOnlyAlertOnce((notification3.flags & 8) != 0).setAutoCancel((notification3.flags & 16) != 0).setDefaults(notification3.defaults).setContentTitle(c0372o.f6062e).setContentText(c0372o.f).setContentInfo(null).setContentIntent(c0372o.f6063g).setDeleteIntent(notification3.deleteIntent).setFullScreenIntent(c0372o.f6064h, (notification3.flags & RecognitionOptions.ITF) != 0).setNumber(c0372o.j).setProgress(c0372o.f6071p, c0372o.f6072q, c0372o.f6073r);
        Notification.Builder builder = (Notification.Builder) aVar.f225c;
        IconCompat iconCompat = c0372o.f6065i;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.h(context));
        ((Notification.Builder) aVar.f225c).setSubText(c0372o.f6070o).setUsesChronometer(c0372o.f6068m).setPriority(c0372o.f6066k);
        W.C c8 = c0372o.f6069n;
        if (c8 instanceof t) {
            t tVar = (t) c8;
            PendingIntent pendingIntent = tVar.f6084h;
            if (pendingIntent == null) {
                h8 = tVar.h(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, tVar.f6087l, R.color.call_notification_decline_color, tVar.f6085i);
            } else {
                h8 = tVar.h(R.drawable.ic_call_decline, R.string.call_notification_decline_action, tVar.f6087l, R.color.call_notification_decline_color, pendingIntent);
            }
            PendingIntent pendingIntent2 = tVar.f6083g;
            if (pendingIntent2 == null) {
                h9 = null;
            } else {
                boolean z7 = tVar.j;
                h9 = tVar.h(z7 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z7 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, tVar.f6086k, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(h8);
            ArrayList arrayList6 = tVar.f5991a.f6059b;
            if (arrayList6 != null) {
                Iterator it = arrayList6.iterator();
                i7 = 2;
                while (it.hasNext()) {
                    C0366i c0366i = (C0366i) it.next();
                    if (c0366i.f) {
                        arrayList5.add(c0366i);
                    } else if (!c0366i.f6037a.getBoolean("key_action_priority") && i7 > 1) {
                        arrayList5.add(c0366i);
                        i7--;
                    }
                    if (h9 != null && i7 == 1) {
                        arrayList5.add(h9);
                        i7--;
                    }
                }
            } else {
                i7 = 2;
            }
            if (h9 != null && i7 >= 1) {
                arrayList5.add(h9);
            }
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                aVar.a((C0366i) it2.next());
            }
        } else {
            Iterator it3 = c0372o.f6059b.iterator();
            while (it3.hasNext()) {
                aVar.a((C0366i) it3.next());
            }
        }
        Bundle bundle2 = c0372o.f6080y;
        if (bundle2 != null) {
            ((Bundle) aVar.f227e).putAll(bundle2);
        }
        int i8 = Build.VERSION.SDK_INT;
        ((Notification.Builder) aVar.f225c).setShowWhen(c0372o.f6067l);
        ((Notification.Builder) aVar.f225c).setLocalOnly(c0372o.f6076u);
        ((Notification.Builder) aVar.f225c).setGroup(c0372o.f6074s);
        ((Notification.Builder) aVar.f225c).setSortKey(null);
        ((Notification.Builder) aVar.f225c).setGroupSummary(c0372o.f6075t);
        aVar.f223a = c0372o.f6053E;
        ((Notification.Builder) aVar.f225c).setCategory(c0372o.f6079x);
        ((Notification.Builder) aVar.f225c).setColor(c0372o.f6081z);
        ((Notification.Builder) aVar.f225c).setVisibility(c0372o.f6049A);
        ((Notification.Builder) aVar.f225c).setPublicVersion(null);
        ((Notification.Builder) aVar.f225c).setSound(notification3.sound, notification3.audioAttributes);
        ArrayList<String> arrayList7 = c0372o.f6057I;
        ArrayList arrayList8 = c0372o.f6060c;
        if (i8 < 28) {
            if (arrayList8 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList(arrayList8.size());
                Iterator it4 = arrayList8.iterator();
                while (it4.hasNext()) {
                    O o7 = (O) it4.next();
                    String str = o7.f6018c;
                    if (str == null) {
                        str = o7.f6016a != null ? "name:" + ((Object) charSequence) : StringUtils.EMPTY;
                    }
                    arrayList4.add(str);
                }
            }
            if (arrayList4 != null) {
                if (arrayList7 == null) {
                    arrayList7 = arrayList4;
                } else {
                    S.g gVar = new S.g(arrayList7.size() + arrayList4.size());
                    gVar.addAll(arrayList4);
                    gVar.addAll(arrayList7);
                    arrayList7 = new ArrayList(gVar);
                }
            }
        }
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            for (String str2 : arrayList7) {
                ((Notification.Builder) aVar.f225c).addPerson(str2);
            }
        }
        ArrayList arrayList9 = c0372o.f6061d;
        if (arrayList9.size() > 0) {
            if (c0372o.f6080y == null) {
                c0372o.f6080y = new Bundle();
            }
            Bundle bundle3 = c0372o.f6080y.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i9 = 0;
            while (i9 < arrayList9.size()) {
                String num = Integer.toString(i9);
                C0366i c0366i2 = (C0366i) arrayList9.get(i9);
                Bundle bundle6 = new Bundle();
                IconCompat a7 = c0366i2.a();
                bundle6.putInt("icon", a7 != null ? a7.f() : 0);
                bundle6.putCharSequence("title", c0366i2.f6043h);
                bundle6.putParcelable("actionIntent", c0366i2.f6044i);
                Bundle bundle7 = c0366i2.f6037a;
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c0366i2.f6040d);
                bundle6.putBundle("extras", bundle);
                Q[] qArr = c0366i2.f6039c;
                if (qArr == null) {
                    arrayList2 = arrayList9;
                    notification2 = notification3;
                    arrayList3 = arrayList8;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[qArr.length];
                    arrayList2 = arrayList9;
                    notification2 = notification3;
                    int i10 = 0;
                    while (i10 < qArr.length) {
                        Q q2 = qArr[i10];
                        Q[] qArr2 = qArr;
                        Bundle bundle8 = new Bundle();
                        q2.getClass();
                        ArrayList arrayList10 = arrayList8;
                        bundle8.putString("resultKey", "FlutterLocalNotificationsPluginInputResult");
                        bundle8.putCharSequence("label", q2.f6022a);
                        bundle8.putCharSequenceArray("choices", q2.f6023b);
                        bundle8.putBoolean("allowFreeFormInput", q2.f6024c);
                        bundle8.putBundle("extras", q2.f6025d);
                        HashSet hashSet = q2.f6026e;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList11 = new ArrayList<>(hashSet.size());
                            Iterator it5 = hashSet.iterator();
                            while (it5.hasNext()) {
                                arrayList11.add((String) it5.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList11);
                        }
                        bundleArr[i10] = bundle8;
                        i10++;
                        qArr = qArr2;
                        arrayList8 = arrayList10;
                    }
                    arrayList3 = arrayList8;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", c0366i2.f6041e);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(num, bundle6);
                i9++;
                arrayList9 = arrayList2;
                notification3 = notification2;
                arrayList8 = arrayList3;
            }
            notification = notification3;
            arrayList = arrayList8;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (c0372o.f6080y == null) {
                c0372o.f6080y = new Bundle();
            }
            c0372o.f6080y.putBundle("android.car.EXTENSIONS", bundle3);
            aVar = this;
            ((Bundle) aVar.f227e).putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            notification = notification3;
            arrayList = arrayList8;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            ((Notification.Builder) aVar.f225c).setExtras(c0372o.f6080y);
            D.c((Notification.Builder) aVar.f225c);
        }
        if (i11 >= 26) {
            E.e((Notification.Builder) aVar.f225c);
            E.h((Notification.Builder) aVar.f225c);
            E.i((Notification.Builder) aVar.f225c, c0372o.f6051C);
            E.j((Notification.Builder) aVar.f225c, c0372o.f6052D);
            E.g((Notification.Builder) aVar.f225c, c0372o.f6053E);
            if (c0372o.f6078w) {
                E.f((Notification.Builder) aVar.f225c, c0372o.f6077v);
            }
            if (!TextUtils.isEmpty(c0372o.f6050B)) {
                ((Notification.Builder) aVar.f225c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i11 >= 28) {
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                O o8 = (O) it6.next();
                o8.getClass();
                F.a((Notification.Builder) aVar.f225c, F.d(o8));
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            AbstractC0361d.b((Notification.Builder) aVar.f225c, c0372o.f6054F);
            AbstractC0361d.c((Notification.Builder) aVar.f225c);
        }
        if (c0372o.f6056H) {
            if (((C0372o) aVar.f226d).f6075t) {
                aVar.f223a = 2;
            } else {
                aVar.f223a = 1;
            }
            ((Notification.Builder) aVar.f225c).setVibrate(null);
            ((Notification.Builder) aVar.f225c).setSound(null);
            Notification notification4 = notification;
            int i13 = notification4.defaults & (-4);
            notification4.defaults = i13;
            ((Notification.Builder) aVar.f225c).setDefaults(i13);
            if (i12 >= 26) {
                if (TextUtils.isEmpty(((C0372o) aVar.f226d).f6074s)) {
                    ((Notification.Builder) aVar.f225c).setGroup("silent");
                }
                E.g((Notification.Builder) aVar.f225c, aVar.f223a);
            }
        }
    }

    @Override // S1.C
    public void c(v vVar, m1.q qVar, H h8) {
    }

    public a(AbstractActivityC0032e abstractActivityC0032e, A.f fVar, AbstractActivityC0032e abstractActivityC0032e2) {
        n nVar = new n(this);
        this.f224b = abstractActivityC0032e;
        this.f225c = fVar;
        fVar.f11c = nVar;
        this.f226d = abstractActivityC0032e2;
        this.f223a = 1280;
    }

    public a(S1.F f, int i7) {
        this.f227e = f;
        this.f224b = new p(new byte[5], 5);
        this.f225c = new SparseArray();
        this.f226d = new SparseIntArray();
        this.f223a = i7;
    }
}
