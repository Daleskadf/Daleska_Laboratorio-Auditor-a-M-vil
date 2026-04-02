package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class j implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f12559a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12560b;

    /* renamed from: c  reason: collision with root package name */
    public String f12561c;

    public j(ArrayList arrayList) {
        this.f12559a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = o.f12566a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f12560b = true;
            return null;
        }
        boolean equals = name.equals("protocols");
        ArrayList arrayList = this.f12559a;
        if (equals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (arrayList.contains(list.get(i7))) {
                        String str = (String) list.get(i7);
                        this.f12561c = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f12561c = str2;
                return str2;
            }
        }
        if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
            this.f12561c = (String) objArr[0];
            return null;
        }
        return method.invoke(this, objArr);
    }
}
