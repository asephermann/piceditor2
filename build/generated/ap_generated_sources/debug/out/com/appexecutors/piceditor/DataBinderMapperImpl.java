package com.appexecutors.piceditor;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.appexecutors.piceditor.databinding.ActivityPicEditorBindingImpl;
import com.appexecutors.piceditor.databinding.FragmentCropRotateBindingImpl;
import com.appexecutors.piceditor.databinding.FragmentImagePreviewBindingImpl;
import com.appexecutors.piceditor.databinding.FragmentPicEditorBindingImpl;
import com.appexecutors.piceditor.databinding.FragmentVideoPreviewBindingImpl;
import com.appexecutors.piceditor.databinding.RecyclerItemCropRatioBindingImpl;
import com.appexecutors.piceditor.databinding.RecyclerItemThumbnailBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYPICEDITOR = 1;

  private static final int LAYOUT_FRAGMENTCROPROTATE = 2;

  private static final int LAYOUT_FRAGMENTIMAGEPREVIEW = 3;

  private static final int LAYOUT_FRAGMENTPICEDITOR = 4;

  private static final int LAYOUT_FRAGMENTVIDEOPREVIEW = 5;

  private static final int LAYOUT_RECYCLERITEMCROPRATIO = 6;

  private static final int LAYOUT_RECYCLERITEMTHUMBNAIL = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.appexecutors.piceditor.R.layout.activity_pic_editor, LAYOUT_ACTIVITYPICEDITOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.appexecutors.piceditor.R.layout.fragment_crop_rotate, LAYOUT_FRAGMENTCROPROTATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.appexecutors.piceditor.R.layout.fragment_image_preview, LAYOUT_FRAGMENTIMAGEPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.appexecutors.piceditor.R.layout.fragment_pic_editor, LAYOUT_FRAGMENTPICEDITOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.appexecutors.piceditor.R.layout.fragment_video_preview, LAYOUT_FRAGMENTVIDEOPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.appexecutors.piceditor.R.layout.recycler_item_crop_ratio, LAYOUT_RECYCLERITEMCROPRATIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.appexecutors.piceditor.R.layout.recycler_item_thumbnail, LAYOUT_RECYCLERITEMTHUMBNAIL);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYPICEDITOR: {
          if ("layout/activity_pic_editor_0".equals(tag)) {
            return new ActivityPicEditorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_pic_editor is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCROPROTATE: {
          if ("layout/fragment_crop_rotate_0".equals(tag)) {
            return new FragmentCropRotateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_crop_rotate is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMAGEPREVIEW: {
          if ("layout/fragment_image_preview_0".equals(tag)) {
            return new FragmentImagePreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_image_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPICEDITOR: {
          if ("layout/fragment_pic_editor_0".equals(tag)) {
            return new FragmentPicEditorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_pic_editor is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIDEOPREVIEW: {
          if ("layout/fragment_video_preview_0".equals(tag)) {
            return new FragmentVideoPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_video_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERITEMCROPRATIO: {
          if ("layout/recycler_item_crop_ratio_0".equals(tag)) {
            return new RecyclerItemCropRatioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_item_crop_ratio is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERITEMTHUMBNAIL: {
          if ("layout/recycler_item_thumbnail_0".equals(tag)) {
            return new RecyclerItemThumbnailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_item_thumbnail is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "fragment");
      sKeys.put(2, "mode");
      sKeys.put(3, "options");
      sKeys.put(4, "ratio");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_pic_editor_0", com.appexecutors.piceditor.R.layout.activity_pic_editor);
      sKeys.put("layout/fragment_crop_rotate_0", com.appexecutors.piceditor.R.layout.fragment_crop_rotate);
      sKeys.put("layout/fragment_image_preview_0", com.appexecutors.piceditor.R.layout.fragment_image_preview);
      sKeys.put("layout/fragment_pic_editor_0", com.appexecutors.piceditor.R.layout.fragment_pic_editor);
      sKeys.put("layout/fragment_video_preview_0", com.appexecutors.piceditor.R.layout.fragment_video_preview);
      sKeys.put("layout/recycler_item_crop_ratio_0", com.appexecutors.piceditor.R.layout.recycler_item_crop_ratio);
      sKeys.put("layout/recycler_item_thumbnail_0", com.appexecutors.piceditor.R.layout.recycler_item_thumbnail);
    }
  }
}
