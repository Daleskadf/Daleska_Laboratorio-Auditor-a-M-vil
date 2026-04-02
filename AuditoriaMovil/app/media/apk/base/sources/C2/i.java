package C2;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f500a;

    /* renamed from: b  reason: collision with root package name */
    public final String f501b;

    /* renamed from: c  reason: collision with root package name */
    public final String f502c;

    /* renamed from: d  reason: collision with root package name */
    public final String f503d;

    /* renamed from: e  reason: collision with root package name */
    public final String f504e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f505g;

    /* renamed from: h  reason: collision with root package name */
    public final String f506h;

    /* renamed from: i  reason: collision with root package name */
    public final String f507i;
    public final String j;

    /* renamed from: k  reason: collision with root package name */
    public final String f508k;

    /* renamed from: l  reason: collision with root package name */
    public final String f509l;

    public i(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f500a = num;
        this.f501b = str;
        this.f502c = str2;
        this.f503d = str3;
        this.f504e = str4;
        this.f = str5;
        this.f505g = str6;
        this.f506h = str7;
        this.f507i = str8;
        this.j = str9;
        this.f508k = str10;
        this.f509l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f500a;
        if (num != null ? num.equals(((i) aVar).f500a) : ((i) aVar).f500a == null) {
            String str = this.f501b;
            if (str != null ? str.equals(((i) aVar).f501b) : ((i) aVar).f501b == null) {
                String str2 = this.f502c;
                if (str2 != null ? str2.equals(((i) aVar).f502c) : ((i) aVar).f502c == null) {
                    String str3 = this.f503d;
                    if (str3 != null ? str3.equals(((i) aVar).f503d) : ((i) aVar).f503d == null) {
                        String str4 = this.f504e;
                        if (str4 != null ? str4.equals(((i) aVar).f504e) : ((i) aVar).f504e == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(((i) aVar).f) : ((i) aVar).f == null) {
                                String str6 = this.f505g;
                                if (str6 != null ? str6.equals(((i) aVar).f505g) : ((i) aVar).f505g == null) {
                                    String str7 = this.f506h;
                                    if (str7 != null ? str7.equals(((i) aVar).f506h) : ((i) aVar).f506h == null) {
                                        String str8 = this.f507i;
                                        if (str8 != null ? str8.equals(((i) aVar).f507i) : ((i) aVar).f507i == null) {
                                            String str9 = this.j;
                                            if (str9 != null ? str9.equals(((i) aVar).j) : ((i) aVar).j == null) {
                                                String str10 = this.f508k;
                                                if (str10 != null ? str10.equals(((i) aVar).f508k) : ((i) aVar).f508k == null) {
                                                    String str11 = this.f509l;
                                                    if (str11 == null) {
                                                        if (((i) aVar).f509l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((i) aVar).f509l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int i7 = 0;
        Integer num = this.f500a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i8 = (hashCode ^ 1000003) * 1000003;
        String str = this.f501b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i9 = (i8 ^ hashCode2) * 1000003;
        String str2 = this.f502c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i10 = (i9 ^ hashCode3) * 1000003;
        String str3 = this.f503d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode4) * 1000003;
        String str4 = this.f504e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i12 = (i11 ^ hashCode5) * 1000003;
        String str5 = this.f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i13 = (i12 ^ hashCode6) * 1000003;
        String str6 = this.f505g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i14 = (i13 ^ hashCode7) * 1000003;
        String str7 = this.f506h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i15 = (i14 ^ hashCode8) * 1000003;
        String str8 = this.f507i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i16 = (i15 ^ hashCode9) * 1000003;
        String str9 = this.j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i17 = (i16 ^ hashCode10) * 1000003;
        String str10 = this.f508k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i18 = (i17 ^ hashCode11) * 1000003;
        String str11 = this.f509l;
        if (str11 != null) {
            i7 = str11.hashCode();
        }
        return i7 ^ i18;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f500a);
        sb.append(", model=");
        sb.append(this.f501b);
        sb.append(", hardware=");
        sb.append(this.f502c);
        sb.append(", device=");
        sb.append(this.f503d);
        sb.append(", product=");
        sb.append(this.f504e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.f505g);
        sb.append(", fingerprint=");
        sb.append(this.f506h);
        sb.append(", locale=");
        sb.append(this.f507i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.f508k);
        sb.append(", applicationBuild=");
        return AbstractC0059i.D(sb, this.f509l, "}");
    }
}
