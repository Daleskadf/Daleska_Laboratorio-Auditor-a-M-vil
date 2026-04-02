package G1;

import android.graphics.Point;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxn;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k5.C1401d;
/* loaded from: classes.dex */
public final class h implements f, SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final int f1372a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1373b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1374c;

    public /* synthetic */ h(C1401d c1401d, int i7, int i8) {
        this.f1374c = c1401d;
        this.f1372a = i7;
        this.f1373b = i8;
    }

    @Override // G1.f
    public int a() {
        return this.f1372a;
    }

    @Override // G1.f
    public int b() {
        return this.f1373b;
    }

    @Override // G1.f
    public int c() {
        int i7 = this.f1372a;
        if (i7 == -1) {
            return ((K0.q) this.f1374c).y();
        }
        return i7;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        List<i5.f> list = (List) obj;
        C1401d c1401d = (C1401d) this.f1374c;
        zzxk zzxkVar = c1401d.f13711Y;
        if (zzxkVar == null) {
            return Tasks.forResult(list);
        }
        c1401d.f13712Z++;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (i5.f fVar : list) {
            int e7 = fVar.f11502a.e();
            if (((e7 > 4096 || e7 == 0) ? -1 : -1) == -1) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                Point[] pointArr = ((i5.f) arrayList2.get(i7)).f11504c;
                if (pointArr != null) {
                    zzxkVar.zzi(c1401d.f13712Z, zzxn.zzg(Arrays.asList(pointArr), this.f1372a, this.f1373b, 0.0f));
                }
            }
        } else {
            c1401d.f13713e0 = true;
        }
        c1401d.f13710X.getClass();
        return Tasks.forResult(arrayList);
    }

    public h() {
        this.f1374c = new h[RecognitionOptions.QR_CODE];
        this.f1372a = 0;
        this.f1373b = 0;
    }

    public h(int i7, int i8) {
        this.f1374c = null;
        this.f1372a = i7;
        int i9 = i8 & 7;
        this.f1373b = i9 == 0 ? 8 : i9;
    }

    public h(int i7, int i8, SparseArray sparseArray) {
        this.f1372a = i7;
        this.f1373b = i8;
        this.f1374c = sparseArray;
    }

    public h(b bVar, H0.r rVar) {
        K0.q qVar = bVar.f1352c;
        this.f1374c = qVar;
        qVar.G(12);
        int y2 = qVar.y();
        if ("audio/raw".equals(rVar.f1886m)) {
            int B7 = K0.x.B(rVar.f1867C, rVar.f1865A);
            if (y2 == 0 || y2 % B7 != 0) {
                K0.a.A("AtomParsers", "Audio sample size mismatch. stsd sample size: " + B7 + ", stsz sample size: " + y2);
                y2 = B7;
            }
        }
        this.f1372a = y2 == 0 ? -1 : y2;
        this.f1373b = qVar.y();
    }
}
