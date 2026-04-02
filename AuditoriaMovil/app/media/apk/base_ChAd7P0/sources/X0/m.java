package X0;

import H0.C0130j;
import H0.I;
import O0.C0245g;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h3.AbstractC1079a;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f6286a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6287b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6288c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f6289d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6290e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6291g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6292h;

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9) {
        str.getClass();
        this.f6286a = str;
        this.f6287b = str2;
        this.f6288c = str3;
        this.f6289d = codecCapabilities;
        this.f6291g = z7;
        this.f6290e = z8;
        this.f = z9;
        this.f6292h = I.k(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(K0.x.g(i7, widthAlignment) * widthAlignment, K0.x.g(i8, heightAlignment) * heightAlignment);
        int i9 = point.x;
        int i10 = point.y;
        if (d7 != -1.0d && d7 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d7));
        }
        return videoCapabilities.isSizeSupported(i9, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ("Nexus 10".equals(r1) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X0.m h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            X0.m r13 = new X0.m
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L39
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r11.isFeatureSupported(r1)
            if (r1 == 0) goto L39
            int r1 = K0.x.f2529a
            r2 = 22
            if (r1 > r2) goto L37
            java.lang.String r1 = K0.x.f2532d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L26
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L37
        L26:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L39
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L37
            goto L39
        L37:
            r6 = r0
            goto L3a
        L39:
            r6 = r14
        L3a:
            r1 = 21
            if (r11 == 0) goto L48
            int r2 = K0.x.f2529a
            if (r2 < r1) goto L48
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L48:
            if (r15 != 0) goto L5b
            if (r11 == 0) goto L59
            int r15 = K0.x.f2529a
            if (r15 < r1) goto L59
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L59
            goto L5b
        L59:
            r7 = r14
            goto L5c
        L5b:
            r7 = r0
        L5c:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.m.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):X0.m");
    }

    public final C0245g b(H0.r rVar, H0.r rVar2) {
        int i7;
        int i8;
        if (!K0.x.a(rVar.f1886m, rVar2.f1886m)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        if (this.f6292h) {
            if (rVar.f1895v != rVar2.f1895v) {
                i7 |= RecognitionOptions.UPC_E;
            }
            if (!this.f6290e && (rVar.f1892s != rVar2.f1892s || rVar.f1893t != rVar2.f1893t)) {
                i7 |= RecognitionOptions.UPC_A;
            }
            C0130j c0130j = rVar.f1899z;
            boolean e7 = C0130j.e(c0130j);
            C0130j c0130j2 = rVar2.f1899z;
            if ((!e7 || !C0130j.e(c0130j2)) && !K0.x.a(c0130j, c0130j2)) {
                i7 |= RecognitionOptions.PDF417;
            }
            if (K0.x.f2532d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f6286a) && !rVar.c(rVar2)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                if (rVar.c(rVar2)) {
                    i8 = 3;
                } else {
                    i8 = 2;
                }
                return new C0245g(this.f6286a, rVar, rVar2, i8, 0);
            }
        } else {
            if (rVar.f1865A != rVar2.f1865A) {
                i7 |= RecognitionOptions.AZTEC;
            }
            if (rVar.f1866B != rVar2.f1866B) {
                i7 |= 8192;
            }
            if (rVar.f1867C != rVar2.f1867C) {
                i7 |= 16384;
            }
            String str = this.f6287b;
            if (i7 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d7 = z.d(rVar);
                Pair d8 = z.d(rVar2);
                if (d7 != null && d8 != null) {
                    int intValue = ((Integer) d7.first).intValue();
                    int intValue2 = ((Integer) d8.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C0245g(this.f6286a, rVar, rVar2, 3, 0);
                    }
                }
            }
            if (!rVar.c(rVar2)) {
                i7 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new C0245g(this.f6286a, rVar, rVar2, 1, 0);
            }
        }
        return new C0245g(this.f6286a, rVar, rVar2, 0, i7);
    }

    public final boolean c(H0.r rVar, boolean z7) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i7;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d7 = z.d(rVar);
        if (d7 == null) {
            return true;
        }
        int intValue = ((Integer) d7.first).intValue();
        int intValue2 = ((Integer) d7.second).intValue();
        boolean equals = "video/dolby-vision".equals(rVar.f1886m);
        int i8 = 8;
        String str = this.f6287b;
        if (equals) {
            if ("video/avc".equals(str)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(str)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.f6292h && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6289d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (K0.x.f2529a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                i7 = videoCapabilities.getBitrateRange().getUpper().intValue();
            } else {
                i7 = 0;
            }
            if (i7 >= 180000000) {
                i8 = RecognitionOptions.UPC_E;
            } else if (i7 >= 120000000) {
                i8 = RecognitionOptions.UPC_A;
            } else if (i7 >= 60000000) {
                i8 = RecognitionOptions.QR_CODE;
            } else if (i7 >= 30000000) {
                i8 = RecognitionOptions.ITF;
            } else if (i7 >= 18000000) {
                i8 = 64;
            } else if (i7 >= 12000000) {
                i8 = 32;
            } else if (i7 >= 7200000) {
                i8 = 16;
            } else if (i7 < 3600000) {
                if (i7 >= 1800000) {
                    i8 = 4;
                } else if (i7 >= 800000) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i8;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z7)) {
                if ("video/hevc".equals(str) && 2 == intValue) {
                    String str2 = K0.x.f2530b;
                    if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + rVar.j + ", " + this.f6288c);
        return false;
    }

    public final boolean d(H0.r rVar) {
        boolean z7;
        int i7;
        int i8;
        String str = rVar.f1886m;
        String str2 = this.f6287b;
        boolean z8 = true;
        if (!str2.equals(str) && !str2.equals(z.b(rVar))) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (!z7 || !c(rVar, true)) {
            return false;
        }
        if (this.f6292h) {
            int i9 = rVar.f1892s;
            if (i9 > 0 && (i8 = rVar.f1893t) > 0) {
                if (K0.x.f2529a >= 21) {
                    return f(i9, i8, rVar.f1894u);
                }
                if (i9 * i8 > z.j()) {
                    z8 = false;
                }
                if (!z8) {
                    g("legacyFrameSize, " + i9 + "x" + i8);
                }
            }
            return z8;
        }
        int i10 = K0.x.f2529a;
        if (i10 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6289d;
        int i11 = rVar.f1866B;
        if (i11 != -1) {
            if (codecCapabilities == null) {
                g("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i11)) {
                    g("sampleRate.support, " + i11);
                }
            }
            return false;
        }
        int i12 = rVar.f1865A;
        if (i12 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            g("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i10 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i7 = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i7 = 16;
                    } else {
                        i7 = 30;
                    }
                    K0.a.A("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f6286a + ", [" + maxInputChannelCount + " to " + i7 + "]");
                    maxInputChannelCount = i7;
                }
                if (maxInputChannelCount >= i12) {
                    return true;
                }
                g("channelCount.support, " + i12);
            }
        }
        return false;
    }

    public final boolean e(H0.r rVar) {
        if (this.f6292h) {
            return this.f6290e;
        }
        Pair d7 = z.d(rVar);
        if (d7 != null && ((Integer) d7.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i7, int i8, double d7) {
        int i9;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6289d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        int i10 = K0.x.f2529a;
        if (i10 >= 29) {
            if (i10 >= 29 && ((bool = AbstractC1079a.f11334c) == null || !bool.booleanValue())) {
                i9 = n.a(videoCapabilities, i7, i8, d7);
            } else {
                i9 = 0;
            }
            if (i9 == 2) {
                return true;
            }
            if (i9 == 1) {
                g("sizeAndRate.cover, " + i7 + "x" + i8 + "@" + d7);
                return false;
            }
        }
        if (!a(videoCapabilities, i7, i8, d7)) {
            if (i7 < i8) {
                String str = this.f6286a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(K0.x.f2530b)) && a(videoCapabilities, i8, i7, d7)) {
                    StringBuilder l8 = io.flutter.plugins.pathprovider.b.l("AssumedSupport [", "sizeAndRate.rotated, " + i7 + "x" + i8 + "@" + d7, "] [", str, ", ");
                    l8.append(this.f6287b);
                    l8.append("] [");
                    l8.append(K0.x.f2533e);
                    l8.append("]");
                    K0.a.m("MediaCodecInfo", l8.toString());
                }
            }
            g("sizeAndRate.support, " + i7 + "x" + i8 + "@" + d7);
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder m7 = Y.m("NoSupport [", str, "] [");
        m7.append(this.f6286a);
        m7.append(", ");
        m7.append(this.f6287b);
        m7.append("] [");
        m7.append(K0.x.f2533e);
        m7.append("]");
        K0.a.m("MediaCodecInfo", m7.toString());
    }

    public final String toString() {
        return this.f6286a;
    }
}
