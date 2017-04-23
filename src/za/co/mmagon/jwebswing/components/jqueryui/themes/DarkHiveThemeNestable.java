/* 
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.components.jqueryui.themes;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.htmlbuilder.css.themes.Theme;

/**
 * The Dark Hive theme to JQuery UI
 *
 * @since 2012/02/04
 * @version
 * @author MMagon
 *
 */
class DarkHiveThemeNestable extends Theme
{

    public DarkHiveThemeNestable()
    {
        super("Dark Hive", "darkhive", "css/theming/images/theme_30_dark_hive.png", "", "css/theming/images/theme_90_dark_hive.png");
        getCssReferences().add(new CSSReference("DarkHiveTheme", 1.114, "css/theming/ui_darkhive_theme.css", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/dark-hive/jquery-ui.css"));

    }

}
