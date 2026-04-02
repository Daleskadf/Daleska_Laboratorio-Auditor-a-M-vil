package z0;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
/* renamed from: z0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2041a implements I {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16728a;

    /* renamed from: b  reason: collision with root package name */
    public int f16729b;

    /* renamed from: c  reason: collision with root package name */
    public int f16730c;

    /* renamed from: d  reason: collision with root package name */
    public int f16731d;

    /* renamed from: e  reason: collision with root package name */
    public int f16732e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16733g;

    /* renamed from: h  reason: collision with root package name */
    public String f16734h;

    /* renamed from: i  reason: collision with root package name */
    public int f16735i;
    public CharSequence j;

    /* renamed from: k  reason: collision with root package name */
    public int f16736k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f16737l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f16738m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f16739n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16740o;

    /* renamed from: p  reason: collision with root package name */
    public final L f16741p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f16742q;

    /* renamed from: r  reason: collision with root package name */
    public int f16743r;

    public C2041a(L l8) {
        l8.H();
        C2063x c2063x = l8.f16677v;
        if (c2063x != null) {
            c2063x.f16857e.getClassLoader();
        }
        this.f16728a = new ArrayList();
        this.f16740o = false;
        this.f16743r = -1;
        this.f16741p = l8;
    }

    @Override // z0.I
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f16733g) {
            this.f16741p.f16661d.add(this);
            return true;
        }
        return true;
    }

    public final void b(U u7) {
        this.f16728a.add(u7);
        u7.f16718d = this.f16729b;
        u7.f16719e = this.f16730c;
        u7.f = this.f16731d;
        u7.f16720g = this.f16732e;
    }

    public final void c(int i7) {
        U u7;
        if (!this.f16733g) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
        }
        ArrayList arrayList = this.f16728a;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((U) arrayList.get(i8)).f16716b;
            if (abstractComponentCallbacksC2061v != null) {
                abstractComponentCallbacksC2061v.f16839m0 += i7;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Bump nesting of " + u7.f16716b + " to " + u7.f16716b.f16839m0);
                }
            }
        }
    }

    public final int d(boolean z7) {
        if (!this.f16742q) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new W());
                f("  ", printWriter, true);
                printWriter.close();
            }
            this.f16742q = true;
            boolean z8 = this.f16733g;
            L l8 = this.f16741p;
            if (z8) {
                this.f16743r = l8.j.getAndIncrement();
            } else {
                this.f16743r = -1;
            }
            l8.y(this, z7);
            return this.f16743r;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void e(int i7, AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v, String str) {
        String str2 = abstractComponentCallbacksC2061v.f16816F0;
        if (str2 != null) {
            A0.d.c(abstractComponentCallbacksC2061v, str2);
        }
        Class<?> cls = abstractComponentCallbacksC2061v.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = abstractComponentCallbacksC2061v.f16845t0;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC2061v + ": was " + abstractComponentCallbacksC2061v.f16845t0 + " now " + str);
                }
                abstractComponentCallbacksC2061v.f16845t0 = str;
            }
            if (i7 != 0) {
                if (i7 != -1) {
                    int i8 = abstractComponentCallbacksC2061v.f16843r0;
                    if (i8 != 0 && i8 != i7) {
                        throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC2061v + ": was " + abstractComponentCallbacksC2061v.f16843r0 + " now " + i7);
                    }
                    abstractComponentCallbacksC2061v.f16843r0 = i7;
                    abstractComponentCallbacksC2061v.f16844s0 = i7;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC2061v + " with tag " + str + " to container view with no id");
                }
            }
            b(new U(1, abstractComponentCallbacksC2061v));
            abstractComponentCallbacksC2061v.f16840n0 = this.f16741p;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void f(String str, PrintWriter printWriter, boolean z7) {
        String str2;
        if (z7) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f16734h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f16743r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f16742q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f16729b != 0 || this.f16730c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16729b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16730c));
            }
            if (this.f16731d != 0 || this.f16732e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16731d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16732e));
            }
            if (this.f16735i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f16735i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.f16736k != 0 || this.f16737l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f16736k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f16737l);
            }
        }
        ArrayList arrayList = this.f16728a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                U u7 = (U) arrayList.get(i7);
                switch (u7.f16715a) {
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
                        str2 = "cmd=" + u7.f16715a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(StringUtils.SPACE);
                printWriter.println(u7.f16716b);
                if (z7) {
                    if (u7.f16718d != 0 || u7.f16719e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(u7.f16718d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(u7.f16719e));
                    }
                    if (u7.f != 0 || u7.f16720g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(u7.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(u7.f16720g));
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) RecognitionOptions.ITF);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f16743r >= 0) {
            sb.append(" #");
            sb.append(this.f16743r);
        }
        if (this.f16734h != null) {
            sb.append(StringUtils.SPACE);
            sb.append(this.f16734h);
        }
        sb.append("}");
        return sb.toString();
    }
}
