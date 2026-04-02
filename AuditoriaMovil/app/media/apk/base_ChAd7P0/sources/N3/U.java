package n3;

import H4.e1;
import H4.p1;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final class U implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14195a;

    public /* synthetic */ U(int i7) {
        this.f14195a = i7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 630
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            Method dump skipped, instructions count: 1870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.U.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f14195a) {
            case 0:
                return new C1510y[i7];
            case 1:
                return new C1509x[i7];
            case 2:
                return new C1511z[i7];
            case 3:
                return new C1468A[i7];
            case 4:
                return new C1469B[i7];
            case 5:
                return new C1470C[i7];
            case 6:
                return new EnumC1472E[i7];
            case 7:
                return new C1473F[i7];
            case 8:
                return new EnumC1476I[i7];
            case 9:
                return new EnumC1477J[i7];
            case 10:
                return new C1479L[i7];
            case 11:
                return new C1480M[i7];
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new W[i7];
            case 13:
                return new C1481N[i7];
            case 14:
                return new EnumC1490e[i7];
            case 15:
                return new C1482O[i7];
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return new C1492g[i7];
            case 17:
                return new C1491f[i7];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new C1493h[i7];
            case 19:
                return new X[i7];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new Y[i7];
            case 21:
                return new C1494i[i7];
            case 22:
                return new C1495j[i7];
            case 23:
                return new C1496k[i7];
            case 24:
                return new C1498m[i7];
            case 25:
                return new C1499n[i7];
            case 26:
                return new C1500o[i7];
            case 27:
                return new C1503r[i7];
            case 28:
                return new Z[i7];
            default:
                return new a0[i7];
        }
    }
}
