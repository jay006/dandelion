/*
    This file is part of the Diaspora for Android.

    Diaspora for Android is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Diaspora for Android is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with the Diaspora for Android.

    If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.dfa.diaspora_android.fragment;

import com.github.dfa.diaspora_android.App;
import com.github.dfa.diaspora_android.data.AppSettings;
import com.github.dfa.diaspora_android.util.theming.ThemeHelper;

/**
 * Fragment that supports color schemes
 * Created by vanitas on 06.10.16.
 */

public abstract class ThemedFragment extends CustomFragment {
    protected AppSettings getAppSettings() {
        return ((App) getActivity().getApplication()).getSettings();
    }

    protected abstract void applyColorToViews();

    @Override
    public void onResume() {
        super.onResume();
        ThemeHelper.getInstance(getAppSettings());
        applyColorToViews();
    }
}