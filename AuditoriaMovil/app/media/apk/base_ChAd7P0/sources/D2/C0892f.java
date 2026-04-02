package d2;

import a.AbstractC0412a;
import android.animation.TypeEvaluator;
/* renamed from: d2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892f implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public Z.e[] f10240a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        Z.e[] eVarArr = (Z.e[]) obj;
        Z.e[] eVarArr2 = (Z.e[]) obj2;
        if (AbstractC0412a.c(eVarArr, eVarArr2)) {
            if (!AbstractC0412a.c(this.f10240a, eVarArr)) {
                this.f10240a = AbstractC0412a.n(eVarArr);
            }
            for (int i7 = 0; i7 < eVarArr.length; i7++) {
                Z.e eVar = this.f10240a[i7];
                Z.e eVar2 = eVarArr[i7];
                Z.e eVar3 = eVarArr2[i7];
                eVar.getClass();
                eVar.f6714a = eVar2.f6714a;
                int i8 = 0;
                while (true) {
                    float[] fArr = eVar2.f6715b;
                    if (i8 < fArr.length) {
                        eVar.f6715b[i8] = (eVar3.f6715b[i8] * f) + ((1.0f - f) * fArr[i8]);
                        i8++;
                    }
                }
            }
            return this.f10240a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
