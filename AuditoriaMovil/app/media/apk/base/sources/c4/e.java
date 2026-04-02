package C4;

import U3.h;
import V2.k;
import android.net.Uri;
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: m  reason: collision with root package name */
    public final Uri f546m;

    /* renamed from: n  reason: collision with root package name */
    public final byte[] f547n;

    /* renamed from: o  reason: collision with root package name */
    public final int f548o;

    public e(k kVar, h hVar, Uri uri, byte[] bArr, long j, int i7, boolean z7) {
        super(kVar, hVar);
        if (j < 0) {
            this.f538a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f548o = i7;
        this.f546m = uri;
        this.f547n = i7 <= 0 ? null : bArr;
        q("X-Goog-Upload-Protocol", "resumable");
        if (z7 && i7 > 0) {
            q("X-Goog-Upload-Command", "upload, finalize");
        } else if (z7) {
            q("X-Goog-Upload-Command", "finalize");
        } else {
            q("X-Goog-Upload-Command", "upload");
        }
        q("X-Goog-Upload-Offset", Long.toString(j));
    }

    @Override // C4.c
    public final String d() {
        return "POST";
    }

    @Override // C4.c
    public final byte[] f() {
        return this.f547n;
    }

    @Override // C4.c
    public final int g() {
        int i7 = this.f548o;
        if (i7 <= 0) {
            return 0;
        }
        return i7;
    }

    @Override // C4.c
    public final Uri k() {
        return this.f546m;
    }
}
