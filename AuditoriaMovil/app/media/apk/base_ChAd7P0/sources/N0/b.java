package N0;

import M0.x;
import android.media.MediaCodec;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f3337a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f3338b;

    /* renamed from: c  reason: collision with root package name */
    public int f3339c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f3340d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f3341e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f3342g;

    /* renamed from: h  reason: collision with root package name */
    public int f3343h;

    /* renamed from: i  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f3344i;
    public final x j;

    public b() {
        x xVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f3344i = cryptoInfo;
        if (K0.x.f2529a >= 24) {
            xVar = new x(cryptoInfo);
        } else {
            xVar = null;
        }
        this.j = xVar;
    }
}
