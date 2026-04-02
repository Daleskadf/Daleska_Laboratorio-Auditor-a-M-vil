package org.simpleframework.xml.transform;

import java.lang.reflect.Array;
/* loaded from: classes2.dex */
class CharacterArrayTransform implements Transform {
    private final Class entry;

    public CharacterArrayTransform(Class cls) {
        this.entry = cls;
    }

    @Override // org.simpleframework.xml.transform.Transform
    public Object read(String str) {
        char[] charArray = str.toCharArray();
        return this.entry == Character.TYPE ? charArray : read(charArray, charArray.length);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Object obj) {
        int length = Array.getLength(obj);
        if (this.entry == Character.TYPE) {
            return new String((char[]) obj);
        }
        return write(obj, length);
    }

    private Object read(char[] cArr, int i10) {
        Object newInstance = Array.newInstance(this.entry, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Array.set(newInstance, i11, Character.valueOf(cArr[i11]));
        }
        return newInstance;
    }

    private String write(Object obj, int i10) {
        StringBuilder sb = new StringBuilder(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj2 = Array.get(obj, i11);
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb.toString();
    }
}
