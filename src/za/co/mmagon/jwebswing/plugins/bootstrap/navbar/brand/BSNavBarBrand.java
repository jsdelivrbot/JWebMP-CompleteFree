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
package za.co.mmagon.jwebswing.plugins.bootstrap.navbar.brand;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.BSComponentNavBarOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.BSNavBarChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.BSNavBarColourSchemes;

/**
 * Brand
 * <p>
 * The .navbar-brand can be applied to most elements, but an anchor works best as some elements might require utility classes or custom styles.
 *
 * @author GedMarc
 * @since 21 Jan 2017
 *
 */
public class BSNavBarBrand extends Div implements BSNavBarChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * Brand
     * <p>
     * The .navbar-brand can be applied to most elements, but an anchor works best as some elements might require utility classes or custom styles.
     */
    public BSNavBarBrand()
    {
        addClass(BSComponentNavBarOptions.Navbar_Brand);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Color schemes
     * <p>
     * Theming the navbar has never been easier thanks to the combination of theming classes and background-color utilities. Choose from .navbar-light for use with light background colors, or
     * .navbar-inverse for dark background colors. Then, customize with .bg-* utilities.
     *
     * @param colourScheme
     */
    public BSNavBarBrand(BSNavBarColourSchemes... colourScheme)
    {
        this();
        for (BSNavBarColourSchemes bSNavBarColourSchemes : colourScheme)
        {
            addClass(bSNavBarColourSchemes);
        }
    }
}
