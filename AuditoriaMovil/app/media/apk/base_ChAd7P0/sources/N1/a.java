package N1;

import D.AbstractC0059i;
import H0.C0129i;
import J1.k;
import J1.l;
import K0.q;
import K0.x;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
import z3.h;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: X  reason: collision with root package name */
    public static final Pattern f3354X = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3355a;

    /* renamed from: b  reason: collision with root package name */
    public final C0129i f3356b;

    /* renamed from: d  reason: collision with root package name */
    public LinkedHashMap f3358d;

    /* renamed from: e  reason: collision with root package name */
    public float f3359e = -3.4028235E38f;
    public float f = -3.4028235E38f;

    /* renamed from: c  reason: collision with root package name */
    public final q f3357c = new q();

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f3355a = true;
            String p7 = x.p((byte[]) list.get(0));
            K0.a.e(p7.startsWith("Format:"));
            C0129i c8 = C0129i.c(p7);
            c8.getClass();
            this.f3356b = c8;
            c(new q((byte[]) list.get(1)), h.f16886c);
            return;
        }
        this.f3355a = false;
        this.f3356b = null;
    }

    public static int b(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i7;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j) {
                    i7 = size + 1;
                    break;
                }
                size--;
            } else {
                i7 = 0;
                break;
            }
        }
        arrayList.add(i7, Long.valueOf(j));
        if (i7 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i7 - 1));
        }
        arrayList2.add(i7, arrayList3);
        return i7;
    }

    public static long d(String str) {
        Matcher matcher = f3354X.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i7 = x.f2529a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // J1.l
    public final /* synthetic */ void a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02aa, code lost:
        if (r4 != 3) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0019 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(K0.q r38, java.nio.charset.Charset r39) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.a.c(K0.q, java.nio.charset.Charset):void");
    }

    @Override // J1.l
    public final /* synthetic */ J1.d g(byte[] bArr, int i7, int i8) {
        return AbstractC0059i.o(this, bArr, i8);
    }

    @Override // J1.l
    public final void l(byte[] bArr, int i7, int i8, k kVar, K0.c cVar) {
        C0129i c0129i;
        ArrayList<J1.a> arrayList;
        Charset charset;
        C0129i c0129i2;
        q qVar;
        d dVar;
        int i9;
        float f;
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i11;
        PointF pointF;
        int i12;
        int i13;
        float f4;
        float f8;
        float f9;
        float f10;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        Integer num;
        int i18;
        int i19;
        a aVar = this;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        q qVar2 = aVar.f3357c;
        qVar2.E(bArr, i7 + i8);
        qVar2.G(i7);
        Charset C7 = qVar2.C();
        if (C7 == null) {
            C7 = h.f16886c;
        }
        boolean z7 = aVar.f3355a;
        if (!z7) {
            aVar.c(qVar2, C7);
        }
        if (z7) {
            c0129i = aVar.f3356b;
        } else {
            c0129i = null;
        }
        while (true) {
            String i20 = qVar2.i(C7);
            if (i20 != null) {
                if (i20.startsWith("Format:")) {
                    c0129i = C0129i.c(i20);
                } else {
                    if (i20.startsWith("Dialogue:")) {
                        if (c0129i == null) {
                            K0.a.A("SsaParser", "Skipping dialogue line before complete format: ".concat(i20));
                        } else {
                            K0.a.e(i20.startsWith("Dialogue:"));
                            String substring = i20.substring(9);
                            int i21 = c0129i.f1809e;
                            String[] split = substring.split(",", i21);
                            if (split.length != i21) {
                                K0.a.A("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(i20));
                            } else {
                                q qVar3 = qVar2;
                                long d7 = d(split[c0129i.f1805a]);
                                if (d7 == -9223372036854775807L) {
                                    K0.a.A("SsaParser", "Skipping invalid timing: ".concat(i20));
                                } else {
                                    long d8 = d(split[c0129i.f1806b]);
                                    if (d8 == -9223372036854775807L) {
                                        K0.a.A("SsaParser", "Skipping invalid timing: ".concat(i20));
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.f3358d;
                                        charset = C7;
                                        if (linkedHashMap != null && (i19 = c0129i.f1807c) != -1) {
                                            dVar = (d) linkedHashMap.get(split[i19].trim());
                                        } else {
                                            dVar = null;
                                        }
                                        String str = split[c0129i.f1808d];
                                        Matcher matcher = c.f3369a.matcher(str);
                                        int i22 = -1;
                                        PointF pointF2 = null;
                                        while (matcher.find()) {
                                            C0129i c0129i3 = c0129i;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a7 = c.a(group);
                                                if (a7 != null) {
                                                    pointF2 = a7;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = c.f3372d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i18 = d.a(group2);
                                                } else {
                                                    i18 = -1;
                                                }
                                                if (i18 != -1) {
                                                    i22 = i18;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            c0129i = c0129i3;
                                        }
                                        c0129i2 = c0129i;
                                        String replace = c.f3369a.matcher(str).replaceAll(StringUtils.EMPTY).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f12 = aVar.f3359e;
                                        float f13 = aVar.f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (dVar != null) {
                                            Integer num2 = dVar.f3375c;
                                            if (num2 != null) {
                                                qVar = qVar3;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                qVar = qVar3;
                                            }
                                            if (dVar.j == 3 && (num = dVar.f3376d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f14 = dVar.f3377e;
                                            if (f14 != -3.4028235E38f && f13 != -3.4028235E38f) {
                                                f10 = f14 / f13;
                                                i14 = 1;
                                            } else {
                                                f10 = -3.4028235E38f;
                                                i14 = Integer.MIN_VALUE;
                                            }
                                            boolean z8 = dVar.f3378g;
                                            boolean z9 = dVar.f;
                                            if (z9 && z8) {
                                                i15 = i14;
                                                f11 = f10;
                                                i16 = 0;
                                                i17 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i15 = i14;
                                                f11 = f10;
                                                i16 = 0;
                                                i17 = 33;
                                                if (z9) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z8) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (dVar.f3379h) {
                                                spannableString.setSpan(new UnderlineSpan(), i16, spannableString.length(), i17);
                                            }
                                            if (dVar.f3380i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i16, spannableString.length(), i17);
                                            }
                                            i9 = i22;
                                            f = f11;
                                            i10 = i15;
                                        } else {
                                            qVar = qVar3;
                                            i9 = i22;
                                            f = -3.4028235E38f;
                                            i10 = Integer.MIN_VALUE;
                                        }
                                        int i23 = -1;
                                        if (i9 != -1) {
                                            i23 = i9;
                                        } else if (dVar != null) {
                                            i23 = dVar.f3374b;
                                        }
                                        switch (i23) {
                                            case 0:
                                            default:
                                                AbstractC0059i.J("Unknown alignment: ", i23, "SsaParser");
                                            case -1:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i24 = Integer.MIN_VALUE;
                                        switch (i23) {
                                            case 0:
                                            default:
                                                AbstractC0059i.J("Unknown alignment: ", i23, "SsaParser");
                                            case -1:
                                                i11 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i11 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i11 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i11 = 2;
                                                break;
                                        }
                                        switch (i23) {
                                            case 0:
                                            default:
                                                AbstractC0059i.J("Unknown alignment: ", i23, "SsaParser");
                                            case -1:
                                                pointF = pointF2;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                pointF = pointF2;
                                                i24 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                pointF = pointF2;
                                                i24 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                pointF = pointF2;
                                                i24 = 0;
                                                break;
                                        }
                                        if (pointF != null && f13 != -3.4028235E38f && f12 != -3.4028235E38f) {
                                            f8 = pointF.y / f13;
                                            f9 = pointF.x / f12;
                                        } else {
                                            float f15 = 0.95f;
                                            if (i11 != 0) {
                                                i12 = 1;
                                                if (i11 != 1) {
                                                    i13 = 2;
                                                    if (i11 != 2) {
                                                        f4 = -3.4028235E38f;
                                                    } else {
                                                        f4 = 0.95f;
                                                    }
                                                } else {
                                                    i13 = 2;
                                                    f4 = 0.5f;
                                                }
                                            } else {
                                                i12 = 1;
                                                i13 = 2;
                                                f4 = 0.05f;
                                            }
                                            if (i24 != 0) {
                                                if (i24 != i12) {
                                                    if (i24 != i13) {
                                                        f15 = -3.4028235E38f;
                                                    }
                                                } else {
                                                    f15 = 0.5f;
                                                }
                                            } else {
                                                f15 = 0.05f;
                                            }
                                            f8 = f15;
                                            f9 = f4;
                                        }
                                        J0.b bVar = new J0.b(spannableString, alignment2, null, null, f8, 0, i24, f9, i11, i10, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                        int b5 = b(d8, arrayList3, arrayList2);
                                        for (int b7 = b(d7, arrayList3, arrayList2); b7 < b5; b7++) {
                                            ((List) arrayList2.get(b7)).add(bVar);
                                        }
                                        aVar = this;
                                        C7 = charset;
                                        c0129i = c0129i2;
                                        qVar2 = qVar;
                                    }
                                }
                                charset = C7;
                                c0129i2 = c0129i;
                                qVar = qVar3;
                                aVar = this;
                                C7 = charset;
                                c0129i = c0129i2;
                                qVar2 = qVar;
                            }
                        }
                    }
                    charset = C7;
                    c0129i2 = c0129i;
                    qVar = qVar2;
                    aVar = this;
                    C7 = charset;
                    c0129i = c0129i2;
                    qVar2 = qVar;
                }
            } else {
                long j = kVar.f2377a;
                if (j != -9223372036854775807L && kVar.f2378b) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                for (int i25 = 0; i25 < arrayList2.size(); i25++) {
                    List list = (List) arrayList2.get(i25);
                    if (!list.isEmpty() || i25 == 0) {
                        if (i25 != arrayList2.size() - 1) {
                            long longValue = ((Long) arrayList3.get(i25)).longValue();
                            long longValue2 = ((Long) arrayList3.get(i25 + 1)).longValue() - ((Long) arrayList3.get(i25)).longValue();
                            if (j != -9223372036854775807L && longValue < j) {
                                if (arrayList != null) {
                                    arrayList.add(new J1.a(list, longValue, longValue2));
                                }
                            } else {
                                cVar.accept(new J1.a(list, longValue, longValue2));
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
                if (arrayList != null) {
                    for (J1.a aVar2 : arrayList) {
                        cVar.accept(aVar2);
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // J1.l
    public final int m() {
        return 1;
    }
}
