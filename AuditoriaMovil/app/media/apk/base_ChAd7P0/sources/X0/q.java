package X0;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class q extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final String f6293a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6294b;

    /* renamed from: c  reason: collision with root package name */
    public final m f6295c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6296d;

    public q(H0.r rVar, w wVar, boolean z7, int i7) {
        this("Decoder init failed: [" + i7 + "], " + rVar, wVar, rVar.f1886m, z7, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : StringUtils.EMPTY) + Math.abs(i7));
    }

    public q(String str, Throwable th, String str2, boolean z7, m mVar, String str3) {
        super(str, th);
        this.f6293a = str2;
        this.f6294b = z7;
        this.f6295c = mVar;
        this.f6296d = str3;
    }
}
