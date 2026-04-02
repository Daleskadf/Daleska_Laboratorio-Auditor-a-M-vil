package X0;

import A3.H;
import A3.K;
import A3.e0;
import B5.S;
import H0.I;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f6369a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f6370b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static int f6371c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (K0.x.f2529a < 26 && K0.x.f2530b.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).f6286a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new K.a(new u(1), 1));
        }
        int i7 = K0.x.f2529a;
        if (i7 < 21 && arrayList.size() > 1) {
            String str2 = ((m) arrayList.get(0)).f6286a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new K.a(new u(2), 1));
            }
        }
        if (i7 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).f6286a)) {
            arrayList.add((m) arrayList.remove(0));
        }
    }

    public static String b(H0.r rVar) {
        Pair d7;
        if ("audio/eac3-joc".equals(rVar.f1886m)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(rVar.f1886m) && (d7 = d(rVar)) != null) {
            int intValue = ((Integer) d7.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                if (intValue == 1024) {
                    return "video/av01";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:154:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x037f A[Catch: NumberFormatException -> 0x0390, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x0390, blocks: (B:249:0x0334, B:251:0x0346, B:263:0x0365, B:274:0x037f), top: B:559:0x0334 }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:571:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(H0.r r25) {
        /*
            Method dump skipped, instructions count: 2436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.z.d(H0.r):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z7, boolean z8) {
        x iVar;
        synchronized (z.class) {
            try {
                v vVar = new v(str, z7, z8);
                HashMap hashMap = f6370b;
                List list = (List) hashMap.get(vVar);
                if (list != null) {
                    return list;
                }
                int i7 = K0.x.f2529a;
                if (i7 >= 21) {
                    iVar = new S(z7, z8);
                } else {
                    iVar = new t2.i(11);
                }
                ArrayList f = f(vVar, iVar);
                if (z7 && f.isEmpty() && 21 <= i7 && i7 <= 23) {
                    f = f(vVar, new t2.i(11));
                    if (!f.isEmpty()) {
                        K0.a.A("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((m) f.get(0)).f6286a);
                    }
                }
                a(str, f);
                K p7 = K.p(f);
                hashMap.put(vVar, p7);
                return p7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r8 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(X0.v r23, X0.x r24) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.z.f(X0.v, X0.x):java.util.ArrayList");
    }

    public static e0 g(u uVar, H0.r rVar, boolean z7, boolean z8) {
        Iterable e7;
        String str = rVar.f1886m;
        uVar.getClass();
        List e8 = e(str, z7, z8);
        String b5 = b(rVar);
        if (b5 == null) {
            e7 = e0.f138e;
        } else {
            uVar.getClass();
            e7 = e(b5, z7, z8);
        }
        H o7 = K.o();
        o7.d(e8);
        o7.d(e7);
        return o7.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z7, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z7 && str.endsWith(".secure"))) {
            return false;
        }
        int i7 = K0.x.f2529a;
        if (i7 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(K0.x.f2531c))) {
            String str3 = K0.x.f2530b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i7 == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(K0.x.f2531c)) {
            String str4 = K0.x.f2530b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i7 == 19 && K0.x.f2530b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i7 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (K0.x.f2529a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        } else if (I.h(str)) {
            return true;
        } else {
            String A7 = AbstractC1740d.A(mediaCodecInfo.getName());
            if (A7.startsWith("arc.")) {
                return false;
            }
            if (A7.startsWith("omx.google.") || A7.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((A7.startsWith("omx.sec.") && A7.contains(".sw.")) || A7.equals("omx.qcom.video.decoder.hevcswvdec") || A7.startsWith("c2.android.") || A7.startsWith("c2.google.")) {
                return true;
            }
            if (!A7.startsWith("omx.") && !A7.startsWith("c2.")) {
                return true;
            }
            return false;
        }
    }

    public static int j() {
        m mVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i7;
        int i8;
        if (f6371c == -1) {
            int i9 = 0;
            List e7 = e("video/avc", false, false);
            if (e7.isEmpty()) {
                mVar = null;
            } else {
                mVar = (m) e7.get(0);
            }
            if (mVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f6289d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i10 = 0;
                while (i9 < length) {
                    int i11 = codecProfileLevelArr[i9].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case RecognitionOptions.DATA_MATRIX /* 16 */:
                            case RecognitionOptions.EAN_13 /* 32 */:
                                i8 = 101376;
                                continue;
                            case RecognitionOptions.EAN_8 /* 64 */:
                                i8 = 202752;
                                continue;
                            case RecognitionOptions.ITF /* 128 */:
                            case RecognitionOptions.QR_CODE /* 256 */:
                                i8 = 414720;
                                continue;
                            case RecognitionOptions.UPC_A /* 512 */:
                                i8 = 921600;
                                continue;
                            case RecognitionOptions.UPC_E /* 1024 */:
                                i8 = 1310720;
                                continue;
                            case RecognitionOptions.PDF417 /* 2048 */:
                            case RecognitionOptions.AZTEC /* 4096 */:
                                i8 = 2097152;
                                continue;
                            case 8192:
                                i8 = 2228224;
                                continue;
                            case 16384:
                                i8 = 5652480;
                                continue;
                            case RecognitionOptions.TEZ_CODE /* 32768 */:
                            case 65536:
                                i8 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i8 = 35651584;
                                continue;
                            default:
                                i8 = -1;
                                continue;
                        }
                    } else {
                        i8 = 25344;
                    }
                    i10 = Math.max(i8, i10);
                    i9++;
                }
                if (K0.x.f2529a >= 21) {
                    i7 = 345600;
                } else {
                    i7 = 172800;
                }
                i9 = Math.max(i10, i7);
            }
            f6371c = i9;
        }
        return f6371c;
    }
}
