package io.flutter.plugins.imagepicker;

import B5.AbstractActivityC0032e;
import a1.C0415A;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import androidx.datastore.preferences.protobuf.Y;
import androidx.lifecycle.AbstractC0564p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
import p.Y0;
/* loaded from: classes.dex */
public class k implements H5.b, I5.a {

    /* renamed from: a  reason: collision with root package name */
    public H5.a f12366a;

    /* renamed from: b  reason: collision with root package name */
    public Y0 f12367b;

    /* JADX WARN: Type inference failed for: r0v7, types: [io.flutter.plugins.imagepicker.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [io.flutter.plugins.imagepicker.l, java.lang.Object] */
    public final m a() {
        h hVar;
        boolean z7;
        Object obj;
        int i7;
        ArrayList arrayList;
        int intValue;
        n nVar;
        String str;
        Set<String> stringSet;
        Y0 y02 = this.f12367b;
        if (y02 != null && ((AbstractActivityC0032e) y02.f14760b) != null) {
            hVar = (h) y02.f14761c;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            C0415A c0415a = hVar.f12357d;
            c0415a.getClass();
            HashMap hashMap = new HashMap();
            Activity activity = (Activity) c0415a.f6744a;
            int i8 = 0;
            SharedPreferences sharedPreferences = activity.getSharedPreferences("flutter_image_picker_shared_preference", 0);
            boolean z8 = true;
            if (sharedPreferences.contains("flutter_image_picker_image_path") && (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", null)) != null) {
                hashMap.put("pathList", new ArrayList(stringSet));
                z7 = true;
            } else {
                z7 = false;
            }
            if (sharedPreferences.contains("flutter_image_picker_error_code")) {
                String string = sharedPreferences.getString("flutter_image_picker_error_code", StringUtils.EMPTY);
                if (sharedPreferences.contains("flutter_image_picker_error_message")) {
                    str = sharedPreferences.getString("flutter_image_picker_error_message", StringUtils.EMPTY);
                } else {
                    str = null;
                }
                ?? obj2 = new Object();
                if (string != null) {
                    obj2.f12368a = string;
                    obj2.f12369b = str;
                    hashMap.put("error", obj2);
                } else {
                    throw new IllegalStateException("Nonnull field \"code\" is null.");
                }
            } else {
                z8 = z7;
            }
            if (!z8) {
                obj = "pathList";
            } else {
                if (sharedPreferences.contains("flutter_image_picker_type")) {
                    if (sharedPreferences.getString("flutter_image_picker_type", StringUtils.EMPTY).equals("video")) {
                        nVar = n.VIDEO;
                    } else {
                        nVar = n.IMAGE;
                    }
                    hashMap.put("type", nVar);
                }
                obj = "pathList";
                if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                    hashMap.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
                }
                if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                    hashMap.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
                }
                hashMap.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
            }
            if (hashMap.isEmpty()) {
                return null;
            }
            n nVar2 = (n) hashMap.get("type");
            if (nVar2 == null) {
                nVar2 = null;
            }
            l lVar = (l) hashMap.get("error");
            ArrayList arrayList2 = (ArrayList) hashMap.get(obj);
            if (arrayList2 != null) {
                arrayList = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    Double d7 = (Double) hashMap.get("maxWidth");
                    Double d8 = (Double) hashMap.get("maxHeight");
                    Integer num = (Integer) hashMap.get("imageQuality");
                    if (num == null) {
                        intValue = 100;
                    } else {
                        intValue = num.intValue();
                    }
                    arrayList.add(hVar.f12356c.D(str2, d7, d8, intValue));
                    i8 = 0;
                }
                i7 = i8;
            } else {
                i7 = 0;
                arrayList = null;
            }
            activity.getSharedPreferences("flutter_image_picker_shared_preference", i7).edit().clear().apply();
            ?? obj3 = new Object();
            if (nVar2 != null) {
                obj3.f12370a = nVar2;
                obj3.f12371b = lVar;
                if (arrayList != null) {
                    obj3.f12372c = arrayList;
                    return obj3;
                }
                throw new IllegalStateException("Nonnull field \"paths\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }
        throw new o("no_activity", "image_picker plugin requires a foreground activity.");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [e0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.Y0, java.lang.Object] */
    @Override // I5.a
    public final void onAttachedToActivity(I5.b bVar) {
        H5.a aVar = this.f12366a;
        L5.f fVar = aVar.f2030b;
        C5.d dVar = (C5.d) bVar;
        AbstractActivityC0032e abstractActivityC0032e = dVar.f571a;
        ?? obj = new Object();
        obj.f14759a = (Application) aVar.f2029a;
        obj.f14760b = abstractActivityC0032e;
        obj.f14763e = bVar;
        obj.f = fVar;
        C0415A c0415a = new C0415A(abstractActivityC0032e);
        ?? obj2 = new Object();
        obj2.f10587a = abstractActivityC0032e;
        obj.f14761c = new h(abstractActivityC0032e, obj2, c0415a);
        Y.A(fVar, this);
        obj.f14762d = new j(this, abstractActivityC0032e);
        dVar.a((h) obj.f14761c);
        dVar.b((h) obj.f14761c);
        AbstractC0564p lifecycle = dVar.f572b.getLifecycle();
        obj.f14758X = lifecycle;
        lifecycle.a((j) obj.f14762d);
        this.f12367b = obj;
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        this.f12366a = aVar;
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        Y0 y02 = this.f12367b;
        if (y02 != null) {
            I5.b bVar = (I5.b) y02.f14763e;
            if (bVar != null) {
                ((C5.d) bVar).d((h) y02.f14761c);
                ((C5.d) ((I5.b) y02.f14763e)).f573c.remove((h) y02.f14761c);
                y02.f14763e = null;
            }
            AbstractC0564p abstractC0564p = (AbstractC0564p) y02.f14758X;
            if (abstractC0564p != null) {
                abstractC0564p.b((j) y02.f14762d);
                y02.f14758X = null;
            }
            Y.A((L5.f) y02.f, null);
            Application application = (Application) y02.f14759a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks((j) y02.f14762d);
                y02.f14759a = null;
            }
            y02.f14760b = null;
            y02.f14762d = null;
            y02.f14761c = null;
            this.f12367b = null;
        }
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        this.f12366a = null;
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b bVar) {
        onAttachedToActivity(bVar);
    }
}
