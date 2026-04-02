package io.grpc.okhttp.internal;

import javax.security.auth.x500.X500Principal;
import org.apache.tika.pipes.PipesConfigBase;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f12543a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12544b;

    /* renamed from: c  reason: collision with root package name */
    public int f12545c;

    /* renamed from: d  reason: collision with root package name */
    public int f12546d;

    /* renamed from: e  reason: collision with root package name */
    public int f12547e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public char[] f12548g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f12543a = name;
        this.f12544b = name.length();
    }

    public final int a(int i7) {
        int i8;
        int i9;
        int i10 = i7 + 1;
        int i11 = this.f12544b;
        String str = this.f12543a;
        if (i10 < i11) {
            char[] cArr = this.f12548g;
            char c8 = cArr[i7];
            if (c8 >= '0' && c8 <= '9') {
                i8 = c8 - '0';
            } else if (c8 >= 'a' && c8 <= 'f') {
                i8 = c8 - 'W';
            } else if (c8 >= 'A' && c8 <= 'F') {
                i8 = c8 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            char c9 = cArr[i10];
            if (c9 >= '0' && c9 <= '9') {
                i9 = c9 - '0';
            } else if (c9 >= 'a' && c9 <= 'f') {
                i9 = c9 - 'W';
            } else if (c9 >= 'A' && c9 <= 'F') {
                i9 = c9 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            return (i8 << 4) + i9;
        }
        throw new IllegalStateException("Malformed DN: " + str);
    }

    public final char b() {
        int i7;
        int i8 = this.f12545c + 1;
        this.f12545c = i8;
        int i9 = this.f12544b;
        if (i8 != i9) {
            char c8 = this.f12548g[i8];
            if (c8 != ' ' && c8 != '%' && c8 != '\\' && c8 != '_' && c8 != '\"' && c8 != '#') {
                switch (c8) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c8) {
                            case ';':
                            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                            case '=':
                            case '>':
                                break;
                            default:
                                int a7 = a(i8);
                                this.f12545c++;
                                if (a7 >= 128) {
                                    if (a7 >= 192 && a7 <= 247) {
                                        if (a7 <= 223) {
                                            a7 &= 31;
                                            i7 = 1;
                                        } else if (a7 <= 239) {
                                            a7 &= 15;
                                            i7 = 2;
                                        } else {
                                            a7 &= 7;
                                            i7 = 3;
                                        }
                                        for (int i10 = 0; i10 < i7; i10++) {
                                            int i11 = this.f12545c;
                                            int i12 = i11 + 1;
                                            this.f12545c = i12;
                                            if (i12 != i9 && this.f12548g[i12] == '\\') {
                                                int i13 = i11 + 2;
                                                this.f12545c = i13;
                                                int a8 = a(i13);
                                                this.f12545c++;
                                                if ((a8 & 192) == 128) {
                                                    a7 = (a7 << 6) + (a8 & 63);
                                                }
                                            }
                                        }
                                    }
                                    return '?';
                                }
                                return (char) a7;
                        }
                }
            }
            return c8;
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f12543a);
    }

    public final String c() {
        int i7;
        int i8;
        int i9;
        char c8;
        int i10;
        char c9;
        char c10;
        while (true) {
            i7 = this.f12545c;
            i8 = this.f12544b;
            if (i7 >= i8 || this.f12548g[i7] != ' ') {
                break;
            }
            this.f12545c = i7 + 1;
        }
        if (i7 == i8) {
            return null;
        }
        this.f12546d = i7;
        this.f12545c = i7 + 1;
        while (true) {
            i9 = this.f12545c;
            if (i9 >= i8 || (c10 = this.f12548g[i9]) == '=' || c10 == ' ') {
                break;
            }
            this.f12545c = i9 + 1;
        }
        String str = this.f12543a;
        if (i9 < i8) {
            this.f12547e = i9;
            if (this.f12548g[i9] == ' ') {
                while (true) {
                    i10 = this.f12545c;
                    if (i10 >= i8 || (c9 = this.f12548g[i10]) == '=' || c9 != ' ') {
                        break;
                    }
                    this.f12545c = i10 + 1;
                }
                if (this.f12548g[i10] != '=' || i10 == i8) {
                    throw new IllegalStateException("Unexpected end of DN: " + str);
                }
            }
            this.f12545c++;
            while (true) {
                int i11 = this.f12545c;
                if (i11 >= i8 || this.f12548g[i11] != ' ') {
                    break;
                }
                this.f12545c = i11 + 1;
            }
            int i12 = this.f12547e;
            int i13 = this.f12546d;
            if (i12 - i13 > 4) {
                char[] cArr = this.f12548g;
                if (cArr[i13 + 3] == '.' && (((c8 = cArr[i13]) == 'O' || c8 == 'o') && ((cArr[i13 + 1] == 'I' || cArr[i13 + 1] == 'i') && (cArr[i13 + 2] == 'D' || cArr[i13 + 2] == 'd')))) {
                    this.f12546d = i13 + 4;
                }
            }
            char[] cArr2 = this.f12548g;
            int i14 = this.f12546d;
            return new String(cArr2, i14, i12 - i14);
        }
        throw new IllegalStateException("Unexpected end of DN: " + str);
    }
}
