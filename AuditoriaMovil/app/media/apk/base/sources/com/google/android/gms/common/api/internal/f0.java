package com.google.android.gms.common.api.internal;

import D.AbstractC0059i;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class f0 extends Fragment implements InterfaceC0739m {

    /* renamed from: d  reason: collision with root package name */
    public static final WeakHashMap f9240d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map f9241a = DesugarCollections.synchronizedMap(new S.k(0));

    /* renamed from: b  reason: collision with root package name */
    public int f9242b = 0;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f9243c;

    @Override // com.google.android.gms.common.api.internal.InterfaceC0739m
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f9241a;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.f9242b > 0) {
                new zzi(Looper.getMainLooper()).post(new H2.a(this, lifecycleCallback, str, 6));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(AbstractC0059i.M("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0739m
    public final LifecycleCallback d(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f9241a.get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f9241a.values()) {
            lifecycleCallback.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0739m
    public final Activity f() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        for (LifecycleCallback lifecycleCallback : this.f9241a.values()) {
            lifecycleCallback.onActivityResult(i7, i8, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f9242b = 1;
        this.f9243c = bundle;
        for (Map.Entry entry : this.f9241a.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f9242b = 5;
        for (LifecycleCallback lifecycleCallback : this.f9241a.values()) {
            lifecycleCallback.onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f9242b = 3;
        for (LifecycleCallback lifecycleCallback : this.f9241a.values()) {
            lifecycleCallback.onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f9241a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f9242b = 2;
        for (LifecycleCallback lifecycleCallback : this.f9241a.values()) {
            lifecycleCallback.onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f9242b = 4;
        for (LifecycleCallback lifecycleCallback : this.f9241a.values()) {
            lifecycleCallback.onStop();
        }
    }
}
