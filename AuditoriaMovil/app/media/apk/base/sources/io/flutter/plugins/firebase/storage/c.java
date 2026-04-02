package io.flutter.plugins.firebase.storage;

import a.AbstractC0412a;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j$.util.Objects;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public class c implements FlutterFirebasePlugin, H5.b {

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f11978c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f11979d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public L5.r f11980a;

    /* renamed from: b  reason: collision with root package name */
    public L5.f f11981b;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, io.flutter.plugins.firebase.storage.l] */
    public static l a(com.google.firebase.storage.h hVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = hVar.f9912b.iterator();
        while (it.hasNext()) {
            arrayList.add(b((com.google.firebase.storage.m) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = hVar.f9911a.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((com.google.firebase.storage.m) it2.next()));
        }
        ?? obj = new Object();
        obj.f12002a = arrayList;
        obj.f12003b = hVar.f9913c;
        obj.f12004c = arrayList2;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [io.flutter.plugins.firebase.storage.o, java.lang.Object] */
    public static o b(com.google.firebase.storage.m mVar) {
        String authority = mVar.f9930a.getAuthority();
        String path = mVar.f9930a.getPath();
        String a7 = mVar.a();
        ?? obj = new Object();
        if (authority != null) {
            obj.f12013a = authority;
            if (path != null) {
                obj.f12014b = path;
                if (a7 != null) {
                    obj.f12015c = a7;
                    return obj;
                }
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"fullPath\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"bucket\" is null.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, A.l] */
    public static com.google.firebase.storage.j c(m mVar) {
        ?? obj = new Object();
        obj.f26b = new com.google.firebase.storage.j();
        String str = mVar.f12009e;
        if (str != null) {
            ((com.google.firebase.storage.j) obj.f26b).f9919d = A.l.o(str);
        }
        String str2 = mVar.f12005a;
        if (str2 != null) {
            ((com.google.firebase.storage.j) obj.f26b).j = A.l.o(str2);
        }
        String str3 = mVar.f12006b;
        if (str3 != null) {
            ((com.google.firebase.storage.j) obj.f26b).f9924k = A.l.o(str3);
        }
        String str4 = mVar.f12007c;
        if (str4 != null) {
            ((com.google.firebase.storage.j) obj.f26b).f9925l = A.l.o(str4);
        }
        String str5 = mVar.f12008d;
        if (str5 != null) {
            ((com.google.firebase.storage.j) obj.f26b).f9926m = A.l.o(str5);
        }
        Map map = mVar.f;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                obj.l((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return obj.c();
    }

    public static com.google.firebase.storage.f d(n nVar) {
        boolean z7;
        U3.h e7 = U3.h.e(nVar.f12010a);
        String str = "gs://" + nVar.f12012c;
        if (str != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("Null is not a valid value for the Firebase Storage URL.", z7);
        if (str.toLowerCase().startsWith("gs://")) {
            try {
                return com.google.firebase.storage.f.c(e7, AbstractC0412a.I(str));
            } catch (UnsupportedEncodingException e8) {
                Log.e("FirebaseStorage", "Unable to parse url:".concat(str), e8);
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            }
        }
        throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
    }

    public static HashMap e(com.google.firebase.storage.j jVar) {
        String str;
        String str2;
        if (jVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str3 = jVar.f9916a;
        if (str3 == null) {
            str3 = StringUtils.EMPTY;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = null;
        } else {
            int lastIndexOf = str3.lastIndexOf(47);
            if (lastIndexOf != -1) {
                str3 = str3.substring(lastIndexOf + 1);
            }
        }
        if (str3 != null) {
            String str4 = jVar.f9916a;
            if (str4 == null) {
                str4 = StringUtils.EMPTY;
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = null;
            } else {
                int lastIndexOf2 = str4.lastIndexOf(47);
                if (lastIndexOf2 != -1) {
                    str4 = str4.substring(lastIndexOf2 + 1);
                }
            }
            hashMap.put("name", str4);
        }
        String str5 = jVar.f9917b;
        if (str5 != null) {
            hashMap.put("bucket", str5);
        }
        String str6 = jVar.f9918c;
        if (str6 != null) {
            hashMap.put("generation", str6);
        }
        String str7 = jVar.f9920e;
        if (str7 != null) {
            hashMap.put("metadataGeneration", str7);
        }
        String str8 = jVar.f9916a;
        if (str8 == null) {
            str8 = StringUtils.EMPTY;
        }
        hashMap.put("fullPath", str8);
        hashMap.put("size", Long.valueOf(jVar.f9922h));
        hashMap.put("creationTimeMillis", Long.valueOf(AbstractC0412a.J(jVar.f)));
        hashMap.put("updatedTimeMillis", Long.valueOf(AbstractC0412a.J(jVar.f9921g)));
        String str9 = jVar.f9923i;
        if (str9 != null) {
            hashMap.put("md5Hash", str9);
        }
        Object obj = jVar.j.f26b;
        if (((String) obj) != null) {
            hashMap.put("cacheControl", (String) obj);
        }
        Object obj2 = jVar.f9924k.f26b;
        if (((String) obj2) != null) {
            hashMap.put("contentDisposition", (String) obj2);
        }
        Object obj3 = jVar.f9925l.f26b;
        if (((String) obj3) != null) {
            hashMap.put("contentEncoding", (String) obj3);
        }
        Object obj4 = jVar.f9926m.f26b;
        if (((String) obj4) != null) {
            hashMap.put("contentLanguage", (String) obj4);
        }
        Object obj5 = jVar.f9919d.f26b;
        if (((String) obj5) != null) {
            hashMap.put("contentType", (String) obj5);
        }
        HashMap hashMap2 = new HashMap();
        for (String str10 : ((Map) jVar.f9927n.f26b).keySet()) {
            if (TextUtils.isEmpty(str10)) {
                str = null;
            } else {
                str = (String) ((Map) jVar.f9927n.f26b).get(str10);
            }
            if (str == null) {
                hashMap2.put(str10, StringUtils.EMPTY);
            } else {
                if (TextUtils.isEmpty(str10)) {
                    str2 = null;
                } else {
                    str2 = (String) ((Map) jVar.f9927n.f26b).get(str10);
                }
                Objects.requireNonNull(str2);
                hashMap2.put(str10, str2);
            }
        }
        hashMap.put("customMetadata", hashMap2);
        return hashMap;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.storage.a
            @Override // java.lang.Runnable
            public final void run() {
                HashMap hashMap = c.f11978c;
                c cVar = c.this;
                cVar.getClass();
                e.a();
                taskCompletionSource.setResult(null);
                cVar.g();
            }
        });
        return taskCompletionSource.getTask();
    }

    public final void f(String str, v vVar) {
        L5.j jVar = new L5.j(this.f11981b, io.flutter.plugins.pathprovider.b.h("plugins.flutter.io/firebase_storage/taskEvent/", str));
        jVar.a(vVar);
        f11978c.put(str, jVar);
        f11979d.put(str, vVar);
    }

    public final synchronized void g() {
        try {
            Iterator it = new ArrayList(f11978c.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                HashMap hashMap = f11978c;
                L5.j jVar = (L5.j) hashMap.get(str);
                if (jVar != null) {
                    jVar.a(null);
                }
                hashMap.remove(str);
            }
            Iterator it2 = new ArrayList(f11979d.keySet()).iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                HashMap hashMap2 = f11979d;
                L5.i iVar = (L5.i) hashMap2.get(str2);
                if (iVar != null) {
                    iVar.b();
                }
                hashMap2.remove(str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(U3.h hVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new P5.e(2, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        L5.f fVar = aVar.f2030b;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_storage", this);
        this.f11980a = new L5.r(fVar, "plugins.flutter.io/firebase_storage");
        Y.D(fVar, this);
        this.f11981b = fVar;
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        e.a();
        this.f11980a.b(null);
        Y.D(this.f11981b, null);
        this.f11980a = null;
        this.f11981b = null;
        g();
    }
}
