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
package za.co.mmagon.jwebswing.base.html.attributes;

import za.co.mmagon.jwebswing.base.html.interfaces.AttributeDefinitions;

/**
 * The attribute enumeration for the input button type
 *
 * @author GedMarc
 */
public enum InputRadioTypeAttributes implements AttributeDefinitions
{
    /**
     * The alternative text or tooltip to display
     */
    Alt,
    /**
     * HTML 5 Only
     * Specifies whether an input element should have auto-complete enabled
     */
    AutoComplete,
    /**
     * HTML 5 Only
     * Specifies that an input element should automatically get focus when the page loads
     */
    AutoFocus,
    /**
     * The value of the field
     */
    Value,
    /**
     * A reference to the form that contain the button
     */
    Form,
    /**
     * Sets the value of the name attribute of an input button
     */
    Name,
    /**
     * Sets if the the type is checked. Use a boolean value.
     */
    Checked,
    /**
     * Sets the default checked value of the check box
     */
    DefaultChecked,
    /**
     * Sets the default value of the check box
     */
    DefaultValue,
    /**
     * Sets or returns whether a check box is disabled, or not
     */
    Disabled,
    /**
     * Sets the required value of the Check Box
     * HTML 5 Only
     */
    Required, /**
     *
     */
    ;

    @Override
    public boolean isKeyword()
    {
        return false;
    }
}
