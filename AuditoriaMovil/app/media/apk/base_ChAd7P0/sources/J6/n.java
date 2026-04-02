package J6;

import F6.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m6.AbstractC1447h;
import m6.AbstractC1449j;
import o6.EnumC1565a;
import org.apache.tika.utils.StringUtils;
import p6.AbstractC1700c;
import p6.InterfaceC1701d;
/* loaded from: classes.dex */
public final class n extends AbstractC1700c implements I6.e {

    /* renamed from: a  reason: collision with root package name */
    public final I6.e f2447a;

    /* renamed from: b  reason: collision with root package name */
    public final n6.i f2448b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2449c;

    /* renamed from: d  reason: collision with root package name */
    public n6.i f2450d;

    /* renamed from: e  reason: collision with root package name */
    public n6.d f2451e;

    public n(I6.e eVar, n6.i iVar) {
        super(k.f2444a, n6.j.f14394a);
        this.f2447a = eVar;
        this.f2448b = iVar;
        this.f2449c = ((Number) iVar.fold(0, m.f2446a)).intValue();
    }

    @Override // I6.e
    public final Object a(Object obj, n6.d dVar) {
        try {
            Object c8 = c(dVar, obj);
            if (c8 == EnumC1565a.COROUTINE_SUSPENDED) {
                return c8;
            }
            return l6.j.f13876a;
        } catch (Throwable th) {
            this.f2450d = new i(dVar.getContext(), th);
            throw th;
        }
    }

    public final Object c(n6.d dVar, Object obj) {
        Comparable comparable;
        int i7;
        String str;
        n6.i context = dVar.getContext();
        H.g(context);
        n6.i iVar = this.f2450d;
        if (iVar != context) {
            int i8 = 0;
            if (iVar instanceof i) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f2442a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str2, "<this>");
                List H7 = D6.f.H(new D6.k(E6.m.W(str2, new String[]{"\r\n", "\n", "\r"}, false, 0), new E6.l(str2, 0)));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : H7) {
                    if (!E6.m.U((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC1449j.M(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i9 = 0;
                    while (true) {
                        if (i9 < length) {
                            char charAt = str3.charAt(i9);
                            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                                break;
                            }
                            i9++;
                        } else {
                            i9 = -1;
                            break;
                        }
                    }
                    if (i9 == -1) {
                        i9 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i9));
                }
                Iterator it2 = arrayList2.iterator();
                if (!it2.hasNext()) {
                    comparable = null;
                } else {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                }
                Integer num = (Integer) comparable;
                if (num != null) {
                    i7 = num.intValue();
                } else {
                    i7 = 0;
                }
                int length2 = str2.length();
                H7.size();
                int size = H7.size() - 1;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : H7) {
                    int i10 = i8 + 1;
                    if (i8 >= 0) {
                        String str4 = (String) obj3;
                        if ((i8 == 0 || i8 == size) && E6.m.U(str4)) {
                            str = null;
                        } else {
                            kotlin.jvm.internal.j.e(str4, "<this>");
                            if (i7 >= 0) {
                                int length3 = str4.length();
                                if (i7 <= length3) {
                                    length3 = i7;
                                }
                                str = str4.substring(length3);
                                kotlin.jvm.internal.j.d(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Requested character count ", i7, " is less than zero.").toString());
                            }
                        }
                        if (str != null) {
                            arrayList3.add(str);
                        }
                        i8 = i10;
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                StringBuilder sb = new StringBuilder(length2);
                AbstractC1447h.Q(arrayList3, sb, "\n", StringUtils.EMPTY, StringUtils.EMPTY, -1, "...", null);
                String sb2 = sb.toString();
                kotlin.jvm.internal.j.d(sb2, "toString(...)");
                throw new IllegalStateException(sb2.toString());
            } else if (((Number) context.fold(0, new q(this))).intValue() == this.f2449c) {
                this.f2450d = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f2448b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f2451e = dVar;
        o oVar = p.f2453a;
        I6.e eVar = this.f2447a;
        kotlin.jvm.internal.j.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object a7 = eVar.a(obj, this);
        if (!kotlin.jvm.internal.j.a(a7, EnumC1565a.COROUTINE_SUSPENDED)) {
            this.f2451e = null;
        }
        return a7;
    }

    @Override // p6.AbstractC1698a, p6.InterfaceC1701d
    public final InterfaceC1701d getCallerFrame() {
        n6.d dVar = this.f2451e;
        if (dVar instanceof InterfaceC1701d) {
            return (InterfaceC1701d) dVar;
        }
        return null;
    }

    @Override // p6.AbstractC1700c, n6.d
    public final n6.i getContext() {
        n6.i iVar = this.f2450d;
        if (iVar == null) {
            return n6.j.f14394a;
        }
        return iVar;
    }

    @Override // p6.AbstractC1698a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        Throwable a7 = l6.f.a(obj);
        if (a7 != null) {
            this.f2450d = new i(getContext(), a7);
        }
        n6.d dVar = this.f2451e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return EnumC1565a.COROUTINE_SUSPENDED;
    }
}
