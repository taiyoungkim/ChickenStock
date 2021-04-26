package com.ktyoung.chickenstock.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.ktyoung.chickenstock.R;

public class SettingFragmentDirections {
  private SettingFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSettingFragmentToHelpFragment() {
    return new ActionOnlyNavDirections(R.id.action_settingFragment_to_helpFragment);
  }
}
