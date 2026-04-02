package com.google.android.play.core.assetpacks;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class bp extends el {
    private final int a;
    private final String b;
    private final long c;
    private final long d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bp(int i, String str, long j, long j2, int i2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.el
    public final int a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.el
    public final int b() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.el
    public final long c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.el
    public final long d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.el
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof el) {
            el elVar = (el) obj;
            if (this.a == elVar.a() && ((str = this.b) != null ? str.equals(elVar.e()) : elVar.e() == null) && this.c == elVar.c() && this.d == elVar.d() && this.e == elVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.a;
        long j = this.c;
        long j2 = this.d;
        return ((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "SliceCheckpoint{fileExtractionStatus=" + this.a + ", filePath=" + this.b + ", fileOffset=" + this.c + ", remainingBytes=" + this.d + ", previousChunk=" + this.e + "}";
    }
}
