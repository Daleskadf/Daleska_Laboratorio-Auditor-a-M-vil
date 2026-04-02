package io.grpc.okhttp.internal;

import c6.C0692o0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12549a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f12550b;

    public e(C0692o0 c0692o0) {
        ArrayList arrayList = c0692o0.f8937b;
        this.f12550b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String toString() {
        String str;
        switch (this.f12549a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String[] strArr = this.f12550b;
                int length = strArr.length / 2;
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = i7 * 2;
                    String str2 = null;
                    if (i8 >= 0 && i8 < strArr.length) {
                        str = strArr[i8];
                    } else {
                        str = null;
                    }
                    sb.append(str);
                    sb.append(": ");
                    int i9 = i8 + 1;
                    if (i9 >= 0 && i9 < strArr.length) {
                        str2 = strArr[i9];
                    }
                    sb.append(str2);
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public e(String[] strArr) {
        this.f12550b = strArr;
    }
}
