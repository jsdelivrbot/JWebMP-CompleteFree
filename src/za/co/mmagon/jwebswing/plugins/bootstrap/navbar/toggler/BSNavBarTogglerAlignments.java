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
package za.co.mmagon.jwebswing.plugins.bootstrap.navbar.toggler;

import com.fasterxml.jackson.annotation.JsonValue;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.IBSComponentOptions;

/**
 *
 * @author GedMarc
 * @since 21 Jan 2017
 *
 */
public enum BSNavBarTogglerAlignments implements IBSComponentOptions
{
    /**
     * Position the toggler on the right
     */
    Navbar_Toggler_Right,
    /**
     * Position the toggler on the left
     */
    Navbar_Toggler_Left,;

    private BSNavBarTogglerAlignments()
    { //Nothing Needed
    }

    @JsonValue
    @Override
    public String toString()
    {
        String name = name().toLowerCase().replaceAll("\\$", " ").replaceAll("_", "-");
        return name;
    }
}
