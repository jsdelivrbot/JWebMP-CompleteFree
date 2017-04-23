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
package za.co.mmagon.jwebswing.plugins.jquerylayout.layout;

/**
 *
 * @author MMagon
 * @since 21 Jul 2013
 * @version 1.0
 */
public enum JQLayoutCSSThemeBlockNames
{
    /**
     * The Layout Component Content
     */
    UI_Layout_Content,
    /**
     * The Layout Component Content
     */
    UI_Layout_North,
    /**
     * The Layout Component Content
     */
    UI_Layout_South,
    /**
     * The Layout Component Content
     */
    UI_Layout_East,
    /**
     * The Layout Component Content
     */
    UI_Layout_Center,
    /**
     * The Layout Component Content
     */
    UI_Layout_West,
    /**
     * A specific header
     */
    UI_Layout_Header,
    /**
     * A specific footer
     */
    UI_Layout_Footer;

    @Override
    public String toString()
    {
        return name().toLowerCase().replace('_', '-');
    }

}
