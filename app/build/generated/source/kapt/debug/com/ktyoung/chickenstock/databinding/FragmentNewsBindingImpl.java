package com.ktyoung.chickenstock.databinding;
import com.ktyoung.chickenstock.R;
import com.ktyoung.chickenstock.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentNewsBindingImpl extends FragmentNewsBinding implements com.ktyoung.chickenstock.generated.callback.OnRefreshListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentNewsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentNewsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[1]
            );
        this.main.setTag(null);
        this.rvItems.setTag(null);
        this.swipeRefresh.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.ktyoung.chickenstock.generated.callback.OnRefreshListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.ktyoung.chickenstock.viewmodel.NewsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.ktyoung.chickenstock.viewmodel.NewsViewModel Viewmodel) {
        updateRegistration(2, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelIsLoading((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewmodelNewsList((androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>>) object, fieldId);
            case 2 :
                return onChangeViewmodel((com.ktyoung.chickenstock.viewmodel.NewsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelIsLoading(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelNewsList(androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>> ViewmodelNewsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(com.ktyoung.chickenstock.viewmodel.NewsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelIsLoading = null;
        androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>> viewmodelNewsList = null;
        java.lang.Boolean viewmodelIsLoadingGetValue = null;
        java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel> viewmodelNewsListGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsLoadingGetValue = false;
        com.ktyoung.chickenstock.viewmodel.NewsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.isLoading()
                        viewmodelIsLoading = viewmodel.isLoading();
                    }
                    updateLiveDataRegistration(0, viewmodelIsLoading);


                    if (viewmodelIsLoading != null) {
                        // read viewmodel.isLoading().getValue()
                        viewmodelIsLoadingGetValue = viewmodelIsLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isLoading().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsLoadingGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.newsList
                        viewmodelNewsList = viewmodel.getNewsList();
                    }
                    updateLiveDataRegistration(1, viewmodelNewsList);


                    if (viewmodelNewsList != null) {
                        // read viewmodel.newsList.getValue()
                        viewmodelNewsListGetValue = viewmodelNewsList.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.ktyoung.chickenstock.util.BindingManagers.setBindItem(this.rvItems, viewmodelNewsList);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.swipeRefresh.setOnRefreshListener(mCallback5);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.swipeRefresh.setRefreshing(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsLoadingGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnRefresh(int sourceId ) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        com.ktyoung.chickenstock.viewmodel.NewsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.onRefresh();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.isLoading()
        flag 1 (0x2L): viewmodel.newsList
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}