package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: c  reason: collision with root package name */
    public static final w f9961c = new w();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f9962a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Object f9963b = new Object();

    public final void a(v vVar) {
        synchronized (this.f9963b) {
            this.f9962a.put(vVar.d().toString(), new WeakReference(vVar));
        }
    }

    public final void b(v vVar) {
        v vVar2;
        synchronized (this.f9963b) {
            try {
                String mVar = vVar.d().toString();
                WeakReference weakReference = (WeakReference) this.f9962a.get(mVar);
                if (weakReference != null) {
                    vVar2 = (v) weakReference.get();
                } else {
                    vVar2 = null;
                }
                if (vVar2 == null || vVar2 == vVar) {
                    this.f9962a.remove(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
