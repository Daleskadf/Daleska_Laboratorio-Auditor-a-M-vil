package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.savedstate.SavedStateRegistry;
/* loaded from: classes.dex */
final class SavedStateHandleController implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f2548a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2549b = false;

    /* renamed from: c  reason: collision with root package name */
    public final s f2550c;

    /* loaded from: classes.dex */
    public static final class a implements SavedStateRegistry.a {
        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(androidx.savedstate.b bVar) {
            if (bVar instanceof y) {
                x viewModelStore = ((y) bVar).getViewModelStore();
                SavedStateRegistry savedStateRegistry = bVar.getSavedStateRegistry();
                for (String str : viewModelStore.c()) {
                    SavedStateHandleController.b(viewModelStore.b(str), savedStateRegistry, bVar.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.e(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, s sVar) {
        this.f2548a = str;
        this.f2550c = sVar;
    }

    public static void b(v vVar, SavedStateRegistry savedStateRegistry, d dVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) vVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.f()) {
            savedStateHandleController.c(savedStateRegistry, dVar);
            g(savedStateRegistry, dVar);
        }
    }

    public static SavedStateHandleController d(SavedStateRegistry savedStateRegistry, d dVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, s.a(savedStateRegistry.a(str), bundle));
        savedStateHandleController.c(savedStateRegistry, dVar);
        g(savedStateRegistry, dVar);
        return savedStateHandleController;
    }

    public static void g(final SavedStateRegistry savedStateRegistry, final d dVar) {
        d.c b10 = dVar.b();
        if (b10 != d.c.INITIALIZED && !b10.a(d.c.STARTED)) {
            dVar.a(new e() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.e
                public void a(g gVar, d.b bVar) {
                    if (bVar == d.b.ON_START) {
                        d.this.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        } else {
            savedStateRegistry.e(a.class);
        }
    }

    @Override // androidx.lifecycle.e
    public void a(g gVar, d.b bVar) {
        if (bVar == d.b.ON_DESTROY) {
            this.f2549b = false;
            gVar.getLifecycle().c(this);
        }
    }

    public void c(SavedStateRegistry savedStateRegistry, d dVar) {
        if (!this.f2549b) {
            this.f2549b = true;
            dVar.a(this);
            savedStateRegistry.d(this.f2548a, this.f2550c.b());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public s e() {
        return this.f2550c;
    }

    public boolean f() {
        return this.f2549b;
    }
}
