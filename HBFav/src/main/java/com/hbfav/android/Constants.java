package com.hbfav.android;


import com.hbfav.android.model.NavigationItem;
import com.hbfav.android.ui.MainActivity;

public class Constants {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    public static final String ARG_SECTION_NUMBER = "section_number";

    public static final String PREF_USER_NAME = MainActivity.getContextOfApplication().getString(R.string.pref_hatena_user_name);

    public static final String HBFAV_BASE_URL = "http://hbfav-android.herokuapp.com/";

    public static final String BASE_THUMBNAIL_URL = "http://www.st-hatena.com/users/";

    public static final String ISSUES_URL = "https://github.com/yasuoza/HBFav-Android/issues";

    public static final NavigationItem[] MENUS = new NavigationItem[]{
            new NavigationItem(
                    null,
                    MainActivity.getContextOfApplication().getString(R.string.title_section0)
            ),

            new NavigationItem(
                    MainActivity.getContextOfApplication().getResources().getDrawable(R.drawable.ic_star),
                    MainActivity.getContextOfApplication().getString(R.string.title_section1)
            ),
            new NavigationItem(
                    MainActivity.getContextOfApplication().getResources().getDrawable(R.drawable.ic_doc),
                    MainActivity.getContextOfApplication().getString(R.string.title_section2)
            ),
            new NavigationItem(
                    MainActivity.getContextOfApplication().getResources().getDrawable(R.drawable.ic_heart),
                    MainActivity.getContextOfApplication().getString(R.string.title_section3)
            ),
            new NavigationItem(
                    MainActivity.getContextOfApplication().getResources().getDrawable(R.drawable.ic_about),
                    MainActivity.getContextOfApplication().getString(R.string.title_section4)
            )
    };

    public static final String[] CATEGORIES = MainActivity.getContextOfApplication()
            .getResources()
            .getStringArray(R.array.params_entry_category);
}
