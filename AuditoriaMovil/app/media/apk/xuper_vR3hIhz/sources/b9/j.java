package b9;

import java.net.ProtocolException;
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final i f5201a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5202b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5203c;

    public j(i iVar, int i10, String str) {
        this.f5201a = iVar;
        this.f5202b = i10;
        this.f5203c = str;
    }

    public static j a(String str) {
        i iVar;
        int i10;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i10 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    iVar = i.HTTP_1_0;
                } else if (charAt == 1) {
                    iVar = i.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            iVar = i.HTTP_1_0;
            i10 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                int parseInt = Integer.parseInt(str.substring(i10, i11));
                if (str.length() > i11) {
                    if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                } else {
                    str2 = "";
                }
                return new j(iVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
        throw new ProtocolException("Unexpected status line: " + str);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f5201a == i.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.f5202b);
        if (this.f5203c != null) {
            sb.append(' ');
            sb.append(this.f5203c);
        }
        return sb.toString();
    }
}
