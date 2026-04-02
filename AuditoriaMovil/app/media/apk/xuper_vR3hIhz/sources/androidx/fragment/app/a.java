package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import androidx.lifecycle.d;
import java.io.PrintWriter;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a extends y implements o.m {

    /* renamed from: t  reason: collision with root package name */
    public final o f2173t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2174u;

    /* renamed from: v  reason: collision with root package name */
    public int f2175v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(androidx.fragment.app.o r3) {
        /*
            r2 = this;
            androidx.fragment.app.k r0 = r3.q0()
            androidx.fragment.app.l r1 = r3.t0()
            if (r1 == 0) goto L17
            androidx.fragment.app.l r1 = r3.t0()
            android.content.Context r1 = r1.f()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L18
        L17:
            r1 = 0
        L18:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f2175v = r0
            r2.f2173t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.<init>(androidx.fragment.app.o):void");
    }

    public static boolean F(y.a aVar) {
        Fragment fragment = aVar.f2454b;
        if (fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed()) {
            return true;
        }
        return false;
    }

    public void A(boolean z10) {
        for (int size = this.f2436c.size() - 1; size >= 0; size--) {
            y.a aVar = (y.a) this.f2436c.get(size);
            Fragment fragment = aVar.f2454b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(o.i1(this.f2441h));
                fragment.setSharedElementNames(this.f2450q, this.f2449p);
            }
            switch (aVar.f2453a) {
                case 1:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.m1(fragment, true);
                    this.f2173t.d1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2453a);
                case 3:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.q1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.m1(fragment, true);
                    this.f2173t.C0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.m1(fragment, true);
                    this.f2173t.x(fragment);
                    break;
                case 8:
                    this.f2173t.o1(null);
                    break;
                case 9:
                    this.f2173t.o1(fragment);
                    break;
                case 10:
                    this.f2173t.n1(fragment, aVar.f2459g);
                    break;
            }
            if (!this.f2451r && aVar.f2453a != 3 && fragment != null && !o.P) {
                this.f2173t.P0(fragment);
            }
        }
        if (!this.f2451r && z10 && !o.P) {
            o oVar = this.f2173t;
            oVar.Q0(oVar.f2354q, true);
        }
    }

    public Fragment B(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f2436c.size()) {
            y.a aVar = (y.a) this.f2436c.get(i10);
            int i11 = aVar.f2453a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3 && i11 != 6) {
                        if (i11 != 7) {
                            if (i11 == 8) {
                                this.f2436c.add(i10, new y.a(9, fragment2));
                                i10++;
                                fragment2 = aVar.f2454b;
                            }
                        }
                    } else {
                        arrayList.remove(aVar.f2454b);
                        Fragment fragment3 = aVar.f2454b;
                        if (fragment3 == fragment2) {
                            this.f2436c.add(i10, new y.a(9, fragment3));
                            i10++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment4 = aVar.f2454b;
                    int i12 = fragment4.mContainerId;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.mContainerId == i12) {
                            if (fragment5 == fragment4) {
                                z10 = true;
                            } else {
                                if (fragment5 == fragment2) {
                                    this.f2436c.add(i10, new y.a(9, fragment5));
                                    i10++;
                                    fragment2 = null;
                                }
                                y.a aVar2 = new y.a(3, fragment5);
                                aVar2.f2455c = aVar.f2455c;
                                aVar2.f2457e = aVar.f2457e;
                                aVar2.f2456d = aVar.f2456d;
                                aVar2.f2458f = aVar.f2458f;
                                this.f2436c.add(i10, aVar2);
                                arrayList.remove(fragment5);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f2436c.remove(i10);
                        i10--;
                    } else {
                        aVar.f2453a = 1;
                        arrayList.add(fragment4);
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f2454b);
            i10++;
        }
        return fragment2;
    }

    public String C() {
        return this.f2444k;
    }

    public boolean D(int i10) {
        int i11;
        int size = this.f2436c.size();
        for (int i12 = 0; i12 < size; i12++) {
            Fragment fragment = ((y.a) this.f2436c.get(i12)).f2454b;
            if (fragment != null) {
                i11 = fragment.mContainerId;
            } else {
                i11 = 0;
            }
            if (i11 != 0 && i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean E(ArrayList arrayList, int i10, int i11) {
        int i12;
        int i13;
        if (i11 == i10) {
            return false;
        }
        int size = this.f2436c.size();
        int i14 = -1;
        for (int i15 = 0; i15 < size; i15++) {
            Fragment fragment = ((y.a) this.f2436c.get(i15)).f2454b;
            if (fragment != null) {
                i12 = fragment.mContainerId;
            } else {
                i12 = 0;
            }
            if (i12 != 0 && i12 != i14) {
                for (int i16 = i10; i16 < i11; i16++) {
                    a aVar = (a) arrayList.get(i16);
                    int size2 = aVar.f2436c.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        Fragment fragment2 = ((y.a) aVar.f2436c.get(i17)).f2454b;
                        if (fragment2 != null) {
                            i13 = fragment2.mContainerId;
                        } else {
                            i13 = 0;
                        }
                        if (i13 == i12) {
                            return true;
                        }
                    }
                }
                i14 = i12;
            }
        }
        return false;
    }

    public boolean G() {
        for (int i10 = 0; i10 < this.f2436c.size(); i10++) {
            if (F((y.a) this.f2436c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void H() {
        if (this.f2452s != null) {
            for (int i10 = 0; i10 < this.f2452s.size(); i10++) {
                ((Runnable) this.f2452s.get(i10)).run();
            }
            this.f2452s = null;
        }
    }

    public void I(Fragment.l lVar) {
        for (int i10 = 0; i10 < this.f2436c.size(); i10++) {
            y.a aVar = (y.a) this.f2436c.get(i10);
            if (F(aVar)) {
                aVar.f2454b.setOnStartEnterTransitionListener(lVar);
            }
        }
    }

    public Fragment J(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f2436c.size() - 1; size >= 0; size--) {
            y.a aVar = (y.a) this.f2436c.get(size);
            int i10 = aVar.f2453a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2454b;
                            break;
                        case 10:
                            aVar.f2460h = aVar.f2459g;
                            break;
                    }
                }
                arrayList.add(aVar.f2454b);
            }
            arrayList.remove(aVar.f2454b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.o.m
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (o.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f2442i) {
            this.f2173t.e(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.y
    public int h() {
        return w(false);
    }

    @Override // androidx.fragment.app.y
    public int i() {
        return w(true);
    }

    @Override // androidx.fragment.app.y
    public void j() {
        m();
        this.f2173t.b0(this, false);
    }

    @Override // androidx.fragment.app.y
    public void k() {
        m();
        this.f2173t.b0(this, true);
    }

    @Override // androidx.fragment.app.y
    public y l(Fragment fragment) {
        o oVar = fragment.mFragmentManager;
        if (oVar != null && oVar != this.f2173t) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.l(fragment);
    }

    @Override // androidx.fragment.app.y
    public void n(int i10, Fragment fragment, String str, int i11) {
        super.n(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f2173t;
    }

    @Override // androidx.fragment.app.y
    public y o(Fragment fragment) {
        o oVar = fragment.mFragmentManager;
        if (oVar != null && oVar != this.f2173t) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.o(fragment);
    }

    @Override // androidx.fragment.app.y
    public y p(Fragment fragment) {
        o oVar = fragment.mFragmentManager;
        if (oVar != null && oVar != this.f2173t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.p(fragment);
    }

    @Override // androidx.fragment.app.y
    public y s(Fragment fragment, d.c cVar) {
        if (fragment.mFragmentManager == this.f2173t) {
            if (cVar == d.c.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
            } else if (cVar != d.c.DESTROYED) {
                return super.s(fragment, cVar);
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f2173t);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2175v >= 0) {
            sb.append(" #");
            sb.append(this.f2175v);
        }
        if (this.f2444k != null) {
            sb.append(" ");
            sb.append(this.f2444k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.y
    public y u(Fragment fragment) {
        o oVar = fragment.mFragmentManager;
        if (oVar != null && oVar != this.f2173t) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.u(fragment);
    }

    public void v(int i10) {
        if (!this.f2442i) {
            return;
        }
        if (o.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bump nesting in ");
            sb.append(this);
            sb.append(" by ");
            sb.append(i10);
        }
        int size = this.f2436c.size();
        for (int i11 = 0; i11 < size; i11++) {
            y.a aVar = (y.a) this.f2436c.get(i11);
            Fragment fragment = aVar.f2454b;
            if (fragment != null) {
                fragment.mBackStackNesting += i10;
                if (o.F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bump nesting of ");
                    sb2.append(aVar.f2454b);
                    sb2.append(" to ");
                    sb2.append(aVar.f2454b.mBackStackNesting);
                }
            }
        }
    }

    public int w(boolean z10) {
        if (!this.f2174u) {
            if (o.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                PrintWriter printWriter = new PrintWriter(new i0("FragmentManager"));
                x("  ", printWriter);
                printWriter.close();
            }
            this.f2174u = true;
            if (this.f2442i) {
                this.f2175v = this.f2173t.j();
            } else {
                this.f2175v = -1;
            }
            this.f2173t.Y(this, z10);
            return this.f2175v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void x(String str, PrintWriter printWriter) {
        y(str, printWriter, true);
    }

    public void y(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2444k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2175v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2174u);
            if (this.f2441h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2441h));
            }
            if (this.f2437d != 0 || this.f2438e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2437d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2438e));
            }
            if (this.f2439f != 0 || this.f2440g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2439f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2440g));
            }
            if (this.f2445l != 0 || this.f2446m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2445l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2446m);
            }
            if (this.f2447n != 0 || this.f2448o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2447n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2448o);
            }
        }
        if (!this.f2436c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2436c.size();
            for (int i10 = 0; i10 < size; i10++) {
                y.a aVar = (y.a) this.f2436c.get(i10);
                switch (aVar.f2453a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f2453a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2454b);
                if (z10) {
                    if (aVar.f2455c != 0 || aVar.f2456d != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2455c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2456d));
                    }
                    if (aVar.f2457e != 0 || aVar.f2458f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2457e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2458f));
                    }
                }
            }
        }
    }

    public void z() {
        int size = this.f2436c.size();
        for (int i10 = 0; i10 < size; i10++) {
            y.a aVar = (y.a) this.f2436c.get(i10);
            Fragment fragment = aVar.f2454b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f2441h);
                fragment.setSharedElementNames(this.f2449p, this.f2450q);
            }
            switch (aVar.f2453a) {
                case 1:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.m1(fragment, false);
                    this.f2173t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2453a);
                case 3:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.d1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.C0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.m1(fragment, false);
                    this.f2173t.q1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.x(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f2455c, aVar.f2456d, aVar.f2457e, aVar.f2458f);
                    this.f2173t.m1(fragment, false);
                    this.f2173t.l(fragment);
                    break;
                case 8:
                    this.f2173t.o1(fragment);
                    break;
                case 9:
                    this.f2173t.o1(null);
                    break;
                case 10:
                    this.f2173t.n1(fragment, aVar.f2460h);
                    break;
            }
            if (!this.f2451r && aVar.f2453a != 1 && fragment != null && !o.P) {
                this.f2173t.P0(fragment);
            }
        }
        if (!this.f2451r && !o.P) {
            o oVar = this.f2173t;
            oVar.Q0(oVar.f2354q, true);
        }
    }
}
