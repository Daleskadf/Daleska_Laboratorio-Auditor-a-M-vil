package s3;

import H4.e1;
import H4.p1;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.barhopper.RecognitionOptions;
import org.apache.tika.utils.XMLReaderUtils;
import v3.C1886b;
import w1.C1949a;
import x1.C1985a;
import y1.C2033a;
import y1.C2034b;
import z0.C2042b;
import z0.C2043c;
import z0.H;
import z0.M;
/* renamed from: s3.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770E implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15587a;

    public /* synthetic */ C1770E(int i7) {
        this.f15587a = i7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 670
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r31) {
        /*
            Method dump skipped, instructions count: 2128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1770E.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f15587a) {
            case 0:
                return new CameraPosition[i7];
            case 1:
                return new x[i7];
            case 2:
                return new y[i7];
            case 3:
                return new z[i7];
            case 4:
                return new C1767B[i7];
            case 5:
                return new C1769D[i7];
            case 6:
                return new C1776d[i7];
            case 7:
                return new C1778f[i7];
            case 8:
                return new C1789q[i7];
            case 9:
                return new C1783k[i7];
            case 10:
                return new LatLngBounds[i7];
            case 11:
                return new LatLng[i7];
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new C1785m[i7];
            case 13:
                return new C1787o[i7];
            case 14:
                return new C1788p[i7];
            case 15:
                return new C1790r[i7];
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return new v[i7];
            case 17:
                return new w[i7];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new C1886b[i7];
            case 19:
                return new v3.e[i7];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new v3.f[i7];
            case 21:
                return new v3.g[i7];
            case 22:
                return new C1949a[i7];
            case 23:
                return new C1985a[i7];
            case 24:
                return new C2033a[i7];
            case 25:
                return new C2034b[i7];
            case 26:
                return new C2042b[i7];
            case 27:
                return new C2043c[i7];
            case 28:
                return new H[i7];
            default:
                return new M[i7];
        }
    }
}
