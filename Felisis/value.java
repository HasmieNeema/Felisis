 <declare-styleable name="ActionBar"><attr name="navigationMode">
            
            <enum name="normal" value="0"/>
            
            <enum name="listMode" value="1"/>
            
            <enum name="tabMode" value="2"/>
        </attr><attr name="displayOptions">
            <flag name="none" value="0"/>
            <flag name="useLogo" value="0x1"/>
            <flag name="showHome" value="0x2"/>
            <flag name="homeAsUp" value="0x4"/>
            <flag name="showTitle" value="0x8"/>
            <flag name="showCustom" value="0x10"/>
            <flag name="disableHome" value="0x20"/>
        </attr><attr name="title"/><attr format="string" name="subtitle"/><attr format="reference" name="titleTextStyle"/><attr format="reference" name="subtitleTextStyle"/><attr format="reference" name="icon"/><attr format="reference" name="logo"/><attr format="reference" name="divider"/><attr format="reference" name="background"/><attr format="reference|color" name="backgroundStacked"/><attr format="reference|color" name="backgroundSplit"/><attr format="reference" name="customNavigationLayout"/><attr name="height"/><attr format="reference" name="homeLayout"/><attr format="reference" name="progressBarStyle"/><attr format="reference" name="indeterminateProgressStyle"/><attr format="dimension" name="progressBarPadding"/><attr name="homeAsUpIndicator"/><attr format="dimension" name="itemPadding"/><attr format="boolean" name="hideOnContentScroll"/><attr format="dimension" name="contentInsetStart"/><attr format="dimension" name="contentInsetEnd"/><attr format="dimension" name="contentInsetLeft"/><attr format="dimension" name="contentInsetRight"/><attr format="dimension" name="contentInsetStartWithNavigation"/><attr format="dimension" name="contentInsetEndWithActions"/><attr format="dimension" name="elevation"/><attr format="reference" name="popupTheme"/></declare-styleable>
    <declare-styleable name="ActionBarLayout"><attr name="android:layout_gravity"/></declare-styleable>
    <declare-styleable name="ActionMenuItemView"><attr name="android:minWidth"/></declare-styleable>
    <declare-styleable name="ActionMenuView"/>
    <declare-styleable name="ActionMode"><attr name="titleTextStyle"/><attr name="subtitleTextStyle"/><attr name="background"/><attr name="backgroundSplit"/><attr name="height"/><attr format="reference" name="closeItemLayout"/></declare-styleable>
    <declare-styleable name="ActivityChooserView"><attr format="string" name="initialActivityCount"/><attr format="reference" name="expandActivityOverflowButtonDrawable"/></declare-styleable>
    <declare-styleable name="AlertDialog"><attr name="android:layout"/><attr format="reference" name="buttonPanelSideLayout"/><attr format="reference" name="listLayout"/><attr format="reference" name="multiChoiceItemLayout"/><attr format="reference" name="singleChoiceItemLayout"/><attr format="reference" name="listItemLayout"/><attr format="boolean" name="showTitle"/></declare-styleable>
    <declare-styleable name="AppCompatImageView"><attr name="android:src"/><attr format="reference" name="srcCompat"/></declare-styleable>
    <declare-styleable name="AppCompatSeekBar"><attr name="android:thumb"/><attr format="reference" name="tickMark"/><attr format="color" name="tickMarkTint"/><attr name="tickMarkTintMode">
            
            <enum name="src_over" value="3"/>
            
            <enum name="src_in" value="5"/>
            
            <enum name="src_atop" value="9"/>
            
            <enum name="multiply" value="14"/>
            
            <enum name="screen" value="15"/>
            
            <enum name="add" value="16"/>
        </attr></declare-styleable>
    <declare-styleable name="AppCompatTextHelper"><attr name="android:drawableLeft"/><attr name="android:drawableTop"/><attr name="android:drawableRight"/><attr name="android:drawableBottom"/><attr name="android:drawableStart"/><attr name="android:drawableEnd"/><attr name="android:textAppearance"/></declare-styleable>
    <declare-styleable name="AppCompatTextView"><attr format="reference|boolean" name="textAllCaps"/><attr name="android:textAppearance"/></declare-styleable>
    <declare-styleable name="AppCompatTheme"><attr format="boolean" name="windowActionBar"/><attr format="boolean" name="windowNoTitle"/><attr format="boolean" name="windowActionBarOverlay"/><attr format="boolean" name="windowActionModeOverlay"/><attr format="dimension|fraction" name="windowFixedWidthMajor"/><attr format="dimension|fraction" name="windowFixedHeightMinor"/><attr format="dimension|fraction" name="windowFixedWidthMinor"/><attr format="dimension|fraction" name="windowFixedHeightMajor"/><attr format="dimension|fraction" name="windowMinWidthMajor"/><attr format="dimension|fraction" name="windowMinWidthMinor"/><attr name="android:windowIsFloating"/><attr name="android:windowAnimationStyle"/><attr format="reference" name="actionBarTabStyle"/><attr format="reference" name="actionBarTabBarStyle"/><attr format="reference" name="actionBarTabTextStyle"/><attr format="reference" name="actionOverflowButtonStyle"/><attr format="reference" name="actionOverflowMenuStyle"/><attr format="reference" name="actionBarPopupTheme"/><attr format="reference" name="actionBarStyle"/><attr format="reference" name="actionBarSplitStyle"/><attr format="reference" name="actionBarTheme"/><attr format="reference" name="actionBarWidgetTheme"/><attr format="dimension" name="actionBarSize">
            <enum name="wrap_content" value="0"/>
        </attr><attr format="reference" name="actionBarDivider"/><attr format="reference" name="actionBarItemBackground"/><attr format="reference" name="actionMenuTextAppearance"/><attr format="color|reference" name="actionMenuTextColor"/><attr format="reference" name="actionModeStyle"/><attr format="reference" name="actionModeCloseButtonStyle"/><attr format="reference" name="actionModeBackground"/><attr format="reference" name="actionModeSplitBackground"/><attr format="reference" name="actionModeCloseDrawable"/><attr format="reference" name="actionModeCutDrawable"/><attr format="reference" name="actionModeCopyDrawable"/><attr format="reference" name="actionModePasteDrawable"/><attr format="reference" name="actionModeSelectAllDrawable"/><attr format="reference" name="actionModeShareDrawable"/><attr format="reference" name="actionModeFindDrawable"/><attr format="reference" name="actionModeWebSearchDrawable"/><attr format="reference" name="actionModePopupWindowStyle"/><attr format="reference" name="textAppearanceLargePopupMenu"/><attr format="reference" name="textAppearanceSmallPopupMenu"/><attr format="reference" name="textAppearancePopupMenuHeader"/><attr format="reference" name="dialogTheme"/><attr format="dimension" name="dialogPreferredPadding"/><attr format="reference" name="listDividerAlertDialog"/><attr format="reference" name="actionDropDownStyle"/><attr format="dimension" name="dropdownListPreferredItemHeight"/><attr format="reference" name="spinnerDropDownItemStyle"/><attr format="reference" name="homeAsUpIndicator"/><attr format="reference" name="actionButtonStyle"/><attr format="reference" name="buttonBarStyle"/><attr format="reference" name="buttonBarButtonStyle"/><attr format="reference" name="selectableItemBackground"/><attr format="reference" name="selectableItemBackgroundBorderless"/><attr format="reference" name="borderlessButtonStyle"/><attr format="reference" name="dividerVertical"/><attr format="reference" name="dividerHorizontal"/><attr format="reference" name="activityChooserViewStyle"/><attr format="reference" name="toolbarStyle"/><attr format="reference" name="toolbarNavigationButtonStyle"/><attr format="reference" name="popupMenuStyle"/><attr format="reference" name="popupWindowStyle"/><attr format="reference|color" name="editTextColor"/><attr format="reference" name="editTextBackground"/><attr format="reference" name="imageButtonStyle"/><attr format="reference" name="textAppearanceSearchResultTitle"/><attr format="reference" name="textAppearanceSearchResultSubtitle"/><attr format="reference|color" name="textColorSearchUrl"/><attr format="reference" name="searchViewStyle"/><attr format="dimension" name="listPreferredItemHeight"/><attr format="dimension" name="listPreferredItemHeightSmall"/><attr format="dimension" name="listPreferredItemHeightLarge"/><attr format="dimension" name="listPreferredItemPaddingLeft"/><attr format="dimension" name="listPreferredItemPaddingRight"/><attr format="reference" name="dropDownListViewStyle"/><attr format="reference" name="listPopupWindowStyle"/><attr format="reference" name="textAppearanceListItem"/><attr format="reference" name="textAppearanceListItemSmall"/><attr format="reference" name="panelBackground"/><attr format="dimension" name="panelMenuListWidth"/><attr format="reference" name="panelMenuListTheme"/><attr format="reference" name="listChoiceBackgroundIndicator"/><attr format="color" name="colorPrimary"/><attr format="color" name="colorPrimaryDark"/><attr format="color" name="colorAccent"/><attr format="color" name="colorControlNormal"/><attr format="color" name="colorControlActivated"/><attr format="color" name="colorControlHighlight"/><attr format="color" name="colorButtonNormal"/><attr format="color" name="colorSwitchThumbNormal"/><attr format="reference" name="controlBackground"/><attr format="color" name="colorBackgroundFloating"/><attr format="reference" name="alertDialogStyle"/><attr format="reference" name="alertDialogButtonGroupStyle"/><attr format="boolean" name="alertDialogCenterButtons"/><attr format="reference" name="alertDialogTheme"/><attr format="reference|color" name="textColorAlertDialogListItem"/><attr format="reference" name="buttonBarPositiveButtonStyle"/><attr format="reference" name="buttonBarNegativeButtonStyle"/><attr format="reference" name="buttonBarNeutralButtonStyle"/><attr format="reference" name="autoCompleteTextViewStyle"/><attr format="reference" name="buttonStyle"/><attr format="reference" name="buttonStyleSmall"/><attr format="reference" name="checkboxStyle"/><attr format="reference" name="checkedTextViewStyle"/><attr format="reference" name="editTextStyle"/><attr format="reference" name="radioButtonStyle"/><attr format="reference" name="ratingBarStyle"/><attr format="reference" name="ratingBarStyleIndicator"/><attr format="reference" name="ratingBarStyleSmall"/><attr format="reference" name="seekBarStyle"/><attr format="reference" name="spinnerStyle"/><attr format="reference" name="switchStyle"/><attr format="reference" name="listMenuViewStyle"/></declare-styleable>
    <declare-styleable name="ButtonBarLayout"><attr format="boolean" name="allowStacking"/></declare-styleable>
    <declare-styleable name="ColorStateListItem"><attr name="android:color"/><attr format="float" name="alpha"/><attr name="android:alpha"/></declare-styleable>
    <declare-styleable name="CompoundButton"><attr name="android:button"/><attr format="color" name="buttonTint"/><attr name="buttonTintMode">
            
            <enum name="src_over" value="3"/>
            
            <enum name="src_in" value="5"/>
            
            <enum name="src_atop" value="9"/>
            
            <enum name="multiply" value="14"/>
            
            <enum name="screen" value="15"/>
        </attr></declare-styleable>
    <declare-styleable name="DrawerArrowToggle"><attr format="color" name="color"/><attr format="boolean" name="spinBars"/><attr format="dimension" name="drawableSize"/><attr format="dimension" name="gapBetweenBars"/><attr format="dimension" name="arrowHeadLength"/><attr format="dimension" name="arrowShaftLength"/><attr format="dimension" name="barLength"/><attr format="dimension" name="thickness"/></declare-styleable>
    <declare-styleable name="LinearLayoutCompat"><attr name="android:orientation"/><attr name="android:gravity"/><attr name="android:baselineAligned"/><attr name="android:baselineAlignedChildIndex"/><attr name="android:weightSum"/><attr format="boolean" name="measureWithLargestChild"/><attr name="divider"/><attr name="showDividers">
            <flag name="none" value="0"/>
            <flag name="beginning" value="1"/>
            <flag name="middle" value="2"/>
            <flag name="end" value="4"/>
        </attr><attr format="dimension" name="dividerPadding"/></declare-styleable>
    <declare-styleable name="LinearLayoutCompat_Layout"><attr name="android:layout_width"/><attr name="android:layout_height"/><attr name="android:layout_weight"/><attr name="android:layout_gravity"/></declare-styleable>
    <declare-styleable name="ListPopupWindow"><attr name="android:dropDownVerticalOffset"/><attr name="android:dropDownHorizontalOffset"/></declare-styleable>
    <declare-styleable name="MenuGroup"><attr name="android:id"/><attr name="android:menuCategory"/><attr name="android:orderInCategory"/><attr name="android:checkableBehavior"/><attr name="android:visible"/><attr name="android:enabled"/></declare-styleable>
    <declare-styleable name="MenuItem"><attr name="android:id"/><attr name="android:menuCategory"/><attr name="android:orderInCategory"/><attr name="android:title"/><attr name="android:titleCondensed"/><attr name="android:icon"/><attr name="android:alphabeticShortcut"/><attr name="android:numericShortcut"/><attr name="android:checkable"/><attr name="android:checked"/><attr name="android:visible"/><attr name="android:enabled"/><attr name="android:onClick"/><attr name="showAsAction">
            
            <flag name="never" value="0"/>
            
            <flag name="ifRoom" value="1"/>
            
            <flag name="always" value="2"/>
            
            <flag name="withText" value="4"/>
            
            <flag name="collapseActionView" value="8"/>
        </attr><attr format="reference" name="actionLayout"/><attr format="string" name="actionViewClass"/><attr format="string" name="actionProviderClass"/></declare-styleable>
    <declare-styleable name="MenuView"><attr name="android:itemTextAppearance"/><attr name="android:horizontalDivider"/><attr name="android:verticalDivider"/><attr name="android:headerBackground"/><attr name="android:itemBackground"/><attr name="android:windowAnimationStyle"/><attr name="android:itemIconDisabledAlpha"/><attr format="boolean" name="preserveIconSpacing"/><attr format="reference" name="subMenuArrow"/></declare-styleable>
    <declare-styleable name="PopupWindow"><attr format="boolean" name="overlapAnchor"/><attr name="android:popupBackground"/><attr name="android:popupAnimationStyle"/></declare-styleable>
    <declare-styleable name="PopupWindowBackgroundState"><attr format="boolean" name="state_above_anchor"/></declare-styleable>
    <declare-styleable name="RecycleListView"><attr format="dimension" name="paddingBottomNoButtons"/><attr format="dimension" name="paddingTopNoTitle"/></declare-styleable>
    <declare-styleable name="SearchView"><attr format="reference" name="layout"/><attr format="boolean" name="iconifiedByDefault"/><attr name="android:maxWidth"/><attr format="string" name="queryHint"/><attr format="string" name="defaultQueryHint"/><attr name="android:imeOptions"/><attr name="android:inputType"/><attr format="reference" name="closeIcon"/><attr format="reference" name="goIcon"/><attr format="reference" name="searchIcon"/><attr format="reference" name="searchHintIcon"/><attr format="reference" name="voiceIcon"/><attr format="reference" name="commitIcon"/><attr format="reference" name="suggestionRowLayout"/><attr format="reference" name="queryBackground"/><attr format="reference" name="submitBackground"/><attr name="android:focusable"/></declare-styleable>
    <declare-styleable name="Spinner"><attr name="android:prompt"/><attr name="popupTheme"/><attr name="android:popupBackground"/><attr name="android:dropDownWidth"/><attr name="android:entries"/></declare-styleable>
    <declare-styleable name="SwitchCompat"><attr name="android:thumb"/><attr format="color" name="thumbTint"/><attr name="thumbTintMode">
            
            <enum name="src_over" value="3"/>
            
            <enum name="src_in" value="5"/>
            
            <enum name="src_atop" value="9"/>
            
            <enum name="multiply" value="14"/>
            
            <enum name="screen" value="15"/>
            
            <enum name="add" value="16"/>
        </attr><attr format="reference" name="track"/><attr format="color" name="trackTint"/><attr name="trackTintMode">
            
            <enum name="src_over" value="3"/>
            
            <enum name="src_in" value="5"/>
            
            <enum name="src_atop" value="9"/>
            
            <enum name="multiply" value="14"/>
            
            <enum name="screen" value="15"/>
            
            <enum name="add" value="16"/>
        </attr><attr name="android:textOn"/><attr name="android:textOff"/><attr format="dimension" name="thumbTextPadding"/><attr format="reference" name="switchTextAppearance"/><attr format="dimension" name="switchMinWidth"/><attr format="dimension" name="switchPadding"/><attr format="boolean" name="splitTrack"/><attr format="boolean" name="showText"/></declare-styleable>
    <declare-styleable name="TextAppearance"><attr name="android:textSize"/><attr name="android:textColor"/><attr name="android:textColorHint"/><attr name="android:textStyle"/><attr name="android:typeface"/><attr name="textAllCaps"/><attr name="android:shadowColor"/><attr name="android:shadowDy"/><attr name="android:shadowDx"/><attr name="android:shadowRadius"/></declare-styleable>
    <declare-styleable name="Toolbar"><attr format="reference" name="titleTextAppearance"/><attr format="reference" name="subtitleTextAppearance"/><attr name="title"/><attr name="subtitle"/><attr name="android:gravity"/><attr format="dimension" name="titleMargin"/><attr format="dimension" name="titleMarginStart"/><attr format="dimension" name="titleMarginEnd"/><attr format="dimension" name="titleMarginTop"/><attr format="dimension" name="titleMarginBottom"/><attr format="dimension" name="titleMargins"/><attr name="contentInsetStart"/><attr name="contentInsetEnd"/><attr name="contentInsetLeft"/><attr name="contentInsetRight"/><attr name="contentInsetStartWithNavigation"/><attr name="contentInsetEndWithActions"/><attr format="dimension" name="maxButtonHeight"/><attr name="buttonGravity">
            
            <flag name="top" value="0x30"/>
            