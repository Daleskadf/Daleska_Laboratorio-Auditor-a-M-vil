package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
/* compiled from: SyntheticJavaPartsProvider.kt */
/* loaded from: classes4.dex */
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {
    private final List<SyntheticJavaPartsProvider> inner;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeSyntheticJavaPartsProvider(List<? extends SyntheticJavaPartsProvider> inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.inner = inner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getMethodNames(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            CollectionsKt.addAll(arrayList, syntheticJavaPartsProvider.getMethodNames(_context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateMethods(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor, Name name, Collection<SimpleFunctionDescriptor> result) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            syntheticJavaPartsProvider.generateMethods(_context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getStaticFunctionNames(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            CollectionsKt.addAll(arrayList, syntheticJavaPartsProvider.getStaticFunctionNames(_context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateStaticFunctions(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor, Name name, Collection<SimpleFunctionDescriptor> result) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            syntheticJavaPartsProvider.generateStaticFunctions(_context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateConstructors(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor, List<ClassConstructorDescriptor> result) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(result, "result");
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            syntheticJavaPartsProvider.generateConstructors(_context_receiver_0, thisDescriptor, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getNestedClassNames(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            CollectionsKt.addAll(arrayList, syntheticJavaPartsProvider.getNestedClassNames(_context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateNestedClass(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor, Name name, List<ClassDescriptor> result) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            syntheticJavaPartsProvider.generateNestedClass(_context_receiver_0, thisDescriptor, name, result);
        }
    }
}
