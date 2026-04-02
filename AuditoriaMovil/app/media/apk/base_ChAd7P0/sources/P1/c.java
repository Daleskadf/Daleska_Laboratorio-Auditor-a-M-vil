package P1;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f3962a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3963b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3964c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3965d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3966e;
    public final g f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f3967g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3968h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3969i;
    public final c j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f3970k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f3971l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f3972m;

    public c(String str, String str2, long j, long j8, g gVar, String[] strArr, String str3, String str4, c cVar) {
        boolean z7;
        this.f3962a = str;
        this.f3963b = str2;
        this.f3969i = str4;
        this.f = gVar;
        this.f3967g = strArr;
        if (str2 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f3964c = z7;
        this.f3965d = j;
        this.f3966e = j8;
        str3.getClass();
        this.f3968h = str3;
        this.j = cVar;
        this.f3970k = new HashMap();
        this.f3971l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", StringUtils.SPACE).replaceAll("[ \t\\x0B\f\r]+", StringUtils.SPACE), -9223372036854775807L, -9223372036854775807L, null, null, StringUtils.EMPTY, null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            J0.a aVar = new J0.a();
            aVar.f2289a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((J0.a) treeMap.get(str)).f2289a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i7) {
        ArrayList arrayList = this.f3972m;
        if (arrayList != null) {
            return (c) arrayList.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f3972m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z7) {
        boolean z8;
        String str = this.f3962a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z7 || equals || (equals2 && this.f3969i != null)) {
            long j = this.f3965d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j8 = this.f3966e;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
        }
        if (this.f3972m == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f3972m.size(); i7++) {
            c cVar = (c) this.f3972m.get(i7);
            if (!z7 && !equals) {
                z8 = false;
            } else {
                z8 = true;
            }
            cVar.d(treeSet, z8);
        }
    }

    public final boolean f(long j) {
        long j8 = this.f3965d;
        int i7 = (j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1));
        long j9 = this.f3966e;
        if ((i7 == 0 && j9 == -9223372036854775807L) || ((j8 <= j && j9 == -9223372036854775807L) || ((j8 == -9223372036854775807L && j < j9) || (j8 <= j && j < j9)))) {
            return true;
        }
        return false;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f3968h;
        if (!StringUtils.EMPTY.equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.f3962a) && (str2 = this.f3969i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i7 = 0; i7 < c(); i7++) {
            b(i7).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r20, java.util.Map r22, java.util.HashMap r23, java.lang.String r24, java.util.TreeMap r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j, boolean z7, String str, TreeMap treeMap) {
        String str2;
        boolean z8;
        HashMap hashMap = this.f3970k;
        hashMap.clear();
        HashMap hashMap2 = this.f3971l;
        hashMap2.clear();
        String str3 = this.f3962a;
        if (ExternalParsersConfigReaderMetKeys.METADATA_TAG.equals(str3)) {
            return;
        }
        String str4 = this.f3968h;
        if (StringUtils.EMPTY.equals(str4)) {
            str2 = str;
        } else {
            str2 = str4;
        }
        if (this.f3964c && z7) {
            SpannableStringBuilder e7 = e(str2, treeMap);
            String str5 = this.f3963b;
            str5.getClass();
            e7.append((CharSequence) str5);
        } else if ("br".equals(str3) && z7) {
            e(str2, treeMap).append('\n');
        } else if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                CharSequence charSequence = ((J0.a) entry.getValue()).f2289a;
                charSequence.getClass();
                hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str3);
            for (int i7 = 0; i7 < c(); i7++) {
                c b5 = b(i7);
                if (!z7 && !equals) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                b5.i(j, z8, str2, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e8 = e(str2, treeMap);
                int length = e8.length() - 1;
                while (length >= 0 && e8.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e8.charAt(length) != '\n') {
                    e8.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                CharSequence charSequence2 = ((J0.a) entry2.getValue()).f2289a;
                charSequence2.getClass();
                hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
