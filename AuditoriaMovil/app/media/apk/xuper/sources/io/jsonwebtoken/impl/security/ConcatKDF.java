package io.jsonwebtoken.impl.security;

import io.jsonwebtoken.impl.lang.Bytes;
import io.jsonwebtoken.impl.lang.CheckedFunction;
import io.jsonwebtoken.lang.Assert;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ConcatKDF extends CryptoAlgorithm {
    private static final long MAX_DERIVED_KEY_BIT_LENGTH = 17179869176L;
    private static final long MAX_HASH_INPUT_BIT_LENGTH = 17179869176L;
    private static final long MAX_HASH_INPUT_BYTE_LENGTH = 2147483647L;
    private static final long MAX_REP_COUNT = 4294967295L;
    private final int hashBitLength;

    /* loaded from: classes3.dex */
    public static class ClearableByteArrayOutputStream extends ByteArrayOutputStream {
        public ClearableByteArrayOutputStream(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            super.reset();
            Bytes.clear(((ByteArrayOutputStream) this).buf);
        }
    }

    public ConcatKDF(String str) {
        super("ConcatKDF", str);
        boolean z10;
        int intValue = ((Integer) jca().withMessageDigest(new CheckedFunction<MessageDigest, Integer>() { // from class: io.jsonwebtoken.impl.security.ConcatKDF.1
            @Override // io.jsonwebtoken.impl.lang.CheckedFunction
            public Integer apply(MessageDigest messageDigest) {
                return Integer.valueOf(messageDigest.getDigestLength());
            }
        })).intValue() * 8;
        this.hashBitLength = intValue;
        if (intValue > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assert.state(z10, "MessageDigest length must be a positive value.");
    }

    public SecretKey deriveKey(final byte[] bArr, final long j10, byte[] bArr2) {
        boolean z10;
        final byte[] bArr3;
        boolean z11;
        boolean z12;
        boolean z13;
        final ClearableByteArrayOutputStream clearableByteArrayOutputStream;
        byte[] bArr4;
        Assert.notEmpty(bArr, "Z cannot be null or empty.");
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assert.isTrue(z10, "derivedKeyBitLength must be a positive integer.");
        if (j10 <= 17179869176L) {
            long j11 = j10 / 8;
            if (bArr2 == null) {
                bArr3 = Bytes.EMPTY;
            } else {
                bArr3 = bArr2;
            }
            double d10 = j10;
            double d11 = this.hashBitLength;
            Double.isNaN(d10);
            Double.isNaN(d11);
            double d12 = d10 / d11;
            final long ceil = (long) Math.ceil(d12);
            if (d12 != ceil) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (ceil <= MAX_REP_COUNT) {
                z12 = true;
            } else {
                z12 = false;
            }
            Assert.state(z12, "derivedKeyBitLength is too large.");
            final byte[] bArr5 = {0, 0, 0, 1};
            if (Bytes.bitLength(bArr5) + Bytes.bitLength(bArr) + Bytes.bitLength(bArr3) <= 17179869176L) {
                z13 = true;
            } else {
                z13 = false;
            }
            Assert.state(z13, "Hash input is too large.");
            ClearableByteArrayOutputStream clearableByteArrayOutputStream2 = new ClearableByteArrayOutputStream((int) j11);
            byte[] bArr6 = Bytes.EMPTY;
            try {
                clearableByteArrayOutputStream = clearableByteArrayOutputStream2;
                final boolean z14 = z11;
                try {
                    bArr4 = (byte[]) jca().withMessageDigest(new CheckedFunction<MessageDigest, byte[]>() { // from class: io.jsonwebtoken.impl.security.ConcatKDF.2
                        @Override // io.jsonwebtoken.impl.lang.CheckedFunction
                        public byte[] apply(MessageDigest messageDigest) {
                            for (long j12 = 1; j12 <= ceil; j12++) {
                                messageDigest.update(bArr5);
                                messageDigest.update(bArr);
                                messageDigest.update(bArr3);
                                byte[] digest = messageDigest.digest();
                                Bytes.increment(bArr5);
                                if (j12 == ceil && z14) {
                                    int i10 = (int) ((j10 % ConcatKDF.this.hashBitLength) / 8);
                                    byte[] bArr7 = new byte[i10];
                                    System.arraycopy(digest, 0, bArr7, 0, i10);
                                    digest = bArr7;
                                }
                                clearableByteArrayOutputStream.write(digest);
                            }
                            return clearableByteArrayOutputStream.toByteArray();
                        }
                    });
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                clearableByteArrayOutputStream = clearableByteArrayOutputStream2;
            }
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr4, "AES");
                Bytes.clear(bArr4);
                Bytes.clear(bArr5);
                clearableByteArrayOutputStream.reset();
                return secretKeySpec;
            } catch (Throwable th3) {
                th = th3;
                bArr6 = bArr4;
                Bytes.clear(bArr6);
                Bytes.clear(bArr5);
                clearableByteArrayOutputStream.reset();
                throw th;
            }
        }
        throw new IllegalArgumentException("derivedKeyBitLength may not exceed " + Bytes.bitsMsg(17179869176L) + ". Specified size: " + Bytes.bitsMsg(j10) + ".");
    }
}
