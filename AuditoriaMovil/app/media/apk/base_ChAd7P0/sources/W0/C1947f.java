package w0;

import D.AbstractC0055e;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
/* renamed from: w0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1947f extends AbstractC0055e {

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16324e;
    public final C1945d f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16325g = true;

    public C1947f(TextView textView) {
        this.f16324e = textView;
        this.f = new C1945d(textView);
    }

    @Override // D.AbstractC0055e
    public final TransformationMethod F(TransformationMethod transformationMethod) {
        if (this.f16325g) {
            if (!(transformationMethod instanceof i) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new i(transformationMethod);
            }
            return transformationMethod;
        } else if (transformationMethod instanceof i) {
            return ((i) transformationMethod).f16330a;
        } else {
            return transformationMethod;
        }
    }

    @Override // D.AbstractC0055e
    public final InputFilter[] i(InputFilter[] inputFilterArr) {
        if (!this.f16325g) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof C1945d) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i8 = 0;
                for (int i9 = 0; i9 < length; i9++) {
                    if (sparseArray.indexOfKey(i9) < 0) {
                        inputFilterArr2[i8] = inputFilterArr[i9];
                        i8++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        int i10 = 0;
        while (true) {
            C1945d c1945d = this.f;
            if (i10 < length2) {
                if (inputFilterArr[i10] != c1945d) {
                    i10++;
                } else {
                    return inputFilterArr;
                }
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c1945d;
                return inputFilterArr3;
            }
        }
    }

    @Override // D.AbstractC0055e
    public final boolean m() {
        return this.f16325g;
    }

    @Override // D.AbstractC0055e
    public final void w(boolean z7) {
        if (z7) {
            TextView textView = this.f16324e;
            textView.setTransformationMethod(F(textView.getTransformationMethod()));
        }
    }

    @Override // D.AbstractC0055e
    public final void x(boolean z7) {
        this.f16325g = z7;
        TextView textView = this.f16324e;
        textView.setTransformationMethod(F(textView.getTransformationMethod()));
        textView.setFilters(i(textView.getFilters()));
    }
}
