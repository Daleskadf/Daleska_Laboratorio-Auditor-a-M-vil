package z0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.appecoactivate.R;
import k0.RunnableC1375b;
/* loaded from: classes.dex */
public class r extends AbstractComponentCallbacksC2061v implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: N0  reason: collision with root package name */
    public final DialogInterface$OnCancelListenerC2054n f16786N0;

    /* renamed from: O0  reason: collision with root package name */
    public final DialogInterface$OnDismissListenerC2055o f16787O0;

    /* renamed from: P0  reason: collision with root package name */
    public int f16788P0;

    /* renamed from: Q0  reason: collision with root package name */
    public int f16789Q0;

    /* renamed from: R0  reason: collision with root package name */
    public boolean f16790R0;

    /* renamed from: S0  reason: collision with root package name */
    public boolean f16791S0;

    /* renamed from: T0  reason: collision with root package name */
    public int f16792T0;

    /* renamed from: U0  reason: collision with root package name */
    public boolean f16793U0;

    /* renamed from: V0  reason: collision with root package name */
    public final C2056p f16794V0;

    /* renamed from: W0  reason: collision with root package name */
    public Dialog f16795W0;

    /* renamed from: X0  reason: collision with root package name */
    public boolean f16796X0;

    /* renamed from: Y0  reason: collision with root package name */
    public boolean f16797Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f16798Z0;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f16799a1;

    public r() {
        new RunnableC1375b(this, 4);
        this.f16786N0 = new DialogInterface$OnCancelListenerC2054n(this);
        this.f16787O0 = new DialogInterface$OnDismissListenerC2055o(this);
        this.f16788P0 = 0;
        this.f16789Q0 = 0;
        this.f16790R0 = true;
        this.f16791S0 = true;
        this.f16792T0 = -1;
        this.f16794V0 = new C2056p(this);
        this.f16799a1 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:12:0x001a, B:14:0x0027, B:24:0x003f, B:28:0x0046, B:30:0x004a, B:33:0x0052, B:27:0x0044, B:20:0x0031, B:22:0x0037, B:23:0x003c, B:34:0x006a), top: B:52:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:12:0x001a, B:14:0x0027, B:24:0x003f, B:28:0x0046, B:30:0x004a, B:33:0x0052, B:27:0x0044, B:20:0x0031, B:22:0x0037, B:23:0x003c, B:34:0x006a), top: B:52:0x001a }] */
    @Override // z0.AbstractComponentCallbacksC2061v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater A(android.os.Bundle r9) {
        /*
            r8 = this;
            android.view.LayoutInflater r9 = super.A(r9)
            boolean r0 = r8.f16791S0
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            if (r0 == 0) goto L9b
            boolean r3 = r8.f16793U0
            if (r3 == 0) goto L11
            goto L9b
        L11:
            if (r0 != 0) goto L14
            goto L72
        L14:
            boolean r0 = r8.f16799a1
            if (r0 != 0) goto L72
            r0 = 0
            r3 = 1
            r8.f16793U0 = r3     // Catch: java.lang.Throwable -> L50
            android.app.Dialog r4 = r8.I()     // Catch: java.lang.Throwable -> L50
            r8.f16795W0 = r4     // Catch: java.lang.Throwable -> L50
            boolean r5 = r8.f16791S0     // Catch: java.lang.Throwable -> L50
            r6 = 0
            if (r5 == 0) goto L6a
            int r5 = r8.f16788P0     // Catch: java.lang.Throwable -> L50
            if (r5 == r3) goto L3c
            if (r5 == r1) goto L3c
            r7 = 3
            if (r5 == r7) goto L31
            goto L3f
        L31:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L3c
            r7 = 24
            r5.addFlags(r7)     // Catch: java.lang.Throwable -> L50
        L3c:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L50
        L3f:
            z0.x r4 = r8.f16841o0     // Catch: java.lang.Throwable -> L50
            if (r4 != 0) goto L44
            goto L46
        L44:
            z0.y r6 = r4.f16857e     // Catch: java.lang.Throwable -> L50
        L46:
            boolean r4 = r6 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L52
            android.app.Dialog r4 = r8.f16795W0     // Catch: java.lang.Throwable -> L50
            r4.setOwnerActivity(r6)     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r9 = move-exception
            goto L6f
        L52:
            android.app.Dialog r4 = r8.f16795W0     // Catch: java.lang.Throwable -> L50
            boolean r5 = r8.f16790R0     // Catch: java.lang.Throwable -> L50
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L50
            android.app.Dialog r4 = r8.f16795W0     // Catch: java.lang.Throwable -> L50
            z0.n r5 = r8.f16786N0     // Catch: java.lang.Throwable -> L50
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L50
            android.app.Dialog r4 = r8.f16795W0     // Catch: java.lang.Throwable -> L50
            z0.o r5 = r8.f16787O0     // Catch: java.lang.Throwable -> L50
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L50
            r8.f16799a1 = r3     // Catch: java.lang.Throwable -> L50
            goto L6c
        L6a:
            r8.f16795W0 = r6     // Catch: java.lang.Throwable -> L50
        L6c:
            r8.f16793U0 = r0
            goto L72
        L6f:
            r8.f16793U0 = r0
            throw r9
        L72:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = " from dialog context"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L8e:
            android.app.Dialog r0 = r8.f16795W0
            if (r0 == 0) goto L9a
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r9 = r9.cloneInContext(r0)
        L9a:
            return r9
        L9b:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto Ld6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r1 = r8.f16791S0
            if (r1 != 0) goto Lc5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
            goto Ld6
        Lc5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
        Ld6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.r.A(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void C(Bundle bundle) {
        Dialog dialog = this.f16795W0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i7 = this.f16788P0;
        if (i7 != 0) {
            bundle.putInt("android:style", i7);
        }
        int i8 = this.f16789Q0;
        if (i8 != 0) {
            bundle.putInt("android:theme", i8);
        }
        boolean z7 = this.f16790R0;
        if (!z7) {
            bundle.putBoolean("android:cancelable", z7);
        }
        boolean z8 = this.f16791S0;
        if (!z8) {
            bundle.putBoolean("android:showsDialog", z8);
        }
        int i9 = this.f16792T0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void D() {
        this.f16850y0 = true;
        Dialog dialog = this.f16795W0;
        if (dialog != null) {
            this.f16796X0 = false;
            dialog.show();
            View decorView = this.f16795W0.getWindow().getDecorView();
            kotlin.jvm.internal.j.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void E() {
        this.f16850y0 = true;
        Dialog dialog = this.f16795W0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.F(layoutInflater, viewGroup, bundle);
        if (this.f16795W0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f16795W0.onRestoreInstanceState(bundle2);
        }
    }

    public Dialog I() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new e.o(G(), this.f16789Q0);
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final org.slf4j.helpers.i i() {
        return new C2057q(this, new C2059t(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.f16796X0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            if (!this.f16797Y0) {
                this.f16797Y0 = true;
                this.f16798Z0 = false;
                Dialog dialog = this.f16795W0;
                if (dialog != null) {
                    dialog.setOnDismissListener(null);
                    this.f16795W0.dismiss();
                }
                this.f16796X0 = true;
                if (this.f16792T0 >= 0) {
                    L n7 = n();
                    int i7 = this.f16792T0;
                    if (i7 >= 0) {
                        n7.y(new J(n7, i7), true);
                        this.f16792T0 = -1;
                        return;
                    }
                    throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Bad id: "));
                }
                C2041a c2041a = new C2041a(n());
                c2041a.f16740o = true;
                L l8 = this.f16840n0;
                if (l8 != null && l8 != c2041a.f16741p) {
                    throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
                }
                c2041a.b(new U(3, this));
                c2041a.d(true);
            }
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void t() {
        this.f16850y0 = true;
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void v(AbstractActivityC2064y abstractActivityC2064y) {
        super.v(abstractActivityC2064y);
        this.f16819I0.f(this.f16794V0);
        if (!this.f16798Z0) {
            this.f16797Y0 = false;
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void w(Bundle bundle) {
        boolean z7;
        super.w(bundle);
        new Handler();
        if (this.f16844s0 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f16791S0 = z7;
        if (bundle != null) {
            this.f16788P0 = bundle.getInt("android:style", 0);
            this.f16789Q0 = bundle.getInt("android:theme", 0);
            this.f16790R0 = bundle.getBoolean("android:cancelable", true);
            this.f16791S0 = bundle.getBoolean("android:showsDialog", this.f16791S0);
            this.f16792T0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void y() {
        this.f16850y0 = true;
        Dialog dialog = this.f16795W0;
        if (dialog != null) {
            this.f16796X0 = true;
            dialog.setOnDismissListener(null);
            this.f16795W0.dismiss();
            if (!this.f16797Y0) {
                onDismiss(this.f16795W0);
            }
            this.f16795W0 = null;
            this.f16799a1 = false;
        }
    }

    @Override // z0.AbstractComponentCallbacksC2061v
    public final void z() {
        this.f16850y0 = true;
        if (!this.f16798Z0 && !this.f16797Y0) {
            this.f16797Y0 = true;
        }
        this.f16819I0.j(this.f16794V0);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
