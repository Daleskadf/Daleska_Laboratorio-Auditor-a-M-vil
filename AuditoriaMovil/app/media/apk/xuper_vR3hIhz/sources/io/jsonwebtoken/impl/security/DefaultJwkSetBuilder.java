package io.jsonwebtoken.impl.security;

import io.jsonwebtoken.impl.ParameterMap;
import io.jsonwebtoken.impl.lang.Parameter;
import io.jsonwebtoken.impl.lang.Parameters;
import io.jsonwebtoken.lang.Collections;
import io.jsonwebtoken.security.Jwk;
import io.jsonwebtoken.security.JwkSet;
import io.jsonwebtoken.security.JwkSetBuilder;
import io.jsonwebtoken.security.KeyOperationPolicy;
import java.security.Provider;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class DefaultJwkSetBuilder extends AbstractSecurityBuilder<JwkSet, JwkSetBuilder> implements JwkSetBuilder {
    private KeyOperationPolicy operationPolicy = AbstractJwkBuilder.DEFAULT_OPERATION_POLICY;
    private JwkSetConverter converter = new JwkSetConverter();
    private ParameterMap map = new ParameterMap(Parameters.registry(DefaultJwkSet.KEYS));

    private JwkSetBuilder refresh() {
        JwkConverter jwkConverter = new JwkConverter(new JwkBuilderSupplier(this.provider, this.operationPolicy));
        this.converter = new JwkSetConverter(jwkConverter, this.converter.isIgnoreUnsupported());
        Parameter<Set<Jwk<?>>> param = DefaultJwkSet.param(jwkConverter);
        ParameterMap parameterMap = new ParameterMap(Parameters.registry(param), this.map, true);
        this.map = parameterMap;
        Set<Jwk> set = (Set) parameterMap.get((Parameter<Object>) param);
        if (!Collections.isEmpty(set)) {
            for (Jwk jwk : set) {
                this.operationPolicy.validate(jwk.getOperations());
            }
        }
        return this;
    }

    public Collection<Jwk<?>> ensureKeys() {
        Collection<Jwk<?>> collection = (Collection) this.map.get((Parameter<Object>) DefaultJwkSet.KEYS);
        if (Collections.isEmpty(collection)) {
            return new LinkedHashSet();
        }
        return collection;
    }

    @Override // io.jsonwebtoken.security.JwkSetBuilder
    public JwkSetBuilder keys(Collection<Jwk<?>> collection) {
        return add(DefaultJwkSet.KEYS.getId(), (Object) collection);
    }

    @Override // io.jsonwebtoken.lang.Builder
    public JwkSet build() {
        return this.converter.applyFrom((Object) this.map);
    }

    @Override // io.jsonwebtoken.lang.MapMutator
    public JwkSetBuilder delete(String str) {
        this.map.remove(str);
        return this;
    }

    @Override // io.jsonwebtoken.lang.MapMutator
    public JwkSetBuilder empty() {
        this.map.clear();
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.jsonwebtoken.security.KeyOperationPolicied
    /* renamed from: operationPolicy */
    public JwkSetBuilder mo91operationPolicy(KeyOperationPolicy keyOperationPolicy) {
        if (keyOperationPolicy == null) {
            keyOperationPolicy = AbstractJwkBuilder.DEFAULT_OPERATION_POLICY;
        }
        this.operationPolicy = keyOperationPolicy;
        return refresh();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.jsonwebtoken.impl.security.AbstractSecurityBuilder, io.jsonwebtoken.security.SecurityBuilder
    public JwkSetBuilder provider(Provider provider) {
        super.provider(provider);
        return refresh();
    }

    @Override // io.jsonwebtoken.lang.MapMutator
    public JwkSetBuilder add(String str, Object obj) {
        this.map.put(str, obj);
        return this;
    }

    @Override // io.jsonwebtoken.lang.MapMutator
    public JwkSetBuilder add(Map<? extends String, ? extends Object> map) {
        this.map.putAll(map);
        return this;
    }

    @Override // io.jsonwebtoken.security.JwkSetBuilder
    public JwkSetBuilder add(Jwk<?> jwk) {
        if (jwk != null) {
            this.operationPolicy.validate(jwk.getOperations());
            Collection<Jwk<?>> ensureKeys = ensureKeys();
            ensureKeys.add(jwk);
            keys(ensureKeys);
        }
        return this;
    }

    @Override // io.jsonwebtoken.security.JwkSetBuilder
    public JwkSetBuilder add(Collection<Jwk<?>> collection) {
        if (!Collections.isEmpty(collection)) {
            for (Jwk<?> jwk : collection) {
                add(jwk);
            }
        }
        return this;
    }
}
