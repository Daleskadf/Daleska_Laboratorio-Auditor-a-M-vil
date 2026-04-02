package q4;

import D.AbstractC0059i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class k extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final k f15360b = new e(Collections.singletonList("__name__"));

    /* renamed from: c  reason: collision with root package name */
    public static final k f15361c = new e(Collections.emptyList());

    /* JADX WARN: Type inference failed for: r8v2, types: [q4.k, q4.e] */
    public static k l(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        boolean z7 = false;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt == '\\') {
                i7++;
                if (i7 != str.length()) {
                    sb.append(str.charAt(i7));
                } else {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
            } else if (charAt == '.') {
                if (!z7) {
                    String sb2 = sb.toString();
                    if (!sb2.isEmpty()) {
                        StringBuilder sb3 = new StringBuilder();
                        arrayList.add(sb2);
                        sb = sb3;
                    } else {
                        throw new IllegalArgumentException(AbstractC0059i.M("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
                    }
                } else {
                    sb.append(charAt);
                }
            } else if (charAt == '`') {
                z7 = !z7;
            } else {
                sb.append(charAt);
            }
            i7++;
        }
        String sb4 = sb.toString();
        if (!sb4.isEmpty()) {
            arrayList.add(sb4);
            return new e(arrayList);
        }
        throw new IllegalArgumentException(AbstractC0059i.M("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
    }

    @Override // q4.e
    public final String c() {
        char charAt;
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        while (true) {
            List list = this.f15351a;
            if (i7 < list.size()) {
                if (i7 > 0) {
                    sb.append(".");
                }
                String replace = ((String) list.get(i7)).replace("\\", "\\\\").replace("`", "\\`");
                if (!replace.isEmpty() && ((charAt = replace.charAt(0)) == '_' || ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')))) {
                    for (int i8 = 1; i8 < replace.length(); i8++) {
                        char charAt2 = replace.charAt(i8);
                        if (charAt2 == '_' || ((charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= '0' && charAt2 <= '9')))) {
                        }
                    }
                    sb.append(replace);
                    i7++;
                }
                replace = "`" + replace + '`';
                sb.append(replace);
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
