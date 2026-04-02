package W2;

import H4.e1;
import H4.p1;
import Y1.C0411l;
import Y1.I;
import Y1.J;
import a3.C0445a;
import a3.C0446b;
import a3.C0447c;
import a4.C0448A;
import a4.C0449B;
import a4.C0451D;
import a4.C0454c;
import a4.C0457f;
import a4.C0458g;
import a4.C0469s;
import a4.E;
import a4.G;
import a4.K;
import a4.v;
import a4.x;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import com.google.android.libraries.barhopper.RecognitionOptions;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6187a;

    public /* synthetic */ m(int i7) {
        this.f6187a = i7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 561
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            Method dump skipped, instructions count: 1560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.m.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f6187a) {
            case 0:
                return new b[i7];
            case 1:
                return new d[i7];
            case 2:
                return new C0411l[i7];
            case 3:
                return new I[i7];
            case 4:
                return new J[i7];
            case 5:
                return new C0445a[i7];
            case 6:
                return new C0446b[i7];
            case 7:
                return new C0447c[i7];
            case 8:
                return new a4.r[i7];
            case 9:
                return new C0469s[i7];
            case 10:
                return new a4.J[i7];
            case 11:
                return new v[i7];
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return new C0448A[i7];
            case 13:
                return new C0449B[i7];
            case 14:
                return new C0451D[i7];
            case 15:
                return new E[i7];
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return new G[i7];
            case 17:
                return new C0454c[i7];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new x[i7];
            case 19:
                return new K[i7];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new C0457f[i7];
            case 21:
                return new C0458g[i7];
            case 22:
                return new MediaBrowserCompat$MediaItem[i7];
            case 23:
                return new MediaDescriptionCompat[i7];
            case 24:
                return new MediaMetadataCompat[i7];
            case 25:
                return new RatingCompat[i7];
            case 26:
                return new MediaSessionCompat$QueueItem[i7];
            case 27:
                return new MediaSessionCompat$ResultReceiverWrapper[i7];
            case 28:
                return new MediaSessionCompat$Token[i7];
            default:
                return new ParcelableVolumeInfo[i7];
        }
    }
}
