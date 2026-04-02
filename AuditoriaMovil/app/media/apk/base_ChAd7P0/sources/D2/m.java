package d2;

import a.AbstractC0412a;
/* loaded from: classes.dex */
public abstract class m extends l {

    /* renamed from: a  reason: collision with root package name */
    public Z.e[] f10261a;

    /* renamed from: b  reason: collision with root package name */
    public String f10262b;

    /* renamed from: c  reason: collision with root package name */
    public int f10263c;

    public m() {
        this.f10261a = null;
        this.f10263c = 0;
    }

    public Z.e[] getPathData() {
        return this.f10261a;
    }

    public String getPathName() {
        return this.f10262b;
    }

    public void setPathData(Z.e[] eVarArr) {
        if (!AbstractC0412a.c(this.f10261a, eVarArr)) {
            this.f10261a = AbstractC0412a.n(eVarArr);
            return;
        }
        Z.e[] eVarArr2 = this.f10261a;
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            eVarArr2[i7].f6714a = eVarArr[i7].f6714a;
            int i8 = 0;
            while (true) {
                float[] fArr = eVarArr[i7].f6715b;
                if (i8 < fArr.length) {
                    eVarArr2[i7].f6715b[i8] = fArr[i8];
                    i8++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f10261a = null;
        this.f10263c = 0;
        this.f10262b = mVar.f10262b;
        this.f10261a = AbstractC0412a.n(mVar.f10261a);
    }
}
