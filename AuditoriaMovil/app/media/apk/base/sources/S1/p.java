package S1;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final m1.G f5089a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5090b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5091c;
    public final K0.p f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f5094g;

    /* renamed from: h  reason: collision with root package name */
    public int f5095h;

    /* renamed from: i  reason: collision with root package name */
    public int f5096i;
    public long j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5097k;

    /* renamed from: l  reason: collision with root package name */
    public long f5098l;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5101o;

    /* renamed from: p  reason: collision with root package name */
    public long f5102p;

    /* renamed from: q  reason: collision with root package name */
    public long f5103q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5104r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5105s;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray f5092d = new SparseArray();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray f5093e = new SparseArray();

    /* renamed from: m  reason: collision with root package name */
    public o f5099m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public o f5100n = new Object();

    /* JADX WARN: Type inference failed for: r1v3, types: [S1.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [S1.o, java.lang.Object] */
    public p(m1.G g3, boolean z7, boolean z8) {
        this.f5089a = g3;
        this.f5090b = z7;
        this.f5091c = z8;
        byte[] bArr = new byte[RecognitionOptions.ITF];
        this.f5094g = bArr;
        this.f = new K0.p(bArr, 0, 0);
        this.f5097k = false;
        this.f5101o = false;
        o oVar = this.f5100n;
        oVar.f5076b = false;
        oVar.f5075a = false;
    }

    public final void a() {
        boolean z7;
        int i7;
        boolean z8 = false;
        if (this.f5090b) {
            o oVar = this.f5100n;
            if (oVar.f5076b && ((i7 = oVar.f5079e) == 7 || i7 == 2)) {
                z7 = true;
            } else {
                z7 = false;
            }
        } else {
            z7 = this.f5105s;
        }
        boolean z9 = this.f5104r;
        int i8 = this.f5096i;
        if (i8 == 5 || (z7 && i8 == 1)) {
            z8 = true;
        }
        this.f5104r = z9 | z8;
    }
}
