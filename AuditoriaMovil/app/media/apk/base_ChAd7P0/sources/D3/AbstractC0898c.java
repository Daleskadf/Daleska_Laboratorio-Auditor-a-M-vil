package d3;

import com.google.android.gms.common.internal.I;
/* renamed from: d3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0898c extends AbstractC0897b implements X2.b {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        AbstractC0897b abstractC0897b = (AbstractC0897b) obj;
        for (C0896a c0896a : getFieldMappings().values()) {
            if (isFieldSet(c0896a)) {
                if (!abstractC0897b.isFieldSet(c0896a) || !I.m(getFieldValue(c0896a), abstractC0897b.getFieldValue(c0896a))) {
                    return false;
                }
            } else if (abstractC0897b.isFieldSet(c0896a)) {
                return false;
            }
        }
        return true;
    }

    @Override // d3.AbstractC0897b
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i7 = 0;
        for (C0896a c0896a : getFieldMappings().values()) {
            if (isFieldSet(c0896a)) {
                Object fieldValue = getFieldValue(c0896a);
                I.i(fieldValue);
                i7 = (i7 * 31) + fieldValue.hashCode();
            }
        }
        return i7;
    }

    @Override // d3.AbstractC0897b
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
