package org.simpleframework.xml.core;

import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.strategy.Type;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class Entry {
    private static final String DEFAULT_NAME = "entry";
    private boolean attribute;
    private Contact contact;
    private String entry;
    private String key;
    private Class keyType;
    private ElementMap label;
    private String value;
    private Class valueType;

    public Entry(Contact contact, ElementMap elementMap) {
        this.attribute = elementMap.attribute();
        this.entry = elementMap.entry();
        this.value = elementMap.value();
        this.key = elementMap.key();
        this.contact = contact;
        this.label = elementMap;
    }

    private Class getDependent(int i10) {
        Class[] dependents = this.contact.getDependents();
        if (dependents.length < i10 || dependents.length == 0) {
            return Object.class;
        }
        return dependents[i10];
    }

    private boolean isEmpty(String str) {
        if (str.length() == 0) {
            return true;
        }
        return false;
    }

    public Contact getContact() {
        return this.contact;
    }

    public String getEntry() {
        String str = this.entry;
        if (str == null) {
            return str;
        }
        if (isEmpty(str)) {
            this.entry = DEFAULT_NAME;
        }
        return this.entry;
    }

    public Converter getKey(Context context) {
        Type keyType = getKeyType();
        if (context.isPrimitive(keyType)) {
            return new PrimitiveKey(context, this, keyType);
        }
        return new CompositeKey(context, this, keyType);
    }

    public Type getKeyType() {
        if (this.keyType == null) {
            Class keyType = this.label.keyType();
            this.keyType = keyType;
            if (keyType == Void.TYPE) {
                this.keyType = getDependent(0);
            }
        }
        return new ClassType(this.keyType);
    }

    public Converter getValue(Context context) {
        Type valueType = getValueType();
        if (context.isPrimitive(valueType)) {
            return new PrimitiveValue(context, this, valueType);
        }
        return new CompositeValue(context, this, valueType);
    }

    public Type getValueType() {
        if (this.valueType == null) {
            Class valueType = this.label.valueType();
            this.valueType = valueType;
            if (valueType == Void.TYPE) {
                this.valueType = getDependent(1);
            }
        }
        return new ClassType(this.valueType);
    }

    public boolean isAttribute() {
        return this.attribute;
    }

    public boolean isInline() {
        return isAttribute();
    }

    public String toString() {
        return String.format("%s on %s", this.label, this.contact);
    }

    public String getKey() {
        String str = this.key;
        if (str == null) {
            return str;
        }
        if (isEmpty(str)) {
            this.key = null;
        }
        return this.key;
    }

    public String getValue() {
        String str = this.value;
        if (str == null) {
            return str;
        }
        if (isEmpty(str)) {
            this.value = null;
        }
        return this.value;
    }
}
