package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
/* loaded from: classes.dex */
public final class ErrorRequestCoordinator implements RequestCoordinator, Request {
    private volatile Request error;
    private RequestCoordinator.RequestState errorState;
    private final RequestCoordinator parent;
    private volatile Request primary;
    private RequestCoordinator.RequestState primaryState;
    private final Object requestLock;

    public ErrorRequestCoordinator(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.primaryState = requestState;
        this.errorState = requestState;
        this.requestLock = obj;
        this.parent = requestCoordinator;
    }

    private boolean isValidRequestForStatusChanged(Request request) {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2 = this.primaryState;
        RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
        if (requestState2 != requestState3) {
            return request.equals(this.primary);
        }
        if (request.equals(this.error) && ((requestState = this.errorState) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3)) {
            return true;
        }
        return false;
    }

    private boolean parentCanNotifyCleared() {
        RequestCoordinator requestCoordinator = this.parent;
        if (requestCoordinator != null && !requestCoordinator.canNotifyCleared(this)) {
            return false;
        }
        return true;
    }

    private boolean parentCanNotifyStatusChanged() {
        RequestCoordinator requestCoordinator = this.parent;
        if (requestCoordinator != null && !requestCoordinator.canNotifyStatusChanged(this)) {
            return false;
        }
        return true;
    }

    private boolean parentCanSetImage() {
        RequestCoordinator requestCoordinator = this.parent;
        if (requestCoordinator != null && !requestCoordinator.canSetImage(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        synchronized (this.requestLock) {
            RequestCoordinator.RequestState requestState = this.primaryState;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.primaryState = requestState2;
                this.primary.begin();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(Request request) {
        boolean z10;
        synchronized (this.requestLock) {
            if (parentCanNotifyCleared() && request.equals(this.primary)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(Request request) {
        boolean z10;
        synchronized (this.requestLock) {
            if (parentCanNotifyStatusChanged() && isValidRequestForStatusChanged(request)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(Request request) {
        boolean parentCanSetImage;
        synchronized (this.requestLock) {
            parentCanSetImage = parentCanSetImage();
        }
        return parentCanSetImage;
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.requestLock) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.primaryState = requestState;
            this.primary.clear();
            if (this.errorState != requestState) {
                this.errorState = requestState;
                this.error.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator requestCoordinator;
        synchronized (this.requestLock) {
            RequestCoordinator requestCoordinator2 = this.parent;
            if (requestCoordinator2 != null) {
                requestCoordinator = requestCoordinator2.getRoot();
            } else {
                requestCoordinator = this;
            }
        }
        return requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.requestLock) {
            if (!this.primary.isAnyResourceSet() && !this.error.isAnyResourceSet()) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
        boolean z10;
        synchronized (this.requestLock) {
            RequestCoordinator.RequestState requestState = this.primaryState;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            if (requestState == requestState2 && this.errorState == requestState2) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        boolean z10;
        synchronized (this.requestLock) {
            RequestCoordinator.RequestState requestState = this.primaryState;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            if (requestState != requestState2 && this.errorState != requestState2) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request) {
        if (!(request instanceof ErrorRequestCoordinator)) {
            return false;
        }
        ErrorRequestCoordinator errorRequestCoordinator = (ErrorRequestCoordinator) request;
        if (!this.primary.isEquivalentTo(errorRequestCoordinator.primary) || !this.error.isEquivalentTo(errorRequestCoordinator.error)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        boolean z10;
        synchronized (this.requestLock) {
            RequestCoordinator.RequestState requestState = this.primaryState;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2 && this.errorState != requestState2) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(Request request) {
        synchronized (this.requestLock) {
            if (!request.equals(this.error)) {
                this.primaryState = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.errorState;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.errorState = requestState2;
                    this.error.begin();
                }
                return;
            }
            this.errorState = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.parent;
            if (requestCoordinator != null) {
                requestCoordinator.onRequestFailed(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(Request request) {
        synchronized (this.requestLock) {
            if (request.equals(this.primary)) {
                this.primaryState = RequestCoordinator.RequestState.SUCCESS;
            } else if (request.equals(this.error)) {
                this.errorState = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.parent;
            if (requestCoordinator != null) {
                requestCoordinator.onRequestSuccess(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
        synchronized (this.requestLock) {
            RequestCoordinator.RequestState requestState = this.primaryState;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.primaryState = RequestCoordinator.RequestState.PAUSED;
                this.primary.pause();
            }
            if (this.errorState == requestState2) {
                this.errorState = RequestCoordinator.RequestState.PAUSED;
                this.error.pause();
            }
        }
    }

    public void setRequests(Request request, Request request2) {
        this.primary = request;
        this.error = request2;
    }
}
