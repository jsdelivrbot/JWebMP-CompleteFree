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
package za.co.mmagon.jwebswing.plugins.pools.jqueryui;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;

/**
 * The JQuery JavaScript Reference
 *
 * @since 2014/12/09
 * @version 1.0
 * @author MMagon
 *
 * I have moved these from the features to make it easier to specify remote or local references.
 *
 */
class JQueryUIWidgetCSSReference extends CSSReference
{

    public JQueryUIWidgetCSSReference()
    {
        super("JQueryUIWidgetCSS", 1.112, "bower_components/jquery-ui/themes/base/theme.css", "https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.4/jquery-ui.css");
        setSortOrder(11);
        setPriority(RequirementsPriority.Third);
    }
}
