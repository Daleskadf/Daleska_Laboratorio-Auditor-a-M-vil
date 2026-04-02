package M0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* renamed from: M0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238e extends AbstractC0236c {

    /* renamed from: X  reason: collision with root package name */
    public AssetFileDescriptor f3150X;

    /* renamed from: Y  reason: collision with root package name */
    public FileInputStream f3151Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f3152Z;

    /* renamed from: e  reason: collision with root package name */
    public final ContentResolver f3153e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f3154e0;
    public Uri f;

    public C0238e(Context context) {
        super(false);
        this.f3153e = context.getContentResolver();
    }

    @Override // M0.h
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f3151Y;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f3151Y = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3150X;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new i(e7, 2000);
                    }
                } finally {
                    this.f3150X = null;
                    if (this.f3154e0) {
                        this.f3154e0 = false;
                        c();
                    }
                }
            } catch (IOException e8) {
                throw new i(e8, 2000);
            }
        } catch (Throwable th) {
            this.f3151Y = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f3150X;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3150X = null;
                    if (this.f3154e0) {
                        this.f3154e0 = false;
                        c();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new i(e9, 2000);
                }
            } finally {
                this.f3150X = null;
                if (this.f3154e0) {
                    this.f3154e0 = false;
                    c();
                }
            }
        }
    }

    @Override // M0.h
    public final long e(l lVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i7 = 2000;
        try {
            Uri normalizeScheme = lVar.f3172a.normalizeScheme();
            this.f = normalizeScheme;
            h();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f3153e;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f3150X = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f3151Y = fileInputStream;
                int i8 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                long j = lVar.f3176e;
                if (i8 != 0 && j > length) {
                    throw new i((Exception) null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j) - startOffset;
                if (skip == j) {
                    if (i8 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f3152Z = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f3152Z = position;
                            if (position < 0) {
                                throw new i((Exception) null, 2008);
                            }
                        }
                    } else {
                        long j8 = length - skip;
                        this.f3152Z = j8;
                        if (j8 < 0) {
                            throw new i((Exception) null, 2008);
                        }
                    }
                    long j9 = lVar.f;
                    int i9 = (j9 > (-1L) ? 1 : (j9 == (-1L) ? 0 : -1));
                    if (i9 != 0) {
                        long j10 = this.f3152Z;
                        if (j10 == -1) {
                            min = j9;
                        } else {
                            min = Math.min(j10, j9);
                        }
                        this.f3152Z = min;
                    }
                    this.f3154e0 = true;
                    k(lVar);
                    if (i9 == 0) {
                        return this.f3152Z;
                    }
                    return j9;
                }
                throw new i((Exception) null, 2008);
            }
            throw new i(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
        } catch (C0237d e7) {
            throw e7;
        } catch (IOException e8) {
            if (e8 instanceof FileNotFoundException) {
                i7 = 2005;
            }
            throw new i(e8, i7);
        }
    }

    @Override // M0.h
    public final Uri p() {
        return this.f;
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f3152Z;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i8 = (int) Math.min(j, i8);
            } catch (IOException e7) {
                throw new i(e7, 2000);
            }
        }
        FileInputStream fileInputStream = this.f3151Y;
        int i9 = K0.x.f2529a;
        int read = fileInputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f3152Z;
        if (j8 != -1) {
            this.f3152Z = j8 - read;
        }
        b(read);
        return read;
    }
}
