package com.ktyoung.chickenstock.databinding;
import com.ktyoung.chickenstock.R;
import com.ktyoung.chickenstock.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CustomToolbarBindingImpl extends CustomToolbarBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CustomToolbarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private CustomToolbarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.ivLeftIcon.setTag(null);
        this.ivLeftIconTwo.setTag(null);
        this.ivRightIcon.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textRightTitle.setTag(null);
        this.textSubTitle.setTag(null);
        this.textTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
        if (BR.leftIconTwo == variableId) {
            setLeftIconTwo((android.graphics.drawable.Drawable) variable);
        }
        else if (BR.leftIconTwoClick == variableId) {
            setLeftIconTwoClick((android.view.View.OnClickListener) variable);
        }
        else if (BR.rightTitle == variableId) {
            setRightTitle((java.lang.String) variable);
        }
        else if (BR.rightTitleClick == variableId) {
            setRightTitleClick((android.view.View.OnClickListener) variable);
        }
        else if (BR.subTitle == variableId) {
            setSubTitle((java.lang.String) variable);
        }
        else if (BR.rightIconClick == variableId) {
            setRightIconClick((android.view.View.OnClickListener) variable);
        }
        else if (BR.leftIconClick == variableId) {
            setLeftIconClick((android.view.View.OnClickListener) variable);
        }
        else if (BR.leftIcon == variableId) {
            setLeftIcon((android.graphics.drawable.Drawable) variable);
        }
        else if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.rightIcon == variableId) {
            setRightIcon((android.graphics.drawable.Drawable) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLeftIconTwo(@Nullable android.graphics.drawable.Drawable LeftIconTwo) {
        this.mLeftIconTwo = LeftIconTwo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.leftIconTwo);
        super.requestRebind();
    }
    public void setLeftIconTwoClick(@Nullable android.view.View.OnClickListener LeftIconTwoClick) {
        this.mLeftIconTwoClick = LeftIconTwoClick;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.leftIconTwoClick);
        super.requestRebind();
    }
    public void setRightTitle(@Nullable java.lang.String RightTitle) {
        this.mRightTitle = RightTitle;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.rightTitle);
        super.requestRebind();
    }
    public void setRightTitleClick(@Nullable android.view.View.OnClickListener RightTitleClick) {
        this.mRightTitleClick = RightTitleClick;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.rightTitleClick);
        super.requestRebind();
    }
    public void setSubTitle(@Nullable java.lang.String SubTitle) {
        this.mSubTitle = SubTitle;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.subTitle);
        super.requestRebind();
    }
    public void setRightIconClick(@Nullable android.view.View.OnClickListener RightIconClick) {
        this.mRightIconClick = RightIconClick;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.rightIconClick);
        super.requestRebind();
    }
    public void setLeftIconClick(@Nullable android.view.View.OnClickListener LeftIconClick) {
        this.mLeftIconClick = LeftIconClick;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.leftIconClick);
        super.requestRebind();
    }
    public void setLeftIcon(@Nullable android.graphics.drawable.Drawable LeftIcon) {
        this.mLeftIcon = LeftIcon;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.leftIcon);
        super.requestRebind();
    }
    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setRightIcon(@Nullable android.graphics.drawable.Drawable RightIcon) {
        this.mRightIcon = RightIcon;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.rightIcon);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        boolean textUtilsIsEmptySubTitle = false;
        boolean rightTitleJavaLangObjectNull = false;
        int leftIconTwoJavaLangObjectNullViewGONEViewVISIBLE = 0;
        android.graphics.drawable.Drawable leftIconTwo = mLeftIconTwo;
        int rightTitleJavaLangObjectNullViewGONEViewVISIBLE = 0;
        android.view.View.OnClickListener leftIconTwoClick = mLeftIconTwoClick;
        java.lang.String rightTitle = mRightTitle;
        android.view.View.OnClickListener rightTitleClick = mRightTitleClick;
        java.lang.String subTitle = mSubTitle;
        boolean textUtilsIsEmptyTitle = false;
        boolean leftIconTwoJavaLangObjectNull = false;
        int textUtilsIsEmptySubTitleViewGONEViewVISIBLE = 0;
        boolean leftIconJavaLangObjectNull = false;
        int leftIconJavaLangObjectNullViewGONEViewVISIBLE = 0;
        int textUtilsIsEmptyTitleViewGONEViewVISIBLE = 0;
        android.view.View.OnClickListener rightIconClick = mRightIconClick;
        android.view.View.OnClickListener leftIconClick = mLeftIconClick;
        android.graphics.drawable.Drawable leftIcon = mLeftIcon;
        java.lang.String title = mTitle;
        boolean textUtilsIsEmptyRightTitle = false;
        int textUtilsIsEmptyRightTitleViewGONEViewVISIBLE = 0;
        android.graphics.drawable.Drawable rightIcon = mRightIcon;

        if ((dirtyFlags & 0x401L) != 0) {



                // read leftIconTwo == null
                leftIconTwoJavaLangObjectNull = (leftIconTwo) == (null);
            if((dirtyFlags & 0x401L) != 0) {
                if(leftIconTwoJavaLangObjectNull) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read leftIconTwo == null ? View.GONE : View.VISIBLE
                leftIconTwoJavaLangObjectNullViewGONEViewVISIBLE = ((leftIconTwoJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x402L) != 0) {
        }
        if ((dirtyFlags & 0x404L) != 0) {



                // read rightTitle == null
                rightTitleJavaLangObjectNull = (rightTitle) == (null);
                // read TextUtils.isEmpty(rightTitle)
                textUtilsIsEmptyRightTitle = android.text.TextUtils.isEmpty(rightTitle);
            if((dirtyFlags & 0x404L) != 0) {
                if(rightTitleJavaLangObjectNull) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x404L) != 0) {
                if(textUtilsIsEmptyRightTitle) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }


                // read rightTitle == null ? View.GONE : View.VISIBLE
                rightTitleJavaLangObjectNullViewGONEViewVISIBLE = ((rightTitleJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read TextUtils.isEmpty(rightTitle) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyRightTitleViewGONEViewVISIBLE = ((textUtilsIsEmptyRightTitle) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x408L) != 0) {
        }
        if ((dirtyFlags & 0x410L) != 0) {



                // read TextUtils.isEmpty(subTitle)
                textUtilsIsEmptySubTitle = android.text.TextUtils.isEmpty(subTitle);
            if((dirtyFlags & 0x410L) != 0) {
                if(textUtilsIsEmptySubTitle) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
                textUtilsIsEmptySubTitleViewGONEViewVISIBLE = ((textUtilsIsEmptySubTitle) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x420L) != 0) {
        }
        if ((dirtyFlags & 0x440L) != 0) {
        }
        if ((dirtyFlags & 0x480L) != 0) {



                // read leftIcon == null
                leftIconJavaLangObjectNull = (leftIcon) == (null);
            if((dirtyFlags & 0x480L) != 0) {
                if(leftIconJavaLangObjectNull) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }


                // read leftIcon == null ? View.GONE : View.VISIBLE
                leftIconJavaLangObjectNullViewGONEViewVISIBLE = ((leftIconJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x500L) != 0) {



                // read TextUtils.isEmpty(title)
                textUtilsIsEmptyTitle = android.text.TextUtils.isEmpty(title);
            if((dirtyFlags & 0x500L) != 0) {
                if(textUtilsIsEmptyTitle) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }


                // read TextUtils.isEmpty(title) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyTitleViewGONEViewVISIBLE = ((textUtilsIsEmptyTitle) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x600L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x480L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.ivLeftIcon, leftIcon);
            this.ivLeftIcon.setVisibility(leftIconJavaLangObjectNullViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x440L) != 0) {
            // api target 1

            this.ivLeftIcon.setOnClickListener(leftIconClick);
        }
        if ((dirtyFlags & 0x401L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.ivLeftIconTwo, leftIconTwo);
            this.ivLeftIconTwo.setVisibility(leftIconTwoJavaLangObjectNullViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x402L) != 0) {
            // api target 1

            this.ivLeftIconTwo.setOnClickListener(leftIconTwoClick);
        }
        if ((dirtyFlags & 0x600L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.ivRightIcon, rightIcon);
        }
        if ((dirtyFlags & 0x404L) != 0) {
            // api target 1

            this.ivRightIcon.setVisibility(rightTitleJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textRightTitle, rightTitle);
            this.textRightTitle.setVisibility(textUtilsIsEmptyRightTitleViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x420L) != 0) {
            // api target 1

            this.ivRightIcon.setOnClickListener(rightIconClick);
        }
        if ((dirtyFlags & 0x408L) != 0) {
            // api target 1

            this.textRightTitle.setOnClickListener(rightTitleClick);
        }
        if ((dirtyFlags & 0x410L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textSubTitle, subTitle);
            this.textSubTitle.setVisibility(textUtilsIsEmptySubTitleViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x500L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTitle, title);
            this.textTitle.setVisibility(textUtilsIsEmptyTitleViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): leftIconTwo
        flag 1 (0x2L): leftIconTwoClick
        flag 2 (0x3L): rightTitle
        flag 3 (0x4L): rightTitleClick
        flag 4 (0x5L): subTitle
        flag 5 (0x6L): rightIconClick
        flag 6 (0x7L): leftIconClick
        flag 7 (0x8L): leftIcon
        flag 8 (0x9L): title
        flag 9 (0xaL): rightIcon
        flag 10 (0xbL): null
        flag 11 (0xcL): leftIconTwo == null ? View.GONE : View.VISIBLE
        flag 12 (0xdL): leftIconTwo == null ? View.GONE : View.VISIBLE
        flag 13 (0xeL): rightTitle == null ? View.GONE : View.VISIBLE
        flag 14 (0xfL): rightTitle == null ? View.GONE : View.VISIBLE
        flag 15 (0x10L): TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
        flag 16 (0x11L): TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
        flag 17 (0x12L): leftIcon == null ? View.GONE : View.VISIBLE
        flag 18 (0x13L): leftIcon == null ? View.GONE : View.VISIBLE
        flag 19 (0x14L): TextUtils.isEmpty(title) ? View.GONE : View.VISIBLE
        flag 20 (0x15L): TextUtils.isEmpty(title) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): TextUtils.isEmpty(rightTitle) ? View.GONE : View.VISIBLE
        flag 22 (0x17L): TextUtils.isEmpty(rightTitle) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}