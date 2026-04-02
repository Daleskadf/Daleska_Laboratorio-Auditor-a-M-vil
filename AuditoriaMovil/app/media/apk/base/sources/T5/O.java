package T5;

import a.AbstractC0412a;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;
/* loaded from: classes.dex */
public final class O extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        String str;
        Set U7 = AbstractC0412a.U("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        if (objectStreamClass != null) {
            str = objectStreamClass.getName();
        } else {
            str = null;
        }
        if (str != null && !U7.contains(str)) {
            throw new ClassNotFoundException(objectStreamClass.getName());
        }
        return super.resolveClass(objectStreamClass);
    }
}
