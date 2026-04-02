package com.google.android.play.core.integrity;
/* loaded from: classes.dex */
final class b extends bq {

    /* renamed from: a  reason: collision with root package name */
    private String f9522a;

    /* renamed from: b  reason: collision with root package name */
    private y f9523b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f9523b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str != null) {
            this.f9522a = str;
            return this;
        }
        throw new NullPointerException("Null token");
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f9522a;
        if (str != null && (yVar = this.f9523b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9522a == null) {
            sb.append(" token");
        }
        if (this.f9523b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
