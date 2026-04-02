package com.google.android.play.core.integrity;
/* loaded from: classes.dex */
public class IntegrityServiceException extends com.google.android.gms.common.api.j {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f9468a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IntegrityServiceException(int r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = com.google.android.play.core.integrity.model.a.a(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Integrity API error ("
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = "): "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            r0.<init>(r5, r1, r2, r2)
            r4.<init>(r0)
            if (r5 == 0) goto L2f
            r4.f9468a = r6
            return
        L2f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "ErrorCode should not be 0."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.IntegrityServiceException.<init>(int, java.lang.Throwable):void");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f9468a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
