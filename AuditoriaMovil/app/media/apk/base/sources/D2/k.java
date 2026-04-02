package d2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f10252a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f10253b;

    /* renamed from: c  reason: collision with root package name */
    public float f10254c;

    /* renamed from: d  reason: collision with root package name */
    public float f10255d;

    /* renamed from: e  reason: collision with root package name */
    public float f10256e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f10257g;

    /* renamed from: h  reason: collision with root package name */
    public float f10258h;

    /* renamed from: i  reason: collision with root package name */
    public float f10259i;
    public final Matrix j;

    /* renamed from: k  reason: collision with root package name */
    public String f10260k;

    public k() {
        this.f10252a = new Matrix();
        this.f10253b = new ArrayList();
        this.f10254c = 0.0f;
        this.f10255d = 0.0f;
        this.f10256e = 0.0f;
        this.f = 1.0f;
        this.f10257g = 1.0f;
        this.f10258h = 0.0f;
        this.f10259i = 0.0f;
        this.j = new Matrix();
        this.f10260k = null;
    }

    @Override // d2.l
    public final boolean a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f10253b;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i7)).a()) {
                return true;
            }
            i7++;
        }
    }

    @Override // d2.l
    public final boolean b(int[] iArr) {
        int i7 = 0;
        boolean z7 = false;
        while (true) {
            ArrayList arrayList = this.f10253b;
            if (i7 < arrayList.size()) {
                z7 |= ((l) arrayList.get(i7)).b(iArr);
                i7++;
            } else {
                return z7;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f10255d, -this.f10256e);
        matrix.postScale(this.f, this.f10257g);
        matrix.postRotate(this.f10254c, 0.0f, 0.0f);
        matrix.postTranslate(this.f10258h + this.f10255d, this.f10259i + this.f10256e);
    }

    public String getGroupName() {
        return this.f10260k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f10255d;
    }

    public float getPivotY() {
        return this.f10256e;
    }

    public float getRotation() {
        return this.f10254c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.f10257g;
    }

    public float getTranslateX() {
        return this.f10258h;
    }

    public float getTranslateY() {
        return this.f10259i;
    }

    public void setPivotX(float f) {
        if (f != this.f10255d) {
            this.f10255d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f10256e) {
            this.f10256e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f10254c) {
            this.f10254c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f10257g) {
            this.f10257g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f10258h) {
            this.f10258h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f10259i) {
            this.f10259i = f;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [d2.m, d2.j] */
    public k(k kVar, S.f fVar) {
        m mVar;
        this.f10252a = new Matrix();
        this.f10253b = new ArrayList();
        this.f10254c = 0.0f;
        this.f10255d = 0.0f;
        this.f10256e = 0.0f;
        this.f = 1.0f;
        this.f10257g = 1.0f;
        this.f10258h = 0.0f;
        this.f10259i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.f10260k = null;
        this.f10254c = kVar.f10254c;
        this.f10255d = kVar.f10255d;
        this.f10256e = kVar.f10256e;
        this.f = kVar.f;
        this.f10257g = kVar.f10257g;
        this.f10258h = kVar.f10258h;
        this.f10259i = kVar.f10259i;
        String str = kVar.f10260k;
        this.f10260k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(kVar.j);
        ArrayList arrayList = kVar.f10253b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Object obj = arrayList.get(i7);
            if (obj instanceof k) {
                this.f10253b.add(new k((k) obj, fVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    ?? mVar2 = new m(jVar);
                    mVar2.f10244e = 0.0f;
                    mVar2.f10245g = 1.0f;
                    mVar2.f10246h = 1.0f;
                    mVar2.f10247i = 0.0f;
                    mVar2.j = 1.0f;
                    mVar2.f10248k = 0.0f;
                    mVar2.f10249l = Paint.Cap.BUTT;
                    mVar2.f10250m = Paint.Join.MITER;
                    mVar2.f10251n = 4.0f;
                    mVar2.f10243d = jVar.f10243d;
                    mVar2.f10244e = jVar.f10244e;
                    mVar2.f10245g = jVar.f10245g;
                    mVar2.f = jVar.f;
                    mVar2.f10263c = jVar.f10263c;
                    mVar2.f10246h = jVar.f10246h;
                    mVar2.f10247i = jVar.f10247i;
                    mVar2.j = jVar.j;
                    mVar2.f10248k = jVar.f10248k;
                    mVar2.f10249l = jVar.f10249l;
                    mVar2.f10250m = jVar.f10250m;
                    mVar2.f10251n = jVar.f10251n;
                    mVar = mVar2;
                } else if (obj instanceof C0895i) {
                    mVar = new m((C0895i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f10253b.add(mVar);
                Object obj2 = mVar.f10262b;
                if (obj2 != null) {
                    fVar.put(obj2, mVar);
                }
            }
        }
    }
}
