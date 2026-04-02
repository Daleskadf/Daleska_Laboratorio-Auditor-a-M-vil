package M0;

import D.AbstractC0059i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;
/* loaded from: classes.dex */
public final class A extends AbstractC0236c {

    /* renamed from: X  reason: collision with root package name */
    public AssetFileDescriptor f3126X;

    /* renamed from: Y  reason: collision with root package name */
    public FileInputStream f3127Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f3128Z;

    /* renamed from: e  reason: collision with root package name */
    public final Context f3129e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f3130e0;
    public l f;

    public A(Context context) {
        super(false);
        this.f3129e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    @Override // M0.h
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f3127Y;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f3127Y = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3126X;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new i(null, e7, 2000);
                    }
                } finally {
                    this.f3126X = null;
                    if (this.f3130e0) {
                        this.f3130e0 = false;
                        c();
                    }
                }
            } catch (IOException e8) {
                throw new i(null, e8, 2000);
            }
        } catch (Throwable th) {
            this.f3127Y = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f3126X;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3126X = null;
                    if (this.f3130e0) {
                        this.f3130e0 = false;
                        c();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new i(null, e9, 2000);
                }
            } finally {
                this.f3126X = null;
                if (this.f3130e0) {
                    this.f3130e0 = false;
                    c();
                }
            }
        }
    }

    @Override // M0.h
    public final long e(l lVar) {
        String host;
        Resources resourcesForApplication;
        int parseInt;
        int i7;
        Resources resources;
        long min;
        this.f = lVar;
        h();
        Uri normalizeScheme = lVar.f3172a.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f3129e;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                try {
                    i7 = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new i("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                throw new i("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new i("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e7, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new i("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(AbstractC0059i.A(host, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, path), "raw", null);
                if (parseInt == 0) {
                    throw new i("Resource not found.", null, 2005);
                }
            }
            i7 = parseInt;
            resources = resourcesForApplication;
        } else {
            throw new i("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i7);
            if (openRawResourceFd != null) {
                this.f3126X = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(this.f3126X.getFileDescriptor());
                this.f3127Y = fileInputStream;
                int i8 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                long j = lVar.f3176e;
                try {
                    if (i8 != 0 && j > length) {
                        throw new i(null, null, 2008);
                    }
                    long startOffset = this.f3126X.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j) - startOffset;
                    if (skip == j) {
                        if (i8 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.f3128Z = -1L;
                            } else {
                                long size = channel.size() - channel.position();
                                this.f3128Z = size;
                                if (size < 0) {
                                    throw new i(null, null, 2008);
                                }
                            }
                        } else {
                            long j8 = length - skip;
                            this.f3128Z = j8;
                            if (j8 < 0) {
                                throw new i(2008);
                            }
                        }
                        long j9 = lVar.f;
                        int i9 = (j9 > (-1L) ? 1 : (j9 == (-1L) ? 0 : -1));
                        if (i9 != 0) {
                            long j10 = this.f3128Z;
                            if (j10 == -1) {
                                min = j9;
                            } else {
                                min = Math.min(j10, j9);
                            }
                            this.f3128Z = min;
                        }
                        this.f3130e0 = true;
                        k(lVar);
                        if (i9 == 0) {
                            return this.f3128Z;
                        }
                        return j9;
                    }
                    throw new i(null, null, 2008);
                } catch (z e8) {
                    throw e8;
                } catch (IOException e9) {
                    throw new i(null, e9, 2000);
                }
            }
            throw new i("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e10) {
            throw new i(null, e10, 2005);
        }
    }

    @Override // M0.h
    public final Uri p() {
        l lVar = this.f;
        if (lVar != null) {
            return lVar.f3172a;
        }
        return null;
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f3128Z;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i8 = (int) Math.min(j, i8);
            } catch (IOException e7) {
                throw new i(null, e7, 2000);
            }
        }
        FileInputStream fileInputStream = this.f3127Y;
        int i9 = K0.x.f2529a;
        int read = fileInputStream.read(bArr, i7, i8);
        if (read == -1) {
            if (this.f3128Z == -1) {
                return -1;
            }
            throw new i("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j8 = this.f3128Z;
        if (j8 != -1) {
            this.f3128Z = j8 - read;
        }
        b(read);
        return read;
    }
}
