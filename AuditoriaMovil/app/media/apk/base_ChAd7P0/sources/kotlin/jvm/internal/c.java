package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class c implements C6.b, Serializable {
    public static final Object NO_RECEIVER = b.f13785a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient C6.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z7) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z7;
    }

    @Override // C6.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // C6.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C6.b compute() {
        C6.b bVar = this.reflected;
        if (bVar == null) {
            C6.b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return bVar;
    }

    public abstract C6.b computeReflected();

    @Override // C6.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // C6.b
    public String getName() {
        return this.name;
    }

    public C6.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            s.f13797a.getClass();
            return new l(cls);
        }
        return s.a(cls);
    }

    @Override // C6.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract C6.b getReflected();

    @Override // C6.b
    public C6.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // C6.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // C6.b
    public C6.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // C6.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // C6.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // C6.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
