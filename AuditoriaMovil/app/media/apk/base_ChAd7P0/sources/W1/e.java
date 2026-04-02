package W1;

import D.AbstractC0059i;
import android.content.pm.PackageInfo;
import androidx.datastore.preferences.protobuf.Y;
import com.google.firebase.firestore.Z;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.TikaCoreProperties;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Z f6135a = new Z(11);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f6136b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f6137c = {112, 114, 109, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f6138d = {48, 49, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f6139e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f6140g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f6141h = {48, 48, 49, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f6142i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(b1.e[] eVarArr, byte[] bArr) {
        int i7 = 0;
        for (b1.e eVar : eVarArr) {
            i7 += ((((eVar.f8127i * 2) + 7) & (-8)) / 8) + (eVar.f * 2) + d(bArr, (String) eVar.f8121b, (String) eVar.f8122c).getBytes(StandardCharsets.UTF_8).length + 16 + eVar.f8126h;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i7);
        if (Arrays.equals(bArr, f)) {
            for (b1.e eVar2 : eVarArr) {
                p(byteArrayOutputStream, eVar2, d(bArr, (String) eVar2.f8121b, (String) eVar2.f8122c));
                r(byteArrayOutputStream, eVar2);
                int[] iArr = (int[]) eVar2.f8123d;
                int length = iArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    int i10 = iArr[i8];
                    u(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                q(byteArrayOutputStream, eVar2);
            }
        } else {
            for (b1.e eVar3 : eVarArr) {
                p(byteArrayOutputStream, eVar3, d(bArr, (String) eVar3.f8121b, (String) eVar3.f8122c));
            }
            for (b1.e eVar4 : eVarArr) {
                r(byteArrayOutputStream, eVar4);
                int[] iArr2 = (int[]) eVar4.f8123d;
                int length2 = iArr2.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length2) {
                    int i13 = iArr2[i11];
                    u(byteArrayOutputStream, i13 - i12);
                    i11++;
                    i12 = i13;
                }
                q(byteArrayOutputStream, eVar4);
            }
        }
        if (byteArrayOutputStream.size() == i7) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i7);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z7 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z7) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            return z7;
        }
        file.delete();
        return true;
    }

    public static String d(byte[] bArr, String str, String str2) {
        Object obj;
        byte[] bArr2 = f6141h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f6140g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, "!");
            }
            if (TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER.equals(obj)) {
                return str2.replace("!", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                StringBuilder l8 = Y.l(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str3 = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
                }
                return AbstractC0059i.D(l8, str3, str2);
            } else if ("!".equals(obj)) {
                return str2.replace(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, "!");
            } else {
                if (TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER.equals(obj)) {
                    return str2.replace("!", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                }
                return str2;
            }
        }
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i7) {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int read = inputStream.read(bArr, i8, i7 - i8);
            if (read >= 0) {
                i8 += read;
            } else {
                throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(i7, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += (int) m(byteArrayInputStream, 2);
            iArr[i9] = i8;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.e.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static b1.e[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b1.e[] eVarArr) {
        byte[] bArr3 = f6142i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f6138d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m7 = (int) m(fileInputStream, 1);
                    byte[] h8 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h8);
                        try {
                            b1.e[] j8 = j(byteArrayInputStream, m7, eVarArr);
                            byteArrayInputStream.close();
                            return j8;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, j)) {
            int m8 = (int) m(fileInputStream, 2);
            byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h9);
                try {
                    b1.e[] k2 = k(byteArrayInputStream2, bArr2, m8, eVarArr);
                    byteArrayInputStream2.close();
                    return k2;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static b1.e[] j(ByteArrayInputStream byteArrayInputStream, int i7, b1.e[] eVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b1.e[0];
        }
        if (i7 == eVarArr.length) {
            String[] strArr = new String[i7];
            int[] iArr = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                iArr[i8] = (int) m(byteArrayInputStream, 2);
                strArr[i8] = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            for (int i9 = 0; i9 < i7; i9++) {
                b1.e eVar = eVarArr[i9];
                if (((String) eVar.f8122c).equals(strArr[i9])) {
                    int i10 = iArr[i9];
                    eVar.f = i10;
                    eVar.f8123d = g(byteArrayInputStream, i10);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return eVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b1.e[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, b1.e[] eVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new b1.e[0];
        }
        if (i7 == eVarArr.length) {
            for (int i8 = 0; i8 < i7; i8++) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m7 = m(byteArrayInputStream, 4);
                int m8 = (int) m(byteArrayInputStream, 2);
                b1.e eVar = null;
                if (eVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i9 = 0;
                    while (true) {
                        if (i9 >= eVarArr.length) {
                            break;
                        } else if (((String) eVarArr[i9].f8122c).equals(str)) {
                            eVar = eVarArr[i9];
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                if (eVar != null) {
                    eVar.j = m7;
                    int[] g3 = g(byteArrayInputStream, m8);
                    if (Arrays.equals(bArr, f6141h)) {
                        eVar.f = m8;
                        eVar.f8123d = g3;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return eVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b1.e[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f6139e)) {
            int m7 = (int) m(fileInputStream, 1);
            byte[] h8 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h8);
                try {
                    b1.e[] n7 = n(byteArrayInputStream, str, m7);
                    byteArrayInputStream.close();
                    return n7;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long m(InputStream inputStream, int i7) {
        byte[] f4 = f(inputStream, i7);
        long j8 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j8 += (f4[i8] & ForkServer.ERROR) << (i8 * 8);
        }
        return j8;
    }

    public static b1.e[] n(ByteArrayInputStream byteArrayInputStream, String str, int i7) {
        TreeMap treeMap;
        int i8;
        if (byteArrayInputStream.available() == 0) {
            return new b1.e[0];
        }
        b1.e[] eVarArr = new b1.e[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            int m7 = (int) m(byteArrayInputStream, 2);
            eVarArr[i9] = new b1.e(str, new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m7, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m7], new TreeMap());
        }
        for (int i10 = 0; i10 < i7; i10++) {
            b1.e eVar = eVarArr[i10];
            int available = byteArrayInputStream.available() - eVar.f8126h;
            int i11 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = (TreeMap) eVar.f8124e;
                if (available2 <= available) {
                    break;
                }
                i11 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i11), 1);
                for (int m8 = (int) m(byteArrayInputStream, 2); m8 > 0; m8--) {
                    m(byteArrayInputStream, 2);
                    int m9 = (int) m(byteArrayInputStream, 1);
                    if (m9 != 6 && m9 != 7) {
                        while (m9 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m10 = (int) m(byteArrayInputStream, 1); m10 > 0; m10--) {
                                m(byteArrayInputStream, 2);
                            }
                            m9--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                eVar.f8123d = g(byteArrayInputStream, eVar.f);
                int i12 = eVar.f8127i;
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i12 * 2) + 7) & (-8)) / 8));
                for (int i13 = 0; i13 < i12; i13++) {
                    if (valueOf.get(i13)) {
                        i8 = 2;
                    } else {
                        i8 = 0;
                    }
                    if (valueOf.get(i13 + i12)) {
                        i8 |= 4;
                    }
                    if (i8 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i13), Integer.valueOf(i8 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return eVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b1.e[] eVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f6138d;
        int i7 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream2, eVarArr.length);
                int i8 = 2;
                int i9 = 2;
                for (b1.e eVar : eVarArr) {
                    t(byteArrayOutputStream2, eVar.f8125g, 4);
                    t(byteArrayOutputStream2, eVar.j, 4);
                    t(byteArrayOutputStream2, eVar.f8127i, 4);
                    String d7 = d(bArr2, (String) eVar.f8121b, (String) eVar.f8122c);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d7.getBytes(charset).length;
                    u(byteArrayOutputStream2, length2);
                    i9 = i9 + 14 + length2;
                    byteArrayOutputStream2.write(d7.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i9 == byteArray.length) {
                    m mVar = new m(b.DEX_FILES, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(mVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < eVarArr.length) {
                        try {
                            b1.e eVar2 = eVarArr[i10];
                            u(byteArrayOutputStream3, i10);
                            u(byteArrayOutputStream3, eVar2.f);
                            i11 = i11 + 4 + (eVar2.f * 2);
                            int[] iArr = (int[]) eVar2.f8123d;
                            int length3 = iArr.length;
                            int i12 = i7;
                            int i13 = i12;
                            while (i12 < length3) {
                                int i14 = iArr[i12];
                                u(byteArrayOutputStream3, i14 - i13);
                                i12++;
                                i13 = i14;
                            }
                            i10++;
                            i7 = 0;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i11 == byteArray2.length) {
                        m mVar2 = new m(b.CLASSES, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(mVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < eVarArr.length) {
                            try {
                                b1.e eVar3 = eVarArr[i15];
                                int i17 = 0;
                                for (Map.Entry entry : ((TreeMap) eVar3.f8124e).entrySet()) {
                                    i17 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                q(byteArrayOutputStream4, eVar3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream5, eVar3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                u(byteArrayOutputStream3, i15);
                                int length4 = byteArray3.length + i8 + byteArray4.length;
                                int i18 = i16 + 6;
                                ArrayList arrayList4 = arrayList3;
                                t(byteArrayOutputStream3, length4, 4);
                                u(byteArrayOutputStream3, i17);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i16 = i18 + length4;
                                i15++;
                                arrayList3 = arrayList4;
                                i8 = 2;
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i16 == byteArray5.length) {
                            m mVar3 = new m(b.METHODS, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(mVar3);
                            long j8 = 4;
                            long size = j8 + j8 + 4 + (arrayList2.size() * 16);
                            t(byteArrayOutputStream, arrayList2.size(), 4);
                            int i19 = 0;
                            while (i19 < arrayList2.size()) {
                                m mVar4 = (m) arrayList2.get(i19);
                                t(byteArrayOutputStream, mVar4.f6153a.a(), 4);
                                t(byteArrayOutputStream, size, 4);
                                byte[] bArr3 = mVar4.f6154b;
                                if (mVar4.f6155c) {
                                    long length5 = bArr3.length;
                                    byte[] a7 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a7);
                                    t(byteArrayOutputStream, a7.length, 4);
                                    t(byteArrayOutputStream, length5, 4);
                                    length = a7.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    t(byteArrayOutputStream, bArr3.length, 4);
                                    t(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i19++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i20));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        byte[] bArr4 = f6139e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b5 = b(eVarArr, bArr4);
            t(byteArrayOutputStream, eVarArr.length, 1);
            t(byteArrayOutputStream, b5.length, 4);
            byte[] a8 = a(b5);
            t(byteArrayOutputStream, a8.length, 4);
            byteArrayOutputStream.write(a8);
            return true;
        }
        byte[] bArr5 = f6140g;
        if (Arrays.equals(bArr, bArr5)) {
            t(byteArrayOutputStream, eVarArr.length, 1);
            for (b1.e eVar4 : eVarArr) {
                String d8 = d(bArr5, (String) eVar4.f8121b, (String) eVar4.f8122c);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d8.getBytes(charset2).length);
                u(byteArrayOutputStream, ((int[]) eVar4.f8123d).length);
                t(byteArrayOutputStream, ((TreeMap) eVar4.f8124e).size() * 4, 4);
                t(byteArrayOutputStream, eVar4.f8125g, 4);
                byteArrayOutputStream.write(d8.getBytes(charset2));
                for (Integer num : ((TreeMap) eVar4.f8124e).keySet()) {
                    u(byteArrayOutputStream, num.intValue());
                    u(byteArrayOutputStream, 0);
                }
                for (int i21 : (int[]) eVar4.f8123d) {
                    u(byteArrayOutputStream, i21);
                }
            }
            return true;
        }
        byte[] bArr6 = f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b7 = b(eVarArr, bArr6);
            t(byteArrayOutputStream, eVarArr.length, 1);
            t(byteArrayOutputStream, b7.length, 4);
            byte[] a9 = a(b7);
            t(byteArrayOutputStream, a9.length, 4);
            byteArrayOutputStream.write(a9);
            return true;
        }
        byte[] bArr7 = f6141h;
        if (Arrays.equals(bArr, bArr7)) {
            u(byteArrayOutputStream, eVarArr.length);
            for (b1.e eVar5 : eVarArr) {
                String d9 = d(bArr7, (String) eVar5.f8121b, (String) eVar5.f8122c);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d9.getBytes(charset3).length);
                TreeMap treeMap = (TreeMap) eVar5.f8124e;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, ((int[]) eVar5.f8123d).length);
                t(byteArrayOutputStream, eVar5.f8125g, 4);
                byteArrayOutputStream.write(d9.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    u(byteArrayOutputStream, num2.intValue());
                }
                for (int i22 : (int[]) eVar5.f8123d) {
                    u(byteArrayOutputStream, i22);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b1.e eVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, eVar.f);
        t(byteArrayOutputStream, eVar.f8126h, 4);
        t(byteArrayOutputStream, eVar.f8125g, 4);
        t(byteArrayOutputStream, eVar.f8127i, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b1.e eVar) {
        byte[] bArr = new byte[(((eVar.f8127i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) eVar.f8124e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i7 = intValue / 8;
                bArr[i7] = (byte) (bArr[i7] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i8 = intValue + eVar.f8127i;
                int i9 = i8 / 8;
                bArr[i9] = (byte) ((1 << (i8 % 8)) | bArr[i9]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b1.e eVar) {
        int i7 = 0;
        for (Map.Entry entry : ((TreeMap) eVar.f8124e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i7);
                u(byteArrayOutputStream, 0);
                i7 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01c8, code lost:
        if (r5 == null) goto L185;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015f  */
    /* JADX WARN: Type inference failed for: r14v0, types: [byte[], b1.e[]] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v23, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(android.content.Context r19, java.util.concurrent.Executor r20, W1.d r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.e.s(android.content.Context, java.util.concurrent.Executor, W1.d, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j8, int i7) {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j8 >> (i8 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        t(byteArrayOutputStream, i7, 2);
    }
}
