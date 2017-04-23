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
 * The Start Theme from JQuery Theme Roller
 *
 * @since 2014/07/05
 * @version 1.0
 * @author MMagon
 *
 *
 */
class SunnyThemeNestable extends Theme
{

    public SunnyThemeNestable()
    {
        super("Sunny", "uisunny", "css/theming/images/theme_30_sunny.png", "", "css/theming/images/theme_30_sunny.png");
        getCssReferences().add(new CSSReference("sunnyTheme", 1.114, "css/theming/ui_sunny_theme.css", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/sunny/jquery-ui.css"));
    }
}
