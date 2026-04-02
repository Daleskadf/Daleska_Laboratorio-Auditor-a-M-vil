package n3;

import H4.e1;
import H4.p1;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import o3.EnumC1556a;
import org.apache.tika.utils.XMLReaderUtils;
import p3.C1662b;
import p3.C1663c;
import p3.C1664d;
import p3.C1665e;
import p3.C1667g;
/* loaded from: classes.dex */
public final class c0 implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14206a;

    public /* synthetic */ c0(int i7) {
        this.f14206a = i7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 762
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r42) {
        /*
            Method dump skipped, instructions count: 2456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.c0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f14206a) {
            case 0:
                return new b0[i7];
            case 1:
                return new EnumC1506u[i7];
            case 2:
                return new C1507v[i7];
            case 3:
                return new EnumC1556a[i7];
            case 4:
                return new o3.c[i7];
            case 5:
                return new o3.d[i7];
            case 6:
                return new o3.f[i7];
            case 7:
                return new o3.g[i7];
            case 8:
                return new RegisterRequestParams[i7];
            case 9:
                return new o3.h[i7];
            case 10:
                return new SignRequestParams[i7];
            case 11:
                return new p3.k[i7];
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new LocationAvailability[i7];
            case 13:
                return new p3.u[i7];
            case 14:
                return new LocationRequest[i7];
            case 15:
                return new LocationResult[i7];
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return new p3.p[i7];
            case 17:
                return new p3.r[i7];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new p3.s[i7];
            case 19:
                return new p3.w[i7];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new p3.t[i7];
            case 21:
                return new p3.x[i7];
            case 22:
                return new p3.y[i7];
            case 23:
                return new C1662b[i7];
            case 24:
                return new C1663c[i7];
            case 25:
                return new C1664d[i7];
            case 26:
                return new C1665e[i7];
            case 27:
                return new C1667g[i7];
            case 28:
                return new p3.j[i7];
            default:
                return new GoogleMapOptions[i7];
        }
    }
}
