package com.google.android.gms.common.api;

import D.AbstractC0059i;
import a.AbstractC0412a;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC0731e;
import com.google.android.gms.common.api.internal.AbstractC0745t;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.internal.AbstractServiceConnectionC0743q;
import com.google.android.gms.common.api.internal.C0728b;
import com.google.android.gms.common.api.internal.C0735i;
import com.google.android.gms.common.api.internal.C0740n;
import com.google.android.gms.common.api.internal.C0742p;
import com.google.android.gms.common.api.internal.C0746u;
import com.google.android.gms.common.api.internal.E;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.common.api.internal.InterfaceC0739m;
import com.google.android.gms.common.api.internal.InterfaceC0749x;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.N;
import com.google.android.gms.common.api.internal.P;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.common.api.internal.Y;
import com.google.android.gms.common.api.internal.Z;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.internal.AbstractC0757f;
import com.google.android.gms.common.internal.C0759h;
import com.google.android.gms.common.internal.C0760i;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class l {
    protected final C0735i zaa;
    private final Context zab;
    private final String zac;
    private final i zad;
    private final e zae;
    private final C0728b zaf;
    private final Looper zag;
    private final int zah;
    private final o zai;
    private final InterfaceC0749x zaj;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(android.app.Activity r9, com.google.android.gms.common.api.i r10, com.google.android.gms.common.api.e r11, com.google.android.gms.common.api.internal.C0727a r12) {
        /*
            r8 = this;
            android.os.Looper r0 = r9.getMainLooper()
            java.lang.String r1 = "Looper must not be null."
            com.google.android.gms.common.internal.I.j(r0, r1)
            com.google.android.gms.common.api.k r7 = new com.google.android.gms.common.api.k
            r7.<init>(r12, r0)
            r2 = r8
            r3 = r9
            r4 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.l.<init>(android.app.Activity, com.google.android.gms.common.api.i, com.google.android.gms.common.api.e, com.google.android.gms.common.api.internal.a):void");
    }

    public final void a(int i7, AbstractC0731e abstractC0731e) {
        abstractC0731e.zak();
        C0735i c0735i = this.zaa;
        c0735i.getClass();
        N n7 = new N(new Y(i7, abstractC0731e), c0735i.f9254Z.get(), this);
        zau zauVar = c0735i.f9264i0;
        zauVar.sendMessage(zauVar.obtainMessage(4, n7));
    }

    public o asGoogleApiClient() {
        return this.zai;
    }

    public final Task b(int i7, AbstractC0751z abstractC0751z) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        InterfaceC0749x interfaceC0749x = this.zaj;
        C0735i c0735i = this.zaa;
        c0735i.getClass();
        c0735i.g(taskCompletionSource, abstractC0751z.f9282c, this);
        N n7 = new N(new a0(i7, abstractC0751z, taskCompletionSource, interfaceC0749x), c0735i.f9254Z.get(), this);
        zau zauVar = c0735i.f9264i0;
        zauVar.sendMessage(zauVar.obtainMessage(4, n7));
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.internal.h, java.lang.Object] */
    public C0759h createClientSettingsBuilder() {
        ?? obj = new Object();
        Set emptySet = Collections.emptySet();
        if (obj.f9351a == null) {
            obj.f9351a = new S.g(0);
        }
        obj.f9351a.addAll(emptySet);
        obj.f9353c = this.zab.getClass().getName();
        obj.f9352b = this.zab.getPackageName();
        return obj;
    }

    public Task<Boolean> disconnectService() {
        C0735i c0735i = this.zaa;
        c0735i.getClass();
        F f = new F(getApiKey());
        zau zauVar = c0735i.f9264i0;
        zauVar.sendMessage(zauVar.obtainMessage(14, f));
        return f.f9174b.getTask();
    }

    public <A extends b, T extends AbstractC0731e> T doBestEffortWrite(T t7) {
        a(2, t7);
        return t7;
    }

    public <A extends b, T extends AbstractC0731e> T doRead(T t7) {
        a(0, t7);
        return t7;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends b, T extends AbstractC0745t, U extends com.google.android.gms.common.api.internal.A> Task<Void> doRegisterEventListener(T t7, U u7) {
        I.i(t7);
        I.i(u7);
        I.j(t7.f9273a.f9271c, "Listener has already been released.");
        I.j(u7.f9161a, "Listener has already been released.");
        I.a("Listener registration and unregistration methods must be constructed with the same ListenerHolder.", I.m(t7.f9273a.f9271c, u7.f9161a));
        return this.zaa.i(this, t7, u7, y.f9288a);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C0740n c0740n) {
        return doUnregisterEventListener(c0740n, 0);
    }

    public <A extends b, T extends AbstractC0731e> T doWrite(T t7) {
        a(1, t7);
        return t7;
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final C0728b getApiKey() {
        return this.zaf;
    }

    public e getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> C0742p registerListener(L l8, String str) {
        return AbstractC0412a.h(this.zag, l8, str);
    }

    public final int zaa() {
        return this.zah;
    }

    public final g zab(Looper looper, G g3) {
        C0759h createClientSettingsBuilder = createClientSettingsBuilder();
        C0760i c0760i = new C0760i(createClientSettingsBuilder.f9351a, createClientSettingsBuilder.f9352b, createClientSettingsBuilder.f9353c);
        AbstractC0726a abstractC0726a = this.zad.f9158a;
        I.i(abstractC0726a);
        g buildClient = abstractC0726a.buildClient(this.zab, looper, c0760i, (Object) this.zae, (m) g3, (n) g3);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof AbstractC0757f)) {
            ((AbstractC0757f) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof AbstractServiceConnectionC0743q)) {
            AbstractC0059i.I(buildClient);
            throw null;
        }
        return buildClient;
    }

    public final T zac(Context context, Handler handler) {
        C0759h createClientSettingsBuilder = createClientSettingsBuilder();
        return new T(context, handler, new C0760i(createClientSettingsBuilder.f9351a, createClientSettingsBuilder.f9352b, createClientSettingsBuilder.f9353c));
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doBestEffortWrite(AbstractC0751z abstractC0751z) {
        return b(2, abstractC0751z);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doRead(AbstractC0751z abstractC0751z) {
        return b(0, abstractC0751z);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C0740n c0740n, int i7) {
        I.j(c0740n, "Listener key cannot be null.");
        C0735i c0735i = this.zaa;
        c0735i.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c0735i.g(taskCompletionSource, i7, this);
        N n7 = new N(new Z(c0740n, taskCompletionSource), c0735i.f9254Z.get(), this);
        zau zauVar = c0735i.f9264i0;
        zauVar.sendMessage(zauVar.obtainMessage(13, n7));
        return taskCompletionSource.getTask();
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doWrite(AbstractC0751z abstractC0751z) {
        return b(1, abstractC0751z);
    }

    public l(Context context, Activity activity, i iVar, e eVar, k kVar) {
        String apiFallbackAttributionTag;
        I.j(context, "Null context is not permitted.");
        I.j(iVar, "Api must not be null.");
        I.j(kVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        I.j(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            apiFallbackAttributionTag = context.getAttributionTag();
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = iVar;
        this.zae = eVar;
        this.zag = kVar.f9285b;
        C0728b c0728b = new C0728b(iVar, eVar, apiFallbackAttributionTag);
        this.zaf = c0728b;
        this.zai = new com.google.android.gms.common.api.internal.I(this);
        C0735i h8 = C0735i.h(applicationContext);
        this.zaa = h8;
        this.zah = h8.f9253Y.getAndIncrement();
        this.zaj = kVar.f9284a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC0739m fragment = LifecycleCallback.getFragment(activity);
            E e7 = (E) fragment.d(E.class, "ConnectionlessLifecycleHelper");
            if (e7 == null) {
                Object obj = W2.e.f6169c;
                e7 = new E(fragment, h8);
            }
            e7.f9172e.add(c0728b);
            h8.b(e7);
        }
        zau zauVar = h8.f9264i0;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    @ResultIgnorabilityUnspecified
    public <A extends b> Task<Void> doRegisterEventListener(C0746u c0746u) {
        I.i(c0746u);
        I.j(c0746u.f9276a.f9273a.f9271c, "Listener has already been released.");
        I.j(c0746u.f9277b.f9161a, "Listener has already been released.");
        return this.zaa.i(this, c0746u.f9276a, c0746u.f9277b, P.f9204a);
    }
}
