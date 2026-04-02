package N2;

import H4.e1;
import H4.p1;
import R2.j;
import R2.k;
import R2.l;
import R2.m;
import R2.o;
import R2.p;
import U0.s;
import U0.t;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.libraries.barhopper.RecognitionOptions;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3395a;

    public /* synthetic */ f(int i7) {
        this.f3395a = i7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 697
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            Method dump skipped, instructions count: 2270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.f.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f3395a) {
            case 0:
                return new b[i7];
            case 1:
                return new c[i7];
            case 2:
                return new TokenData[i7];
            case 3:
                return new Q2.b[i7];
            case 4:
                return new Q2.d[i7];
            case 5:
                return new Q2.e[i7];
            case 6:
                return new Q2.f[i7];
            case 7:
                return new Q2.a[i7];
            case 8:
                return new AuthorizationRequest[i7];
            case 9:
                return new R2.a[i7];
            case 10:
                return new R2.f[i7];
            case 11:
                return new R2.g[i7];
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new R2.i[i7];
            case 13:
                return new j[i7];
            case 14:
                return new R2.b[i7];
            case 15:
                return new R2.c[i7];
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return new R2.d[i7];
            case 17:
                return new R2.e[i7];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new SaveAccountLinkingTokenRequest[i7];
            case 19:
                return new k[i7];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new l[i7];
            case 21:
                return new m[i7];
            case 22:
                return new o[i7];
            case 23:
                return new p[i7];
            case 24:
                return new T2.a[i7];
            case 25:
                return new T2.b[i7];
            case 26:
                return new t[i7];
            case 27:
                return new s[i7];
            case 28:
                return new V2.a[i7];
            default:
                return new SignInConfiguration[i7];
        }
    }
}
