package org.simpleframework.xml.transform;

import java.util.Date;
/* loaded from: classes2.dex */
class DateTransform<T extends Date> implements Transform<T> {
    private final DateFactory<T> factory;

    public DateTransform(Class<T> cls) {
        this.factory = new DateFactory<>(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ String write(Object obj) {
        return write((DateTransform<T>) ((Date) obj));
    }

    @Override // org.simpleframework.xml.transform.Transform
    public synchronized T read(String str) {
        return this.factory.getInstance(Long.valueOf(DateType.getDate(str).getTime()));
    }

    public synchronized String write(T t10) {
        return DateType.getText(t10);
    }
}
