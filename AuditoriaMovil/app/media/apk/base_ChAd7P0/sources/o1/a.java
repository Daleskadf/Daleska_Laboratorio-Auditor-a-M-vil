package O1;

import A3.K;
import D.AbstractC0059i;
import J0.b;
import J1.d;
import J1.k;
import J1.l;
import K0.c;
import K0.q;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
import z3.h;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f3842d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f3843e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f3844a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3845b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final q f3846c = new q();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b b(Spanned spanned, String str) {
        char c8;
        int i7;
        char c9;
        int i8;
        float f;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        if (c8 != 0 && c8 != 1 && c8 != 2) {
            if (c8 != 3 && c8 != 4 && c8 != 5) {
                i7 = 1;
            } else {
                i7 = 2;
            }
        } else {
            i7 = 0;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 != 0 && c9 != 1 && c9 != 2) {
            if (c9 != 3 && c9 != 4 && c9 != 5) {
                i8 = 1;
            } else {
                i8 = 0;
            }
        } else {
            i8 = 2;
        }
        float f4 = 0.92f;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    f = 0.92f;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                f = 0.5f;
            }
        } else {
            f = 0.08f;
        }
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalArgumentException();
                }
            } else {
                f4 = 0.5f;
            }
        } else {
            f4 = 0.08f;
        }
        return new b(spanned, null, null, null, f4, 0, i8, f, i7, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public static long c(Matcher matcher, int i7) {
        long j;
        String group = matcher.group(i7 + 1);
        if (group != null) {
            j = Long.parseLong(group) * 3600000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i7 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j;
        String group3 = matcher.group(i7 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i7 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override // J1.l
    public final /* synthetic */ void a() {
    }

    @Override // J1.l
    public final /* synthetic */ d g(byte[] bArr, int i7, int i8) {
        return AbstractC0059i.o(this, bArr, i8);
    }

    @Override // J1.l
    public final void l(byte[] bArr, int i7, int i8, k kVar, c cVar) {
        ArrayList<J1.a> arrayList;
        c cVar2;
        String i9;
        String str;
        c cVar3;
        a aVar = this;
        c cVar4 = cVar;
        String str2 = "SubripParser";
        q qVar = aVar.f3846c;
        qVar.E(bArr, i7 + i8);
        qVar.G(i7);
        Charset C7 = qVar.C();
        if (C7 == null) {
            C7 = h.f16886c;
        }
        long j = kVar.f2377a;
        if (j != -9223372036854775807L && kVar.f2378b) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        while (true) {
            String i10 = qVar.i(C7);
            if (i10 == null) {
                break;
            } else if (i10.length() != 0) {
                try {
                    Integer.parseInt(i10);
                    i9 = qVar.i(C7);
                } catch (NumberFormatException unused) {
                    cVar2 = cVar4;
                    K0.a.A(str2, "Skipping invalid index: ".concat(i10));
                }
                if (i9 == null) {
                    K0.a.A(str2, "Unexpected end");
                    break;
                }
                Matcher matcher = f3842d.matcher(i9);
                if (matcher.matches()) {
                    long c8 = c(matcher, 1);
                    long c9 = c(matcher, 6);
                    StringBuilder sb = aVar.f3844a;
                    sb.setLength(0);
                    ArrayList arrayList2 = aVar.f3845b;
                    arrayList2.clear();
                    String i11 = qVar.i(C7);
                    while (!TextUtils.isEmpty(i11)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String trim = i11.trim();
                        StringBuilder sb2 = new StringBuilder(trim);
                        Matcher matcher2 = f3843e.matcher(trim);
                        int i12 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            Matcher matcher3 = matcher2;
                            int start = matcher2.start() - i12;
                            int length = group.length();
                            sb2.replace(start, start + length, StringUtils.EMPTY);
                            i12 += length;
                            matcher2 = matcher3;
                            str2 = str2;
                        }
                        sb.append(sb2.toString());
                        i11 = qVar.i(C7);
                        str2 = str2;
                    }
                    String str3 = str2;
                    Spanned fromHtml = Html.fromHtml(sb.toString());
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList2.size()) {
                            str = (String) arrayList2.get(i13);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i13++;
                        } else {
                            str = null;
                            break;
                        }
                    }
                    if (j != -9223372036854775807L && c8 < j) {
                        if (arrayList != null) {
                            arrayList.add(new J1.a(K.u(b(fromHtml, str)), c8, c9 - c8));
                        }
                        cVar3 = cVar;
                    } else {
                        cVar3 = cVar;
                        cVar3.accept(new J1.a(K.u(b(fromHtml, str)), c8, c9 - c8));
                    }
                    cVar4 = cVar3;
                    str2 = str3;
                    aVar = this;
                } else {
                    cVar2 = cVar4;
                    K0.a.A(str2, "Skipping invalid timing: ".concat(i9));
                    cVar4 = cVar2;
                    aVar = this;
                }
            }
        }
        c cVar5 = cVar4;
        if (arrayList != null) {
            for (J1.a aVar2 : arrayList) {
                cVar5.accept(aVar2);
            }
        }
    }

    @Override // J1.l
    public final int m() {
        return 1;
    }
}
