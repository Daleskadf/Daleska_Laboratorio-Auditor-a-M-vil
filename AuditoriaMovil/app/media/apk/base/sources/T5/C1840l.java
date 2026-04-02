package t5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.utils.StringUtils;
/* renamed from: t5.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1840l {

    /* renamed from: a  reason: collision with root package name */
    public final String f15910a;

    /* renamed from: b  reason: collision with root package name */
    public final List f15911b;

    public C1840l(String str, List list) {
        this.f15910a = str;
        this.f15911b = list == null ? new ArrayList() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            byte[] bArr = new byte[list.size()];
            for (int i7 = 0; i7 < list.size(); i7++) {
                bArr[i7] = (byte) ((Integer) list.get(i7)).intValue();
            }
            return bArr;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1840l)) {
            return false;
        }
        C1840l c1840l = (C1840l) obj;
        String str = this.f15910a;
        if (str != null) {
            if (!str.equals(c1840l.f15910a)) {
                return false;
            }
        } else if (c1840l.f15910a != null) {
            return false;
        }
        List list = this.f15911b;
        if (list.size() != c1840l.f15911b.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            boolean z7 = list.get(i7) instanceof byte[];
            List list2 = c1840l.f15911b;
            if (z7 && (list2.get(i7) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i7), (byte[]) list2.get(i7))) {
                    return false;
                }
            } else if (!list.get(i7).equals(list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f15910a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15910a);
        List list = this.f15911b;
        if (list != null && !list.isEmpty()) {
            str = StringUtils.SPACE + list;
        } else {
            str = StringUtils.EMPTY;
        }
        sb.append(str);
        return sb.toString();
    }
}
