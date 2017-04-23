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
package za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete;

/**
 *
 * @author Marc Magon
 * @since 06 Aug 2015
 * @version 1.0
 */
public enum JQUIAutoCompleteDataSetTypes
{

    /**
     * Displays a straight forward menu for selection
     */
    SingleSelections,
    /**
     * Displays a categorized menu item for selection
     */
    CategorySelections;

    private JQUIAutoCompleteDataSetTypes()
    {

    }

    /**
     * Returns the name of the enumeration in lower case
     * <p>
     * @return
     */
    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
