package e0;

import android.util.Base64;
import java.util.List;
/* renamed from: e0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930e {

    /* renamed from: a  reason: collision with root package name */
    public final String f10593a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10594b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10595c;

    /* renamed from: d  reason: collision with root package name */
    public final List f10596d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10597e;

    public C0930e(String str, String str2, String str3, List list) {
        str.getClass();
        this.f10593a = str;
        str2.getClass();
        this.f10594b = str2;
        this.f10595c = str3;
        list.getClass();
        this.f10596d = list;
        this.f10597e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f10593a + ", mProviderPackage: " + this.f10594b + ", mQuery: " + this.f10595c + ", mCertificates:");
        int i7 = 0;
        while (true) {
            List list = this.f10596d;
            if (i7 < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i7);
                for (int i8 = 0; i8 < list2.size(); i8++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i8), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i7++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }
}
