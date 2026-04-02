package com.google.android.play.core.integrity;
/* loaded from: classes.dex */
final class a extends ap {

    /* renamed from: a  reason: collision with root package name */
    private String f9470a;

    /* renamed from: b  reason: collision with root package name */
    private y f9471b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.f9471b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f9470a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f9470a;
        if (str != null && (yVar = this.f9471b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9470a == null) {
            sb.append(" token");
        }
        if (this.f9471b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
