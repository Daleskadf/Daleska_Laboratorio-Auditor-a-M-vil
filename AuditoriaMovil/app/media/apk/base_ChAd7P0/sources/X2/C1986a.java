package x2;

import java.io.Serializable;
import java.util.List;
/* renamed from: x2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1986a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final List f16497a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f16498b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16499c;

    /* renamed from: d  reason: collision with root package name */
    public final List f16500d;

    public C1986a(List list, Boolean bool, String str, List list2) {
        this.f16497a = list;
        this.f16498b = bool;
        this.f16499c = str;
        this.f16500d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1986a.class != obj.getClass()) {
            return false;
        }
        C1986a c1986a = (C1986a) obj;
        List list = c1986a.f16497a;
        List list2 = this.f16497a;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        Boolean bool = c1986a.f16498b;
        Boolean bool2 = this.f16498b;
        if (bool2 == null ? bool != null : !bool2.equals(bool)) {
            return false;
        }
        String str = c1986a.f16499c;
        String str2 = this.f16499c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list3 = c1986a.f16500d;
        List list4 = this.f16500d;
        if (list4 != null) {
            return list4.equals(list3);
        }
        if (list3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        List list = this.f16497a;
        if (list != null) {
            i7 = list.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = i7 * 31;
        Boolean bool = this.f16498b;
        if (bool != null) {
            i8 = bool.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (i11 + i8) * 31;
        String str = this.f16499c;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (i12 + i9) * 31;
        List list2 = this.f16500d;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return i13 + i10;
    }
}
