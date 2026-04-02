package android.support.v4.media.session;

import H4.e1;
import H4.p1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c3.C0629a;
import c3.C0630b;
import c3.C0631c;
import com.google.android.gms.common.internal.C0758g;
import com.google.android.gms.common.internal.C0761j;
import com.google.android.gms.common.internal.C0762k;
import com.google.android.gms.common.internal.C0770t;
import com.google.android.gms.common.internal.C0773w;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.O;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.fido.common.Transport;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d.C0882d;
import d3.f;
import d3.g;
import d3.h;
import g.C0996a;
import g.C1001f;
import k0.C1381h;
import m5.d;
import n3.C1483P;
import n3.C1484Q;
import n3.C1485S;
import n3.C1508w;
import n3.EnumC1488c;
import n3.T;
import n3.d0;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7266a;

    public /* synthetic */ b(int i7) {
        this.f7266a = i7;
    }

    public static void a(C0762k c0762k, Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = c0762k.f9370a;
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        d.K(parcel, 2, 4);
        parcel.writeInt(c0762k.f9371b);
        d.K(parcel, 3, 4);
        parcel.writeInt(c0762k.f9372c);
        d.B(parcel, 4, c0762k.f9373d, false);
        d.v(parcel, 5, c0762k.f9374e);
        d.E(parcel, 6, c0762k.f, i7);
        d.q(parcel, 7, c0762k.f9367X, false);
        d.A(parcel, 8, c0762k.f9368Y, i7, false);
        d.E(parcel, 10, c0762k.f9369Z, i7);
        d.E(parcel, 11, c0762k.f9375e0, i7);
        d.K(parcel, 12, 4);
        parcel.writeInt(c0762k.f9376f0 ? 1 : 0);
        d.K(parcel, 13, 4);
        parcel.writeInt(c0762k.f9377g0);
        boolean z7 = c0762k.f9378h0;
        d.K(parcel, 14, 4);
        parcel.writeInt(z7 ? 1 : 0);
        d.B(parcel, 15, c0762k.f9379i0, false);
        d.J(G2, parcel);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 572
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r27) {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f7266a) {
            case 0:
                return new PlaybackStateCompat[i7];
            case 1:
                return new C0630b[i7];
            case 2:
                return new C0629a[i7];
            case 3:
                return new C0631c[i7];
            case 4:
                return new C0758g[i7];
            case 5:
                return new x[i7];
            case 6:
                return new C0770t[i7];
            case 7:
                return new D[i7];
            case 8:
                return new E[i7];
            case 9:
                return new C0773w[i7];
            case 10:
                return new O[i7];
            case 11:
                return new C0761j[i7];
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new C0762k[i7];
            case 13:
                return new C0882d[i7];
            case 14:
                return new g[i7];
            case 15:
                return new h[i7];
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return new f[i7];
            case 17:
                return new d3.d[i7];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new ParcelImpl[i7];
            case 19:
                return new C0996a[i7];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new C1001f[i7];
            case 21:
                return new C1381h[i7];
            case 22:
                return new Transport[i7];
            case 23:
                return new EnumC1488c[i7];
            case 24:
                return new d0[i7];
            case 25:
                return new C1483P[i7];
            case 26:
                return new C1484Q[i7];
            case 27:
                return new C1508w[i7];
            case 28:
                return new C1485S[i7];
            default:
                return new T[i7];
        }
    }
}
