package x0;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.tika.utils.StringUtils;
/* renamed from: x0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1982h {

    /* renamed from: U  reason: collision with root package name */
    public static final C1979e f16454U;

    /* renamed from: V  reason: collision with root package name */
    public static final C1979e[][] f16455V;

    /* renamed from: W  reason: collision with root package name */
    public static final C1979e[] f16456W;

    /* renamed from: X  reason: collision with root package name */
    public static final HashMap[] f16457X;

    /* renamed from: Y  reason: collision with root package name */
    public static final HashMap[] f16458Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final HashSet f16459Z;

    /* renamed from: a0  reason: collision with root package name */
    public static final HashMap f16460a0;
    public static final Charset b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final byte[] f16461c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f16462d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final Pattern f16463e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final Pattern f16464f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final Pattern f16465g0;

    /* renamed from: a  reason: collision with root package name */
    public final String f16473a;

    /* renamed from: b  reason: collision with root package name */
    public final FileDescriptor f16474b;

    /* renamed from: c  reason: collision with root package name */
    public final AssetManager.AssetInputStream f16475c;

    /* renamed from: d  reason: collision with root package name */
    public int f16476d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap[] f16477e;
    public final HashSet f;

    /* renamed from: g  reason: collision with root package name */
    public ByteOrder f16478g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16479h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16480i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public int f16481k;

    /* renamed from: l  reason: collision with root package name */
    public int f16482l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f16483m;

    /* renamed from: n  reason: collision with root package name */
    public int f16484n;

    /* renamed from: o  reason: collision with root package name */
    public int f16485o;

    /* renamed from: p  reason: collision with root package name */
    public int f16486p;

    /* renamed from: q  reason: collision with root package name */
    public int f16487q;

    /* renamed from: r  reason: collision with root package name */
    public int f16488r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f16489s;

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f16466t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u  reason: collision with root package name */
    public static final List f16467u = Arrays.asList(1, 6, 3, 8);

    /* renamed from: v  reason: collision with root package name */
    public static final List f16468v = Arrays.asList(2, 7, 4, 5);

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f16469w = {8, 8, 8};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f16470x = {8};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f16471y = {-1, -40, -1};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f16472z = {102, 116, 121, 112};

    /* renamed from: A  reason: collision with root package name */
    public static final byte[] f16434A = {109, 105, 102, 49};

    /* renamed from: B  reason: collision with root package name */
    public static final byte[] f16435B = {104, 101, 105, 99};

    /* renamed from: C  reason: collision with root package name */
    public static final byte[] f16436C = {79, 76, 89, 77, 80, 0};

    /* renamed from: D  reason: collision with root package name */
    public static final byte[] f16437D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: E  reason: collision with root package name */
    public static final byte[] f16438E = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: F  reason: collision with root package name */
    public static final byte[] f16439F = {101, 88, 73, 102};

    /* renamed from: G  reason: collision with root package name */
    public static final byte[] f16440G = {73, 72, 68, 82};

    /* renamed from: H  reason: collision with root package name */
    public static final byte[] f16441H = {73, 69, 78, 68};

    /* renamed from: I  reason: collision with root package name */
    public static final byte[] f16442I = {82, 73, 70, 70};

    /* renamed from: J  reason: collision with root package name */
    public static final byte[] f16443J = {87, 69, 66, 80};

    /* renamed from: K  reason: collision with root package name */
    public static final byte[] f16444K = {69, 88, 73, 70};

    /* renamed from: L  reason: collision with root package name */
    public static final byte[] f16445L = {-99, 1, 42};

    /* renamed from: M  reason: collision with root package name */
    public static final byte[] f16446M = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: N  reason: collision with root package name */
    public static final byte[] f16447N = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: O  reason: collision with root package name */
    public static final byte[] f16448O = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: P  reason: collision with root package name */
    public static final byte[] f16449P = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: Q  reason: collision with root package name */
    public static final byte[] f16450Q = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: R  reason: collision with root package name */
    public static final String[] f16451R = {StringUtils.EMPTY, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: S  reason: collision with root package name */
    public static final int[] f16452S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: T  reason: collision with root package name */
    public static final byte[] f16453T = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        C1979e[] c1979eArr;
        C1979e[] c1979eArr2 = {new C1979e("NewSubfileType", 254, 4), new C1979e("SubfileType", 255, 4), new C1979e(RecognitionOptions.QR_CODE, 3, 4, "ImageWidth"), new C1979e(257, 3, 4, "ImageLength"), new C1979e("BitsPerSample", 258, 3), new C1979e("Compression", 259, 3), new C1979e("PhotometricInterpretation", 262, 3), new C1979e("ImageDescription", 270, 2), new C1979e("Make", 271, 2), new C1979e("Model", 272, 2), new C1979e(273, 3, 4, "StripOffsets"), new C1979e("Orientation", 274, 3), new C1979e("SamplesPerPixel", 277, 3), new C1979e(278, 3, 4, "RowsPerStrip"), new C1979e(279, 3, 4, "StripByteCounts"), new C1979e("XResolution", 282, 5), new C1979e("YResolution", 283, 5), new C1979e("PlanarConfiguration", 284, 3), new C1979e("ResolutionUnit", 296, 3), new C1979e("TransferFunction", 301, 3), new C1979e("Software", 305, 2), new C1979e("DateTime", 306, 2), new C1979e("Artist", 315, 2), new C1979e("WhitePoint", 318, 5), new C1979e("PrimaryChromaticities", 319, 5), new C1979e("SubIFDPointer", 330, 4), new C1979e("JPEGInterchangeFormat", 513, 4), new C1979e("JPEGInterchangeFormatLength", 514, 4), new C1979e("YCbCrCoefficients", 529, 5), new C1979e("YCbCrSubSampling", 530, 3), new C1979e("YCbCrPositioning", 531, 3), new C1979e("ReferenceBlackWhite", 532, 5), new C1979e("Copyright", 33432, 2), new C1979e("ExifIFDPointer", 34665, 4), new C1979e("GPSInfoIFDPointer", 34853, 4), new C1979e("SensorTopBorder", 4, 4), new C1979e("SensorLeftBorder", 5, 4), new C1979e("SensorBottomBorder", 6, 4), new C1979e("SensorRightBorder", 7, 4), new C1979e("ISO", 23, 3), new C1979e("JpgFromRaw", 46, 7), new C1979e("Xmp", 700, 1)};
        f16454U = new C1979e("StripOffsets", 273, 3);
        f16455V = new C1979e[][]{c1979eArr2, new C1979e[]{new C1979e("ExposureTime", 33434, 5), new C1979e("FNumber", 33437, 5), new C1979e("ExposureProgram", 34850, 3), new C1979e("SpectralSensitivity", 34852, 2), new C1979e("PhotographicSensitivity", 34855, 3), new C1979e("OECF", 34856, 7), new C1979e("SensitivityType", 34864, 3), new C1979e("StandardOutputSensitivity", 34865, 4), new C1979e("RecommendedExposureIndex", 34866, 4), new C1979e("ISOSpeed", 34867, 4), new C1979e("ISOSpeedLatitudeyyy", 34868, 4), new C1979e("ISOSpeedLatitudezzz", 34869, 4), new C1979e("ExifVersion", 36864, 2), new C1979e("DateTimeOriginal", 36867, 2), new C1979e("DateTimeDigitized", 36868, 2), new C1979e("OffsetTime", 36880, 2), new C1979e("OffsetTimeOriginal", 36881, 2), new C1979e("OffsetTimeDigitized", 36882, 2), new C1979e("ComponentsConfiguration", 37121, 7), new C1979e("CompressedBitsPerPixel", 37122, 5), new C1979e("ShutterSpeedValue", 37377, 10), new C1979e("ApertureValue", 37378, 5), new C1979e("BrightnessValue", 37379, 10), new C1979e("ExposureBiasValue", 37380, 10), new C1979e("MaxApertureValue", 37381, 5), new C1979e("SubjectDistance", 37382, 5), new C1979e("MeteringMode", 37383, 3), new C1979e("LightSource", 37384, 3), new C1979e("Flash", 37385, 3), new C1979e("FocalLength", 37386, 5), new C1979e("SubjectArea", 37396, 3), new C1979e("MakerNote", 37500, 7), new C1979e("UserComment", 37510, 7), new C1979e("SubSecTime", 37520, 2), new C1979e("SubSecTimeOriginal", 37521, 2), new C1979e("SubSecTimeDigitized", 37522, 2), new C1979e("FlashpixVersion", 40960, 7), new C1979e("ColorSpace", 40961, 3), new C1979e(40962, 3, 4, "PixelXDimension"), new C1979e(40963, 3, 4, "PixelYDimension"), new C1979e("RelatedSoundFile", 40964, 2), new C1979e("InteroperabilityIFDPointer", 40965, 4), new C1979e("FlashEnergy", 41483, 5), new C1979e("SpatialFrequencyResponse", 41484, 7), new C1979e("FocalPlaneXResolution", 41486, 5), new C1979e("FocalPlaneYResolution", 41487, 5), new C1979e("FocalPlaneResolutionUnit", 41488, 3), new C1979e("SubjectLocation", 41492, 3), new C1979e("ExposureIndex", 41493, 5), new C1979e("SensingMethod", 41495, 3), new C1979e("FileSource", 41728, 7), new C1979e("SceneType", 41729, 7), new C1979e("CFAPattern", 41730, 7), new C1979e("CustomRendered", 41985, 3), new C1979e("ExposureMode", 41986, 3), new C1979e("WhiteBalance", 41987, 3), new C1979e("DigitalZoomRatio", 41988, 5), new C1979e("FocalLengthIn35mmFilm", 41989, 3), new C1979e("SceneCaptureType", 41990, 3), new C1979e("GainControl", 41991, 3), new C1979e("Contrast", 41992, 3), new C1979e("Saturation", 41993, 3), new C1979e("Sharpness", 41994, 3), new C1979e("DeviceSettingDescription", 41995, 7), new C1979e("SubjectDistanceRange", 41996, 3), new C1979e("ImageUniqueID", 42016, 2), new C1979e("CameraOwnerName", 42032, 2), new C1979e("BodySerialNumber", 42033, 2), new C1979e("LensSpecification", 42034, 5), new C1979e("LensMake", 42035, 2), new C1979e("LensModel", 42036, 2), new C1979e("Gamma", 42240, 5), new C1979e("DNGVersion", 50706, 1), new C1979e(50720, 3, 4, "DefaultCropSize")}, new C1979e[]{new C1979e("GPSVersionID", 0, 1), new C1979e("GPSLatitudeRef", 1, 2), new C1979e(2, 5, 10, "GPSLatitude"), new C1979e("GPSLongitudeRef", 3, 2), new C1979e(4, 5, 10, "GPSLongitude"), new C1979e("GPSAltitudeRef", 5, 1), new C1979e("GPSAltitude", 6, 5), new C1979e("GPSTimeStamp", 7, 5), new C1979e("GPSSatellites", 8, 2), new C1979e("GPSStatus", 9, 2), new C1979e("GPSMeasureMode", 10, 2), new C1979e("GPSDOP", 11, 5), new C1979e("GPSSpeedRef", 12, 2), new C1979e("GPSSpeed", 13, 5), new C1979e("GPSTrackRef", 14, 2), new C1979e("GPSTrack", 15, 5), new C1979e("GPSImgDirectionRef", 16, 2), new C1979e("GPSImgDirection", 17, 5), new C1979e("GPSMapDatum", 18, 2), new C1979e("GPSDestLatitudeRef", 19, 2), new C1979e("GPSDestLatitude", 20, 5), new C1979e("GPSDestLongitudeRef", 21, 2), new C1979e("GPSDestLongitude", 22, 5), new C1979e("GPSDestBearingRef", 23, 2), new C1979e("GPSDestBearing", 24, 5), new C1979e("GPSDestDistanceRef", 25, 2), new C1979e("GPSDestDistance", 26, 5), new C1979e("GPSProcessingMethod", 27, 7), new C1979e("GPSAreaInformation", 28, 7), new C1979e("GPSDateStamp", 29, 2), new C1979e("GPSDifferential", 30, 3), new C1979e("GPSHPositioningError", 31, 5)}, new C1979e[]{new C1979e("InteroperabilityIndex", 1, 2)}, new C1979e[]{new C1979e("NewSubfileType", 254, 4), new C1979e("SubfileType", 255, 4), new C1979e(RecognitionOptions.QR_CODE, 3, 4, "ThumbnailImageWidth"), new C1979e(257, 3, 4, "ThumbnailImageLength"), new C1979e("BitsPerSample", 258, 3), new C1979e("Compression", 259, 3), new C1979e("PhotometricInterpretation", 262, 3), new C1979e("ImageDescription", 270, 2), new C1979e("Make", 271, 2), new C1979e("Model", 272, 2), new C1979e(273, 3, 4, "StripOffsets"), new C1979e("ThumbnailOrientation", 274, 3), new C1979e("SamplesPerPixel", 277, 3), new C1979e(278, 3, 4, "RowsPerStrip"), new C1979e(279, 3, 4, "StripByteCounts"), new C1979e("XResolution", 282, 5), new C1979e("YResolution", 283, 5), new C1979e("PlanarConfiguration", 284, 3), new C1979e("ResolutionUnit", 296, 3), new C1979e("TransferFunction", 301, 3), new C1979e("Software", 305, 2), new C1979e("DateTime", 306, 2), new C1979e("Artist", 315, 2), new C1979e("WhitePoint", 318, 5), new C1979e("PrimaryChromaticities", 319, 5), new C1979e("SubIFDPointer", 330, 4), new C1979e("JPEGInterchangeFormat", 513, 4), new C1979e("JPEGInterchangeFormatLength", 514, 4), new C1979e("YCbCrCoefficients", 529, 5), new C1979e("YCbCrSubSampling", 530, 3), new C1979e("YCbCrPositioning", 531, 3), new C1979e("ReferenceBlackWhite", 532, 5), new C1979e("Copyright", 33432, 2), new C1979e("ExifIFDPointer", 34665, 4), new C1979e("GPSInfoIFDPointer", 34853, 4), new C1979e("DNGVersion", 50706, 1), new C1979e(50720, 3, 4, "DefaultCropSize")}, c1979eArr2, new C1979e[]{new C1979e("ThumbnailImage", RecognitionOptions.QR_CODE, 7), new C1979e("CameraSettingsIFDPointer", 8224, 4), new C1979e("ImageProcessingIFDPointer", 8256, 4)}, new C1979e[]{new C1979e("PreviewImageStart", 257, 4), new C1979e("PreviewImageLength", 258, 4)}, new C1979e[]{new C1979e("AspectFrame", 4371, 3)}, new C1979e[]{new C1979e("ColorSpace", 55, 3)}};
        f16456W = new C1979e[]{new C1979e("SubIFDPointer", 330, 4), new C1979e("ExifIFDPointer", 34665, 4), new C1979e("GPSInfoIFDPointer", 34853, 4), new C1979e("InteroperabilityIFDPointer", 40965, 4), new C1979e("CameraSettingsIFDPointer", 8224, 1), new C1979e("ImageProcessingIFDPointer", 8256, 1)};
        f16457X = new HashMap[10];
        f16458Y = new HashMap[10];
        f16459Z = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f16460a0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        b0 = forName;
        f16461c0 = "Exif\u0000\u0000".getBytes(forName);
        f16462d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i7 = 0;
        while (true) {
            C1979e[][] c1979eArr3 = f16455V;
            if (i7 < c1979eArr3.length) {
                f16457X[i7] = new HashMap();
                f16458Y[i7] = new HashMap();
                for (C1979e c1979e : c1979eArr3[i7]) {
                    f16457X[i7].put(Integer.valueOf(c1979e.f16428a), c1979e);
                    f16458Y[i7].put(c1979e.f16429b, c1979e);
                }
                i7++;
            } else {
                HashMap hashMap = f16460a0;
                C1979e[] c1979eArr4 = f16456W;
                hashMap.put(Integer.valueOf(c1979eArr4[0].f16428a), 5);
                hashMap.put(Integer.valueOf(c1979eArr4[1].f16428a), 1);
                hashMap.put(Integer.valueOf(c1979eArr4[2].f16428a), 2);
                hashMap.put(Integer.valueOf(c1979eArr4[3].f16428a), 3);
                hashMap.put(Integer.valueOf(c1979eArr4[4].f16428a), 7);
                hashMap.put(Integer.valueOf(c1979eArr4[5].f16428a), 8);
                Pattern.compile(".*[1-9].*");
                f16463e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f16464f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f16465g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C1982h(String str) {
        FileInputStream fileInputStream;
        boolean z7;
        C1979e[][] c1979eArr = f16455V;
        this.f16477e = new HashMap[c1979eArr.length];
        this.f = new HashSet(c1979eArr.length);
        this.f16478g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.f16475c = null;
            this.f16473a = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    AbstractC1983i.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    z7 = true;
                } catch (Exception unused) {
                    if (f16466t) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z7 = false;
                }
                if (z7) {
                    this.f16474b = fileInputStream.getFD();
                } else {
                    this.f16474b = null;
                }
                r(fileInputStream);
                G.i.q(fileInputStream);
                return;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                G.i.q(fileInputStream2);
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }

    public static Pair o(String str) {
        int intValue;
        int i7;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair o7 = o(split[0]);
            if (((Integer) o7.first).intValue() == 2) {
                return o7;
            }
            for (int i8 = 1; i8 < split.length; i8++) {
                Pair o8 = o(split[i8]);
                if (!((Integer) o8.first).equals(o7.first) && !((Integer) o8.second).equals(o7.first)) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) o7.first).intValue();
                }
                if (((Integer) o7.second).intValue() != -1 && (((Integer) o8.first).equals(o7.second) || ((Integer) o8.second).equals(o7.second))) {
                    i7 = ((Integer) o7.second).intValue();
                } else {
                    i7 = -1;
                }
                if (intValue == -1 && i7 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    o7 = new Pair(Integer.valueOf(i7), -1);
                } else if (i7 == -1) {
                    o7 = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return o7;
        } else if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair(2, -1);
        } else {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    int i9 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                    if (i9 >= 0 && parseLong <= 65535) {
                        return new Pair(3, 4);
                    }
                    if (i9 < 0) {
                        return new Pair(9, -1);
                    }
                    return new Pair(4, -1);
                } catch (NumberFormatException unused2) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused3) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
    }

    public static ByteOrder u(C1976b c1976b) {
        short readShort = c1976b.readShort();
        boolean z7 = f16466t;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z7) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z7) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void A(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (f16466t) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        C1976b c1976b = new C1976b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C1977c c1977c = new C1977c(bufferedOutputStream, byteOrder);
        byte[] bArr = f16438E;
        G.i.t(c1976b, c1977c, bArr.length);
        int i7 = this.f16485o;
        if (i7 == 0) {
            int readInt = c1976b.readInt();
            c1977c.b(readInt);
            G.i.t(c1976b, c1977c, readInt + 8);
        } else {
            G.i.t(c1976b, c1977c, (i7 - bArr.length) - 8);
            c1976b.a(c1976b.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C1977c c1977c2 = new C1977c(byteArrayOutputStream2, byteOrder);
                G(c1977c2);
                byte[] byteArray = ((ByteArrayOutputStream) c1977c2.f16422a).toByteArray();
                c1977c.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                c1977c.b((int) crc32.getValue());
                G.i.q(byteArrayOutputStream2);
                G.i.s(c1976b, c1977c);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                G.i.q(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void B(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        int i7;
        int i8;
        int i9;
        boolean z7;
        int i10;
        C1977c c1977c;
        byte[] bArr;
        int i11;
        boolean z8;
        if (f16466t) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C1976b c1976b = new C1976b(bufferedInputStream, byteOrder);
        C1977c c1977c2 = new C1977c(bufferedOutputStream, byteOrder);
        byte[] bArr2 = f16442I;
        G.i.t(c1976b, c1977c2, bArr2.length);
        byte[] bArr3 = f16443J;
        c1976b.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            C1977c c1977c3 = new C1977c(byteArrayOutputStream, byteOrder);
            int i12 = this.f16485o;
            if (i12 != 0) {
                G.i.t(c1976b, c1977c3, (i12 - ((bArr2.length + 4) + bArr3.length)) - 8);
                c1976b.a(4);
                int readInt = c1976b.readInt();
                if (readInt % 2 != 0) {
                    readInt++;
                }
                c1976b.a(readInt);
                G(c1977c3);
            } else {
                byte[] bArr4 = new byte[4];
                c1976b.readFully(bArr4);
                byte[] bArr5 = f16446M;
                boolean equals = Arrays.equals(bArr4, bArr5);
                byte[] bArr6 = f16448O;
                byte[] bArr7 = f16447N;
                boolean z9 = false;
                if (equals) {
                    int readInt2 = c1976b.readInt();
                    if (readInt2 % 2 == 1) {
                        i11 = readInt2 + 1;
                    } else {
                        i11 = readInt2;
                    }
                    byte[] bArr8 = new byte[i11];
                    c1976b.readFully(bArr8);
                    byte b5 = (byte) (8 | bArr8[0]);
                    bArr8[0] = b5;
                    if (((b5 >> 1) & 1) == 1) {
                        z9 = true;
                    }
                    c1977c3.write(bArr5);
                    c1977c3.b(readInt2);
                    c1977c3.write(bArr8);
                    if (z9) {
                        byte[] bArr9 = f16449P;
                        while (true) {
                            byte[] bArr10 = new byte[4];
                            c1976b.readFully(bArr10);
                            int readInt3 = c1976b.readInt();
                            c1977c3.write(bArr10);
                            c1977c3.b(readInt3);
                            if (readInt3 % 2 == 1) {
                                readInt3++;
                            }
                            G.i.t(c1976b, c1977c3, readInt3);
                            if (Arrays.equals(bArr10, bArr9)) {
                                break;
                            }
                        }
                        while (true) {
                            byte[] bArr11 = new byte[4];
                            try {
                                c1976b.readFully(bArr11);
                                z8 = !Arrays.equals(bArr11, f16450Q);
                            } catch (EOFException unused) {
                                z8 = true;
                            }
                            if (z8) {
                                break;
                            }
                            int readInt4 = c1976b.readInt();
                            c1977c3.write(bArr11);
                            c1977c3.b(readInt4);
                            if (readInt4 % 2 == 1) {
                                readInt4++;
                            }
                            G.i.t(c1976b, c1977c3, readInt4);
                        }
                        G(c1977c3);
                    } else {
                        while (true) {
                            byte[] bArr12 = new byte[4];
                            c1976b.readFully(bArr12);
                            int readInt5 = c1976b.readInt();
                            c1977c3.write(bArr12);
                            c1977c3.b(readInt5);
                            if (readInt5 % 2 == 1) {
                                readInt5++;
                            }
                            G.i.t(c1976b, c1977c3, readInt5);
                            if (Arrays.equals(bArr12, bArr6) || (bArr7 != null && Arrays.equals(bArr12, bArr7))) {
                                break;
                            }
                        }
                        G(c1977c3);
                    }
                } else if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                    int readInt6 = c1976b.readInt();
                    if (readInt6 % 2 == 1) {
                        i7 = readInt6 + 1;
                    } else {
                        i7 = readInt6;
                    }
                    byte[] bArr13 = new byte[3];
                    boolean equals2 = Arrays.equals(bArr4, bArr6);
                    byte[] bArr14 = f16445L;
                    if (equals2) {
                        c1976b.readFully(bArr13);
                        byte[] bArr15 = new byte[3];
                        c1976b.readFully(bArr15);
                        if (Arrays.equals(bArr14, bArr15)) {
                            i8 = c1976b.readInt();
                            i7 -= 10;
                            i9 = (i8 << 18) >> 18;
                            i10 = (i8 << 2) >> 18;
                            z7 = false;
                        } else {
                            throw new IOException("Error checking VP8 signature");
                        }
                    } else if (Arrays.equals(bArr4, bArr7)) {
                        if (c1976b.readByte() == 47) {
                            i8 = c1976b.readInt();
                            z7 = true;
                            i9 = (i8 & 16383) + 1;
                            i10 = ((i8 & 268419072) >>> 14) + 1;
                            if ((i8 & 268435456) == 0) {
                                z7 = false;
                            }
                            i7 -= 5;
                        } else {
                            throw new IOException("Error checking VP8L signature");
                        }
                    } else {
                        i8 = 0;
                        i9 = 0;
                        z7 = false;
                        i10 = 0;
                    }
                    c1977c3.write(bArr5);
                    c1977c3.b(10);
                    byte[] bArr16 = new byte[10];
                    if (z7) {
                        c1977c = c1977c2;
                        bArr16[0] = (byte) (bArr16[0] | 16);
                    } else {
                        c1977c = c1977c2;
                    }
                    bArr = bArr3;
                    bArr16[0] = (byte) (bArr16[0] | 8);
                    int i13 = i9 - 1;
                    int i14 = i10 - 1;
                    bArr16[4] = (byte) i13;
                    bArr16[5] = (byte) (i13 >> 8);
                    bArr16[6] = (byte) (i13 >> 16);
                    bArr16[7] = (byte) i14;
                    bArr16[8] = (byte) (i14 >> 8);
                    bArr16[9] = (byte) (i14 >> 16);
                    c1977c3.write(bArr16);
                    c1977c3.write(bArr4);
                    c1977c3.b(readInt6);
                    if (Arrays.equals(bArr4, bArr6)) {
                        c1977c3.write(bArr13);
                        c1977c3.write(bArr14);
                        c1977c3.b(i8);
                    } else if (Arrays.equals(bArr4, bArr7)) {
                        c1977c3.write(47);
                        c1977c3.b(i8);
                    }
                    G.i.t(c1976b, c1977c3, i7);
                    G(c1977c3);
                    G.i.s(c1976b, c1977c3);
                    byte[] bArr17 = bArr;
                    C1977c c1977c4 = c1977c;
                    c1977c4.b(byteArrayOutputStream.size() + bArr17.length);
                    c1977c4.write(bArr17);
                    byteArrayOutputStream.writeTo(c1977c4);
                    G.i.q(byteArrayOutputStream);
                }
            }
            c1977c = c1977c2;
            bArr = bArr3;
            G.i.s(c1976b, c1977c3);
            byte[] bArr172 = bArr;
            C1977c c1977c42 = c1977c;
            c1977c42.b(byteArrayOutputStream.size() + bArr172.length);
            c1977c42.write(bArr172);
            byteArrayOutputStream.writeTo(c1977c42);
            G.i.q(byteArrayOutputStream);
        } catch (Exception e8) {
            e = e8;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            G.i.q(byteArrayOutputStream2);
            throw th;
        }
    }

    public final void C(C1976b c1976b) {
        String str;
        C1978d c1978d;
        int h8;
        HashMap hashMap = this.f16477e[4];
        C1978d c1978d2 = (C1978d) hashMap.get("Compression");
        if (c1978d2 != null) {
            int h9 = c1978d2.h(this.f16478g);
            this.f16484n = h9;
            int i7 = 1;
            if (h9 != 1) {
                if (h9 != 6) {
                    if (h9 != 7) {
                        return;
                    }
                } else {
                    p(c1976b, hashMap);
                    return;
                }
            }
            C1978d c1978d3 = (C1978d) hashMap.get("BitsPerSample");
            String str2 = "ExifInterface";
            if (c1978d3 != null) {
                int[] iArr = (int[]) c1978d3.j(this.f16478g);
                int[] iArr2 = f16469w;
                if (Arrays.equals(iArr2, iArr) || (this.f16476d == 3 && (c1978d = (C1978d) hashMap.get("PhotometricInterpretation")) != null && (((h8 = c1978d.h(this.f16478g)) == 1 && Arrays.equals(iArr, f16470x)) || (h8 == 6 && Arrays.equals(iArr, iArr2))))) {
                    C1978d c1978d4 = (C1978d) hashMap.get("StripOffsets");
                    C1978d c1978d5 = (C1978d) hashMap.get("StripByteCounts");
                    if (c1978d4 != null && c1978d5 != null) {
                        long[] r7 = G.i.r(c1978d4.j(this.f16478g));
                        long[] r8 = G.i.r(c1978d5.j(this.f16478g));
                        if (r7 != null && r7.length != 0) {
                            if (r8 != null && r8.length != 0) {
                                if (r7.length != r8.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j = 0;
                                for (long j8 : r8) {
                                    j += j8;
                                }
                                int i8 = (int) j;
                                byte[] bArr = new byte[i8];
                                this.j = true;
                                this.f16480i = true;
                                this.f16479h = true;
                                int i9 = 0;
                                int i10 = 0;
                                int i11 = 0;
                                while (i9 < r7.length) {
                                    int i12 = (int) r7[i9];
                                    int i13 = (int) r8[i9];
                                    if (i9 < r7.length - i7) {
                                        str = str2;
                                        if (i12 + i13 != r7[i9 + 1]) {
                                            this.j = false;
                                        }
                                    } else {
                                        str = str2;
                                    }
                                    int i14 = i12 - i10;
                                    if (i14 < 0) {
                                        Log.d(str, "Invalid strip offset value");
                                        return;
                                    }
                                    String str3 = str;
                                    try {
                                        c1976b.a(i14);
                                        int i15 = i10 + i14;
                                        byte[] bArr2 = new byte[i13];
                                        try {
                                            c1976b.readFully(bArr2);
                                            i10 = i15 + i13;
                                            System.arraycopy(bArr2, 0, bArr, i11, i13);
                                            i11 += i13;
                                            i9++;
                                            str2 = str3;
                                            i7 = 1;
                                        } catch (EOFException unused) {
                                            Log.d(str3, "Failed to read " + i13 + " bytes.");
                                            return;
                                        }
                                    } catch (EOFException unused2) {
                                        Log.d(str3, "Failed to skip " + i14 + " bytes.");
                                        return;
                                    }
                                }
                                this.f16483m = bArr;
                                if (this.j) {
                                    this.f16481k = (int) r7[0];
                                    this.f16482l = i8;
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (f16466t) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        this.f16484n = 6;
        p(c1976b, hashMap);
    }

    public final void D(int i7, int i8) {
        HashMap[] hashMapArr = this.f16477e;
        boolean isEmpty = hashMapArr[i7].isEmpty();
        boolean z7 = f16466t;
        if (!isEmpty && !hashMapArr[i8].isEmpty()) {
            C1978d c1978d = (C1978d) hashMapArr[i7].get("ImageLength");
            C1978d c1978d2 = (C1978d) hashMapArr[i7].get("ImageWidth");
            C1978d c1978d3 = (C1978d) hashMapArr[i8].get("ImageLength");
            C1978d c1978d4 = (C1978d) hashMapArr[i8].get("ImageWidth");
            if (c1978d != null && c1978d2 != null) {
                if (c1978d3 != null && c1978d4 != null) {
                    int h8 = c1978d.h(this.f16478g);
                    int h9 = c1978d2.h(this.f16478g);
                    int h10 = c1978d3.h(this.f16478g);
                    int h11 = c1978d4.h(this.f16478g);
                    if (h8 < h10 && h9 < h11) {
                        HashMap hashMap = hashMapArr[i7];
                        hashMapArr[i7] = hashMapArr[i8];
                        hashMapArr[i8] = hashMap;
                    }
                } else if (z7) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (z7) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (z7) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void E(C1981g c1981g, int i7) {
        C1978d e7;
        C1978d e8;
        HashMap[] hashMapArr = this.f16477e;
        C1978d c1978d = (C1978d) hashMapArr[i7].get("DefaultCropSize");
        C1978d c1978d2 = (C1978d) hashMapArr[i7].get("SensorTopBorder");
        C1978d c1978d3 = (C1978d) hashMapArr[i7].get("SensorLeftBorder");
        C1978d c1978d4 = (C1978d) hashMapArr[i7].get("SensorBottomBorder");
        C1978d c1978d5 = (C1978d) hashMapArr[i7].get("SensorRightBorder");
        if (c1978d != null) {
            if (c1978d.f16424a == 5) {
                C1980f[] c1980fArr = (C1980f[]) c1978d.j(this.f16478g);
                if (c1980fArr != null && c1980fArr.length == 2) {
                    e7 = C1978d.d(new C1980f[]{c1980fArr[0]}, this.f16478g);
                    e8 = C1978d.d(new C1980f[]{c1980fArr[1]}, this.f16478g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c1980fArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) c1978d.j(this.f16478g);
                if (iArr != null && iArr.length == 2) {
                    e7 = C1978d.e(iArr[0], this.f16478g);
                    e8 = C1978d.e(iArr[1], this.f16478g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i7].put("ImageWidth", e7);
            hashMapArr[i7].put("ImageLength", e8);
        } else if (c1978d2 != null && c1978d3 != null && c1978d4 != null && c1978d5 != null) {
            int h8 = c1978d2.h(this.f16478g);
            int h9 = c1978d4.h(this.f16478g);
            int h10 = c1978d5.h(this.f16478g);
            int h11 = c1978d3.h(this.f16478g);
            if (h9 > h8 && h10 > h11) {
                C1978d e9 = C1978d.e(h9 - h8, this.f16478g);
                C1978d e10 = C1978d.e(h10 - h11, this.f16478g);
                hashMapArr[i7].put("ImageLength", e9);
                hashMapArr[i7].put("ImageWidth", e10);
            }
        } else {
            C1978d c1978d6 = (C1978d) hashMapArr[i7].get("ImageLength");
            C1978d c1978d7 = (C1978d) hashMapArr[i7].get("ImageWidth");
            if (c1978d6 == null || c1978d7 == null) {
                C1978d c1978d8 = (C1978d) hashMapArr[i7].get("JPEGInterchangeFormat");
                C1978d c1978d9 = (C1978d) hashMapArr[i7].get("JPEGInterchangeFormatLength");
                if (c1978d8 != null && c1978d9 != null) {
                    int h12 = c1978d8.h(this.f16478g);
                    int h13 = c1978d8.h(this.f16478g);
                    c1981g.b(h12);
                    byte[] bArr = new byte[h13];
                    c1981g.readFully(bArr);
                    f(new C1976b(bArr), h12, i7);
                }
            }
        }
    }

    public final void F() {
        D(0, 5);
        D(0, 4);
        D(5, 4);
        HashMap[] hashMapArr = this.f16477e;
        C1978d c1978d = (C1978d) hashMapArr[1].get("PixelXDimension");
        C1978d c1978d2 = (C1978d) hashMapArr[1].get("PixelYDimension");
        if (c1978d != null && c1978d2 != null) {
            hashMapArr[0].put("ImageWidth", c1978d);
            hashMapArr[0].put("ImageLength", c1978d2);
        }
        if (hashMapArr[4].isEmpty() && q(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!q(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        y("ThumbnailOrientation", 0, "Orientation");
        y("ThumbnailImageLength", 0, "ImageLength");
        y("ThumbnailImageWidth", 0, "ImageWidth");
        y("ThumbnailOrientation", 5, "Orientation");
        y("ThumbnailImageLength", 5, "ImageLength");
        y("ThumbnailImageWidth", 5, "ImageWidth");
        y("Orientation", 4, "ThumbnailOrientation");
        y("ImageLength", 4, "ThumbnailImageLength");
        y("ImageWidth", 4, "ThumbnailImageWidth");
    }

    public final void G(C1977c c1977c) {
        HashMap[] hashMapArr;
        int[] iArr;
        short s7;
        HashMap[] hashMapArr2;
        HashMap[] hashMapArr3;
        Object[] objArr;
        int i7;
        int i8 = 1;
        C1979e[][] c1979eArr = f16455V;
        int[] iArr2 = new int[c1979eArr.length];
        int[] iArr3 = new int[c1979eArr.length];
        C1979e[] c1979eArr2 = f16456W;
        for (C1979e c1979e : c1979eArr2) {
            x(c1979e.f16429b);
        }
        if (this.f16479h) {
            if (this.f16480i) {
                x("StripOffsets");
                x("StripByteCounts");
            } else {
                x("JPEGInterchangeFormat");
                x("JPEGInterchangeFormatLength");
            }
        }
        int i9 = 0;
        while (true) {
            int length = c1979eArr.length;
            hashMapArr = this.f16477e;
            if (i9 >= length) {
                break;
            }
            Object[] array = hashMapArr[i9].entrySet().toArray();
            int length2 = array.length;
            int i10 = 0;
            while (i10 < length2) {
                Map.Entry entry = (Map.Entry) array[i10];
                if (entry.getValue() == null) {
                    objArr = array;
                    hashMapArr[i9].remove(entry.getKey());
                    i7 = 1;
                } else {
                    objArr = array;
                    i7 = i8;
                }
                i10 += i7;
                i8 = i7;
                array = objArr;
            }
            i9 += i8;
        }
        int i11 = i8;
        if (!hashMapArr[i11].isEmpty()) {
            hashMapArr[0].put(c1979eArr2[i11].f16429b, C1978d.b(0L, this.f16478g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(c1979eArr2[2].f16429b, C1978d.b(0L, this.f16478g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(c1979eArr2[3].f16429b, C1978d.b(0L, this.f16478g));
        }
        if (this.f16479h) {
            if (this.f16480i) {
                hashMapArr[4].put("StripOffsets", C1978d.e(0, this.f16478g));
                hashMapArr[4].put("StripByteCounts", C1978d.e(this.f16482l, this.f16478g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", C1978d.b(0L, this.f16478g));
                hashMapArr[4].put("JPEGInterchangeFormatLength", C1978d.b(this.f16482l, this.f16478g));
            }
        }
        int i12 = 0;
        while (true) {
            int length3 = c1979eArr.length;
            iArr = f16452S;
            if (i12 >= length3) {
                break;
            }
            int i13 = 0;
            for (Map.Entry entry2 : hashMapArr[i12].entrySet()) {
                C1978d c1978d = (C1978d) entry2.getValue();
                c1978d.getClass();
                int i14 = iArr[c1978d.f16424a] * c1978d.f16425b;
                if (i14 > 4) {
                    i13 += i14;
                }
            }
            iArr3[i12] = iArr3[i12] + i13;
            i12++;
        }
        int i15 = 8;
        for (int i16 = 0; i16 < c1979eArr.length; i16++) {
            if (!hashMapArr[i16].isEmpty()) {
                iArr2[i16] = i15;
                i15 += (hashMapArr[i16].size() * 12) + 6 + iArr3[i16];
            }
        }
        if (this.f16479h) {
            if (this.f16480i) {
                hashMapArr[4].put("StripOffsets", C1978d.e(i15, this.f16478g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", C1978d.b(i15, this.f16478g));
            }
            this.f16481k = i15;
            i15 += this.f16482l;
        }
        if (this.f16476d == 4) {
            i15 += 8;
        }
        if (f16466t) {
            for (int i17 = 0; i17 < c1979eArr.length; i17++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i17), Integer.valueOf(iArr2[i17]), Integer.valueOf(hashMapArr[i17].size()), Integer.valueOf(iArr3[i17]), Integer.valueOf(i15)));
            }
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(c1979eArr2[1].f16429b, C1978d.b(iArr2[1], this.f16478g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(c1979eArr2[2].f16429b, C1978d.b(iArr2[2], this.f16478g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(c1979eArr2[3].f16429b, C1978d.b(iArr2[3], this.f16478g));
        }
        int i18 = this.f16476d;
        if (i18 != 4) {
            if (i18 != 13) {
                if (i18 == 14) {
                    c1977c.write(f16444K);
                    c1977c.b(i15);
                }
            } else {
                c1977c.b(i15);
                c1977c.write(f16439F);
            }
        } else if (i15 <= 65535) {
            c1977c.g(i15);
            c1977c.write(f16461c0);
        } else {
            throw new IllegalStateException(io.flutter.plugins.pathprovider.b.f("Size of exif data (", i15, " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
        }
        if (this.f16478g == ByteOrder.BIG_ENDIAN) {
            s7 = 19789;
        } else {
            s7 = 18761;
        }
        c1977c.c(s7);
        c1977c.f16423b = this.f16478g;
        c1977c.g(42);
        c1977c.d(8L);
        int i19 = 0;
        while (i19 < c1979eArr.length) {
            if (!hashMapArr[i19].isEmpty()) {
                c1977c.g(hashMapArr[i19].size());
                int size = (hashMapArr[i19].size() * 12) + iArr2[i19] + 2 + 4;
                for (Map.Entry entry3 : hashMapArr[i19].entrySet()) {
                    int i20 = ((C1979e) f16458Y[i19].get(entry3.getKey())).f16428a;
                    C1978d c1978d2 = (C1978d) entry3.getValue();
                    c1978d2.getClass();
                    int i21 = c1978d2.f16424a;
                    int i22 = iArr[i21];
                    int i23 = c1978d2.f16425b;
                    int i24 = i22 * i23;
                    c1977c.g(i20);
                    c1977c.g(i21);
                    c1977c.b(i23);
                    if (i24 > 4) {
                        hashMapArr3 = hashMapArr;
                        c1977c.d(size);
                        size += i24;
                    } else {
                        hashMapArr3 = hashMapArr;
                        c1977c.write(c1978d2.f16427d);
                        if (i24 < 4) {
                            while (i24 < 4) {
                                c1977c.a(0);
                                i24++;
                            }
                        }
                    }
                    hashMapArr = hashMapArr3;
                }
                hashMapArr2 = hashMapArr;
                if (i19 == 0 && !hashMapArr2[4].isEmpty()) {
                    c1977c.d(iArr2[4]);
                } else {
                    c1977c.d(0L);
                }
                for (Map.Entry entry4 : hashMapArr2[i19].entrySet()) {
                    byte[] bArr = ((C1978d) entry4.getValue()).f16427d;
                    if (bArr.length > 4) {
                        c1977c.write(bArr, 0, bArr.length);
                    }
                }
            } else {
                hashMapArr2 = hashMapArr;
            }
            i19++;
            hashMapArr = hashMapArr2;
        }
        if (this.f16479h) {
            c1977c.write(m());
        }
        if (this.f16476d == 14 && i15 % 2 == 1) {
            c1977c.a(0);
        }
        c1977c.f16423b = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String b5 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f16477e;
        if (b5 != null && b("DateTime") == null) {
            hashMapArr[0].put("DateTime", C1978d.a(b5));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C1978d.b(0L, this.f16478g));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C1978d.b(0L, this.f16478g));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C1978d.b(0L, this.f16478g));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C1978d.b(0L, this.f16478g));
        }
    }

    public final String b(String str) {
        if (str != null) {
            C1978d d7 = d(str);
            if (d7 != null) {
                if (!f16459Z.contains(str)) {
                    return d7.i(this.f16478g);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i7 = d7.f16424a;
                    if (i7 != 5 && i7 != 10) {
                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i7);
                        return null;
                    }
                    C1980f[] c1980fArr = (C1980f[]) d7.j(this.f16478g);
                    if (c1980fArr != null && c1980fArr.length == 3) {
                        C1980f c1980f = c1980fArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) c1980f.f16432a) / ((float) c1980f.f16433b)));
                        C1980f c1980f2 = c1980fArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) c1980f2.f16432a) / ((float) c1980f2.f16433b)));
                        C1980f c1980f3 = c1980fArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) c1980f3.f16432a) / ((float) c1980f3.f16433b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c1980fArr));
                    return null;
                }
                try {
                    return Double.toString(d7.g(this.f16478g));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final int c(int i7, String str) {
        C1978d d7 = d(str);
        if (d7 == null) {
            return i7;
        }
        try {
            return d7.h(this.f16478g);
        } catch (NumberFormatException unused) {
            return i7;
        }
    }

    public final C1978d d(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f16466t) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i7 = 0; i7 < f16455V.length; i7++) {
                C1978d c1978d = (C1978d) this.f16477e[i7].get(str);
                if (c1978d != null) {
                    return c1978d;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final void e(C1981g c1981g) {
        String str;
        String str2;
        String str3;
        int i7;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    AbstractC1984j.a(mediaMetadataRetriever, new C1975a(c1981g));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.f16477e;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", C1978d.e(Integer.parseInt(str), this.f16478g));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", C1978d.e(Integer.parseInt(str2), this.f16478g));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i7 = 1;
                                } else {
                                    i7 = 8;
                                }
                            } else {
                                i7 = 3;
                            }
                        } else {
                            i7 = 6;
                        }
                        hashMapArr[0].put("Orientation", C1978d.e(i7, this.f16478g));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            c1981g.b(parseInt2);
                            byte[] bArr = new byte[6];
                            c1981g.readFully(bArr);
                            int i8 = parseInt2 + 6;
                            int i9 = parseInt3 - 6;
                            if (Arrays.equals(bArr, f16461c0)) {
                                byte[] bArr2 = new byte[i9];
                                c1981g.readFully(bArr2);
                                this.f16485o = i8;
                                v(bArr2, 0);
                            } else {
                                throw new IOException("Invalid identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f16466t) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x018c, code lost:
        r23.f16419c = r22.f16478g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0190, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0179 A[LOOP:0: B:10:0x0033->B:78:0x0179, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(x0.C1976b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C1982h.f(x0.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bb, code lost:
        if (r8 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C1982h.g(java.io.BufferedInputStream):int");
    }

    public final void h(C1981g c1981g) {
        int i7;
        int i8;
        k(c1981g);
        HashMap[] hashMapArr = this.f16477e;
        C1978d c1978d = (C1978d) hashMapArr[1].get("MakerNote");
        if (c1978d != null) {
            C1981g c1981g2 = new C1981g(c1978d.f16427d);
            c1981g2.f16419c = this.f16478g;
            byte[] bArr = f16436C;
            byte[] bArr2 = new byte[bArr.length];
            c1981g2.readFully(bArr2);
            c1981g2.b(0L);
            byte[] bArr3 = f16437D;
            byte[] bArr4 = new byte[bArr3.length];
            c1981g2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c1981g2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c1981g2.b(12L);
            }
            w(c1981g2, 6);
            C1978d c1978d2 = (C1978d) hashMapArr[7].get("PreviewImageStart");
            C1978d c1978d3 = (C1978d) hashMapArr[7].get("PreviewImageLength");
            if (c1978d2 != null && c1978d3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c1978d2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c1978d3);
            }
            C1978d c1978d4 = (C1978d) hashMapArr[8].get("AspectFrame");
            if (c1978d4 != null) {
                int[] iArr = (int[]) c1978d4.j(this.f16478g);
                if (iArr != null && iArr.length == 4) {
                    int i9 = iArr[2];
                    int i10 = iArr[0];
                    if (i9 > i10 && (i7 = iArr[3]) > (i8 = iArr[1])) {
                        int i11 = (i9 - i10) + 1;
                        int i12 = (i7 - i8) + 1;
                        if (i11 < i12) {
                            int i13 = i11 + i12;
                            i12 = i13 - i12;
                            i11 = i13 - i12;
                        }
                        C1978d e7 = C1978d.e(i11, this.f16478g);
                        C1978d e8 = C1978d.e(i12, this.f16478g);
                        hashMapArr[0].put("ImageWidth", e7);
                        hashMapArr[0].put("ImageLength", e8);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void i(C1976b c1976b) {
        if (f16466t) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c1976b);
        }
        c1976b.f16419c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f16438E;
        c1976b.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c1976b.readInt();
                byte[] bArr2 = new byte[4];
                c1976b.readFully(bArr2);
                int i7 = length + 8;
                if (i7 == 16 && !Arrays.equals(bArr2, f16440G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (!Arrays.equals(bArr2, f16441H)) {
                    if (Arrays.equals(bArr2, f16439F)) {
                        byte[] bArr3 = new byte[readInt];
                        c1976b.readFully(bArr3);
                        int readInt2 = c1976b.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) == readInt2) {
                            this.f16485o = i7;
                            v(bArr3, 0);
                            F();
                            C(new C1976b(bArr3));
                            return;
                        }
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    int i8 = readInt + 4;
                    c1976b.a(i8);
                    length = i7 + i8;
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(C1976b c1976b) {
        boolean z7 = f16466t;
        if (z7) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c1976b);
        }
        c1976b.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c1976b.readFully(bArr);
        c1976b.readFully(bArr2);
        c1976b.readFully(bArr3);
        int i7 = ByteBuffer.wrap(bArr).getInt();
        int i8 = ByteBuffer.wrap(bArr2).getInt();
        int i9 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i8];
        c1976b.a(i7 - c1976b.f16418b);
        c1976b.readFully(bArr4);
        f(new C1976b(bArr4), i7, 5);
        c1976b.a(i9 - c1976b.f16418b);
        c1976b.f16419c = ByteOrder.BIG_ENDIAN;
        int readInt = c1976b.readInt();
        if (z7) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i10 = 0; i10 < readInt; i10++) {
            int readUnsignedShort = c1976b.readUnsignedShort();
            int readUnsignedShort2 = c1976b.readUnsignedShort();
            if (readUnsignedShort == f16454U.f16428a) {
                short readShort = c1976b.readShort();
                short readShort2 = c1976b.readShort();
                C1978d e7 = C1978d.e(readShort, this.f16478g);
                C1978d e8 = C1978d.e(readShort2, this.f16478g);
                HashMap[] hashMapArr = this.f16477e;
                hashMapArr[0].put("ImageLength", e7);
                hashMapArr[0].put("ImageWidth", e8);
                if (z7) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c1976b.a(readUnsignedShort2);
        }
    }

    public final void k(C1981g c1981g) {
        s(c1981g);
        w(c1981g, 0);
        E(c1981g, 0);
        E(c1981g, 5);
        E(c1981g, 4);
        F();
        if (this.f16476d == 8) {
            HashMap[] hashMapArr = this.f16477e;
            C1978d c1978d = (C1978d) hashMapArr[1].get("MakerNote");
            if (c1978d != null) {
                C1981g c1981g2 = new C1981g(c1978d.f16427d);
                c1981g2.f16419c = this.f16478g;
                c1981g2.a(6);
                w(c1981g2, 9);
                C1978d c1978d2 = (C1978d) hashMapArr[9].get("ColorSpace");
                if (c1978d2 != null) {
                    hashMapArr[1].put("ColorSpace", c1978d2);
                }
            }
        }
    }

    public final void l(C1981g c1981g) {
        if (f16466t) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c1981g);
        }
        k(c1981g);
        HashMap[] hashMapArr = this.f16477e;
        C1978d c1978d = (C1978d) hashMapArr[0].get("JpgFromRaw");
        if (c1978d != null) {
            f(new C1976b(c1978d.f16427d), (int) c1978d.f16426c, 5);
        }
        C1978d c1978d2 = (C1978d) hashMapArr[0].get("ISO");
        C1978d c1978d3 = (C1978d) hashMapArr[1].get("PhotographicSensitivity");
        if (c1978d2 != null && c1978d3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", c1978d2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] m() {
        /*
            r10 = this;
            java.lang.String r0 = "Error closing fd."
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r2 = "ExifInterface"
            boolean r3 = r10.f16479h
            r4 = 0
            if (r3 != 0) goto Lc
            return r4
        Lc:
            byte[] r3 = r10.f16483m
            if (r3 == 0) goto L11
            return r3
        L11:
            android.content.res.AssetManager$AssetInputStream r3 = r10.f16475c     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            if (r3 == 0) goto L33
            boolean r5 = r3.markSupported()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L25
            if (r5 == 0) goto L2a
            r3.reset()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L25
        L1e:
            r5 = r4
            goto L5c
        L20:
            r2 = move-exception
            r5 = r4
        L22:
            r4 = r3
            goto L9c
        L25:
            r5 = move-exception
            r6 = r5
            r5 = r4
            goto L8a
        L2a:
            java.lang.String r5 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r2, r5)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L25
            G.i.q(r3)
            return r4
        L33:
            java.lang.String r3 = r10.f16473a     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            if (r3 == 0) goto L47
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.lang.String r5 = r10.f16473a     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            goto L1e
        L3f:
            r2 = move-exception
            r5 = r4
            goto L9c
        L42:
            r5 = move-exception
            r3 = r4
            r6 = r5
            r5 = r3
            goto L8a
        L47:
            java.io.FileDescriptor r3 = r10.f16474b     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.io.FileDescriptor r3 = x0.AbstractC1983i.b(r3)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            r6 = 0
            x0.AbstractC1983i.c(r3, r6, r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            r9 = r5
            r5 = r3
            r3 = r9
        L5c:
            x0.b r6 = new x0.b     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r7 = r10.f16481k     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r8 = r10.f16485o     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r7 = r7 + r8
            r6.a(r7)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r7 = r10.f16482l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.readFully(r7)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r10.f16483m = r7     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            G.i.q(r3)
            if (r5 == 0) goto L7e
            x0.AbstractC1983i.a(r5)     // Catch: java.lang.Exception -> L7b
            goto L7e
        L7b:
            android.util.Log.e(r1, r0)
        L7e:
            return r7
        L7f:
            r2 = move-exception
            goto L22
        L81:
            r6 = move-exception
            goto L8a
        L83:
            r2 = move-exception
            r5 = r3
            goto L9c
        L86:
            r5 = move-exception
            r6 = r5
            r5 = r3
            r3 = r4
        L8a:
            java.lang.String r7 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r2, r7, r6)     // Catch: java.lang.Throwable -> L7f
            G.i.q(r3)
            if (r5 == 0) goto L9b
            x0.AbstractC1983i.a(r5)     // Catch: java.lang.Exception -> L98
            goto L9b
        L98:
            android.util.Log.e(r1, r0)
        L9b:
            return r4
        L9c:
            G.i.q(r4)
            if (r5 == 0) goto La8
            x0.AbstractC1983i.a(r5)     // Catch: java.lang.Exception -> La5
            goto La8
        La5:
            android.util.Log.e(r1, r0)
        La8:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C1982h.m():byte[]");
    }

    public final void n(C1976b c1976b) {
        if (f16466t) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c1976b);
        }
        c1976b.f16419c = ByteOrder.LITTLE_ENDIAN;
        c1976b.a(f16442I.length);
        int readInt = c1976b.readInt() + 8;
        byte[] bArr = f16443J;
        c1976b.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c1976b.readFully(bArr2);
                int readInt2 = c1976b.readInt();
                int i7 = length + 8;
                if (Arrays.equals(f16444K, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    c1976b.readFully(bArr3);
                    this.f16485o = i7;
                    v(bArr3, 0);
                    C(new C1976b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i7 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length <= readInt) {
                    c1976b.a(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(C1976b c1976b, HashMap hashMap) {
        C1978d c1978d = (C1978d) hashMap.get("JPEGInterchangeFormat");
        C1978d c1978d2 = (C1978d) hashMap.get("JPEGInterchangeFormatLength");
        if (c1978d != null && c1978d2 != null) {
            int h8 = c1978d.h(this.f16478g);
            int h9 = c1978d2.h(this.f16478g);
            if (this.f16476d == 7) {
                h8 += this.f16486p;
            }
            if (h8 > 0 && h9 > 0) {
                this.f16479h = true;
                if (this.f16473a == null && this.f16475c == null && this.f16474b == null) {
                    byte[] bArr = new byte[h9];
                    c1976b.a(h8);
                    c1976b.readFully(bArr);
                    this.f16483m = bArr;
                }
                this.f16481k = h8;
                this.f16482l = h9;
            }
            if (f16466t) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + h8 + ", length: " + h9);
            }
        }
    }

    public final boolean q(HashMap hashMap) {
        C1978d c1978d = (C1978d) hashMap.get("ImageLength");
        C1978d c1978d2 = (C1978d) hashMap.get("ImageWidth");
        if (c1978d != null && c1978d2 != null) {
            int h8 = c1978d.h(this.f16478g);
            int h9 = c1978d2.h(this.f16478g);
            if (h8 <= 512 && h9 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008f A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0004, B:5:0x0009, B:12:0x001e, B:18:0x003b, B:20:0x0046, B:28:0x005c, B:23:0x004d, B:26:0x0055, B:27:0x0059, B:29:0x0066, B:31:0x006f, B:33:0x0075, B:35:0x007b, B:37:0x0081, B:42:0x008f), top: B:52:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = x0.C1982h.f16466t
            r1 = 0
            r2 = r1
        L4:
            x0.e[][] r3 = x0.C1982h.f16455V     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r3 = r3.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 >= r3) goto L1e
            java.util.HashMap[] r3 = r7.f16477e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3[r2] = r4     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2 + 1
            goto L4
        L15:
            r8 = move-exception
            goto L97
        L18:
            r8 = move-exception
            goto L8d
        L1b:
            r8 = move-exception
            goto L8d
        L1e:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r8 = r7.g(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.f16476d = r8     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L66
            if (r8 == r5) goto L66
            if (r8 == r4) goto L66
            if (r8 != r3) goto L3b
            goto L66
        L3b:
            x0.g r8 = new x0.g     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r7.f16476d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 12
            if (r1 != r2) goto L4a
            r7.e(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L4a:
            r2 = 7
            if (r1 != r2) goto L51
            r7.h(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L51:
            r2 = 10
            if (r1 != r2) goto L59
            r7.l(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L59:
            r7.k(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L5c:
            int r1 = r7.f16485o     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.b(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.C(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L66:
            x0.b r8 = new x0.b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r7.f16476d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 != r6) goto L73
            r7.f(r8, r1, r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L73:
            if (r2 != r4) goto L79
            r7.i(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L79:
            if (r2 != r5) goto L7f
            r7.j(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L7f:
            if (r2 != r3) goto L84
            r7.n(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L84:
            r7.a()
            if (r0 == 0) goto La6
        L89:
            r7.t()
            goto La6
        L8d:
            if (r0 == 0) goto La0
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L15
            goto La0
        L97:
            r7.a()
            if (r0 == 0) goto L9f
            r7.t()
        L9f:
            throw r8
        La0:
            r7.a()
            if (r0 == 0) goto La6
            goto L89
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C1982h.r(java.io.InputStream):void");
    }

    public final void s(C1981g c1981g) {
        ByteOrder u7 = u(c1981g);
        this.f16478g = u7;
        c1981g.f16419c = u7;
        int readUnsignedShort = c1981g.readUnsignedShort();
        int i7 = this.f16476d;
        if (i7 != 7 && i7 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c1981g.readInt();
        if (readInt >= 8) {
            int i8 = readInt - 8;
            if (i8 > 0) {
                c1981g.a(i8);
                return;
            }
            return;
        }
        throw new IOException(io.flutter.plugins.pathprovider.b.e(readInt, "Invalid first Ifd offset: "));
    }

    public final void t() {
        int i7 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f16477e;
            if (i7 < hashMapArr.length) {
                StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("The size of tag group[", i7, "]: ");
                k2.append(hashMapArr[i7].size());
                Log.d("ExifInterface", k2.toString());
                for (Map.Entry entry : hashMapArr[i7].entrySet()) {
                    C1978d c1978d = (C1978d) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c1978d.toString() + ", tagValue: '" + c1978d.i(this.f16478g) + "'");
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void v(byte[] bArr, int i7) {
        C1981g c1981g = new C1981g(bArr);
        s(c1981g);
        w(c1981g, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(x0.C1981g r29, int r30) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C1982h.w(x0.g, int):void");
    }

    public final void x(String str) {
        for (int i7 = 0; i7 < f16455V.length; i7++) {
            this.f16477e[i7].remove(str);
        }
    }

    public final void y(String str, int i7, String str2) {
        HashMap[] hashMapArr = this.f16477e;
        if (!hashMapArr[i7].isEmpty() && hashMapArr[i7].get(str) != null) {
            HashMap hashMap = hashMapArr[i7];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i7].remove(str);
        }
    }

    public final void z(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        C1978d c1978d;
        if (f16466t) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        C1976b c1976b = new C1976b(bufferedInputStream);
        C1977c c1977c = new C1977c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (c1976b.readByte() == -1) {
            c1977c.a(-1);
            if (c1976b.readByte() == -40) {
                c1977c.a(-40);
                String b5 = b("Xmp");
                HashMap[] hashMapArr = this.f16477e;
                if (b5 != null && this.f16489s) {
                    c1978d = (C1978d) hashMapArr[0].remove("Xmp");
                } else {
                    c1978d = null;
                }
                c1977c.a(-1);
                c1977c.a(-31);
                G(c1977c);
                if (c1978d != null) {
                    hashMapArr[0].put("Xmp", c1978d);
                }
                byte[] bArr = new byte[RecognitionOptions.AZTEC];
                while (c1976b.readByte() == -1) {
                    byte readByte = c1976b.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            c1977c.a(-1);
                            c1977c.a(readByte);
                            int readUnsignedShort = c1976b.readUnsignedShort();
                            c1977c.g(readUnsignedShort);
                            int i7 = readUnsignedShort - 2;
                            if (i7 >= 0) {
                                while (i7 > 0) {
                                    int read = c1976b.read(bArr, 0, Math.min(i7, (int) RecognitionOptions.AZTEC));
                                    if (read >= 0) {
                                        c1977c.write(bArr, 0, read);
                                        i7 -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = c1976b.readUnsignedShort();
                            int i8 = readUnsignedShort2 - 2;
                            if (i8 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (i8 >= 6) {
                                    c1976b.readFully(bArr2);
                                    if (Arrays.equals(bArr2, f16461c0)) {
                                        c1976b.a(readUnsignedShort2 - 8);
                                    }
                                }
                                c1977c.a(-1);
                                c1977c.a(readByte);
                                c1977c.g(readUnsignedShort2);
                                if (i8 >= 6) {
                                    i8 = readUnsignedShort2 - 8;
                                    c1977c.write(bArr2);
                                }
                                while (i8 > 0) {
                                    int read2 = c1976b.read(bArr, 0, Math.min(i8, (int) RecognitionOptions.AZTEC));
                                    if (read2 >= 0) {
                                        c1977c.write(bArr, 0, read2);
                                        i8 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        c1977c.a(-1);
                        c1977c.a(readByte);
                        G.i.s(c1976b, c1977c);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public C1982h(InputStream inputStream) {
        C1979e[][] c1979eArr = f16455V;
        this.f16477e = new HashMap[c1979eArr.length];
        this.f = new HashSet(c1979eArr.length);
        this.f16478g = ByteOrder.BIG_ENDIAN;
        this.f16473a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f16475c = (AssetManager.AssetInputStream) inputStream;
            this.f16474b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    AbstractC1983i.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f16475c = null;
                    this.f16474b = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (f16466t) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.f16475c = null;
            this.f16474b = null;
        }
        r(inputStream);
    }
}
