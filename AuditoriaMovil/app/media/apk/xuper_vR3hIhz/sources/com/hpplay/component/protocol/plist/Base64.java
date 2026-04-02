package com.hpplay.component.protocol.plist;

import com.google.common.base.Ascii;
import com.hpplay.sdk.source.mdns.xbill.dns.TTL;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DECODE = 0;
    public static final int DONT_GUNZIP = 4;
    public static final int DO_BREAK_LINES = 8;
    public static final int ENCODE = 1;
    private static final byte EQUALS_SIGN_ENC = -1;
    public static final int GZIP = 2;
    private static final int MAX_LINE_LENGTH = 76;
    private static final byte NEW_LINE = 10;
    public static final int NO_OPTIONS = 0;
    public static final int ORDERED = 32;
    private static final String PREFERRED_ENCODING = "US-ASCII";
    public static final int URL_SAFE = 16;
    private static final byte[] _STANDARD_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte WHITE_SPACE_ENC = -5;
    private static final byte EQUALS_SIGN = 61;
    private static final byte[] _STANDARD_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, -9, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] _URL_SAFE_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] _URL_SAFE_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, 63, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] _ORDERED_ALPHABET = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] _ORDERED_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* loaded from: classes2.dex */
    public static class B64InputStream extends FilterInputStream {
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int numSigBytes;
        private int options;
        private int position;

        public B64InputStream(InputStream inputStream) {
            this(inputStream, 0);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read;
            if (this.position < 0) {
                if (this.encode) {
                    byte[] bArr = new byte[3];
                    int i10 = 0;
                    for (int i11 = 0; i11 < 3; i11++) {
                        int read2 = ((FilterInputStream) this).in.read();
                        if (read2 < 0) {
                            break;
                        }
                        bArr[i11] = (byte) read2;
                        i10++;
                    }
                    if (i10 <= 0) {
                        return -1;
                    }
                    Base64.encode3to4(bArr, 0, i10, this.buffer, 0, this.options);
                    this.position = 0;
                    this.numSigBytes = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i12 = 0;
                    while (i12 < 4) {
                        do {
                            read = ((FilterInputStream) this).in.read();
                            if (read < 0) {
                                break;
                            }
                        } while (this.decodabet[read & 127] <= -5);
                        if (read < 0) {
                            break;
                        }
                        bArr2[i12] = (byte) read;
                        i12++;
                    }
                    if (i12 != 4) {
                        if (i12 == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.numSigBytes = Base64.decode4to3(bArr2, 0, this.buffer, 0, this.options);
                    this.position = 0;
                }
            }
            int i13 = this.position;
            if (i13 >= 0) {
                if (i13 >= this.numSigBytes) {
                    return -1;
                }
                if (this.encode && this.breakLines && this.lineLength >= 76) {
                    this.lineLength = 0;
                    return 10;
                }
                this.lineLength++;
                byte[] bArr3 = this.buffer;
                int i14 = i13 + 1;
                this.position = i14;
                byte b10 = bArr3[i13];
                if (i14 >= this.bufferLength) {
                    this.position = -1;
                }
                return b10 & 255;
            }
            throw new IOException("Error in Base64 code reading stream.");
        }

        public B64InputStream(InputStream inputStream, int i10) {
            super(inputStream);
            this.options = i10;
            this.breakLines = (i10 & 8) > 0;
            boolean z10 = (i10 & 1) > 0;
            this.encode = z10;
            int i11 = z10 ? 4 : 3;
            this.bufferLength = i11;
            this.buffer = new byte[i11];
            this.position = -1;
            this.lineLength = 0;
            this.decodabet = Base64.getDecodabet(i10);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i10 + i12] = (byte) read;
                    i12++;
                } else if (i12 == 0) {
                    return -1;
                }
            }
            return i12;
        }
    }

    /* loaded from: classes2.dex */
    public static class B64OutputStream extends FilterOutputStream {

        /* renamed from: b4  reason: collision with root package name */
        private byte[] f7361b4;
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int options;
        private int position;
        private boolean suspendEncoding;

        public B64OutputStream(OutputStream outputStream) {
            this(outputStream, 1);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            flushBase64();
            super.close();
            this.buffer = null;
            ((FilterOutputStream) this).out = null;
        }

        public void flushBase64() {
            int i10 = this.position;
            if (i10 > 0) {
                if (this.encode) {
                    ((FilterOutputStream) this).out.write(Base64.encode3to4(this.f7361b4, this.buffer, i10, this.options));
                    this.position = 0;
                    return;
                }
                throw new IOException("Base64 input not properly padded.");
            }
        }

        public void resumeEncoding() {
            this.suspendEncoding = false;
        }

        public void suspendEncoding() {
            flushBase64();
            this.suspendEncoding = true;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) {
            if (this.suspendEncoding) {
                ((FilterOutputStream) this).out.write(i10);
            } else if (this.encode) {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                int i12 = i11 + 1;
                this.position = i12;
                bArr[i11] = (byte) i10;
                int i13 = this.bufferLength;
                if (i12 >= i13) {
                    ((FilterOutputStream) this).out.write(Base64.encode3to4(this.f7361b4, bArr, i13, this.options));
                    int i14 = this.lineLength + 4;
                    this.lineLength = i14;
                    if (this.breakLines && i14 >= 76) {
                        ((FilterOutputStream) this).out.write(10);
                        this.lineLength = 0;
                    }
                    this.position = 0;
                }
            } else {
                byte b10 = this.decodabet[i10 & 127];
                if (b10 <= -5) {
                    if (b10 != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr2 = this.buffer;
                int i15 = this.position;
                int i16 = i15 + 1;
                this.position = i16;
                bArr2[i15] = (byte) i10;
                if (i16 >= this.bufferLength) {
                    ((FilterOutputStream) this).out.write(this.f7361b4, 0, Base64.decode4to3(bArr2, 0, this.f7361b4, 0, this.options));
                    this.position = 0;
                }
            }
        }

        public B64OutputStream(OutputStream outputStream, int i10) {
            super(outputStream);
            this.breakLines = (i10 & 8) != 0;
            boolean z10 = (i10 & 1) != 0;
            this.encode = z10;
            int i11 = z10 ? 3 : 4;
            this.bufferLength = i11;
            this.buffer = new byte[i11];
            this.position = 0;
            this.lineLength = 0;
            this.suspendEncoding = false;
            this.f7361b4 = new byte[4];
            this.options = i10;
            this.decodabet = Base64.getDecodabet(i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            if (this.suspendEncoding) {
                ((FilterOutputStream) this).out.write(bArr, i10, i11);
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                write(bArr[i10 + i12]);
            }
        }
    }

    private Base64() {
    }

    public static byte[] decode(byte[] bArr) {
        return decode(bArr, 0, bArr.length, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int decode4to3(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13;
        int i14;
        if (bArr != null) {
            if (bArr2 != null) {
                if (i10 >= 0 && (i13 = i10 + 3) < bArr.length) {
                    if (i11 >= 0 && (i14 = i11 + 2) < bArr2.length) {
                        byte[] decodabet = getDecodabet(i12);
                        byte b10 = bArr[i10 + 2];
                        if (b10 == 61) {
                            bArr2[i11] = (byte) ((((decodabet[bArr[i10 + 1]] & 255) << 12) | ((decodabet[bArr[i10]] & 255) << 18)) >>> 16);
                            return 1;
                        }
                        byte b11 = bArr[i13];
                        if (b11 == 61) {
                            int i15 = ((decodabet[bArr[i10 + 1]] & 255) << 12) | ((decodabet[bArr[i10]] & 255) << 18) | ((decodabet[b10] & 255) << 6);
                            bArr2[i11] = (byte) (i15 >>> 16);
                            bArr2[i11 + 1] = (byte) (i15 >>> 8);
                            return 2;
                        }
                        int i16 = ((decodabet[bArr[i10 + 1]] & 255) << 12) | ((decodabet[bArr[i10]] & 255) << 18) | ((decodabet[b10] & 255) << 6) | (decodabet[b11] & 255);
                        bArr2[i11] = (byte) (i16 >> 16);
                        bArr2[i11 + 1] = (byte) (i16 >> 8);
                        bArr2[i14] = (byte) i16;
                        return 3;
                    }
                    throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i11)));
                }
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10)));
            }
            throw new NullPointerException("Destination array was null.");
        }
        throw new NullPointerException("Source array was null.");
    }

    public static void decodeFileToFile(String str, String str2) {
        BufferedOutputStream bufferedOutputStream;
        byte[] decodeFromFile = decodeFromFile(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(decodeFromFile);
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e10) {
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e11) {
            throw e11;
        }
    }

    public static byte[] decodeFromFile(String str) {
        B64InputStream b64InputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.length() <= TTL.MAX_VALUE) {
                    byte[] bArr = new byte[(int) file.length()];
                    B64InputStream b64InputStream2 = new B64InputStream(new BufferedInputStream(new FileInputStream(file)), 0);
                    int i10 = 0;
                    while (true) {
                        try {
                            int read = b64InputStream2.read(bArr, i10, 4096);
                            if (read < 0) {
                                break;
                            }
                            i10 += read;
                        } catch (IOException e10) {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            b64InputStream = b64InputStream2;
                            try {
                                b64InputStream.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    }
                    byte[] bArr2 = new byte[i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    try {
                        b64InputStream2.close();
                    } catch (Exception unused2) {
                    }
                    return bArr2;
                }
                throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            throw e11;
        }
    }

    public static void decodeToFile(String str, String str2) {
        B64OutputStream b64OutputStream;
        B64OutputStream b64OutputStream2 = null;
        try {
            try {
                b64OutputStream = new B64OutputStream(new FileOutputStream(str2), 0);
            } catch (IOException e10) {
                throw e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            b64OutputStream.write(str.getBytes(PREFERRED_ENCODING));
            try {
                b64OutputStream.close();
            } catch (Exception unused) {
            }
        } catch (IOException e11) {
        } catch (Throwable th2) {
            th = th2;
            b64OutputStream2 = b64OutputStream;
            try {
                b64OutputStream2.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }

    public static Object decodeToObject(String str) {
        return decodeToObject(str, 0, null);
    }

    public static void encode(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            encode3to4(bArr2, bArr, min, 0);
            byteBuffer2.put(bArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, byte[] bArr2, int i10, int i11) {
        encode3to4(bArr2, 0, i10, bArr, 0, i11);
        return bArr;
    }

    public static String encodeBytes(byte[] bArr) {
        try {
            return encodeBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static byte[] encodeBytesToBytes(byte[] bArr) {
        try {
            return encodeBytesToBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static void encodeFileToFile(String str, String str2) {
        BufferedOutputStream bufferedOutputStream;
        String encodeFromFile = encodeFromFile(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(encodeFromFile.getBytes(PREFERRED_ENCODING));
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e10) {
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e11) {
            throw e11;
        }
    }

    public static String encodeFromFile(String str) {
        B64InputStream b64InputStream = null;
        try {
            try {
                File file = new File(str);
                double length = file.length();
                Double.isNaN(length);
                byte[] bArr = new byte[Math.max((int) ((length * 1.4d) + 1.0d), 40)];
                B64InputStream b64InputStream2 = new B64InputStream(new BufferedInputStream(new FileInputStream(file)), 1);
                int i10 = 0;
                while (true) {
                    try {
                        int read = b64InputStream2.read(bArr, i10, 4096);
                        if (read < 0) {
                            break;
                        }
                        i10 += read;
                    } catch (IOException e10) {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        b64InputStream = b64InputStream2;
                        try {
                            b64InputStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i10, PREFERRED_ENCODING);
                try {
                    b64InputStream2.close();
                } catch (Exception unused2) {
                }
                return str2;
            } catch (IOException e11) {
                throw e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String encodeObject(Serializable serializable) {
        return encodeObject(serializable, 0);
    }

    public static void encodeToFile(byte[] bArr, String str) {
        B64OutputStream b64OutputStream;
        if (bArr != null) {
            B64OutputStream b64OutputStream2 = null;
            try {
                try {
                    b64OutputStream = new B64OutputStream(new FileOutputStream(str), 1);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    b64OutputStream.write(bArr);
                    try {
                        b64OutputStream.close();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (IOException e10) {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    b64OutputStream2 = b64OutputStream;
                    try {
                        b64OutputStream2.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e11) {
                throw e11;
            }
        }
        throw new NullPointerException("Data to encode was null.");
    }

    private static byte[] getAlphabet(int i10) {
        if ((i10 & 16) == 16) {
            return _URL_SAFE_ALPHABET;
        }
        if ((i10 & 32) == 32) {
            return _ORDERED_ALPHABET;
        }
        return _STANDARD_ALPHABET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] getDecodabet(int i10) {
        if ((i10 & 16) == 16) {
            return _URL_SAFE_DECODABET;
        }
        if ((i10 & 32) == 32) {
            return _ORDERED_DECODABET;
        }
        return _STANDARD_DECODABET;
    }

    public static byte[] decode(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        if (bArr != null) {
            if (i10 < 0 || (i13 = i10 + i11) > bArr.length) {
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            if (i11 == 0) {
                return new byte[0];
            }
            if (i11 >= 4) {
                byte[] decodabet = getDecodabet(i12);
                byte[] bArr2 = new byte[(i11 * 3) / 4];
                byte[] bArr3 = new byte[4];
                int i14 = 0;
                int i15 = 0;
                while (i10 < i13) {
                    byte b10 = bArr[i10];
                    byte b11 = decodabet[b10 & 255];
                    if (b11 < -5) {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i10] & 255), Integer.valueOf(i10)));
                    }
                    if (b11 >= -1) {
                        int i16 = i14 + 1;
                        bArr3[i14] = b10;
                        if (i16 > 3) {
                            i15 += decode4to3(bArr3, 0, bArr2, i15, i12);
                            if (bArr[i10] == 61) {
                                break;
                            }
                            i14 = 0;
                        } else {
                            i14 = i16;
                        }
                    }
                    i10++;
                }
                byte[] bArr4 = new byte[i15];
                System.arraycopy(bArr2, 0, bArr4, 0, i15);
                return bArr4;
            }
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i11);
        }
        throw new NullPointerException("Cannot decode null source array.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static Object decodeToObject(String str, int i10, final ClassLoader classLoader) {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        byte[] decode = decode(str, i10);
        ByteArrayInputStream byteArrayInputStream2 = null;
        r2 = null;
        r2 = null;
        ObjectInputStream objectInputStream2 = null;
        byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(decode);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (classLoader == 0) {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } else {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream) { // from class: com.hpplay.component.protocol.plist.Base64.1
                        @Override // java.io.ObjectInputStream
                        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
                            Class<?> cls = Class.forName(objectStreamClass.getName(), false, classLoader);
                            if (cls == null) {
                                return super.resolveClass(objectStreamClass);
                            }
                            return cls;
                        }
                    };
                }
                objectInputStream2 = objectInputStream;
                Object readObject = objectInputStream2.readObject();
                try {
                    byteArrayInputStream.close();
                } catch (Exception unused) {
                }
                try {
                    objectInputStream2.close();
                } catch (Exception unused2) {
                }
                return readObject;
            } catch (IOException e10) {
                e = e10;
                throw e;
            } catch (ClassNotFoundException e11) {
                e = e11;
                throw e;
            } catch (Throwable th2) {
                th = th2;
                classLoader = objectInputStream2;
                byteArrayInputStream2 = byteArrayInputStream;
                try {
                    byteArrayInputStream2.close();
                } catch (Exception unused3) {
                }
                try {
                    classLoader.close();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (ClassNotFoundException e13) {
            e = e13;
        } catch (Throwable th3) {
            th = th3;
            classLoader = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        byte[] alphabet = getAlphabet(i13);
        int i14 = (i11 > 0 ? (bArr[i10] << Ascii.CAN) >>> 8 : 0) | (i11 > 1 ? (bArr[i10 + 1] << Ascii.CAN) >>> 16 : 0) | (i11 > 2 ? (bArr[i10 + 2] << Ascii.CAN) >>> 24 : 0);
        if (i11 == 1) {
            bArr2[i12] = alphabet[i14 >>> 18];
            bArr2[i12 + 1] = alphabet[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = EQUALS_SIGN;
            bArr2[i12 + 3] = EQUALS_SIGN;
            return bArr2;
        } else if (i11 == 2) {
            bArr2[i12] = alphabet[i14 >>> 18];
            bArr2[i12 + 1] = alphabet[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = alphabet[(i14 >>> 6) & 63];
            bArr2[i12 + 3] = EQUALS_SIGN;
            return bArr2;
        } else if (i11 != 3) {
            return bArr2;
        } else {
            bArr2[i12] = alphabet[i14 >>> 18];
            bArr2[i12 + 1] = alphabet[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = alphabet[(i14 >>> 6) & 63];
            bArr2[i12 + 3] = alphabet[i14 & 63];
            return bArr2;
        }
    }

    public static String encodeBytes(byte[] bArr, int i10) {
        return encodeBytes(bArr, 0, bArr.length, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static byte[] encodeBytesToBytes(byte[] bArr, int i10, int i11, int i12) {
        ByteArrayOutputStream byteArrayOutputStream;
        B64OutputStream b64OutputStream;
        ?? r42;
        if (bArr != null) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Cannot have negative offset: " + i10);
            } else if (i11 >= 0) {
                if (i10 + i11 <= bArr.length) {
                    if ((i12 & 2) != 0) {
                        ByteArrayOutputStream byteArrayOutputStream2 = null;
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                b64OutputStream = new B64OutputStream(byteArrayOutputStream, i12 | 1);
                                try {
                                    r42 = new GZIPOutputStream(b64OutputStream);
                                } catch (IOException e10) {
                                    e = e10;
                                    r42 = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        byteArrayOutputStream2.close();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        b64OutputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused3) {
                                    }
                                    throw th;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                b64OutputStream = null;
                                r42 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                b64OutputStream = null;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            b64OutputStream = null;
                            r42 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            byteArrayOutputStream = null;
                            b64OutputStream = null;
                        }
                        try {
                            r42.write(bArr, i10, i11);
                            r42.close();
                            try {
                                r42.close();
                            } catch (Exception unused4) {
                            }
                            try {
                                b64OutputStream.close();
                            } catch (Exception unused5) {
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused6) {
                            }
                            return byteArrayOutputStream.toByteArray();
                        } catch (IOException e13) {
                            e = e13;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            r42 = r42;
                            try {
                                throw e;
                            } catch (Throwable th4) {
                                th = th4;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                byteArrayOutputStream2 = r42;
                                byteArrayOutputStream2.close();
                                b64OutputStream.close();
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            byteArrayOutputStream2 = r42;
                            byteArrayOutputStream2.close();
                            b64OutputStream.close();
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    }
                    boolean z10 = (i12 & 8) != 0;
                    int i13 = ((i11 / 3) * 4) + (i11 % 3 > 0 ? 4 : 0);
                    if (z10) {
                        i13 += i13 / 76;
                    }
                    int i14 = i13;
                    byte[] bArr2 = new byte[i14];
                    int i15 = i11 - 2;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    while (i16 < i15) {
                        int i19 = i16;
                        encode3to4(bArr, i16 + i10, 3, bArr2, i17, i12);
                        int i20 = i18 + 4;
                        if (!z10 || i20 < 76) {
                            i18 = i20;
                        } else {
                            bArr2[i17 + 4] = 10;
                            i17++;
                            i18 = 0;
                        }
                        i16 = i19 + 3;
                        i17 += 4;
                    }
                    int i21 = i16;
                    if (i21 < i11) {
                        encode3to4(bArr, i21 + i10, i11 - i21, bArr2, i17, i12);
                        i17 += 4;
                    }
                    int i22 = i17;
                    if (i22 <= i14 - 1) {
                        byte[] bArr3 = new byte[i22];
                        System.arraycopy(bArr2, 0, bArr3, 0, i22);
                        return bArr3;
                    }
                    return bArr2;
                }
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length)));
            } else {
                throw new IllegalArgumentException("Cannot have length offset: " + i11);
            }
        }
        throw new NullPointerException("Cannot serialize a null array.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String encodeObject(Serializable serializable, int i10) {
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        B64OutputStream b64OutputStream;
        OutputStream outputStream2;
        if (serializable != null) {
            ObjectOutputStream objectOutputStream = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    b64OutputStream = new B64OutputStream(byteArrayOutputStream, i10 | 1);
                    try {
                        if ((i10 & 2) != 0) {
                            outputStream = new GZIPOutputStream(b64OutputStream);
                            try {
                                objectOutputStream = new ObjectOutputStream(outputStream);
                                outputStream = outputStream;
                            } catch (IOException e10) {
                                e = e10;
                                outputStream2 = objectOutputStream;
                                objectOutputStream = byteArrayOutputStream;
                                outputStream = outputStream;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    OutputStream outputStream3 = outputStream2;
                                    byteArrayOutputStream = objectOutputStream;
                                    objectOutputStream = outputStream3;
                                    try {
                                        objectOutputStream.close();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        outputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        b64OutputStream.close();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused4) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                objectOutputStream.close();
                                outputStream.close();
                                b64OutputStream.close();
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } else {
                            objectOutputStream = new ObjectOutputStream(b64OutputStream);
                            outputStream = null;
                        }
                        objectOutputStream.writeObject(serializable);
                        try {
                            objectOutputStream.close();
                        } catch (Exception unused5) {
                        }
                        try {
                            outputStream.close();
                        } catch (Exception unused6) {
                        }
                        try {
                            b64OutputStream.close();
                        } catch (Exception unused7) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused8) {
                        }
                        try {
                            return new String(byteArrayOutputStream.toByteArray(), PREFERRED_ENCODING);
                        } catch (UnsupportedEncodingException unused9) {
                            return new String(byteArrayOutputStream.toByteArray());
                        }
                    } catch (IOException e11) {
                        e = e11;
                        OutputStream outputStream4 = objectOutputStream;
                        objectOutputStream = byteArrayOutputStream;
                        outputStream2 = outputStream4;
                        outputStream = outputStream4;
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = objectOutputStream;
                    }
                } catch (IOException e12) {
                    e = e12;
                    outputStream = null;
                    b64OutputStream = null;
                    objectOutputStream = byteArrayOutputStream;
                    outputStream2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = null;
                    b64OutputStream = null;
                }
            } catch (IOException e13) {
                e = e13;
                outputStream = null;
                outputStream2 = null;
                b64OutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                outputStream = null;
                byteArrayOutputStream = 0;
                b64OutputStream = null;
            }
        } else {
            throw new NullPointerException("Cannot serialize a null object.");
        }
    }

    public static String encodeBytes(byte[] bArr, int i10, int i11) {
        try {
            return encodeBytes(bArr, i10, i11, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String encodeBytes(byte[] bArr, int i10, int i11, int i12) {
        byte[] encodeBytesToBytes = encodeBytesToBytes(bArr, i10, i11, i12);
        try {
            return new String(encodeBytesToBytes, PREFERRED_ENCODING);
        } catch (UnsupportedEncodingException unused) {
            return new String(encodeBytesToBytes);
        }
    }

    public static void encode(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            encode3to4(bArr2, bArr, min, 0);
            for (int i10 = 0; i10 < 4; i10++) {
                charBuffer.put((char) (bArr2[i10] & 255));
            }
        }
    }

    public static byte[] decode(String str) {
        return decode(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0059 -> B:74:0x0059). Please submit an issue!!! */
    public static byte[] decode(String str, int i10) {
        byte[] bytes;
        ?? length;
        GZIPInputStream gZIPInputStream;
        if (str != null) {
            try {
                bytes = str.getBytes(PREFERRED_ENCODING);
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            byte[] decode = decode(bytes, 0, bytes.length, i10);
            boolean z10 = (i10 & 4) != 0;
            if (decode != null && (length = decode.length) >= 4 && !z10 && 35615 == ((decode[0] & 255) | ((decode[1] << 8) & 65280))) {
                byte[] bArr = new byte[2048];
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            length = new ByteArrayInputStream(decode);
                            try {
                                gZIPInputStream = new GZIPInputStream(length);
                                while (true) {
                                    try {
                                        int read = gZIPInputStream.read(bArr);
                                        if (read < 0) {
                                            break;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, read);
                                    } catch (IOException e10) {
                                        e = e10;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        length = length;
                                        try {
                                            e.printStackTrace();
                                            byteArrayOutputStream.close();
                                            gZIPInputStream.close();
                                            length.close();
                                            return decode;
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                byteArrayOutputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                gZIPInputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                            try {
                                                length.close();
                                            } catch (Exception unused4) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream.close();
                                        gZIPInputStream.close();
                                        length.close();
                                        throw th;
                                    }
                                }
                                decode = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                            } catch (IOException e11) {
                                e = e11;
                                gZIPInputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                gZIPInputStream = null;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            length = 0;
                            gZIPInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            length = 0;
                            gZIPInputStream = null;
                        }
                    } catch (Exception unused5) {
                    }
                } catch (IOException e13) {
                    e = e13;
                    length = 0;
                    gZIPInputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    length = 0;
                    gZIPInputStream = null;
                }
                try {
                    gZIPInputStream.close();
                } catch (Exception unused6) {
                }
                try {
                    length.close();
                } catch (Exception unused7) {
                }
            }
            return decode;
        }
        throw new NullPointerException("Input string was null.");
    }
}
