package A;

import B5.M;
import H0.C0136p;
import a4.AbstractC0467p;
import a4.K;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import b4.C0611t;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.auth.FirebaseAuth;
import e0.C0927b;
import io.flutter.plugins.googlemaps.AbstractC1179l;
import io.flutter.plugins.googlemaps.C1190x;
import io.flutter.plugins.googlemaps.r0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.json.JSONObject;
import w.C1940y;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static l f23c;

    /* renamed from: d  reason: collision with root package name */
    public static io.flutter.plugins.firebase.storage.g f24d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25a;

    /* renamed from: b  reason: collision with root package name */
    public Object f26b;

    public l() {
        this.f26b = new SparseBooleanArray();
    }

    public static String f(JSONObject jSONObject, String str) {
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static l n(Object obj) {
        return new l(obj, false);
    }

    public static l o(Serializable serializable) {
        return new l((Object) serializable, true);
    }

    public static K p(Intent intent) {
        X2.b r7;
        I.i(intent);
        Parcelable.Creator<zzaic> creator = zzaic.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        if (byteArrayExtra == null) {
            r7 = null;
        } else {
            r7 = org.slf4j.helpers.i.r(byteArrayExtra, creator);
        }
        return K.n(((zzaic) r7).zzc(true));
    }

    public static void r(Context context) {
        l lVar = f23c;
        lVar.f25a = false;
        if (((BroadcastReceiver) lVar.f26b) != null) {
            F0.c a7 = F0.c.a(context);
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) f23c.f26b;
            synchronized (a7.f1113b) {
                try {
                    ArrayList arrayList = (ArrayList) a7.f1113b.remove(broadcastReceiver);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            F0.b bVar = (F0.b) arrayList.get(size);
                            bVar.f1110d = true;
                            for (int i7 = 0; i7 < bVar.f1107a.countActions(); i7++) {
                                String action = bVar.f1107a.getAction(i7);
                                ArrayList arrayList2 = (ArrayList) a7.f1114c.get(action);
                                if (arrayList2 != null) {
                                    for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                        F0.b bVar2 = (F0.b) arrayList2.get(size2);
                                        if (bVar2.f1108b == broadcastReceiver) {
                                            bVar2.f1110d = true;
                                            arrayList2.remove(size2);
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        a7.f1114c.remove(action);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }
        f23c.f26b = null;
    }

    public void a(int i7) {
        K0.a.j(!this.f25a);
        ((SparseBooleanArray) this.f26b).append(i7, true);
    }

    public C0136p b() {
        K0.a.j(!this.f25a);
        this.f25a = true;
        return new C0136p((SparseBooleanArray) this.f26b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.firebase.storage.j] */
    public com.google.firebase.storage.j c() {
        ?? obj = new Object();
        obj.f9916a = null;
        obj.f9917b = null;
        obj.f9918c = null;
        obj.f9919d = n(StringUtils.EMPTY);
        obj.f9920e = null;
        obj.f = null;
        obj.f9921g = null;
        obj.f9923i = null;
        obj.j = n(StringUtils.EMPTY);
        obj.f9924k = n(StringUtils.EMPTY);
        obj.f9925l = n(StringUtils.EMPTY);
        obj.f9926m = n(StringUtils.EMPTY);
        obj.f9927n = n(Collections.emptyMap());
        com.google.firebase.storage.j jVar = (com.google.firebase.storage.j) this.f26b;
        I.i(jVar);
        obj.f9916a = jVar.f9916a;
        obj.f9917b = jVar.f9917b;
        obj.f9919d = jVar.f9919d;
        obj.j = jVar.j;
        obj.f9924k = jVar.f9924k;
        obj.f9925l = jVar.f9925l;
        obj.f9926m = jVar.f9926m;
        obj.f9927n = jVar.f9927n;
        if (this.f25a) {
            obj.f9923i = jVar.f9923i;
            obj.f9922h = jVar.f9922h;
            obj.f9921g = jVar.f9921g;
            obj.f = jVar.f;
            obj.f9920e = jVar.f9920e;
            obj.f9918c = jVar.f9918c;
        }
        return obj;
    }

    public CameraCaptureSession.CaptureCallback d(CameraCaptureSession.CaptureCallback captureCallback) {
        if (this.f25a) {
            k kVar = new k(0);
            E3.b bVar = (E3.b) kVar.f21b;
            ((List) this.f26b).add(bVar);
            Log.d("RequestMonitor", "RequestListener " + kVar + " monitoring " + this);
            bVar.a(new h(this, kVar, bVar, 0), j3.f.r());
            return new C1940y(Arrays.asList(kVar, captureCallback));
        }
        return captureCallback;
    }

    public boolean e() {
        return this.f25a;
    }

    public E3.b g() {
        List list = (List) this.f26b;
        if (list.isEmpty()) {
            return H.k.f1628c;
        }
        H.m mVar = new H.m(new ArrayList(new ArrayList(list)), false, j3.f.r());
        i iVar = new i(0);
        return H.i.d(H.i.f(mVar, new A4.c(iVar, 10), j3.f.r()));
    }

    public boolean h(CharSequence charSequence, int i7) {
        if (charSequence != null && i7 >= 0 && charSequence.length() - i7 >= 0) {
            if (((f0.f) this.f26b) == null) {
                return e();
            }
            boolean z7 = true;
            for (int i8 = 0; i8 < i7 && z7; i8++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i8));
                l lVar = f0.g.f10975a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case RecognitionOptions.DATA_MATRIX /* 16 */:
                            case 17:
                                break;
                            default:
                                z7 = true;
                                break;
                        }
                    }
                    z7 = false;
                }
                z7 = true;
            }
            if (!z7) {
                return true;
            }
            if (z7) {
                return false;
            }
            return e();
        }
        throw new IllegalArgumentException();
    }

    public void i(boolean z7) {
        if (!this.f25a) {
            this.f25a = true;
            M m7 = (M) this.f26b;
            int i7 = m7.f329b - 1;
            m7.f329b = i7;
            boolean z8 = z7 | m7.f328a;
            m7.f328a = z8;
            if (i7 == 0 && !z8) {
                ((V2.k) m7.f331d).B((KeyEvent) m7.f330c);
                return;
            }
            return;
        }
        throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
    }

    public void j(q3.g gVar) {
        this.f25a = true;
        if (f24d != null) {
            int i7 = AbstractC1179l.f12226a[gVar.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    f24d.b(new C1190x(gVar.name(), "Unknown renderer type", "Initialized with unknown renderer type"));
                } else {
                    f24d.a(r0.LEGACY);
                }
            } else {
                f24d.a(r0.LATEST);
            }
            f24d = null;
        }
    }

    public void k(boolean z7) {
        if (z7 == this.f25a) {
            return;
        }
        this.f25a = z7;
        if (!z7) {
            synchronized (((C0927b) this.f26b).f10587a) {
            }
        }
    }

    public void l(String str, String str2) {
        com.google.firebase.storage.j jVar = (com.google.firebase.storage.j) this.f26b;
        if (!jVar.f9927n.f25a) {
            jVar.f9927n = o(new HashMap());
        }
        ((Map) jVar.f9927n.f26b).put(str, str2);
    }

    public void m() {
        LinkedList linkedList = new LinkedList((List) this.f26b);
        while (!linkedList.isEmpty()) {
            E3.b bVar = (E3.b) linkedList.poll();
            Objects.requireNonNull(bVar);
            bVar.cancel(true);
        }
    }

    public void q(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f26b = broadcastReceiver;
        F0.c a7 = F0.c.a(activity);
        IntentFilter intentFilter = new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        synchronized (a7.f1113b) {
            try {
                F0.b bVar = new F0.b(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) a7.f1113b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    a7.f1113b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(bVar);
                for (int i7 = 0; i7 < intentFilter.countActions(); i7++) {
                    String action = intentFilter.getAction(i7);
                    ArrayList arrayList2 = (ArrayList) a7.f1114c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        a7.f1114c.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean s(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC0467p abstractC0467p) {
        if (!this.f25a) {
            q(activity, new C0611t(this, activity, taskCompletionSource, firebaseAuth, abstractC0467p));
            this.f25a = true;
            return true;
        }
        return false;
    }

    public l(Object obj, boolean z7) {
        this.f25a = z7;
        this.f26b = obj;
    }

    public l(boolean z7) {
        this.f26b = DesugarCollections.synchronizedList(new ArrayList());
        this.f25a = z7;
    }

    public l(f0.f fVar, boolean z7) {
        this.f26b = fVar;
        this.f25a = z7;
    }

    public l(JSONObject jSONObject, com.google.firebase.storage.m mVar) {
        com.google.firebase.storage.j jVar = new com.google.firebase.storage.j();
        this.f26b = jVar;
        jVar.f9918c = jSONObject.optString("generation");
        jVar.f9916a = jSONObject.optString("name");
        jVar.f9917b = jSONObject.optString("bucket");
        jVar.f9920e = jSONObject.optString("metageneration");
        jVar.f = jSONObject.optString("timeCreated");
        jVar.f9921g = jSONObject.optString("updated");
        jVar.f9922h = jSONObject.optLong("size");
        jVar.f9923i = jSONObject.optString("md5Hash");
        if (jSONObject.has(ExternalParsersConfigReaderMetKeys.METADATA_TAG) && !jSONObject.isNull(ExternalParsersConfigReaderMetKeys.METADATA_TAG)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(ExternalParsersConfigReaderMetKeys.METADATA_TAG);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                l(next, jSONObject2.getString(next));
            }
        }
        String f = f(jSONObject, "contentType");
        if (f != null) {
            ((com.google.firebase.storage.j) this.f26b).f9919d = o(f);
        }
        String f4 = f(jSONObject, "cacheControl");
        if (f4 != null) {
            ((com.google.firebase.storage.j) this.f26b).j = o(f4);
        }
        String f8 = f(jSONObject, "contentDisposition");
        if (f8 != null) {
            ((com.google.firebase.storage.j) this.f26b).f9924k = o(f8);
        }
        String f9 = f(jSONObject, "contentEncoding");
        if (f9 != null) {
            ((com.google.firebase.storage.j) this.f26b).f9925l = o(f9);
        }
        String f10 = f(jSONObject, "contentLanguage");
        if (f10 != null) {
            ((com.google.firebase.storage.j) this.f26b).f9926m = o(f10);
        }
        this.f25a = true;
        ((com.google.firebase.storage.j) this.f26b).getClass();
    }
}
