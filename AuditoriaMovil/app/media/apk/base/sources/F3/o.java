package F3;

import B5.AbstractActivityC0032e;
import D.AbstractC0059i;
import D.C0061k;
import D.D;
import H4.W;
import K0.x;
import R3.EnumC0328x0;
import R3.G0;
import R3.X0;
import X5.C0377c;
import X5.C0380f;
import X5.C0381g;
import X5.C0395v;
import a6.u0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C0503e;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.camera.core.impl.J;
import androidx.lifecycle.EnumC0563o;
import androidx.lifecycle.InterfaceC0568u;
import c4.InterfaceC0635d;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import h3.AbstractC1079a;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import k6.InterfaceC1408a;
import m6.AbstractC1447h;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.utils.StringUtils;
import v.C1878a;
import w5.C1957a;
/* loaded from: classes.dex */
public final class o implements F2.b, J1.d, InterfaceC0635d, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1177a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1178b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1179c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1180d;

    /* renamed from: e  reason: collision with root package name */
    public Object f1181e;
    public Object f;

    public /* synthetic */ o(int i7) {
        this.f1177a = i7;
    }

    public static String n(String str) {
        if (str != null && E6.m.N(str, "/")) {
            String substring = str.substring(0, E6.m.R(0, 6, str, "/", false));
            kotlin.jvm.internal.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return "*";
    }

    public static void q(Throwable th) {
        Log.e("WebChromeClientImpl", th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    @Override // J1.d
    public List M(long j) {
        P1.a[] aVarArr;
        P1.c cVar = (P1.c) this.f1178b;
        ArrayList arrayList = new ArrayList();
        cVar.g(j, cVar.f3968h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j, false, cVar.f3968h, treeMap);
        HashMap hashMap = (HashMap) this.f1181e;
        cVar.h(j, (Map) this.f1180d, hashMap, cVar.f3968h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((HashMap) this.f).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                P1.f fVar = (P1.f) hashMap.get(pair.first);
                fVar.getClass();
                arrayList2.add(new J0.b(null, null, null, decodeByteArray, fVar.f3986c, 0, fVar.f3988e, fVar.f3985b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f, fVar.f3989g, false, -16777216, fVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            P1.f fVar2 = (P1.f) hashMap.get(entry.getKey());
            fVar2.getClass();
            J0.a aVar = (J0.a) entry.getValue();
            CharSequence charSequence = aVar.f2289a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (P1.a aVar2 : (P1.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), P1.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) StringUtils.EMPTY);
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length(); i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    int i9 = i8;
                    while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                        i9++;
                    }
                    int i10 = i9 - i8;
                    if (i10 > 0) {
                        spannableStringBuilder.delete(i7, i10 + i7);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
                if (spannableStringBuilder.charAt(i11) == '\n') {
                    int i12 = i11 + 1;
                    if (spannableStringBuilder.charAt(i12) == ' ') {
                        spannableStringBuilder.delete(i12, i11 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == ' ') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == '\n') {
                        spannableStringBuilder.delete(i13, i14);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.f2293e = fVar2.f3986c;
            aVar.f = fVar2.f3987d;
            aVar.f2294g = fVar2.f3988e;
            aVar.f2295h = fVar2.f3985b;
            aVar.f2298l = fVar2.f;
            aVar.f2297k = fVar2.f3991i;
            aVar.j = fVar2.f3990h;
            aVar.f2302p = fVar2.j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public void a(Object obj, Object obj2, G0 g02, boolean z7) {
        byte[] array;
        if (((ConcurrentHashMap) this.f1179c) != null) {
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (g02.F() == EnumC0328x0.ENABLED) {
                Integer valueOf = Integer.valueOf(g02.D());
                byte[] bArr = null;
                if (g02.E() == X0.RAW) {
                    valueOf = null;
                }
                c a7 = M3.j.f3240b.a(M3.q.l(g02.C().D(), g02.C().E(), g02.C().C(), g02.E(), valueOf));
                int i7 = b.f1161a[g02.E().ordinal()];
                if (i7 != 1 && i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            array = c.f1162a;
                        } else {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                    } else {
                        array = ByteBuffer.allocate(5).put((byte) 1).putInt(g02.D()).array();
                    }
                } else {
                    array = ByteBuffer.allocate(5).put((byte) 0).putInt(g02.D()).array();
                }
                p pVar = new p(obj, obj2, array, g02.F(), g02.E(), g02.D(), g02.C().D(), a7);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f1179c;
                ArrayList arrayList = (ArrayList) this.f1180d;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(pVar);
                byte[] bArr2 = pVar.f1184c;
                if (bArr2 != null) {
                    bArr = Arrays.copyOf(bArr2, bArr2.length);
                }
                q qVar = new q(bArr);
                List list = (List) concurrentHashMap.put(qVar, DesugarCollections.unmodifiableList(arrayList2));
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(list);
                    arrayList3.add(pVar);
                    concurrentHashMap.put(qVar, DesugarCollections.unmodifiableList(arrayList3));
                }
                arrayList.add(pVar);
                if (z7) {
                    if (((p) this.f1181e) == null) {
                        this.f1181e = pVar;
                        return;
                    }
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                return;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }

    public void b(R.b bVar, List list, B.a aVar) {
        synchronized (this.f1178b) {
            try {
                g0.c.b(!list.isEmpty());
                this.f = aVar;
                InterfaceC0568u i7 = bVar.i();
                R.c l8 = l(i7);
                if (l8 == null) {
                    return;
                }
                Set<R.a> set = (Set) ((HashMap) this.f1180d).get(l8);
                B.a aVar2 = (B.a) this.f;
                if (aVar2 == null || aVar2.f223a != 2) {
                    for (R.a aVar3 : set) {
                        R.b bVar2 = (R.b) ((HashMap) this.f1179c).get(aVar3);
                        bVar2.getClass();
                        if (!bVar2.equals(bVar) && !bVar2.p().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    bVar.f4508c.H();
                    bVar.f4508c.F();
                    bVar.c(list);
                    if (((AbstractActivityC0032e) i7).f354c.f7946c.a(EnumC0563o.STARTED)) {
                        t(i7);
                    }
                } catch (I.e e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public G3.k c() {
        if (((Integer) this.f1178b) != null) {
            if (((Integer) this.f1179c) != null) {
                Integer num = (Integer) this.f1180d;
                if (num != null) {
                    if (((G3.j) this.f1181e) != null) {
                        if (((G3.j) this.f) != null) {
                            int intValue = num.intValue();
                            G3.j jVar = (G3.j) this.f1181e;
                            if (jVar == G3.j.f1534c) {
                                if (intValue > 20) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                                }
                            } else if (jVar == G3.j.f1535d) {
                                if (intValue > 28) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                                }
                            } else if (jVar == G3.j.f1536e) {
                                if (intValue > 32) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                                }
                            } else if (jVar == G3.j.f) {
                                if (intValue > 48) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                                }
                            } else if (jVar == G3.j.f1537g) {
                                if (intValue > 64) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                                }
                            } else {
                                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                            }
                            return new G3.k(((Integer) this.f1178b).intValue(), ((Integer) this.f1179c).intValue(), ((Integer) this.f1180d).intValue(), (G3.j) this.f, (G3.j) this.f1181e);
                        }
                        throw new GeneralSecurityException("variant is not set");
                    }
                    throw new GeneralSecurityException("hash type is not set");
                }
                throw new GeneralSecurityException("tag size is not set");
            }
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        throw new GeneralSecurityException("AES key size is not set");
    }

    @Override // c4.InterfaceC0635d
    public Object d(M3.q qVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((c4.r) this.f1178b, (c4.r) this.f1179c, (c4.r) this.f1180d, (c4.r) this.f1181e, (c4.r) this.f, qVar);
    }

    public C0503e e() {
        String str;
        if (((J) this.f1178b) == null) {
            str = " surface";
        } else {
            str = StringUtils.EMPTY;
        }
        if (((List) this.f1179c) == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (((Integer) this.f1180d) == null) {
            str = AbstractC0059i.z(str, " mirrorMode");
        }
        if (((Integer) this.f1181e) == null) {
            str = AbstractC0059i.z(str, " surfaceGroupId");
        }
        if (((D) this.f) == null) {
            str = AbstractC0059i.z(str, " dynamicRange");
        }
        if (str.isEmpty()) {
            return new C0503e((J) this.f1178b, (List) this.f1179c, ((Integer) this.f1180d).intValue(), ((Integer) this.f1181e).intValue(), (D) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // J1.d
    public int e0() {
        return ((long[]) this.f1179c).length;
    }

    public C0505g f() {
        String str;
        if (((Size) this.f1178b) == null) {
            str = " resolution";
        } else {
            str = StringUtils.EMPTY;
        }
        if (((D) this.f1179c) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Range) this.f1180d) == null) {
            str = AbstractC0059i.z(str, " expectedFrameRateRange");
        }
        if (((Boolean) this.f) == null) {
            str = AbstractC0059i.z(str, " zslDisabled");
        }
        if (str.isEmpty()) {
            return new C0505g((Size) this.f1178b, (D) this.f1179c, (Range) this.f1180d, (C1878a) this.f1181e, ((Boolean) this.f).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // J1.d
    public int g(long j) {
        long[] jArr = (long[]) this.f1179c;
        int b5 = x.b(jArr, j, false);
        if (b5 >= jArr.length) {
            return -1;
        }
        return b5;
    }

    @Override // k6.InterfaceC1408a
    public Object get() {
        return new H2.b((Executor) ((InterfaceC1408a) this.f1178b).get(), (E2.f) ((InterfaceC1408a) this.f1179c).get(), (I2.d) ((V2.k) this.f1180d).get(), (J2.c) ((InterfaceC1408a) this.f1181e).get(), (K2.c) ((InterfaceC1408a) this.f).get());
    }

    public void h(InterfaceC0521x interfaceC0521x, InterfaceC0521x interfaceC0521x2, M.m mVar, M.m mVar2, Map.Entry entry) {
        InterfaceC0521x interfaceC0521x3;
        InterfaceC0521x interfaceC0521x4;
        M.m mVar3 = (M.m) entry.getValue();
        Size size = mVar.f3108g.f7621a;
        O.b bVar = ((N.a) entry.getKey()).f3310a;
        if (mVar.f3105c) {
            interfaceC0521x3 = interfaceC0521x;
        } else {
            interfaceC0521x3 = null;
        }
        C0061k c0061k = new C0061k(size, bVar.f3456d, interfaceC0521x3, ((N.a) entry.getKey()).f3310a.f, ((N.a) entry.getKey()).f3310a.f3458g);
        Size size2 = mVar2.f3108g.f7621a;
        O.b bVar2 = ((N.a) entry.getKey()).f3311b;
        if (mVar2.f3105c) {
            interfaceC0521x4 = interfaceC0521x2;
        } else {
            interfaceC0521x4 = null;
        }
        C0061k c0061k2 = new C0061k(size2, bVar2.f3456d, interfaceC0521x4, ((N.a) entry.getKey()).f3311b.f, ((N.a) entry.getKey()).f3311b.f3458g);
        O.b bVar3 = ((N.a) entry.getKey()).f3310a;
        mVar3.getClass();
        AbstractC1079a.e();
        mVar3.a();
        g0.c.g("Consumer can only be linked once.", !mVar3.j);
        mVar3.j = true;
        M.l lVar = mVar3.f3112l;
        H.b f = H.i.f(lVar.c(), new M.k(mVar3, lVar, bVar3.f3455c, c0061k, c0061k2), j3.f.C());
        f.a(new H.h(0, f, new M0.x(1, this, mVar3)), j3.f.C());
    }

    public R.b i(AbstractActivityC0032e abstractActivityC0032e, I.g gVar) {
        boolean z7;
        synchronized (this.f1178b) {
            try {
                if (((HashMap) this.f1179c).get(new R.a(abstractActivityC0032e, gVar.f2096e)) == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                g0.c.a("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", z7);
                R.b bVar = new R.b(abstractActivityC0032e, gVar);
                if (((ArrayList) gVar.z()).isEmpty()) {
                    bVar.r();
                }
                if (abstractActivityC0032e.f354c.f7946c == EnumC0563o.DESTROYED) {
                    return bVar;
                }
                r(bVar);
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public L5.n j() {
        if (((C0381g) this.f1180d) == null) {
            this.f1180d = new C0381g(this);
        }
        C0381g c0381g = (C0381g) this.f1180d;
        kotlin.jvm.internal.j.b(c0381g);
        return c0381g;
    }

    public Context k() {
        AbstractActivityC0032e abstractActivityC0032e = (AbstractActivityC0032e) this.f1179c;
        if (abstractActivityC0032e == null) {
            return (Context) this.f1178b;
        }
        return abstractActivityC0032e;
    }

    public R.c l(InterfaceC0568u interfaceC0568u) {
        synchronized (this.f1178b) {
            try {
                for (R.c cVar : ((HashMap) this.f1180d).keySet()) {
                    if (interfaceC0568u.equals(cVar.f4511b)) {
                        return cVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection m() {
        Collection unmodifiableCollection;
        synchronized (this.f1178b) {
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(((HashMap) this.f1179c).values());
        }
        return unmodifiableCollection;
    }

    public File o() {
        return new File(k().getCacheDir(), "share_plus");
    }

    public boolean p(InterfaceC0568u interfaceC0568u) {
        synchronized (this.f1178b) {
            try {
                R.c l8 = l(interfaceC0568u);
                if (l8 == null) {
                    return false;
                }
                for (R.a aVar : (Set) ((HashMap) this.f1180d).get(l8)) {
                    R.b bVar = (R.b) ((HashMap) this.f1179c).get(aVar);
                    bVar.getClass();
                    if (!bVar.p().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(R.b bVar) {
        Set hashSet;
        synchronized (this.f1178b) {
            try {
                InterfaceC0568u i7 = bVar.i();
                I.g gVar = bVar.f4508c;
                R.a aVar = new R.a(i7, I.g.v(gVar.f2104l0, gVar.f2105m0));
                R.c l8 = l(i7);
                if (l8 != null) {
                    hashSet = (Set) ((HashMap) this.f1180d).get(l8);
                } else {
                    hashSet = new HashSet();
                }
                hashSet.add(aVar);
                ((HashMap) this.f1179c).put(aVar, bVar);
                if (l8 == null) {
                    R.c cVar = new R.c(i7, this);
                    ((HashMap) this.f1180d).put(cVar, hashSet);
                    ((AbstractActivityC0032e) i7).f354c.a(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(Runnable runnable) {
        Context context = (Context) this.f1181e;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void t(InterfaceC0568u interfaceC0568u) {
        synchronized (this.f1178b) {
            try {
                if (!p(interfaceC0568u)) {
                    return;
                }
                if (((ArrayDeque) this.f1181e).isEmpty()) {
                    ((ArrayDeque) this.f1181e).push(interfaceC0568u);
                } else {
                    B.a aVar = (B.a) this.f;
                    if (aVar == null || aVar.f223a != 2) {
                        InterfaceC0568u interfaceC0568u2 = (InterfaceC0568u) ((ArrayDeque) this.f1181e).peek();
                        if (!interfaceC0568u.equals(interfaceC0568u2)) {
                            w(interfaceC0568u2);
                            ((ArrayDeque) this.f1181e).remove(interfaceC0568u);
                            ((ArrayDeque) this.f1181e).push(interfaceC0568u);
                        }
                    }
                }
                z(interfaceC0568u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean isSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1181e;
        if (isSuccessful) {
            com.google.firebase.storage.h hVar = (com.google.firebase.storage.h) task.getResult();
            ArrayList arrayList = hVar.f9911a;
            ArrayList arrayList2 = (ArrayList) this.f1180d;
            arrayList2.addAll(arrayList);
            ArrayList arrayList3 = hVar.f9912b;
            ArrayList arrayList4 = (ArrayList) this.f1178b;
            arrayList4.addAll(arrayList3);
            String str = hVar.f9913c;
            if (str != null) {
                ((com.google.firebase.storage.m) this.f).c(null, str).continueWithTask((u0) this.f1179c, this);
            } else {
                taskCompletionSource.setResult(new com.google.firebase.storage.h(arrayList2, arrayList4, null));
            }
        } else {
            taskCompletionSource.setException(task.getException());
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f1177a) {
            case 14:
                return "RemoteEvent{snapshotVersion=" + ((q4.q) this.f1178b) + ", targetChanges=" + ((Map) this.f1179c) + ", targetMismatches=" + ((Map) this.f1180d) + ", documentUpdates=" + ((Map) this.f1181e) + ", resolvedLimboDocuments=" + ((Set) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public void u(InterfaceC0568u interfaceC0568u) {
        synchronized (this.f1178b) {
            try {
                ((ArrayDeque) this.f1181e).remove(interfaceC0568u);
                w(interfaceC0568u);
                if (!((ArrayDeque) this.f1181e).isEmpty()) {
                    z((InterfaceC0568u) ((ArrayDeque) this.f1181e).peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v(Map arguments) {
        ArrayList<String> arrayList;
        ArrayList arrayList2;
        ArrayList<? extends Parcelable> arrayList3;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        K5.r rVar;
        boolean z11;
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.j.e(arguments, "arguments");
        File o7 = o();
        File[] listFiles = o7.listFiles();
        if (o7.exists() && listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                file.delete();
            }
            o7.delete();
        }
        String str = (String) arguments.get("text");
        String str2 = (String) arguments.get("uri");
        String str3 = (String) arguments.get("subject");
        String str4 = (String) arguments.get("title");
        List list = (List) arguments.get("paths");
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = (List) arguments.get("mimeTypes");
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList != null) {
            arrayList3 = new ArrayList<>(arrayList.size());
            for (String str5 : arrayList) {
                File file2 = new File(str5);
                try {
                    String filePath = file2.getCanonicalPath();
                    kotlin.jvm.internal.j.d(filePath, "filePath");
                    String canonicalPath = o().getCanonicalPath();
                    kotlin.jvm.internal.j.d(canonicalPath, "shareCacheFolder.canonicalPath");
                    z13 = E6.m.e0(filePath, canonicalPath);
                } catch (IOException unused) {
                    z13 = false;
                }
                if (!z13) {
                    File o8 = o();
                    if (!o8.exists()) {
                        o8.mkdirs();
                    }
                    File file3 = new File(o8, file2.getName());
                    if (file2.exists()) {
                        if (file3.exists() && !file3.delete()) {
                            throw new R0.a(file2, file3, "Tried to overwrite the destination, but failed to delete it.");
                        }
                        if (file2.isDirectory()) {
                            if (!file3.mkdirs()) {
                                throw new R0.a(file2, file3, "Failed to create target directory.");
                            }
                        } else {
                            File parentFile = file3.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            FileInputStream fileInputStream = new FileInputStream(file2);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                G.i.u(fileInputStream, fileOutputStream, 8192);
                                W.g(fileOutputStream, null);
                                W.g(fileInputStream, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    W.g(fileInputStream, th);
                                    throw th2;
                                }
                            }
                        }
                        arrayList3.add(X.f.d(k(), (String) ((l6.g) this.f1181e).a(), file3));
                    } else {
                        throw new R0.a(file2, (File) null, "The source file doesn't exist.");
                    }
                } else {
                    throw new IOException(AbstractC0059i.M("Shared file can not be located in '", o().getCanonicalPath(), "'"));
                }
            }
        } else {
            arrayList3 = null;
        }
        Intent intent = new Intent();
        if (arrayList3 == null) {
            intent.setAction("android.intent.action.SEND");
            intent.setType(MimeTypes.PLAIN_TEXT);
            if (str2 != null) {
                str = str2;
            }
            intent.putExtra("android.intent.extra.TEXT", str);
            if (str3 != null && !E6.m.U(str3)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                intent.putExtra("android.intent.extra.SUBJECT", str3);
            }
            if (str4 != null && !E6.m.U(str4)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12) {
                intent.putExtra("android.intent.extra.TITLE", str4);
            }
        } else if (!arrayList3.isEmpty()) {
            String str6 = "*/*";
            if (arrayList3.size() == 1) {
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    str6 = (String) AbstractC1447h.O(arrayList2);
                }
                intent.setAction("android.intent.action.SEND");
                intent.setType(str6);
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) AbstractC1447h.O(arrayList3));
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    if (arrayList2.size() == 1) {
                        str6 = (String) AbstractC1447h.O(arrayList2);
                    } else {
                        String str7 = (String) AbstractC1447h.O(arrayList2);
                        int size = arrayList2.size() - 1;
                        if (1 <= size) {
                            int i7 = 1;
                            while (true) {
                                if (!kotlin.jvm.internal.j.a(str7, arrayList2.get(i7))) {
                                    if (!n(str7).equals(n((String) arrayList2.get(i7)))) {
                                        break;
                                    }
                                    str7 = n((String) arrayList2.get(i7)).concat("/*");
                                }
                                if (i7 == size) {
                                    break;
                                }
                                i7++;
                            }
                        }
                        str6 = str7;
                    }
                }
                intent.setType(str6);
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
            }
            if (str != null && !E6.m.U(str)) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (!z7) {
                intent.putExtra("android.intent.extra.TEXT", str);
            }
            if (str3 != null && !E6.m.U(str3)) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!z8) {
                intent.putExtra("android.intent.extra.SUBJECT", str3);
            }
            if (str4 != null && !E6.m.U(str4)) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z9) {
                intent.putExtra("android.intent.extra.TITLE", str4);
            }
            intent.addFlags(1);
        } else {
            throw new IOException("Error sharing files: No files found");
        }
        Context context = (Context) this.f1178b;
        Intent chooserIntent = Intent.createChooser(intent, str4, PendingIntent.getBroadcast(context, 0, new Intent(context, SharePlusPendingIntent.class), ((Number) ((l6.g) this.f).a()).intValue() | 134217728).getIntentSender());
        if (arrayList3 != null) {
            List<ResolveInfo> queryIntentActivities = k().getPackageManager().queryIntentActivities(chooserIntent, 65536);
            kotlin.jvm.internal.j.d(queryIntentActivities, "getContext().packageMana…EFAULT_ONLY\n            )");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str8 = resolveInfo.activityInfo.packageName;
                Iterator<T> it = arrayList3.iterator();
                while (it.hasNext()) {
                    k().grantUriPermission(str8, (Uri) it.next(), 3);
                }
            }
        }
        kotlin.jvm.internal.j.d(chooserIntent, "chooserIntent");
        AbstractActivityC0032e abstractActivityC0032e = (AbstractActivityC0032e) this.f1179c;
        if (abstractActivityC0032e != null) {
            abstractActivityC0032e.startActivityForResult(chooserIntent, 22643);
            return;
        }
        chooserIntent.addFlags(268435456);
        w5.c cVar = (w5.c) this.f1180d;
        if (cVar.f16373b.compareAndSet(false, true) && (rVar = cVar.f16372a) != null) {
            rVar.a("dev.fluttercommunity.plus/share/unavailable");
            cVar.f16372a = null;
        }
        context.startActivity(chooserIntent);
    }

    public void w(InterfaceC0568u interfaceC0568u) {
        synchronized (this.f1178b) {
            try {
                R.c l8 = l(interfaceC0568u);
                if (l8 == null) {
                    return;
                }
                for (R.a aVar : (Set) ((HashMap) this.f1180d).get(l8)) {
                    R.b bVar = (R.b) ((HashMap) this.f1179c).get(aVar);
                    bVar.getClass();
                    bVar.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.d
    public long x(int i7) {
        return ((long[]) this.f1179c)[i7];
    }

    public void y() {
        synchronized (this.f1178b) {
            try {
                for (R.a aVar : ((HashMap) this.f1179c).keySet()) {
                    R.b bVar = (R.b) ((HashMap) this.f1179c).get(aVar);
                    bVar.s();
                    u(bVar.i());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(InterfaceC0568u interfaceC0568u) {
        synchronized (this.f1178b) {
            try {
                for (R.a aVar : (Set) ((HashMap) this.f1180d).get(l(interfaceC0568u))) {
                    R.b bVar = (R.b) ((HashMap) this.f1179c).get(aVar);
                    bVar.getClass();
                    if (!bVar.p().isEmpty()) {
                        bVar.t();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f1177a = i7;
        this.f1178b = obj;
        this.f1179c = obj2;
        this.f1180d = obj3;
        this.f1181e = obj4;
        this.f = obj5;
    }

    public o(Context context, w5.c manager) {
        this.f1177a = 15;
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(manager, "manager");
        this.f1178b = context;
        this.f1179c = null;
        this.f1180d = manager;
        this.f1181e = m5.d.m(new R6.d(this, 5));
        this.f = m5.d.m(C1957a.f16368a);
    }

    public o(L5.f binaryMessenger, Context context, C0395v c0395v) {
        this.f1177a = 6;
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        this.f1178b = binaryMessenger;
        this.f1179c = new C0377c(new A4.c(new C0380f(binaryMessenger), 26));
        this.f1181e = context;
        this.f = c0395v;
    }

    public o(P1.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f1177a = 4;
        this.f1178b = cVar;
        this.f1181e = hashMap2;
        this.f = hashMap3;
        this.f1180d = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        this.f1179c = jArr;
    }

    public o() {
        this.f1177a = 5;
        this.f1178b = new Object();
        this.f1179c = new HashMap();
        this.f1180d = new HashMap();
        this.f1181e = new ArrayDeque();
    }

    public o(InterfaceC0521x interfaceC0521x, InterfaceC0521x interfaceC0521x2, N.e eVar) {
        this.f1177a = 3;
        this.f1179c = interfaceC0521x;
        this.f1180d = interfaceC0521x2;
        this.f1178b = eVar;
    }

    public o(Class cls) {
        this.f1177a = 0;
        this.f1179c = new ConcurrentHashMap();
        this.f1180d = new ArrayList();
        this.f1178b = cls;
        this.f = P3.a.f4016b;
    }

    public o(com.google.firebase.storage.m mVar, ArrayList arrayList, ArrayList arrayList2, u0 u0Var, TaskCompletionSource taskCompletionSource) {
        this.f1177a = 10;
        this.f = mVar;
        this.f1180d = arrayList;
        this.f1178b = arrayList2;
        this.f1179c = u0Var;
        this.f1181e = taskCompletionSource;
    }
}
