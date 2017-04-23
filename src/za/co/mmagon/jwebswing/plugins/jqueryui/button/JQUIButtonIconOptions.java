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
package za.co.mmagon.jwebswing.plugins.jqueryui.button;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavascriptPartType;

/**
 * The button icon options, This has been deprecated from version 1-11
 *
 * @author GedMarc
 * @since Mar 8, 2015
 * @version 1.0
 * @deprecated
 * <p>
 * <p>
 */
@Deprecated
public class JQUIButtonIconOptions extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;

    /**
     * Specifies the icon for primary
     */
    private String primaryIcon;
    /**
     * Specifies the icon for secondary
     */
    private String secondaryIcon;

    /**
     *
     */
    public JQUIButtonIconOptions()
    {

    }

    /**
     * Gets the primary icon
     * <p>
     * @return CSS Class Type
     */
    public String getPrimaryIcon()
    {
        return primaryIcon;
    }

    /**
     * Sets the primary icon
     * <p>
     * @param primaryIcon CSS Class Type
     *
     * @return
     */
    public JQUIButtonIconOptions setPrimaryIcon(String primaryIcon)
    {
        this.primaryIcon = primaryIcon;
        return this;
    }

    /**
     * *
     * Gets the secondary icon
     * <p>
     * @return
     */
    public String getSecondaryIcon()
    {
        return secondaryIcon;
    }

    /**
     * Sets the secondary icon CSS Class
     * <p>
     * @param secondaryIcon
     *
     * @return
     */
    public JQUIButtonIconOptions setSecondaryIcon(String secondaryIcon)
    {
        this.secondaryIcon = secondaryIcon;
        return this;
    }

    @Override
    public JavascriptPartType getJavascriptType()
    {
        return JavascriptPartType.Javascript;
    }
}
