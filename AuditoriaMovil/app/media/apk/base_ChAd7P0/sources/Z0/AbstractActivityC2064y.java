package z0;

import W.InterfaceC0358a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0570w;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.EnumC0563o;
import c6.C0644E;
import e.C0925f;
import e0.C0927b;
import g0.InterfaceC1003a;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: z0.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2064y extends e.n implements InterfaceC0358a {

    /* renamed from: p0  reason: collision with root package name */
    public boolean f16860p0;
    public boolean q0;

    /* renamed from: n0  reason: collision with root package name */
    public final C0927b f16858n0 = new C0927b(new C2063x(this));

    /* renamed from: o0  reason: collision with root package name */
    public final C0570w f16859o0 = new C0570w(this);

    /* renamed from: r0  reason: collision with root package name */
    public boolean f16861r0 = true;

    public AbstractActivityC2064y() {
        ((K5.s) this.f10553d.f690c).d("android:support:lifecycle", new C0925f(this, 1));
        d(new InterfaceC1003a(this) { // from class: z0.w

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC2064y f16853b;

            {
                this.f16853b = this;
            }

            @Override // g0.InterfaceC1003a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        this.f16853b.f16858n0.B();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        this.f16853b.f16858n0.B();
                        return;
                }
            }
        });
        this.f10556f0.add(new InterfaceC1003a(this) { // from class: z0.w

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC2064y f16853b;

            {
                this.f16853b = this;
            }

            @Override // g0.InterfaceC1003a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        this.f16853b.f16858n0.B();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        this.f16853b.f16858n0.B();
                        return;
                }
            }
        });
        e.g gVar = new e.g(this, 1);
        C0644E c0644e = this.f10551b;
        c0644e.getClass();
        e.n nVar = (e.n) c0644e.f8441a;
        if (nVar != null) {
            gVar.a(nVar);
        }
        ((CopyOnWriteArraySet) c0644e.f8442b).add(gVar);
    }

    public static boolean k(L l8, EnumC0563o enumC0563o) {
        AbstractActivityC2064y abstractActivityC2064y;
        boolean z7 = false;
        for (AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v : l8.f16660c.K()) {
            if (abstractComponentCallbacksC2061v != null) {
                C2063x c2063x = abstractComponentCallbacksC2061v.f16841o0;
                if (c2063x == null) {
                    abstractActivityC2064y = null;
                } else {
                    abstractActivityC2064y = c2063x.f16855Y;
                }
                if (abstractActivityC2064y != null) {
                    z7 |= k(abstractComponentCallbacksC2061v.l(), enumC0563o);
                }
                if (abstractComponentCallbacksC2061v.f16818H0.f7946c.a(EnumC0563o.STARTED)) {
                    abstractComponentCallbacksC2061v.f16818H0.g(enumC0563o);
                    z7 = true;
                }
            }
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r0.equals("--list-dumpables") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        if (r0.equals("--dump-dumpable") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
        /*
            r3 = this;
            super.dump(r4, r5, r6, r7)
            if (r7 == 0) goto L5d
            int r0 = r7.length
            if (r0 != 0) goto L9
            goto L5d
        L9:
            r0 = 0
            r0 = r7[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L4d;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L24;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L5d
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L5d
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L5d
            goto L5c
        L24:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L5d
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L5d
            goto L5c
        L34:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L3d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L46:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L5d
            goto L5c
        L4d:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L5d
        L56:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L5d
        L5c:
            return
        L5d:
            r6.print(r4)
            java.lang.String r0 = "Local FragmentActivity "
            r6.print(r0)
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r6.print(r0)
            java.lang.String r0 = " State:"
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.print(r0)
            java.lang.String r1 = "mCreated="
            r6.print(r1)
            boolean r1 = r3.f16860p0
            r6.print(r1)
            java.lang.String r1 = " mResumed="
            r6.print(r1)
            boolean r1 = r3.q0
            r6.print(r1)
            java.lang.String r1 = " mStopped="
            r6.print(r1)
            boolean r1 = r3.f16861r0
            r6.print(r1)
            android.app.Application r1 = r3.getApplication()
            if (r1 == 0) goto Lb9
            A.f r1 = new A.f
            androidx.lifecycle.X r2 = r3.g()
            r1.<init>(r3, r2)
            r1.i(r0, r6)
        Lb9:
            e0.b r0 = r3.f16858n0
            java.lang.Object r0 = r0.f10587a
            z0.x r0 = (z0.C2063x) r0
            z0.L r0 = r0.f16854X
            r0.w(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.AbstractActivityC2064y.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final L j() {
        return ((C2063x) this.f16858n0.f10587a).f16854X;
    }

    @Override // e.n, android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        this.f16858n0.B();
        super.onActivityResult(i7, i8, intent);
    }

    @Override // e.n, W.AbstractActivityC0362e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16859o0.e(EnumC0562n.ON_CREATE);
        L l8 = ((C2063x) this.f16858n0.f10587a).f16854X;
        l8.f16649G = false;
        l8.f16650H = false;
        l8.f16656N.f16694g = false;
        l8.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C2040A c2040a = (C2040A) ((C2063x) this.f16858n0.f10587a).f16854X.f.onCreateView(view, str, context, attributeSet);
        return c2040a == null ? super.onCreateView(view, str, context, attributeSet) : c2040a;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C2063x) this.f16858n0.f10587a).f16854X.l();
        this.f16859o0.e(EnumC0562n.ON_DESTROY);
    }

    @Override // e.n, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return ((C2063x) this.f16858n0.f10587a).f16854X.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.q0 = false;
        ((C2063x) this.f16858n0.f10587a).f16854X.u(5);
        this.f16859o0.e(EnumC0562n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.f16859o0.e(EnumC0562n.ON_RESUME);
        L l8 = ((C2063x) this.f16858n0.f10587a).f16854X;
        l8.f16649G = false;
        l8.f16650H = false;
        l8.f16656N.f16694g = false;
        l8.u(7);
    }

    @Override // e.n, android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.f16858n0.B();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0927b c0927b = this.f16858n0;
        c0927b.B();
        super.onResume();
        this.q0 = true;
        ((C2063x) c0927b.f10587a).f16854X.A(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        C0927b c0927b = this.f16858n0;
        c0927b.B();
        super.onStart();
        this.f16861r0 = false;
        boolean z7 = this.f16860p0;
        C2063x c2063x = (C2063x) c0927b.f10587a;
        if (!z7) {
            this.f16860p0 = true;
            L l8 = c2063x.f16854X;
            l8.f16649G = false;
            l8.f16650H = false;
            l8.f16656N.f16694g = false;
            l8.u(4);
        }
        c2063x.f16854X.A(true);
        this.f16859o0.e(EnumC0562n.ON_START);
        L l9 = c2063x.f16854X;
        l9.f16649G = false;
        l9.f16650H = false;
        l9.f16656N.f16694g = false;
        l9.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f16858n0.B();
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f16861r0 = true;
        do {
        } while (k(j(), EnumC0563o.CREATED));
        L l8 = ((C2063x) this.f16858n0.f10587a).f16854X;
        l8.f16650H = true;
        l8.f16656N.f16694g = true;
        l8.u(4);
        this.f16859o0.e(EnumC0562n.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        C2040A c2040a = (C2040A) ((C2063x) this.f16858n0.f10587a).f16854X.f.onCreateView(null, str, context, attributeSet);
        return c2040a == null ? super.onCreateView(str, context, attributeSet) : c2040a;
    }
}
