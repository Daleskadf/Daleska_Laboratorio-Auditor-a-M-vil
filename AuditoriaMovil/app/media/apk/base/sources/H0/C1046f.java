package h0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* renamed from: h0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046f {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f11188a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f11189b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f11190c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11191d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f11192e;

    public C1046f(ViewGroup viewGroup) {
        this.f11190c = viewGroup;
    }

    public final boolean a(float f, float f4, boolean z7) {
        ViewParent e7;
        if (!this.f11191d || (e7 = e(0)) == null) {
            return false;
        }
        try {
            return e7.onNestedFling(this.f11190c, f, f4, z7);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedFling", e8);
            return false;
        }
    }

    public final boolean b(float f, float f4) {
        ViewParent e7;
        if (!this.f11191d || (e7 = e(0)) == null) {
            return false;
        }
        try {
            return e7.onNestedPreFling(this.f11190c, f, f4);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedPreFling", e8);
            return false;
        }
    }

    public final boolean c(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        ViewParent e7;
        int i10;
        int i11;
        if (!this.f11191d || (e7 = e(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f11190c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            if (this.f11192e == null) {
                this.f11192e = new int[2];
            }
            iArr = this.f11192e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (e7 instanceof InterfaceC1047g) {
            ((InterfaceC1047g) e7).e(i7, i8, i9, iArr);
        } else if (i9 == 0) {
            try {
                e7.onNestedPreScroll(viewGroup, i7, i8, iArr);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedPreScroll", e8);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent e7;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.f11191d || (e7 = e(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f11190c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr2 == null) {
            if (this.f11192e == null) {
                this.f11192e = new int[2];
            }
            int[] iArr4 = this.f11192e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (e7 instanceof InterfaceC1048h) {
            ((InterfaceC1048h) e7).d(viewGroup, i7, i8, i9, i10, i11, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i9;
            iArr3[1] = iArr3[1] + i10;
            if (e7 instanceof InterfaceC1047g) {
                ((InterfaceC1047g) e7).b(viewGroup, i7, i8, i9, i10, i11);
            } else if (i11 == 0) {
                try {
                    e7.onNestedScroll(viewGroup, i7, i8, i9, i10);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedScroll", e8);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i12;
            iArr[1] = iArr[1] - i13;
        }
        return true;
    }

    public final ViewParent e(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                return null;
            }
            return this.f11189b;
        }
        return this.f11188a;
    }

    public final boolean f(int i7) {
        if (e(i7) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i7, int i8) {
        boolean onStartNestedScroll;
        if (f(i8)) {
            return true;
        }
        if (this.f11191d) {
            View view = this.f11190c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z7 = parent instanceof InterfaceC1047g;
                if (z7) {
                    onStartNestedScroll = ((InterfaceC1047g) parent).f(view2, view, i7, i8);
                } else {
                    if (i8 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view2, view, i7);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e7);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i8 != 0) {
                        if (i8 == 1) {
                            this.f11189b = parent;
                        }
                    } else {
                        this.f11188a = parent;
                    }
                    if (z7) {
                        ((InterfaceC1047g) parent).a(view2, view, i7, i8);
                    } else if (i8 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i7);
                        } catch (AbstractMethodError e8) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e8);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void h(int i7) {
        ViewParent e7 = e(i7);
        if (e7 != null) {
            boolean z7 = e7 instanceof InterfaceC1047g;
            ViewGroup viewGroup = this.f11190c;
            if (z7) {
                ((InterfaceC1047g) e7).c(viewGroup, i7);
            } else if (i7 == 0) {
                try {
                    e7.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onStopNestedScroll", e8);
                }
            }
            if (i7 != 0) {
                if (i7 == 1) {
                    this.f11189b = null;
                    return;
                }
                return;
            }
            this.f11188a = null;
        }
    }
}
