package com.appexecutors.piceditor.databinding;
import com.appexecutors.piceditor.R;
import com.appexecutors.piceditor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPicEditorBindingImpl extends FragmentPicEditorBinding implements com.appexecutors.piceditor.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_pager, 15);
        sViewsWithIds.put(R.id.constraint_layout_toolbar, 16);
        sViewsWithIds.put(R.id.constraint_layout_text, 17);
        sViewsWithIds.put(R.id.edit_text, 18);
        sViewsWithIds.put(R.id.constraint_layout_caption, 19);
        sViewsWithIds.put(R.id.view_anchor, 20);
        sViewsWithIds.put(R.id.color_picker, 21);
        sViewsWithIds.put(R.id.constraint_progress, 22);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPicEditorBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentPicEditorBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[10]
            , (com.github.veritas1.verticalslidecolorpicker.VerticalSlideColorPicker) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (android.widget.EditText) bindings[18]
            , (android.widget.EditText) bindings[12]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[14]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[20]
            , (androidx.viewpager2.widget.ViewPager2) bindings[15]
            );
        this.addTextDoneTv.setTag(null);
        this.editTextCaption.setTag(null);
        this.fabSelect.setTag(null);
        this.imageViewAddMore.setTag(null);
        this.imageViewBack.setTag(null);
        this.imageViewCropRotate.setTag(null);
        this.imageViewDelete.setTag(null);
        this.imageViewDraw.setTag(null);
        this.imageViewRedo.setTag(null);
        this.imageViewText.setTag(null);
        this.imageViewUndo.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.recyclerViewMedia.setTag(null);
        this.rootView.setTag(null);
        this.verticalLine.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 6);
        mCallback2 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 2);
        mCallback9 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 9);
        mCallback5 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 5);
        mCallback1 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 8);
        mCallback4 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 4);
        mCallback10 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 10);
        mCallback7 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 7);
        mCallback3 = new com.appexecutors.piceditor.generated.callback.OnClickListener(this, 3);
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
        if (BR.fragment == variableId) {
            setFragment((com.appexecutors.piceditor.PicEditorFragment) variable);
        }
        else if (BR.mode == variableId) {
            setMode((java.lang.Integer) variable);
        }
        else if (BR.options == variableId) {
            setOptions((com.appexecutors.piceditor.EditOptions) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.appexecutors.piceditor.PicEditorFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setMode(@Nullable java.lang.Integer Mode) {
        this.mMode = Mode;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mode);
        super.requestRebind();
    }
    public void setOptions(@Nullable com.appexecutors.piceditor.EditOptions Options) {
        this.mOptions = Options;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.options);
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
        boolean optionsShowDeleteOptionModeInt1BooleanFalse = false;
        int androidxDatabindingViewDataBindingSafeUnboxMode = 0;
        com.appexecutors.piceditor.PicEditorFragment fragment = mFragment;
        boolean optionsShowTextOptionModeInt1BooleanFalse = false;
        int optionsShowTextOptionModeInt1BooleanFalseViewVISIBLEViewGONE = 0;
        boolean optionsShowDrawOption = false;
        boolean optionsShowDrawOptionModeInt1BooleanFalse = false;
        boolean optionsShowCropOptionModeInt1BooleanFalse = false;
        int optionsShowCropOptionModeInt1BooleanFalseViewVISIBLEViewGONE = 0;
        int optionsShowDeleteOptionModeInt1BooleanFalseViewVISIBLEViewGONE = 0;
        int optionsShowThumbnailViewVISIBLEViewGONE = 0;
        int optionsShowDrawOptionModeInt1BooleanFalseViewVISIBLEViewGONE = 0;
        boolean optionsShowThumbnail = false;
        boolean optionsAllowAddingImages = false;
        int optionsAllowAddingImagesViewVISIBLEViewGONE = 0;
        boolean optionsShowCropOption = false;
        java.lang.Integer mode = mMode;
        int modeInt1ViewVISIBLEViewGONE = 0;
        int optionsShowCaptionViewVISIBLEViewGONE = 0;
        com.appexecutors.piceditor.EditOptions options = mOptions;
        boolean optionsShowCaption = false;
        boolean optionsShowTextOption = false;
        boolean optionsShowDeleteOption = false;
        boolean modeInt1 = false;

        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(mode)
                androidxDatabindingViewDataBindingSafeUnboxMode = androidx.databinding.ViewDataBinding.safeUnbox(mode);


                // read androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1
                modeInt1 = (androidxDatabindingViewDataBindingSafeUnboxMode) == (1);
            if((dirtyFlags & 0xaL) != 0) {
                if(modeInt1) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 ? View.VISIBLE : View.GONE
                modeInt1ViewVISIBLEViewGONE = ((modeInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xeL) != 0) {



                if (options != null) {
                    // read options.showDrawOption
                    optionsShowDrawOption = options.getShowDrawOption();
                    // read options.showCropOption
                    optionsShowCropOption = options.getShowCropOption();
                    // read options.showTextOption
                    optionsShowTextOption = options.getShowTextOption();
                    // read options.showDeleteOption
                    optionsShowDeleteOption = options.getShowDeleteOption();
                }
            if((dirtyFlags & 0xeL) != 0) {
                if(optionsShowDrawOption) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0xeL) != 0) {
                if(optionsShowCropOption) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0xeL) != 0) {
                if(optionsShowTextOption) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0xeL) != 0) {
                if(optionsShowDeleteOption) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (options != null) {
                        // read options.showThumbnail
                        optionsShowThumbnail = options.getShowThumbnail();
                        // read options.allowAddingImages
                        optionsAllowAddingImages = options.getAllowAddingImages();
                        // read options.showCaption
                        optionsShowCaption = options.getShowCaption();
                    }
                if((dirtyFlags & 0xcL) != 0) {
                    if(optionsShowThumbnail) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
                if((dirtyFlags & 0xcL) != 0) {
                    if(optionsAllowAddingImages) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
                if((dirtyFlags & 0xcL) != 0) {
                    if(optionsShowCaption) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }


                    // read options.showThumbnail ? View.VISIBLE : View.GONE
                    optionsShowThumbnailViewVISIBLEViewGONE = ((optionsShowThumbnail) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read options.allowAddingImages ? View.VISIBLE : View.GONE
                    optionsAllowAddingImagesViewVISIBLEViewGONE = ((optionsAllowAddingImages) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read options.showCaption ? View.VISIBLE : View.GONE
                    optionsShowCaptionViewVISIBLEViewGONE = ((optionsShowCaption) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x28a0L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(mode)
                androidxDatabindingViewDataBindingSafeUnboxMode = androidx.databinding.ViewDataBinding.safeUnbox(mode);


                // read androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1
                modeInt1 = (androidxDatabindingViewDataBindingSafeUnboxMode) == (1);
            if((dirtyFlags & 0xaL) != 0) {
                if(modeInt1) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }
        }

        if ((dirtyFlags & 0xeL) != 0) {

                // read options.showDeleteOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
                optionsShowDeleteOptionModeInt1BooleanFalse = ((optionsShowDeleteOption) ? (modeInt1) : (false));
                // read options.showTextOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
                optionsShowTextOptionModeInt1BooleanFalse = ((optionsShowTextOption) ? (modeInt1) : (false));
                // read options.showDrawOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
                optionsShowDrawOptionModeInt1BooleanFalse = ((optionsShowDrawOption) ? (modeInt1) : (false));
                // read options.showCropOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
                optionsShowCropOptionModeInt1BooleanFalse = ((optionsShowCropOption) ? (modeInt1) : (false));
            if((dirtyFlags & 0xeL) != 0) {
                if(optionsShowDeleteOptionModeInt1BooleanFalse) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }
            if((dirtyFlags & 0xeL) != 0) {
                if(optionsShowTextOptionModeInt1BooleanFalse) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0xeL) != 0) {
                if(optionsShowDrawOptionModeInt1BooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }
            if((dirtyFlags & 0xeL) != 0) {
                if(optionsShowCropOptionModeInt1BooleanFalse) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read options.showDeleteOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
                optionsShowDeleteOptionModeInt1BooleanFalseViewVISIBLEViewGONE = ((optionsShowDeleteOptionModeInt1BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read options.showTextOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
                optionsShowTextOptionModeInt1BooleanFalseViewVISIBLEViewGONE = ((optionsShowTextOptionModeInt1BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read options.showDrawOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
                optionsShowDrawOptionModeInt1BooleanFalseViewVISIBLEViewGONE = ((optionsShowDrawOptionModeInt1BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read options.showCropOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
                optionsShowCropOptionModeInt1BooleanFalseViewVISIBLEViewGONE = ((optionsShowCropOptionModeInt1BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.addTextDoneTv.setOnClickListener(mCallback8);
            this.fabSelect.setOnClickListener(mCallback10);
            this.imageViewAddMore.setOnClickListener(mCallback9);
            this.imageViewBack.setOnClickListener(mCallback1);
            this.imageViewCropRotate.setOnClickListener(mCallback5);
            this.imageViewDelete.setOnClickListener(mCallback4);
            this.imageViewDraw.setOnClickListener(mCallback7);
            this.imageViewRedo.setOnClickListener(mCallback3);
            this.imageViewText.setOnClickListener(mCallback6);
            this.imageViewUndo.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.editTextCaption.setVisibility(optionsShowCaptionViewVISIBLEViewGONE);
            this.imageViewAddMore.setVisibility(optionsAllowAddingImagesViewVISIBLEViewGONE);
            this.recyclerViewMedia.setVisibility(optionsShowThumbnailViewVISIBLEViewGONE);
            this.verticalLine.setVisibility(optionsAllowAddingImagesViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.imageViewCropRotate.setVisibility(optionsShowCropOptionModeInt1BooleanFalseViewVISIBLEViewGONE);
            this.imageViewDelete.setVisibility(optionsShowDeleteOptionModeInt1BooleanFalseViewVISIBLEViewGONE);
            this.imageViewDraw.setVisibility(optionsShowDrawOptionModeInt1BooleanFalseViewVISIBLEViewGONE);
            this.imageViewText.setVisibility(optionsShowTextOptionModeInt1BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.mboundView2.setVisibility(modeInt1ViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.PicEditorFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.addTextOver();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.PicEditorFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {



                    fragment.undoRedo(1);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.PicEditorFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.addMore();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.PicEditorFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.cropImage();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment.onBackPress()
                kotlin.Unit fragmentOnBackPress = null;
                // fragment
                com.appexecutors.piceditor.PicEditorFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragmentOnBackPress = fragment.onBackPress();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.PicEditorFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.textDone();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.PicEditorFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.deleteImage();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.PicEditorFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.editDone();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.PicEditorFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.startBrush();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // fragment
                com.appexecutors.piceditor.PicEditorFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {



                    fragment.undoRedo(2);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): mode
        flag 2 (0x3L): options
        flag 3 (0x4L): null
        flag 4 (0x5L): options.showDeleteOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
        flag 5 (0x6L): options.showDeleteOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
        flag 6 (0x7L): options.showTextOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
        flag 7 (0x8L): options.showTextOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
        flag 8 (0x9L): options.showTextOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): options.showTextOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): options.showDrawOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
        flag 11 (0xcL): options.showDrawOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
        flag 12 (0xdL): options.showCropOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
        flag 13 (0xeL): options.showCropOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false
        flag 14 (0xfL): options.showCropOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): options.showCropOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): options.showDeleteOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): options.showDeleteOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): options.showThumbnail ? View.VISIBLE : View.GONE
        flag 19 (0x14L): options.showThumbnail ? View.VISIBLE : View.GONE
        flag 20 (0x15L): options.showDrawOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): options.showDrawOption ? androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): options.allowAddingImages ? View.VISIBLE : View.GONE
        flag 23 (0x18L): options.allowAddingImages ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(mode) == 1 ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): options.showCaption ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): options.showCaption ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}