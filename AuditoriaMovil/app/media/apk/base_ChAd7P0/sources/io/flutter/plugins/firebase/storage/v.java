package io.flutter.plugins.firebase.storage;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class v implements L5.i {

    /* renamed from: a  reason: collision with root package name */
    public final e f12026a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.firebase.storage.f f12027b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.firebase.storage.v f12028c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12029d;

    public v(e eVar, com.google.firebase.storage.f fVar, com.google.firebase.storage.v vVar, String str) {
        this.f12026a = eVar;
        this.f12027b = fVar;
        this.f12028c = vVar;
        this.f12029d = str;
    }

    @Override // L5.i
    public final void a(Object obj, final L5.h hVar) {
        q qVar = new q(this, hVar);
        com.google.firebase.storage.v vVar = this.f12028c;
        vVar.getClass();
        vVar.f.d(null, null, qVar);
        vVar.f9958g.d(null, null, new r(this, hVar));
        vVar.f9954b.d(null, null, new OnSuccessListener() { // from class: io.flutter.plugins.firebase.storage.s
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj2) {
                com.google.firebase.storage.u uVar = (com.google.firebase.storage.u) obj2;
                v vVar2 = v.this;
                e eVar = vVar2.f12026a;
                if (!eVar.f11991k.booleanValue()) {
                    HashMap c8 = vVar2.c(uVar, null);
                    c8.put("taskState", Integer.valueOf(p.SUCCESS.index));
                    hVar.c(c8);
                    eVar.b();
                }
            }
        });
        vVar.f9957e.d(null, null, new OnCanceledListener() { // from class: io.flutter.plugins.firebase.storage.t
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                v vVar2 = v.this;
                L5.h hVar2 = hVar;
                if (!vVar2.f12026a.f11991k.booleanValue()) {
                    HashMap c8 = vVar2.c(null, null);
                    c8.put("taskState", Integer.valueOf(p.ERROR.index));
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", "canceled");
                    hashMap.put("message", "User cancelled the operation.");
                    c8.put("error", hashMap);
                    hVar2.c(c8);
                    e eVar = vVar2.f12026a;
                    synchronized (eVar.f11990i) {
                        eVar.f11990i.notifyAll();
                    }
                    vVar2.f12026a.b();
                }
            }
        });
        vVar.f9955c.d(null, null, new OnFailureListener() { // from class: io.flutter.plugins.firebase.storage.u
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                v vVar2 = v.this;
                e eVar = vVar2.f12026a;
                if (!eVar.f11991k.booleanValue()) {
                    HashMap c8 = vVar2.c(null, exc);
                    c8.put("taskState", Integer.valueOf(p.ERROR.index));
                    hVar.c(c8);
                    eVar.b();
                }
            }
        });
    }

    @Override // L5.i
    public final void b() {
        com.google.firebase.storage.v vVar = this.f12028c;
        if (!vVar.isCanceled()) {
            vVar.p(new int[]{RecognitionOptions.QR_CODE, 32}, true);
        }
        e eVar = this.f12026a;
        if (!eVar.f11991k.booleanValue()) {
            eVar.b();
        }
        HashMap hashMap = c.f11978c;
        String str = this.f12029d;
        L5.j jVar = (L5.j) hashMap.get(str);
        if (jVar != null) {
            jVar.a(null);
            hashMap.remove(str);
        }
        HashMap hashMap2 = c.f11979d;
        if (hashMap2.get(str) != null) {
            hashMap2.remove(str);
        }
    }

    public final HashMap c(Object obj, Exception exc) {
        HashMap hashMap = new HashMap();
        U3.h hVar = this.f12027b.f9900a;
        hVar.a();
        hashMap.put("appName", hVar.f5750b);
        if (obj != null) {
            hashMap.put("snapshot", e.d(obj));
        }
        if (exc != null) {
            HashMap hashMap2 = c.f11978c;
            HashMap hashMap3 = new HashMap();
            i D4 = G.i.D(exc);
            hashMap3.put("code", D4.f11998a);
            hashMap3.put("message", D4.getMessage());
            hashMap.put("error", hashMap3);
        }
        return hashMap;
    }
}
