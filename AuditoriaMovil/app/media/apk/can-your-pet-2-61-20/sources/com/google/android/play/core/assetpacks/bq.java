package com.google.android.play.core.assetpacks;

import java.util.Arrays;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class bq extends es {
    private final String a;
    private final long b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final byte[] f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bq(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.es
    public final int a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.es
    public final long b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.es
    public final String c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.es
    public final boolean d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.es
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof es) {
            es esVar = (es) obj;
            String str = this.a;
            if (str != null ? str.equals(esVar.c()) : esVar.c() == null) {
                if (this.b == esVar.b() && this.c == esVar.a() && this.d == esVar.e() && this.e == esVar.d()) {
                    if (Arrays.equals(this.f, esVar instanceof bq ? ((bq) esVar).f : esVar.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.es
    public final byte[] f() {
        return this.f;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f);
        return "ZipEntry{name=" + this.a + ", size=" + this.b + ", compressionMethod=" + this.c + ", isPartial=" + this.d + ", isEndOfArchive=" + this.e + ", headerBytes=" + arrays + "}";
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = this.c;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f);
    }
}
