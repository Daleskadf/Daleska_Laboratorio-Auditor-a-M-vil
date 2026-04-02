package io.flutter.plugin.editing;

import A.m;
import B5.S;
import K5.w;
import K5.z;
import L5.r;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import g1.C1006c;
import io.flutter.plugin.platform.o;
/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    public final View f11662a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f11663b;

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f11664c;

    /* renamed from: d  reason: collision with root package name */
    public final A.f f11665d;

    /* renamed from: e  reason: collision with root package name */
    public S f11666e = new S(j.NO_TARGET, 0, 10);
    public w f;

    /* renamed from: g  reason: collision with root package name */
    public SparseArray f11667g;

    /* renamed from: h  reason: collision with root package name */
    public f f11668h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11669i;
    public InputConnection j;

    /* renamed from: k  reason: collision with root package name */
    public final o f11670k;

    /* renamed from: l  reason: collision with root package name */
    public Rect f11671l;

    /* renamed from: m  reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f11672m;

    /* renamed from: n  reason: collision with root package name */
    public z f11673n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11674o;

    public k(View view, A.f fVar, m mVar, o oVar) {
        this.f11662a = view;
        this.f11668h = new f(null, view);
        this.f11663b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            this.f11664c = com.dexterous.flutterlocalnotifications.b.e(view.getContext().getSystemService(com.dexterous.flutterlocalnotifications.b.B()));
        } else {
            this.f11664c = null;
        }
        if (i7 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f11672m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f11665d = fVar;
        fVar.f11c = new C1006c(this);
        ((r) fVar.f10b).a("TextInputClient.requestExistingInputState", null, null);
        this.f11670k = oVar;
        oVar.f = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r10 == r0.f2762e) goto L42;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r17) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.k.a(boolean):void");
    }

    public final void b(int i7) {
        S s7 = this.f11666e;
        j jVar = (j) s7.f336c;
        if ((jVar == j.VIRTUAL_DISPLAY_PLATFORM_VIEW || jVar == j.PHYSICAL_DISPLAY_PLATFORM_VIEW) && s7.f335b == i7) {
            this.f11666e = new S(j.NO_TARGET, 0, 10);
            d();
            View view = this.f11662a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f11663b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f11669i = false;
        }
    }

    public final void c() {
        this.f11670k.f = null;
        this.f11665d.f11c = null;
        d();
        this.f11668h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f11672m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        w wVar;
        E.e eVar;
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f11664c) != null && (wVar = this.f) != null && (eVar = wVar.j) != null && this.f11667g != null) {
            autofillManager.notifyViewExited(this.f11662a, ((String) eVar.f920b).hashCode());
        }
    }

    public final void e(w wVar) {
        E.e eVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (wVar != null && (eVar = wVar.j) != null) {
            SparseArray sparseArray = new SparseArray();
            this.f11667g = sparseArray;
            w[] wVarArr = wVar.f2754l;
            if (wVarArr == null) {
                sparseArray.put(((String) eVar.f920b).hashCode(), wVar);
                return;
            }
            for (w wVar2 : wVarArr) {
                E.e eVar2 = wVar2.j;
                if (eVar2 != null) {
                    SparseArray sparseArray2 = this.f11667g;
                    String str = (String) eVar2.f920b;
                    sparseArray2.put(str.hashCode(), wVar2);
                    AutofillManager autofillManager = this.f11664c;
                    int hashCode = str.hashCode();
                    forText = AutofillValue.forText(((z) eVar2.f922d).f2758a);
                    autofillManager.notifyValueChanged(this.f11662a, hashCode, forText);
                }
            }
            return;
        }
        this.f11667g = null;
    }
}
