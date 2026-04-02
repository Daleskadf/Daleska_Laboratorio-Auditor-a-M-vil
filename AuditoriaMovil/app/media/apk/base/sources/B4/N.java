package b4;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final String f8208a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8209b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8210c;

    public N(String str, String str2, String str3) {
        this.f8208a = str;
        this.f8209b = str2;
        this.f8210c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N) {
            N n7 = (N) obj;
            String str = this.f8208a;
            if (str != null ? str.equals(n7.f8208a) : n7.f8208a == null) {
                String str2 = this.f8209b;
                if (str2 != null ? str2.equals(n7.f8209b) : n7.f8209b == null) {
                    String str3 = this.f8210c;
                    if (str3 != null ? str3.equals(n7.f8210c) : n7.f8210c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i7 = 0;
        String str = this.f8208a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f8209b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (i8 ^ hashCode2) * 1000003;
        String str3 = this.f8210c;
        if (str3 != null) {
            i7 = str3.hashCode();
        }
        return i7 ^ i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttestationResult{recaptchaV2Token=");
        sb.append(this.f8208a);
        sb.append(", playIntegrityToken=");
        sb.append(this.f8209b);
        sb.append(", recaptchaEnterpriseToken=");
        return AbstractC0059i.D(sb, this.f8210c, "}");
    }
}
