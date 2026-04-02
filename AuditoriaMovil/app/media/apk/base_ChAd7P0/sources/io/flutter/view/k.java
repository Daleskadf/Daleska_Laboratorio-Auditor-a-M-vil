package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: C  reason: collision with root package name */
    public int f12444C;

    /* renamed from: D  reason: collision with root package name */
    public int f12445D;

    /* renamed from: E  reason: collision with root package name */
    public int f12446E;

    /* renamed from: F  reason: collision with root package name */
    public int f12447F;

    /* renamed from: G  reason: collision with root package name */
    public float f12448G;

    /* renamed from: H  reason: collision with root package name */
    public String f12449H;

    /* renamed from: I  reason: collision with root package name */
    public String f12450I;

    /* renamed from: J  reason: collision with root package name */
    public float f12451J;

    /* renamed from: K  reason: collision with root package name */
    public float f12452K;

    /* renamed from: L  reason: collision with root package name */
    public float f12453L;

    /* renamed from: M  reason: collision with root package name */
    public float f12454M;

    /* renamed from: N  reason: collision with root package name */
    public float[] f12455N;

    /* renamed from: O  reason: collision with root package name */
    public k f12456O;

    /* renamed from: R  reason: collision with root package name */
    public ArrayList f12459R;

    /* renamed from: S  reason: collision with root package name */
    public h f12460S;

    /* renamed from: T  reason: collision with root package name */
    public h f12461T;

    /* renamed from: V  reason: collision with root package name */
    public float[] f12463V;

    /* renamed from: X  reason: collision with root package name */
    public float[] f12465X;

    /* renamed from: Y  reason: collision with root package name */
    public Rect f12466Y;

    /* renamed from: a  reason: collision with root package name */
    public final o f12467a;

    /* renamed from: c  reason: collision with root package name */
    public int f12469c;

    /* renamed from: d  reason: collision with root package name */
    public int f12470d;

    /* renamed from: e  reason: collision with root package name */
    public int f12471e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f12472g;

    /* renamed from: h  reason: collision with root package name */
    public int f12473h;

    /* renamed from: i  reason: collision with root package name */
    public int f12474i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f12475k;

    /* renamed from: l  reason: collision with root package name */
    public float f12476l;

    /* renamed from: m  reason: collision with root package name */
    public float f12477m;

    /* renamed from: n  reason: collision with root package name */
    public float f12478n;

    /* renamed from: o  reason: collision with root package name */
    public String f12479o;

    /* renamed from: p  reason: collision with root package name */
    public String f12480p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f12481q;

    /* renamed from: r  reason: collision with root package name */
    public String f12482r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f12483s;

    /* renamed from: t  reason: collision with root package name */
    public String f12484t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f12485u;

    /* renamed from: v  reason: collision with root package name */
    public String f12486v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList f12487w;

    /* renamed from: x  reason: collision with root package name */
    public String f12488x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f12489y;

    /* renamed from: z  reason: collision with root package name */
    public String f12490z;

    /* renamed from: b  reason: collision with root package name */
    public int f12468b = -1;

    /* renamed from: A  reason: collision with root package name */
    public int f12442A = -1;

    /* renamed from: B  reason: collision with root package name */
    public boolean f12443B = false;

    /* renamed from: P  reason: collision with root package name */
    public final ArrayList f12457P = new ArrayList();

    /* renamed from: Q  reason: collision with root package name */
    public final ArrayList f12458Q = new ArrayList();

    /* renamed from: U  reason: collision with root package name */
    public boolean f12462U = true;

    /* renamed from: W  reason: collision with root package name */
    public boolean f12464W = true;

    public k(o oVar) {
        this.f12467a = oVar;
    }

    public static boolean a(k kVar, g gVar) {
        if ((kVar.f12470d & gVar.value) != 0) {
            return true;
        }
        return false;
    }

    public static CharSequence b(k kVar) {
        CharSequence[] charSequenceArr = {e(kVar.f12482r, kVar.f12483s), e(kVar.f12480p, kVar.f12481q), e(kVar.f12488x, kVar.f12489y)};
        CharSequence charSequence = null;
        for (int i7 = 0; i7 < 3; i7++) {
            CharSequence charSequence2 = charSequenceArr[i7];
            if (charSequence2 != null && charSequence2.length() > 0) {
                if (charSequence != null && charSequence.length() != 0) {
                    charSequence = TextUtils.concat(charSequence, ", ", charSequence2);
                } else {
                    charSequence = charSequence2;
                }
            }
        }
        return charSequence;
    }

    public static boolean c(k kVar, g gVar) {
        if ((kVar.f12445D & gVar.value) != 0) {
            return true;
        }
        return false;
    }

    public static SpannableString e(String str, ArrayList arrayList) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                int i7 = e.f12435a[mVar.f12493c.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) mVar).f12441d)), mVar.f12491a, mVar.f12492b, 0);
                    }
                } else {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), mVar.f12491a, mVar.f12492b, 0);
                }
            }
        }
        return spannableString;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [io.flutter.view.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [io.flutter.view.m, io.flutter.view.j, java.lang.Object] */
    public static ArrayList g(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i7 = byteBuffer.getInt();
        if (i7 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            n nVar = n.values()[byteBuffer.getInt()];
            int i11 = e.f12435a[nVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    ?? obj = new Object();
                    obj.f12491a = i9;
                    obj.f12492b = i10;
                    obj.f12493c = nVar;
                    obj.f12441d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(obj);
                }
            } else {
                byteBuffer.getInt();
                ?? obj2 = new Object();
                obj2.f12491a = i9;
                obj2.f12492b = i10;
                obj2.f12493c = nVar;
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f = fArr[3];
        fArr[0] = fArr[0] / f;
        fArr[1] = fArr[1] / f;
        fArr[2] = fArr[2] / f;
        fArr[3] = 0.0f;
    }

    public final void d(ArrayList arrayList) {
        if (h(i.SCOPES_ROUTE)) {
            arrayList.add(this);
        }
        Iterator it = this.f12457P.iterator();
        while (it.hasNext()) {
            ((k) it.next()).d(arrayList);
        }
    }

    public final String f() {
        String str;
        if (h(i.NAMES_ROUTE) && (str = this.f12480p) != null && !str.isEmpty()) {
            return this.f12480p;
        }
        Iterator it = this.f12457P.iterator();
        while (it.hasNext()) {
            String f = ((k) it.next()).f();
            if (f != null && !f.isEmpty()) {
                return f;
            }
        }
        return null;
    }

    public final boolean h(i iVar) {
        if ((iVar.value & this.f12469c) != 0) {
            return true;
        }
        return false;
    }

    public final k i(float[] fArr, boolean z7) {
        float f = fArr[3];
        boolean z8 = false;
        float f4 = fArr[0] / f;
        float f8 = fArr[1] / f;
        if (f4 < this.f12451J || f4 >= this.f12453L || f8 < this.f12452K || f8 >= this.f12454M) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f12458Q.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!kVar.h(i.IS_HIDDEN)) {
                if (kVar.f12462U) {
                    kVar.f12462U = false;
                    if (kVar.f12463V == null) {
                        kVar.f12463V = new float[16];
                    }
                    if (!Matrix.invertM(kVar.f12463V, 0, kVar.f12455N, 0)) {
                        Arrays.fill(kVar.f12463V, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, kVar.f12463V, 0, fArr, 0);
                k i7 = kVar.i(fArr2, z7);
                if (i7 != null) {
                    return i7;
                }
            }
        }
        if (z7 && this.f12474i != -1) {
            z8 = true;
        }
        if (!j() && !z8) {
            return null;
        }
        return this;
    }

    public final boolean j() {
        String str;
        String str2;
        String str3;
        if (h(i.SCOPES_ROUTE)) {
            return false;
        }
        if (h(i.IS_FOCUSABLE)) {
            return true;
        }
        if ((this.f12470d & (~o.f12496z)) == 0 && (this.f12469c & o.f12494A) == 0 && (((str = this.f12480p) == null || str.isEmpty()) && (((str2 = this.f12482r) == null || str2.isEmpty()) && ((str3 = this.f12488x) == null || str3.isEmpty())))) {
            return false;
        }
        return true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z7) {
        hashSet.add(this);
        if (this.f12464W) {
            z7 = true;
        }
        if (z7) {
            if (this.f12465X == null) {
                this.f12465X = new float[16];
            }
            if (this.f12455N == null) {
                this.f12455N = new float[16];
            }
            Matrix.multiplyMM(this.f12465X, 0, fArr, 0, this.f12455N, 0);
            float[] fArr2 = {this.f12451J, this.f12452K, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.f12465X, fArr2);
            fArr2[0] = this.f12453L;
            fArr2[1] = this.f12452K;
            k(fArr4, this.f12465X, fArr2);
            fArr2[0] = this.f12453L;
            fArr2[1] = this.f12454M;
            k(fArr5, this.f12465X, fArr2);
            fArr2[0] = this.f12451J;
            fArr2[1] = this.f12454M;
            k(fArr6, this.f12465X, fArr2);
            if (this.f12466Y == null) {
                this.f12466Y = new Rect();
            }
            this.f12466Y.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f12464W = false;
        }
        Iterator it = this.f12457P.iterator();
        int i7 = -1;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            kVar.f12442A = i7;
            i7 = kVar.f12468b;
            kVar.l(this.f12465X, hashSet, z7);
        }
    }
}
