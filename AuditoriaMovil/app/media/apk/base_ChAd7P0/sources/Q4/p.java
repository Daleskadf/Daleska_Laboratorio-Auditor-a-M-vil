package q4;

import D.AbstractC0059i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class p extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final p f15369b = new e(Collections.emptyList());

    /* JADX WARN: Type inference failed for: r5v3, types: [q4.p, q4.e] */
    public static p l(String str) {
        if (!str.contains("//")) {
            String[] split = str.split("/");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                if (!str2.isEmpty()) {
                    arrayList.add(str2);
                }
            }
            return new e(arrayList);
        }
        throw new IllegalArgumentException(AbstractC0059i.M("Invalid path (", str, "). Paths must not contain // in them."));
    }

    @Override // q4.e
    public final String c() {
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        while (true) {
            List list = this.f15351a;
            if (i7 < list.size()) {
                if (i7 > 0) {
                    sb.append("/");
                }
                sb.append((String) list.get(i7));
                i7++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // q4.e
    public final e e(List list) {
        return new e(list);
    }
}
