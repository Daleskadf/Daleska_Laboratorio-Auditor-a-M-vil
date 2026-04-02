package C6;

import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public interface b extends a {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    h getReturnType();

    List getTypeParameters();

    i getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();
}
