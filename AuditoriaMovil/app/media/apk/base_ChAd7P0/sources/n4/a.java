package N4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.slf4j.helpers.i;
/* loaded from: classes.dex */
public final class a extends i {
    @Override // org.slf4j.helpers.i
    public final boolean F(Class cls) {
        return false;
    }

    @Override // org.slf4j.helpers.i
    public final Method w(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // org.slf4j.helpers.i
    public final Constructor x(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // org.slf4j.helpers.i
    public final String[] z(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }
}
