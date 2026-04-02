package K0;

import H4.e1;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0533j;
import androidx.datastore.preferences.protobuf.AbstractC0547y;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0530g;
import androidx.datastore.preferences.protobuf.C0536m;
import androidx.datastore.preferences.protobuf.InterfaceC0548z;
import androidx.datastore.preferences.protobuf.Z;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.v0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.crypto.tink.shaded.protobuf.AbstractC0777d;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785l;
import com.google.crypto.tink.shaded.protobuf.AbstractC0792t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0798z;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.F;
import com.google.crypto.tink.shaded.protobuf.I;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.protobuf.AbstractC0839f0;
import com.google.protobuf.AbstractC0840g;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.AbstractC0860q;
import com.google.protobuf.AbstractC0867u;
import com.google.protobuf.C0871w;
import com.google.protobuf.C0878z0;
import com.google.protobuf.E;
import com.google.protobuf.E0;
import com.google.protobuf.InterfaceC0831b0;
import com.google.protobuf.J;
import com.google.protobuf.P;
import com.google.protobuf.V;
import com.google.protobuf.X;
import com.google.protobuf.g1;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.NoSuchElementException;
import m6.AbstractC1446g;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2493a;

    /* renamed from: b  reason: collision with root package name */
    public int f2494b;

    /* renamed from: c  reason: collision with root package name */
    public int f2495c;

    /* renamed from: d  reason: collision with root package name */
    public int f2496d;

    /* renamed from: e  reason: collision with root package name */
    public Object f2497e;

    public l(int i7) {
        this.f2493a = i7;
        switch (i7) {
            case 1:
                int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
                this.f2496d = highestOneBit - 1;
                this.f2497e = new int[highestOneBit];
                return;
            default:
                return;
        }
    }

    public static void X(int i7) {
        if ((i7 & 3) == 0) {
            return;
        }
        throw F.f();
    }

    public static void Y(int i7) {
        if ((i7 & 3) == 0) {
            return;
        }
        throw X.g();
    }

    public static void Z(int i7) {
        if ((i7 & 7) == 0) {
            return;
        }
        throw F.f();
    }

    public static void a0(int i7) {
        if ((i7 & 7) == 0) {
            return;
        }
        throw X.g();
    }

    public void A(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof AbstractC0792t;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    AbstractC0792t abstractC0792t = (AbstractC0792t) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 2) {
                        if (i7 == 5) {
                            do {
                                abstractC0792t.h(dVar.t());
                                if (!dVar.g()) {
                                    C8 = dVar.C();
                                } else {
                                    return;
                                }
                            } while (C8 == this.f2494b);
                            this.f2496d = C8;
                            return;
                        }
                        throw F.c();
                    }
                    int D4 = dVar.D();
                    X(D4);
                    int f = dVar.f() + D4;
                    do {
                        abstractC0792t.h(dVar.t());
                    } while (dVar.f() < f);
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 2) {
                    if (i8 == 5) {
                        do {
                            list.add(Float.valueOf(dVar.t()));
                            if (!dVar.g()) {
                                C7 = dVar.C();
                            } else {
                                return;
                            }
                        } while (C7 == this.f2494b);
                        this.f2496d = C7;
                        return;
                    }
                    throw F.c();
                }
                int D7 = dVar.D();
                X(D7);
                int f4 = dVar.f() + D7;
                do {
                    list.add(Float.valueOf(dVar.t()));
                } while (dVar.f() < f4);
                return;
            default:
                boolean z8 = list instanceof E;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    E e7 = (E) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 2) {
                        if (i9 == 5) {
                            do {
                                e7.h(bVar.q());
                                if (!bVar.g()) {
                                    A8 = bVar.A();
                                } else {
                                    return;
                                }
                            } while (A8 == this.f2494b);
                            this.f2496d = A8;
                            return;
                        }
                        throw X.d();
                    }
                    int B7 = bVar.B();
                    Y(B7);
                    int f8 = bVar.f() + B7;
                    do {
                        e7.h(bVar.q());
                    } while (bVar.f() < f8);
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 2) {
                    if (i10 == 5) {
                        do {
                            list.add(Float.valueOf(bVar.q()));
                            if (!bVar.g()) {
                                A7 = bVar.A();
                            } else {
                                return;
                            }
                        } while (A7 == this.f2494b);
                        this.f2496d = A7;
                        return;
                    }
                    throw X.d();
                }
                int B8 = bVar.B();
                Y(B8);
                int f9 = bVar.f() + B8;
                do {
                    list.add(Float.valueOf(bVar.q()));
                } while (bVar.f() < f9);
                return;
        }
    }

    public void B(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 0) {
            if (i7 == 2) {
                int f = dVar.f() + dVar.D();
                do {
                    ((Z) interfaceC0548z).add(Integer.valueOf(dVar.u()));
                } while (dVar.f() < f);
                U(f);
                return;
            }
            throw C.b();
        }
        do {
            ((Z) interfaceC0548z).add(Integer.valueOf(dVar.u()));
            if (dVar.g()) {
                return;
            }
            C7 = dVar.C();
        } while (C7 == this.f2494b);
        this.f2496d = C7;
    }

    public void C(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof AbstractC0798z;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    AbstractC0798z abstractC0798z = (AbstractC0798z) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 0) {
                        if (i7 == 2) {
                            int f = dVar.f() + dVar.D();
                            do {
                                abstractC0798z.h(dVar.u());
                            } while (dVar.f() < f);
                            U(f);
                            return;
                        }
                        throw F.c();
                    }
                    do {
                        abstractC0798z.h(dVar.u());
                        if (!dVar.g()) {
                            C8 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C8 == this.f2494b);
                    this.f2496d = C8;
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int f4 = dVar.f() + dVar.D();
                        do {
                            list.add(Integer.valueOf(dVar.u()));
                        } while (dVar.f() < f4);
                        U(f4);
                        return;
                    }
                    throw F.c();
                }
                do {
                    list.add(Integer.valueOf(dVar.u()));
                    if (!dVar.g()) {
                        C7 = dVar.C();
                    } else {
                        return;
                    }
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            default:
                boolean z8 = list instanceof P;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    P p7 = (P) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 0) {
                        if (i9 == 2) {
                            int f8 = bVar.f() + bVar.B();
                            do {
                                p7.h(bVar.s());
                            } while (bVar.f() < f8);
                            U(f8);
                            return;
                        }
                        throw X.d();
                    }
                    do {
                        p7.h(bVar.s());
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int f9 = bVar.f() + bVar.B();
                        do {
                            list.add(Integer.valueOf(bVar.s()));
                        } while (bVar.f() < f9);
                        U(f9);
                        return;
                    }
                    throw X.d();
                }
                do {
                    list.add(Integer.valueOf(bVar.s()));
                    if (!bVar.g()) {
                        A7 = bVar.A();
                    } else {
                        return;
                    }
                } while (A7 == this.f2494b);
                this.f2496d = A7;
                return;
        }
    }

    public void D(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 0) {
            if (i7 == 2) {
                int f = dVar.f() + dVar.D();
                do {
                    ((Z) interfaceC0548z).add(Long.valueOf(dVar.v()));
                } while (dVar.f() < f);
                U(f);
                return;
            }
            throw C.b();
        }
        do {
            ((Z) interfaceC0548z).add(Long.valueOf(dVar.v()));
            if (dVar.g()) {
                return;
            }
            C7 = dVar.C();
        } while (C7 == this.f2494b);
        this.f2496d = C7;
    }

    public void E(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof M;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    M m7 = (M) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 0) {
                        if (i7 == 2) {
                            int f = dVar.f() + dVar.D();
                            do {
                                m7.h(dVar.v());
                            } while (dVar.f() < f);
                            U(f);
                            return;
                        }
                        throw F.c();
                    }
                    do {
                        m7.h(dVar.v());
                        if (!dVar.g()) {
                            C8 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C8 == this.f2494b);
                    this.f2496d = C8;
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int f4 = dVar.f() + dVar.D();
                        do {
                            list.add(Long.valueOf(dVar.v()));
                        } while (dVar.f() < f4);
                        U(f4);
                        return;
                    }
                    throw F.c();
                }
                do {
                    list.add(Long.valueOf(dVar.v()));
                    if (!dVar.g()) {
                        C7 = dVar.C();
                    } else {
                        return;
                    }
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            default:
                boolean z8 = list instanceof AbstractC0839f0;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 0) {
                        if (i9 == 2) {
                            int f8 = bVar.f() + bVar.B();
                            do {
                                abstractC0839f0.h(bVar.t());
                            } while (bVar.f() < f8);
                            U(f8);
                            return;
                        }
                        throw X.d();
                    }
                    do {
                        abstractC0839f0.h(bVar.t());
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int f9 = bVar.f() + bVar.B();
                        do {
                            list.add(Long.valueOf(bVar.t()));
                        } while (bVar.f() < f9);
                        U(f9);
                        return;
                    }
                    throw X.d();
                }
                do {
                    list.add(Long.valueOf(bVar.t()));
                    if (!bVar.g()) {
                        A7 = bVar.A();
                    } else {
                        return;
                    }
                } while (A7 == this.f2494b);
                this.f2496d = A7;
                return;
        }
    }

    public void F(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 2) {
            if (i7 == 5) {
                do {
                    ((Z) interfaceC0548z).add(Integer.valueOf(dVar.w()));
                    if (dVar.g()) {
                        return;
                    }
                    C7 = dVar.C();
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            }
            throw C.b();
        }
        int D4 = dVar.D();
        if ((D4 & 3) == 0) {
            int f = dVar.f() + D4;
            do {
                ((Z) interfaceC0548z).add(Integer.valueOf(dVar.w()));
            } while (dVar.f() < f);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void G(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof AbstractC0798z;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    AbstractC0798z abstractC0798z = (AbstractC0798z) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 2) {
                        if (i7 == 5) {
                            do {
                                abstractC0798z.h(dVar.w());
                                if (!dVar.g()) {
                                    C8 = dVar.C();
                                } else {
                                    return;
                                }
                            } while (C8 == this.f2494b);
                            this.f2496d = C8;
                            return;
                        }
                        throw F.c();
                    }
                    int D4 = dVar.D();
                    X(D4);
                    int f = dVar.f() + D4;
                    do {
                        abstractC0798z.h(dVar.w());
                    } while (dVar.f() < f);
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 2) {
                    if (i8 == 5) {
                        do {
                            list.add(Integer.valueOf(dVar.w()));
                            if (!dVar.g()) {
                                C7 = dVar.C();
                            } else {
                                return;
                            }
                        } while (C7 == this.f2494b);
                        this.f2496d = C7;
                        return;
                    }
                    throw F.c();
                }
                int D7 = dVar.D();
                X(D7);
                int f4 = dVar.f() + D7;
                do {
                    list.add(Integer.valueOf(dVar.w()));
                } while (dVar.f() < f4);
                return;
            default:
                boolean z8 = list instanceof P;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    P p7 = (P) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 2) {
                        if (i9 == 5) {
                            do {
                                p7.h(bVar.u());
                                if (!bVar.g()) {
                                    A8 = bVar.A();
                                } else {
                                    return;
                                }
                            } while (A8 == this.f2494b);
                            this.f2496d = A8;
                            return;
                        }
                        throw X.d();
                    }
                    int B7 = bVar.B();
                    Y(B7);
                    int f8 = bVar.f() + B7;
                    do {
                        p7.h(bVar.u());
                    } while (bVar.f() < f8);
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 2) {
                    if (i10 == 5) {
                        do {
                            list.add(Integer.valueOf(bVar.u()));
                            if (!bVar.g()) {
                                A7 = bVar.A();
                            } else {
                                return;
                            }
                        } while (A7 == this.f2494b);
                        this.f2496d = A7;
                        return;
                    }
                    throw X.d();
                }
                int B8 = bVar.B();
                Y(B8);
                int f9 = bVar.f() + B8;
                do {
                    list.add(Integer.valueOf(bVar.u()));
                } while (bVar.f() < f9);
                return;
        }
    }

    public void H(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 1) {
            if (i7 == 2) {
                int D4 = dVar.D();
                if ((D4 & 7) == 0) {
                    int f = dVar.f() + D4;
                    do {
                        ((Z) interfaceC0548z).add(Long.valueOf(dVar.x()));
                    } while (dVar.f() < f);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw C.b();
        }
        do {
            ((Z) interfaceC0548z).add(Long.valueOf(dVar.x()));
            if (dVar.g()) {
                return;
            }
            C7 = dVar.C();
        } while (C7 == this.f2494b);
        this.f2496d = C7;
    }

    public void I(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof M;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    M m7 = (M) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 1) {
                        if (i7 == 2) {
                            int D4 = dVar.D();
                            Z(D4);
                            int f = dVar.f() + D4;
                            do {
                                m7.h(dVar.x());
                            } while (dVar.f() < f);
                            return;
                        }
                        throw F.c();
                    }
                    do {
                        m7.h(dVar.x());
                        if (!dVar.g()) {
                            C8 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C8 == this.f2494b);
                    this.f2496d = C8;
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 1) {
                    if (i8 == 2) {
                        int D7 = dVar.D();
                        Z(D7);
                        int f4 = dVar.f() + D7;
                        do {
                            list.add(Long.valueOf(dVar.x()));
                        } while (dVar.f() < f4);
                        return;
                    }
                    throw F.c();
                }
                do {
                    list.add(Long.valueOf(dVar.x()));
                    if (!dVar.g()) {
                        C7 = dVar.C();
                    } else {
                        return;
                    }
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            default:
                boolean z8 = list instanceof AbstractC0839f0;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 1) {
                        if (i9 == 2) {
                            int B7 = bVar.B();
                            a0(B7);
                            int f8 = bVar.f() + B7;
                            do {
                                abstractC0839f0.h(bVar.v());
                            } while (bVar.f() < f8);
                            return;
                        }
                        throw X.d();
                    }
                    do {
                        abstractC0839f0.h(bVar.v());
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int B8 = bVar.B();
                        a0(B8);
                        int f9 = bVar.f() + B8;
                        do {
                            list.add(Long.valueOf(bVar.v()));
                        } while (bVar.f() < f9);
                        return;
                    }
                    throw X.d();
                }
                do {
                    list.add(Long.valueOf(bVar.v()));
                    if (!bVar.g()) {
                        A7 = bVar.A();
                    } else {
                        return;
                    }
                } while (A7 == this.f2494b);
                this.f2496d = A7;
                return;
        }
    }

    public void J(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 0) {
            if (i7 == 2) {
                int f = dVar.f() + dVar.D();
                do {
                    ((Z) interfaceC0548z).add(Integer.valueOf(dVar.y()));
                } while (dVar.f() < f);
                U(f);
                return;
            }
            throw C.b();
        }
        do {
            ((Z) interfaceC0548z).add(Integer.valueOf(dVar.y()));
            if (dVar.g()) {
                return;
            }
            C7 = dVar.C();
        } while (C7 == this.f2494b);
        this.f2496d = C7;
    }

    public void K(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof AbstractC0798z;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    AbstractC0798z abstractC0798z = (AbstractC0798z) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 0) {
                        if (i7 == 2) {
                            int f = dVar.f() + dVar.D();
                            do {
                                abstractC0798z.h(dVar.y());
                            } while (dVar.f() < f);
                            U(f);
                            return;
                        }
                        throw F.c();
                    }
                    do {
                        abstractC0798z.h(dVar.y());
                        if (!dVar.g()) {
                            C8 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C8 == this.f2494b);
                    this.f2496d = C8;
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int f4 = dVar.f() + dVar.D();
                        do {
                            list.add(Integer.valueOf(dVar.y()));
                        } while (dVar.f() < f4);
                        U(f4);
                        return;
                    }
                    throw F.c();
                }
                do {
                    list.add(Integer.valueOf(dVar.y()));
                    if (!dVar.g()) {
                        C7 = dVar.C();
                    } else {
                        return;
                    }
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            default:
                boolean z8 = list instanceof P;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    P p7 = (P) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 0) {
                        if (i9 == 2) {
                            int f8 = bVar.f() + bVar.B();
                            do {
                                p7.h(bVar.w());
                            } while (bVar.f() < f8);
                            U(f8);
                            return;
                        }
                        throw X.d();
                    }
                    do {
                        p7.h(bVar.w());
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int f9 = bVar.f() + bVar.B();
                        do {
                            list.add(Integer.valueOf(bVar.w()));
                        } while (bVar.f() < f9);
                        U(f9);
                        return;
                    }
                    throw X.d();
                }
                do {
                    list.add(Integer.valueOf(bVar.w()));
                    if (!bVar.g()) {
                        A7 = bVar.A();
                    } else {
                        return;
                    }
                } while (A7 == this.f2494b);
                this.f2496d = A7;
                return;
        }
    }

    public void L(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 0) {
            if (i7 == 2) {
                int f = dVar.f() + dVar.D();
                do {
                    ((Z) interfaceC0548z).add(Long.valueOf(dVar.z()));
                } while (dVar.f() < f);
                U(f);
                return;
            }
            throw C.b();
        }
        do {
            ((Z) interfaceC0548z).add(Long.valueOf(dVar.z()));
            if (dVar.g()) {
                return;
            }
            C7 = dVar.C();
        } while (C7 == this.f2494b);
        this.f2496d = C7;
    }

    public void M(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof M;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    M m7 = (M) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 0) {
                        if (i7 == 2) {
                            int f = dVar.f() + dVar.D();
                            do {
                                m7.h(dVar.z());
                            } while (dVar.f() < f);
                            U(f);
                            return;
                        }
                        throw F.c();
                    }
                    do {
                        m7.h(dVar.z());
                        if (!dVar.g()) {
                            C8 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C8 == this.f2494b);
                    this.f2496d = C8;
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int f4 = dVar.f() + dVar.D();
                        do {
                            list.add(Long.valueOf(dVar.z()));
                        } while (dVar.f() < f4);
                        U(f4);
                        return;
                    }
                    throw F.c();
                }
                do {
                    list.add(Long.valueOf(dVar.z()));
                    if (!dVar.g()) {
                        C7 = dVar.C();
                    } else {
                        return;
                    }
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            default:
                boolean z8 = list instanceof AbstractC0839f0;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 0) {
                        if (i9 == 2) {
                            int f8 = bVar.f() + bVar.B();
                            do {
                                abstractC0839f0.h(bVar.x());
                            } while (bVar.f() < f8);
                            U(f8);
                            return;
                        }
                        throw X.d();
                    }
                    do {
                        abstractC0839f0.h(bVar.x());
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int f9 = bVar.f() + bVar.B();
                        do {
                            list.add(Long.valueOf(bVar.x()));
                        } while (bVar.f() < f9);
                        U(f9);
                        return;
                    }
                    throw X.d();
                }
                do {
                    list.add(Long.valueOf(bVar.x()));
                    if (!bVar.g()) {
                        A7 = bVar.A();
                    } else {
                        return;
                    }
                } while (A7 == this.f2494b);
                this.f2496d = A7;
                return;
        }
    }

    public void N(InterfaceC0548z interfaceC0548z, boolean z7) {
        String A7;
        int C7;
        if ((this.f2494b & 7) == 2) {
            do {
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    V(2);
                    A7 = dVar.B();
                } else {
                    V(2);
                    A7 = dVar.A();
                }
                ((Z) interfaceC0548z).add(A7);
                if (dVar.g()) {
                    return;
                }
                C7 = dVar.C();
            } while (C7 == this.f2494b);
            this.f2496d = C7;
            return;
        }
        throw C.b();
    }

    public void O(List list, boolean z7) {
        String A7;
        int C7;
        int C8;
        String y2;
        int A8;
        int A9;
        switch (this.f2493a) {
            case 3:
                if ((this.f2494b & 7) == 2) {
                    boolean z8 = list instanceof I;
                    H3.d dVar = (H3.d) this.f2497e;
                    if (z8 && !z7) {
                        I i7 = (I) list;
                        do {
                            i7.j(l());
                            if (!dVar.g()) {
                                C8 = dVar.C();
                            } else {
                                return;
                            }
                        } while (C8 == this.f2494b);
                        this.f2496d = C8;
                        return;
                    }
                    do {
                        if (z7) {
                            V(2);
                            A7 = dVar.B();
                        } else {
                            V(2);
                            A7 = dVar.A();
                        }
                        list.add(A7);
                        if (!dVar.g()) {
                            C7 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C7 == this.f2494b);
                    this.f2496d = C7;
                    return;
                }
                throw F.c();
            default:
                if ((this.f2494b & 7) == 2) {
                    boolean z9 = list instanceof InterfaceC0831b0;
                    J6.b bVar = (J6.b) this.f2497e;
                    if (z9 && !z7) {
                        InterfaceC0831b0 interfaceC0831b0 = (InterfaceC0831b0) list;
                        do {
                            interfaceC0831b0.g(m());
                            if (!bVar.g()) {
                                A9 = bVar.A();
                            } else {
                                return;
                            }
                        } while (A9 == this.f2494b);
                        this.f2496d = A9;
                        return;
                    }
                    do {
                        if (z7) {
                            V(2);
                            y2 = bVar.z();
                        } else {
                            V(2);
                            y2 = bVar.y();
                        }
                        list.add(y2);
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                throw X.d();
        }
    }

    public void P(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 0) {
            if (i7 == 2) {
                int f = dVar.f() + dVar.D();
                do {
                    ((Z) interfaceC0548z).add(Integer.valueOf(dVar.D()));
                } while (dVar.f() < f);
                U(f);
                return;
            }
            throw C.b();
        }
        do {
            ((Z) interfaceC0548z).add(Integer.valueOf(dVar.D()));
            if (dVar.g()) {
                return;
            }
            C7 = dVar.C();
        } while (C7 == this.f2494b);
        this.f2496d = C7;
    }

    public void Q(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof AbstractC0798z;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    AbstractC0798z abstractC0798z = (AbstractC0798z) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 0) {
                        if (i7 == 2) {
                            int f = dVar.f() + dVar.D();
                            do {
                                abstractC0798z.h(dVar.D());
                            } while (dVar.f() < f);
                            U(f);
                            return;
                        }
                        throw F.c();
                    }
                    do {
                        abstractC0798z.h(dVar.D());
                        if (!dVar.g()) {
                            C8 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C8 == this.f2494b);
                    this.f2496d = C8;
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int f4 = dVar.f() + dVar.D();
                        do {
                            list.add(Integer.valueOf(dVar.D()));
                        } while (dVar.f() < f4);
                        U(f4);
                        return;
                    }
                    throw F.c();
                }
                do {
                    list.add(Integer.valueOf(dVar.D()));
                    if (!dVar.g()) {
                        C7 = dVar.C();
                    } else {
                        return;
                    }
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            default:
                boolean z8 = list instanceof P;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    P p7 = (P) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 0) {
                        if (i9 == 2) {
                            int f8 = bVar.f() + bVar.B();
                            do {
                                p7.h(bVar.B());
                            } while (bVar.f() < f8);
                            U(f8);
                            return;
                        }
                        throw X.d();
                    }
                    do {
                        p7.h(bVar.B());
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int f9 = bVar.f() + bVar.B();
                        do {
                            list.add(Integer.valueOf(bVar.B()));
                        } while (bVar.f() < f9);
                        U(f9);
                        return;
                    }
                    throw X.d();
                }
                do {
                    list.add(Integer.valueOf(bVar.B()));
                    if (!bVar.g()) {
                        A7 = bVar.A();
                    } else {
                        return;
                    }
                } while (A7 == this.f2494b);
                this.f2496d = A7;
                return;
        }
    }

    public void R(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 0) {
            if (i7 == 2) {
                int f = dVar.f() + dVar.D();
                do {
                    ((Z) interfaceC0548z).add(Long.valueOf(dVar.E()));
                } while (dVar.f() < f);
                U(f);
                return;
            }
            throw C.b();
        }
        do {
            ((Z) interfaceC0548z).add(Long.valueOf(dVar.E()));
            if (dVar.g()) {
                return;
            }
            C7 = dVar.C();
        } while (C7 == this.f2494b);
        this.f2496d = C7;
    }

    public void S(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof M;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    M m7 = (M) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 0) {
                        if (i7 == 2) {
                            int f = dVar.f() + dVar.D();
                            do {
                                m7.h(dVar.E());
                            } while (dVar.f() < f);
                            U(f);
                            return;
                        }
                        throw F.c();
                    }
                    do {
                        m7.h(dVar.E());
                        if (!dVar.g()) {
                            C8 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C8 == this.f2494b);
                    this.f2496d = C8;
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int f4 = dVar.f() + dVar.D();
                        do {
                            list.add(Long.valueOf(dVar.E()));
                        } while (dVar.f() < f4);
                        U(f4);
                        return;
                    }
                    throw F.c();
                }
                do {
                    list.add(Long.valueOf(dVar.E()));
                    if (!dVar.g()) {
                        C7 = dVar.C();
                    } else {
                        return;
                    }
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            default:
                boolean z8 = list instanceof AbstractC0839f0;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 0) {
                        if (i9 == 2) {
                            int f8 = bVar.f() + bVar.B();
                            do {
                                abstractC0839f0.h(bVar.C());
                            } while (bVar.f() < f8);
                            U(f8);
                            return;
                        }
                        throw X.d();
                    }
                    do {
                        abstractC0839f0.h(bVar.C());
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int f9 = bVar.f() + bVar.B();
                        do {
                            list.add(Long.valueOf(bVar.C()));
                        } while (bVar.f() < f9);
                        U(f9);
                        return;
                    }
                    throw X.d();
                }
                do {
                    list.add(Long.valueOf(bVar.C()));
                    if (!bVar.g()) {
                        A7 = bVar.A();
                    } else {
                        return;
                    }
                } while (A7 == this.f2494b);
                this.f2496d = A7;
                return;
        }
    }

    public long T() {
        int i7 = this.f2495c;
        if (i7 != 0) {
            int i8 = this.f2494b;
            long j = ((long[]) this.f2497e)[i8];
            this.f2494b = (i8 + 1) & this.f2496d;
            this.f2495c = i7 - 1;
            return j;
        }
        throw new NoSuchElementException();
    }

    public void U(int i7) {
        switch (this.f2493a) {
            case 2:
                if (((H3.d) this.f2497e).f() == i7) {
                    return;
                }
                throw C.e();
            case 3:
                if (((H3.d) this.f2497e).f() == i7) {
                    return;
                }
                throw F.g();
            default:
                if (((J6.b) this.f2497e).f() == i7) {
                    return;
                }
                throw X.h();
        }
    }

    public void V(int i7) {
        switch (this.f2493a) {
            case 2:
                if ((this.f2494b & 7) == i7) {
                    return;
                }
                throw C.b();
            case 3:
                if ((this.f2494b & 7) == i7) {
                    return;
                }
                throw F.c();
            default:
                if ((this.f2494b & 7) == i7) {
                    return;
                }
                throw X.d();
        }
    }

    public boolean W() {
        int i7;
        int i8;
        switch (this.f2493a) {
            case 2:
                H3.d dVar = (H3.d) this.f2497e;
                if (!dVar.g() && (i7 = this.f2494b) != this.f2495c) {
                    return dVar.F(i7);
                }
                return false;
            default:
                J6.b bVar = (J6.b) this.f2497e;
                if (!bVar.g() && (i8 = this.f2494b) != this.f2495c) {
                    return bVar.D(i8);
                }
                return false;
        }
    }

    public void a(int i7) {
        int[] iArr = (int[]) this.f2497e;
        int i8 = this.f2495c;
        iArr[i8] = i7;
        int i9 = this.f2496d & (i8 + 1);
        this.f2495c = i9;
        int i10 = this.f2494b;
        if (i9 == i10) {
            int length = iArr.length;
            int i11 = length - i10;
            int i12 = length << 1;
            if (i12 >= 0) {
                int[] iArr2 = new int[i12];
                AbstractC1446g.J(0, i10, length, iArr, iArr2);
                AbstractC1446g.J(i11, 0, this.f2494b, (int[]) this.f2497e, iArr2);
                this.f2497e = iArr2;
                this.f2494b = 0;
                this.f2495c = length;
                this.f2496d = i12 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public int b() {
        switch (this.f2493a) {
            case 2:
                int i7 = this.f2496d;
                if (i7 != 0) {
                    this.f2494b = i7;
                    this.f2496d = 0;
                } else {
                    this.f2494b = ((H3.d) this.f2497e).C();
                }
                int i8 = this.f2494b;
                if (i8 != 0 && i8 != this.f2495c) {
                    return i8 >>> 3;
                }
                return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            case 3:
                int i9 = this.f2496d;
                if (i9 != 0) {
                    this.f2494b = i9;
                    this.f2496d = 0;
                } else {
                    this.f2494b = ((H3.d) this.f2497e).C();
                }
                int i10 = this.f2494b;
                if (i10 != 0 && i10 != this.f2495c) {
                    return i10 >>> 3;
                }
                return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            default:
                int i11 = this.f2496d;
                if (i11 != 0) {
                    this.f2494b = i11;
                    this.f2496d = 0;
                } else {
                    this.f2494b = ((J6.b) this.f2497e).A();
                }
                int i12 = this.f2494b;
                if (i12 != 0 && i12 != this.f2495c) {
                    return i12 >>> 3;
                }
                return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
    }

    public void c(Object obj, b0 b0Var, C0536m c0536m) {
        int i7 = this.f2495c;
        this.f2495c = ((this.f2494b >>> 3) << 3) | 4;
        try {
            b0Var.f(obj, this, c0536m);
            if (this.f2494b == this.f2495c) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.f2495c = i7;
        }
    }

    public void d(Object obj, g0 g0Var, C0787n c0787n) {
        int i7 = this.f2495c;
        this.f2495c = ((this.f2494b >>> 3) << 3) | 4;
        try {
            g0Var.e(obj, this, c0787n);
            if (this.f2494b == this.f2495c) {
                return;
            }
            throw F.f();
        } finally {
            this.f2495c = i7;
        }
    }

    public void e(Object obj, E0 e02, C0871w c0871w) {
        int i7 = this.f2495c;
        this.f2495c = ((this.f2494b >>> 3) << 3) | 4;
        try {
            e02.f(obj, this, c0871w);
            if (this.f2494b == this.f2495c) {
                return;
            }
            throw X.g();
        } finally {
            this.f2495c = i7;
        }
    }

    public void f(Object obj, b0 b0Var, C0536m c0536m) {
        H3.d dVar = (H3.d) this.f2497e;
        int D4 = dVar.D();
        if (dVar.f1981a < 100) {
            int l8 = dVar.l(D4);
            dVar.f1981a++;
            b0Var.f(obj, this, c0536m);
            dVar.b(0);
            dVar.f1981a--;
            dVar.j(l8);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void g(Object obj, g0 g0Var, C0787n c0787n) {
        H3.d dVar = (H3.d) this.f2497e;
        int D4 = dVar.D();
        if (dVar.f1981a < 100) {
            int l8 = dVar.l(D4);
            dVar.f1981a++;
            g0Var.e(obj, this, c0787n);
            dVar.b(0);
            dVar.f1981a--;
            dVar.j(l8);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public void h(Object obj, E0 e02, C0871w c0871w) {
        J6.b bVar = (J6.b) this.f2497e;
        int B7 = bVar.B();
        if (bVar.f2425a < bVar.f2426b) {
            int j = bVar.j(B7);
            bVar.f2425a++;
            e02.f(obj, this, c0871w);
            bVar.b(0);
            bVar.f2425a--;
            bVar.i(j);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void i(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 0) {
            if (i7 == 2) {
                int f = dVar.f() + dVar.D();
                do {
                    ((Z) interfaceC0548z).add(Boolean.valueOf(dVar.m()));
                } while (dVar.f() < f);
                U(f);
                return;
            }
            throw C.b();
        }
        do {
            ((Z) interfaceC0548z).add(Boolean.valueOf(dVar.m()));
            if (dVar.g()) {
                return;
            }
            C7 = dVar.C();
        } while (C7 == this.f2494b);
        this.f2496d = C7;
    }

    public void j(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof AbstractC0777d;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    AbstractC0777d abstractC0777d = (AbstractC0777d) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 0) {
                        if (i7 == 2) {
                            int f = dVar.f() + dVar.D();
                            do {
                                abstractC0777d.h(dVar.m());
                            } while (dVar.f() < f);
                            U(f);
                            return;
                        }
                        throw F.c();
                    }
                    do {
                        abstractC0777d.h(dVar.m());
                        if (!dVar.g()) {
                            C8 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C8 == this.f2494b);
                    this.f2496d = C8;
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int f4 = dVar.f() + dVar.D();
                        do {
                            list.add(Boolean.valueOf(dVar.m()));
                        } while (dVar.f() < f4);
                        U(f4);
                        return;
                    }
                    throw F.c();
                }
                do {
                    list.add(Boolean.valueOf(dVar.m()));
                    if (!dVar.g()) {
                        C7 = dVar.C();
                    } else {
                        return;
                    }
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            default:
                boolean z8 = list instanceof AbstractC0840g;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    AbstractC0840g abstractC0840g = (AbstractC0840g) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 0) {
                        if (i9 == 2) {
                            int f8 = bVar.f() + bVar.B();
                            do {
                                abstractC0840g.h(bVar.k());
                            } while (bVar.f() < f8);
                            U(f8);
                            return;
                        }
                        throw X.d();
                    }
                    do {
                        abstractC0840g.h(bVar.k());
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int f9 = bVar.f() + bVar.B();
                        do {
                            list.add(Boolean.valueOf(bVar.k()));
                        } while (bVar.f() < f9);
                        U(f9);
                        return;
                    }
                    throw X.d();
                }
                do {
                    list.add(Boolean.valueOf(bVar.k()));
                    if (!bVar.g()) {
                        A7 = bVar.A();
                    } else {
                        return;
                    }
                } while (A7 == this.f2494b);
                this.f2496d = A7;
                return;
        }
    }

    public C0530g k() {
        V(2);
        return ((H3.d) this.f2497e).n();
    }

    public AbstractC0781h l() {
        V(2);
        return ((H3.d) this.f2497e).o();
    }

    public AbstractC0852m m() {
        V(2);
        return ((J6.b) this.f2497e).l();
    }

    public void n(InterfaceC0548z interfaceC0548z) {
        int C7;
        if ((this.f2494b & 7) == 2) {
            do {
                ((Z) interfaceC0548z).add(k());
                H3.d dVar = (H3.d) this.f2497e;
                if (dVar.g()) {
                    return;
                }
                C7 = dVar.C();
            } while (C7 == this.f2494b);
            this.f2496d = C7;
            return;
        }
        throw C.b();
    }

    public void o(List list) {
        int C7;
        int A7;
        switch (this.f2493a) {
            case 3:
                if ((this.f2494b & 7) == 2) {
                    do {
                        list.add(l());
                        H3.d dVar = (H3.d) this.f2497e;
                        if (!dVar.g()) {
                            C7 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C7 == this.f2494b);
                    this.f2496d = C7;
                    return;
                }
                throw F.c();
            default:
                if ((this.f2494b & 7) == 2) {
                    do {
                        list.add(m());
                        J6.b bVar = (J6.b) this.f2497e;
                        if (!bVar.g()) {
                            A7 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A7 == this.f2494b);
                    this.f2496d = A7;
                    return;
                }
                throw X.d();
        }
    }

    public void p(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 1) {
            if (i7 == 2) {
                int D4 = dVar.D();
                if ((D4 & 7) == 0) {
                    int f = dVar.f() + D4;
                    do {
                        ((Z) interfaceC0548z).add(Double.valueOf(dVar.p()));
                    } while (dVar.f() < f);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw C.b();
        }
        do {
            ((Z) interfaceC0548z).add(Double.valueOf(dVar.p()));
            if (dVar.g()) {
                return;
            }
            C7 = dVar.C();
        } while (C7 == this.f2494b);
        this.f2496d = C7;
    }

    public void q(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof AbstractC0785l;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    AbstractC0785l abstractC0785l = (AbstractC0785l) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 1) {
                        if (i7 == 2) {
                            int D4 = dVar.D();
                            Z(D4);
                            int f = dVar.f() + D4;
                            do {
                                abstractC0785l.h(dVar.p());
                            } while (dVar.f() < f);
                            return;
                        }
                        throw F.c();
                    }
                    do {
                        abstractC0785l.h(dVar.p());
                        if (!dVar.g()) {
                            C8 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C8 == this.f2494b);
                    this.f2496d = C8;
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 1) {
                    if (i8 == 2) {
                        int D7 = dVar.D();
                        Z(D7);
                        int f4 = dVar.f() + D7;
                        do {
                            list.add(Double.valueOf(dVar.p()));
                        } while (dVar.f() < f4);
                        return;
                    }
                    throw F.c();
                }
                do {
                    list.add(Double.valueOf(dVar.p()));
                    if (!dVar.g()) {
                        C7 = dVar.C();
                    } else {
                        return;
                    }
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            default:
                boolean z8 = list instanceof AbstractC0867u;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    AbstractC0867u abstractC0867u = (AbstractC0867u) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 1) {
                        if (i9 == 2) {
                            int B7 = bVar.B();
                            a0(B7);
                            int f8 = bVar.f() + B7;
                            do {
                                abstractC0867u.h(bVar.m());
                            } while (bVar.f() < f8);
                            return;
                        }
                        throw X.d();
                    }
                    do {
                        abstractC0867u.h(bVar.m());
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int B8 = bVar.B();
                        a0(B8);
                        int f9 = bVar.f() + B8;
                        do {
                            list.add(Double.valueOf(bVar.m()));
                        } while (bVar.f() < f9);
                        return;
                    }
                    throw X.d();
                }
                do {
                    list.add(Double.valueOf(bVar.m()));
                    if (!bVar.g()) {
                        A7 = bVar.A();
                    } else {
                        return;
                    }
                } while (A7 == this.f2494b);
                this.f2496d = A7;
                return;
        }
    }

    public void r(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 0) {
            if (i7 == 2) {
                int f = dVar.f() + dVar.D();
                do {
                    ((Z) interfaceC0548z).add(Integer.valueOf(dVar.q()));
                } while (dVar.f() < f);
                U(f);
                return;
            }
            throw C.b();
        }
        do {
            ((Z) interfaceC0548z).add(Integer.valueOf(dVar.q()));
            if (dVar.g()) {
                return;
            }
            C7 = dVar.C();
        } while (C7 == this.f2494b);
        this.f2496d = C7;
    }

    public void s(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof AbstractC0798z;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    AbstractC0798z abstractC0798z = (AbstractC0798z) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 0) {
                        if (i7 == 2) {
                            int f = dVar.f() + dVar.D();
                            do {
                                abstractC0798z.h(dVar.q());
                            } while (dVar.f() < f);
                            U(f);
                            return;
                        }
                        throw F.c();
                    }
                    do {
                        abstractC0798z.h(dVar.q());
                        if (!dVar.g()) {
                            C8 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C8 == this.f2494b);
                    this.f2496d = C8;
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int f4 = dVar.f() + dVar.D();
                        do {
                            list.add(Integer.valueOf(dVar.q()));
                        } while (dVar.f() < f4);
                        U(f4);
                        return;
                    }
                    throw F.c();
                }
                do {
                    list.add(Integer.valueOf(dVar.q()));
                    if (!dVar.g()) {
                        C7 = dVar.C();
                    } else {
                        return;
                    }
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            default:
                boolean z8 = list instanceof P;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    P p7 = (P) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 0) {
                        if (i9 == 2) {
                            int f8 = bVar.f() + bVar.B();
                            do {
                                p7.h(bVar.n());
                            } while (bVar.f() < f8);
                            U(f8);
                            return;
                        }
                        throw X.d();
                    }
                    do {
                        p7.h(bVar.n());
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int f9 = bVar.f() + bVar.B();
                        do {
                            list.add(Integer.valueOf(bVar.n()));
                        } while (bVar.f() < f9);
                        U(f9);
                        return;
                    }
                    throw X.d();
                }
                do {
                    list.add(Integer.valueOf(bVar.n()));
                    if (!bVar.g()) {
                        A7 = bVar.A();
                    } else {
                        return;
                    }
                } while (A7 == this.f2494b);
                this.f2496d = A7;
                return;
        }
    }

    public Object t(v0 v0Var, Class cls, C0536m c0536m) {
        int i7 = AbstractC0533j.f7839a[v0Var.ordinal()];
        H3.d dVar = (H3.d) this.f2497e;
        switch (i7) {
            case 1:
                V(0);
                return Boolean.valueOf(dVar.m());
            case 2:
                return k();
            case 3:
                V(1);
                return Double.valueOf(dVar.p());
            case 4:
                V(0);
                return Integer.valueOf(dVar.q());
            case 5:
                V(5);
                return Integer.valueOf(dVar.r());
            case 6:
                V(1);
                return Long.valueOf(dVar.s());
            case 7:
                V(5);
                return Float.valueOf(dVar.t());
            case 8:
                V(0);
                return Integer.valueOf(dVar.u());
            case 9:
                V(0);
                return Long.valueOf(dVar.v());
            case 10:
                V(2);
                b0 a7 = androidx.datastore.preferences.protobuf.X.f7783c.a(cls);
                AbstractC0547y newInstance = a7.newInstance();
                f(newInstance, a7, c0536m);
                a7.b(newInstance);
                return newInstance;
            case 11:
                V(5);
                return Integer.valueOf(dVar.w());
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                V(1);
                return Long.valueOf(dVar.x());
            case 13:
                V(0);
                return Integer.valueOf(dVar.y());
            case 14:
                V(0);
                return Long.valueOf(dVar.z());
            case 15:
                V(2);
                return dVar.B();
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                V(0);
                return Integer.valueOf(dVar.D());
            case 17:
                V(0);
                return Long.valueOf(dVar.E());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public Object u(g1 g1Var, Class cls, C0871w c0871w) {
        int i7 = AbstractC0860q.f10113a[g1Var.ordinal()];
        J6.b bVar = (J6.b) this.f2497e;
        switch (i7) {
            case 1:
                V(0);
                return Boolean.valueOf(bVar.k());
            case 2:
                return m();
            case 3:
                V(1);
                return Double.valueOf(bVar.m());
            case 4:
                V(0);
                return Integer.valueOf(bVar.n());
            case 5:
                V(5);
                return Integer.valueOf(bVar.o());
            case 6:
                V(1);
                return Long.valueOf(bVar.p());
            case 7:
                V(5);
                return Float.valueOf(bVar.q());
            case 8:
                V(0);
                return Integer.valueOf(bVar.s());
            case 9:
                V(0);
                return Long.valueOf(bVar.t());
            case 10:
                V(2);
                E0 a7 = C0878z0.f10148c.a(cls);
                J newInstance = a7.newInstance();
                h(newInstance, a7, c0871w);
                a7.b(newInstance);
                return newInstance;
            case 11:
                V(5);
                return Integer.valueOf(bVar.u());
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                V(1);
                return Long.valueOf(bVar.v());
            case 13:
                V(0);
                return Integer.valueOf(bVar.w());
            case 14:
                V(0);
                return Long.valueOf(bVar.x());
            case 15:
                V(2);
                return bVar.z();
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                V(0);
                return Integer.valueOf(bVar.B());
            case 17:
                V(0);
                return Long.valueOf(bVar.C());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public void v(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 2) {
            if (i7 == 5) {
                do {
                    ((Z) interfaceC0548z).add(Integer.valueOf(dVar.r()));
                    if (dVar.g()) {
                        return;
                    }
                    C7 = dVar.C();
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            }
            throw C.b();
        }
        int D4 = dVar.D();
        if ((D4 & 3) == 0) {
            int f = dVar.f() + D4;
            do {
                ((Z) interfaceC0548z).add(Integer.valueOf(dVar.r()));
            } while (dVar.f() < f);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void w(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof AbstractC0798z;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    AbstractC0798z abstractC0798z = (AbstractC0798z) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 2) {
                        if (i7 == 5) {
                            do {
                                abstractC0798z.h(dVar.r());
                                if (!dVar.g()) {
                                    C8 = dVar.C();
                                } else {
                                    return;
                                }
                            } while (C8 == this.f2494b);
                            this.f2496d = C8;
                            return;
                        }
                        throw F.c();
                    }
                    int D4 = dVar.D();
                    X(D4);
                    int f = dVar.f() + D4;
                    do {
                        abstractC0798z.h(dVar.r());
                    } while (dVar.f() < f);
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 2) {
                    if (i8 == 5) {
                        do {
                            list.add(Integer.valueOf(dVar.r()));
                            if (!dVar.g()) {
                                C7 = dVar.C();
                            } else {
                                return;
                            }
                        } while (C7 == this.f2494b);
                        this.f2496d = C7;
                        return;
                    }
                    throw F.c();
                }
                int D7 = dVar.D();
                X(D7);
                int f4 = dVar.f() + D7;
                do {
                    list.add(Integer.valueOf(dVar.r()));
                } while (dVar.f() < f4);
                return;
            default:
                boolean z8 = list instanceof P;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    P p7 = (P) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 2) {
                        if (i9 == 5) {
                            do {
                                p7.h(bVar.o());
                                if (!bVar.g()) {
                                    A8 = bVar.A();
                                } else {
                                    return;
                                }
                            } while (A8 == this.f2494b);
                            this.f2496d = A8;
                            return;
                        }
                        throw X.d();
                    }
                    int B7 = bVar.B();
                    Y(B7);
                    int f8 = bVar.f() + B7;
                    do {
                        p7.h(bVar.o());
                    } while (bVar.f() < f8);
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 2) {
                    if (i10 == 5) {
                        do {
                            list.add(Integer.valueOf(bVar.o()));
                            if (!bVar.g()) {
                                A7 = bVar.A();
                            } else {
                                return;
                            }
                        } while (A7 == this.f2494b);
                        this.f2496d = A7;
                        return;
                    }
                    throw X.d();
                }
                int B8 = bVar.B();
                Y(B8);
                int f9 = bVar.f() + B8;
                do {
                    list.add(Integer.valueOf(bVar.o()));
                } while (bVar.f() < f9);
                return;
        }
    }

    public void x(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 1) {
            if (i7 == 2) {
                int D4 = dVar.D();
                if ((D4 & 7) == 0) {
                    int f = dVar.f() + D4;
                    do {
                        ((Z) interfaceC0548z).add(Long.valueOf(dVar.s()));
                    } while (dVar.f() < f);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw C.b();
        }
        do {
            ((Z) interfaceC0548z).add(Long.valueOf(dVar.s()));
            if (dVar.g()) {
                return;
            }
            C7 = dVar.C();
        } while (C7 == this.f2494b);
        this.f2496d = C7;
    }

    public void y(List list) {
        int C7;
        int C8;
        int A7;
        int A8;
        switch (this.f2493a) {
            case 3:
                boolean z7 = list instanceof M;
                H3.d dVar = (H3.d) this.f2497e;
                if (z7) {
                    M m7 = (M) list;
                    int i7 = this.f2494b & 7;
                    if (i7 != 1) {
                        if (i7 == 2) {
                            int D4 = dVar.D();
                            Z(D4);
                            int f = dVar.f() + D4;
                            do {
                                m7.h(dVar.s());
                            } while (dVar.f() < f);
                            return;
                        }
                        throw F.c();
                    }
                    do {
                        m7.h(dVar.s());
                        if (!dVar.g()) {
                            C8 = dVar.C();
                        } else {
                            return;
                        }
                    } while (C8 == this.f2494b);
                    this.f2496d = C8;
                    return;
                }
                int i8 = this.f2494b & 7;
                if (i8 != 1) {
                    if (i8 == 2) {
                        int D7 = dVar.D();
                        Z(D7);
                        int f4 = dVar.f() + D7;
                        do {
                            list.add(Long.valueOf(dVar.s()));
                        } while (dVar.f() < f4);
                        return;
                    }
                    throw F.c();
                }
                do {
                    list.add(Long.valueOf(dVar.s()));
                    if (!dVar.g()) {
                        C7 = dVar.C();
                    } else {
                        return;
                    }
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            default:
                boolean z8 = list instanceof AbstractC0839f0;
                J6.b bVar = (J6.b) this.f2497e;
                if (z8) {
                    AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) list;
                    int i9 = this.f2494b & 7;
                    if (i9 != 1) {
                        if (i9 == 2) {
                            int B7 = bVar.B();
                            a0(B7);
                            int f8 = bVar.f() + B7;
                            do {
                                abstractC0839f0.h(bVar.p());
                            } while (bVar.f() < f8);
                            return;
                        }
                        throw X.d();
                    }
                    do {
                        abstractC0839f0.h(bVar.p());
                        if (!bVar.g()) {
                            A8 = bVar.A();
                        } else {
                            return;
                        }
                    } while (A8 == this.f2494b);
                    this.f2496d = A8;
                    return;
                }
                int i10 = this.f2494b & 7;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int B8 = bVar.B();
                        a0(B8);
                        int f9 = bVar.f() + B8;
                        do {
                            list.add(Long.valueOf(bVar.p()));
                        } while (bVar.f() < f9);
                        return;
                    }
                    throw X.d();
                }
                do {
                    list.add(Long.valueOf(bVar.p()));
                    if (!bVar.g()) {
                        A7 = bVar.A();
                    } else {
                        return;
                    }
                } while (A7 == this.f2494b);
                this.f2496d = A7;
                return;
        }
    }

    public void z(InterfaceC0548z interfaceC0548z) {
        int C7;
        int i7 = this.f2494b & 7;
        H3.d dVar = (H3.d) this.f2497e;
        if (i7 != 2) {
            if (i7 == 5) {
                do {
                    ((Z) interfaceC0548z).add(Float.valueOf(dVar.t()));
                    if (dVar.g()) {
                        return;
                    }
                    C7 = dVar.C();
                } while (C7 == this.f2494b);
                this.f2496d = C7;
                return;
            }
            throw C.b();
        }
        int D4 = dVar.D();
        if ((D4 & 3) == 0) {
            int f = dVar.f() + D4;
            do {
                ((Z) interfaceC0548z).add(Float.valueOf(dVar.t()));
            } while (dVar.f() < f);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public l(H3.d dVar) {
        this.f2493a = 2;
        this.f2496d = 0;
        Charset charset = A.f7747a;
        this.f2497e = dVar;
        dVar.f1982b = this;
    }

    public l(J6.b bVar) {
        this.f2493a = 4;
        this.f2496d = 0;
        V.a(bVar, "input");
        this.f2497e = bVar;
        bVar.f2427c = this;
    }

    public l(H3.d dVar, byte b5) {
        this.f2493a = 3;
        this.f2496d = 0;
        D.a(dVar, "input");
        this.f2497e = dVar;
        dVar.f1982b = this;
    }
}
