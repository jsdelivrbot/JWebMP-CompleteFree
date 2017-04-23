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
package za.co.mmagon.jwebswing.plugins.jqueryui.selectmenu;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @author GedMarc
 * @since Mar 9, 2015
 * @version 1.0
 * <p>
 *
 */
public class JQUISelectMenuIconsOptions extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;

    /**
     * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
     * button (string, default: "ui-icon-triangle-1-s")
     */
    private String button;

    /**
     * Sets the button
     *
     * @param button
     */
    public JQUISelectMenuIconsOptions(String button)
    {
        this.button = button;
    }

    /**
     * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
     * button (string, default: "ui-icon-triangle-1-s")
     *
     * @return
     */
    public String getButton()
    {
        return button;
    }

    /**
     * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
     * button (string, default: "ui-icon-triangle-1-s")
     *
     * @param button
     */
    public void setButton(String button)
    {
        this.button = button;
    }
}
