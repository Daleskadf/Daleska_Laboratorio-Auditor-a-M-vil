package io.jsonwebtoken.impl.lang;

import io.jsonwebtoken.Identifiable;
import io.jsonwebtoken.lang.CollectionMutator;
import io.jsonwebtoken.lang.Collections;
import io.jsonwebtoken.lang.Objects;
import io.jsonwebtoken.lang.Strings;
import java.util.Collection;
import java.util.LinkedHashSet;
/* loaded from: classes3.dex */
public class DefaultCollectionMutator<E, M extends CollectionMutator<E, M>> implements CollectionMutator<E, M> {
    private final Collection<E> collection;

    public DefaultCollectionMutator(Collection<? extends E> collection) {
        this.collection = new LinkedHashSet(Collections.nullSafe(collection));
    }

    private boolean doAdd(E e10) {
        if (Objects.isEmpty(e10)) {
            return false;
        }
        if ((e10 instanceof Identifiable) && !Strings.hasText(((Identifiable) e10).getId())) {
            throw new IllegalArgumentException(e10.getClass() + " getId() value cannot be null or empty.");
        }
        return this.collection.add(e10);
    }

    @Override // io.jsonwebtoken.lang.CollectionMutator
    public M add(E e10) {
        if (doAdd(e10)) {
            changed();
        }
        return self();
    }

    public void changed() {
    }

    @Override // io.jsonwebtoken.lang.CollectionMutator
    public M clear() {
        boolean z10 = !Collections.isEmpty((Collection<?>) this.collection);
        this.collection.clear();
        if (z10) {
            changed();
        }
        return self();
    }

    public Collection<E> getCollection() {
        return Collections.immutable(this.collection);
    }

    @Override // io.jsonwebtoken.lang.CollectionMutator
    public M remove(E e10) {
        if (this.collection.remove(e10)) {
            changed();
        }
        return self();
    }

    public final M self() {
        return this;
    }

    @Override // io.jsonwebtoken.lang.CollectionMutator
    public M add(Collection<? extends E> collection) {
        boolean z10;
        loop0: while (true) {
            for (E e10 : Collections.nullSafe(collection)) {
                z10 = doAdd(e10) || z10;
            }
        }
        if (z10) {
            changed();
        }
        return self();
    }
}
